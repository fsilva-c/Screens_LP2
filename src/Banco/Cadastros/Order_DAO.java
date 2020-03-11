/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Pratos.Menu_Item;
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
            stmt = con.prepareStatement("INSERT INTO sql10326340.PEDIDO(id_conta,valor,status)VALUES(?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setInt(1,pedido.getId_conta());
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
            
            this.InserirItems(pedido);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return true;
    }
    
    public boolean Excluir(Order pedido){
        this.ExcluirItems(pedido);
        this.con = new Conectar().conectar();
        PreparedStatement stmt = null;
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("DELETE FROM sql10326340.PEDIDO WHERE id = ?");
            stmt.setInt(1,pedido.getId());
            
            //Execução da SQL
            stmt.executeUpdate();
            
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return true;
    }
    
    public boolean ExcluirItems(Order pedido){

        PreparedStatement stmt = null;
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("DELETE FROM sql10326340.ITEMSPEDIDO WHERE id_pedido = ?");
            stmt.setInt(1,pedido.getId());

            //Execução da SQL
            stmt.executeUpdate();
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
                pedido.setId(rs.getInt("id"));
                pedido.setId_conta(rs.getInt("id_conta"));
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
            stmt = con.prepareStatement("UPDATE sql10326340.PEDIDO SET status = ? WHERE id = ?");
            stmt.setString(1,pedido.getStatus());
            stmt.setInt(2,pedido.getId());
            
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
                pedido.setId(rs.getInt("id"));
                pedido.setId_conta(rs.getInt("id_conta"));
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
    
     public List<Order> Carregar_pConta(int conta_id){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Order> pedidos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.PEDIDO WHERE id_conta = ?");  
            stmt.setInt(1,conta_id);
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            while (rs.next()){
                Order pedido = new Order();
                pedido.setId(rs.getInt("id"));
                pedido.setId_conta(rs.getInt("id_conta"));
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
        
        
        for(Order_Item item: items){
            this.con = new Conectar().conectar();
            PreparedStatement stmt = null;
            try {
               //Passagem de parametros
                stmt = con.prepareStatement("INSERT INTO sql10326340.ITEMSPEDIDO(id_pedido,id_item,qntd)VALUES(?,?,?)");
                stmt.setInt(1,pedido.getId());
                stmt.setFloat(2,item.getItem().getId());
                stmt.setInt(3,item.getQuantity());
                
            
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
    
    public Order CarregarItems(Order pedido){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.ITEMSPEDIDO WHERE id_pedido LIKE ?");  
            stmt.setInt(1,pedido.getId());
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            while (rs.next()){
                Item_DAO item_dao = new Item_DAO();
                Menu_Item item_menu = item_dao.CarregarDados_Item(rs.getInt("id_item"));
                Order_Item item = new Order_Item(item_menu, rs.getInt("qntd"));
                pedido.AddItem(item);
            }
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }
        return pedido;
    }
}
