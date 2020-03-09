/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Pessoas.Client;
import Negocio.Servicos.Order;
import Negocio.Servicos.Order_Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitor M
 */
public class Order_DAO {
    private Connection con;
    
    public Order_DAO(){
        this.con = new Conectar().conectar();
    }
    
    public boolean Inserir(Order pedido){
        
        PreparedStatement stmt = null;
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("INSERT INTO sql10326340.PEDIDO(cpf,valor,status)VALUES(?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1,pedido.getPedinte().getCpf());
            stmt.setFloat(2,pedido.CalcValue());
            stmt.setString(3,pedido.getStatus());
            
            //Execução da SQL
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                pedido.setId(rs.getInt(1));
            }
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return true;
    }
    
    public List<Order> Carregar(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Order> pedidos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.PEDIDO");   //Selecione todas as colunas da tabela produto
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            while (rs.next()){
                Order pedido = new Order();
                Client c1 = new Client();
                pedido.setId(rs.getInt("id"));
                c1.setCpf(rs.getString("cpf"));
                pedido.setPedinte(c1);
                pedido.setValue(rs.getFloat("valor"));
                pedido.setStatus(rs.getString("status"));
                pedidos.add(pedido);
            }
            
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }
        return pedidos;        
    }
    
    public boolean Atualizar(Order pedido){
        PreparedStatement stmt = null;
        
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("UPDATE sql10326340.PEDIDO SET cpf = ?,valor = ?, status = ? WHERE id = ?");
            stmt.setString(1,pedido.getPedinte().getCpf());
            stmt.setFloat(2,pedido.getValue());
            stmt.setString(3,pedido.getStatus());
            stmt.setInt(4,pedido.getId());
            
            //Execução da SQL
            stmt.executeUpdate();
 
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar registro"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return true;
    }
    
    public List<Order> Carregar(String status){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Order> pedidos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.PEDIDO WHERE status LIKE ?");  
            stmt.setString(1,status);
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            while (rs.next()){
                Order pedido = new Order();
                Client c1 = new Client();
                pedido.setId(rs.getInt("id"));
                c1.setCpf(rs.getString("cpf"));
                pedido.setPedinte(c1);
                pedido.setValue(rs.getFloat("valor"));
                pedido.setStatus(rs.getString("status"));
                pedidos.add(pedido);
            }
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }
        return pedidos;
    }
    
    //Itens do pedido
    private boolean InserirItems(Order pedido){
        List<Order_Item> items = pedido.ItensPedido();
        this.con = new Conectar().conectar();
        
        for(Order_Item item: items){
            PreparedStatement stmt = null;
            try {
               //Passagem de parametros
                stmt = con.prepareStatement("INSERT INTO sql10326340.ITEMSPEDIDO(id_pedido,id_item,qntd,valor)VALUES(?,?,?,?)");
                stmt.setInt(1,pedido.getId());
                stmt.setFloat(2,pedido.get());
                stmt.setString(3,pedido.getStatus());
            
                //Execução da SQL
                stmt.executeUpdate();
                con.close();
                stmt.close();
            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir registro"+ex);
                throw new RuntimeException(ex);
                //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
            }
        }
        return true;
    }
}
