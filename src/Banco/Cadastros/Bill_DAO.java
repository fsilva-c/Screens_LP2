/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Pessoas.Client;
import Negocio.Servicos.Bill;
import Negocio.Servicos.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dcet1-lami11-ubuntu
 */
public class Bill_DAO {
    
    private Connection con;
    
    public Bill_DAO(){
    }
    
    public boolean Atualizar(Bill conta){
        
        this.con = new Conectar().conectar();
        PreparedStatement stmt = null;
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("INSERT INTO sql10326340.CONTA(cpf,data,valor,pagamento)VALUES(?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1,conta.getClient().getCpf());
            stmt.setString(2,conta.getDate());
            stmt.setFloat(3,conta.CalcBill());
            stmt.setString(4,conta.getPayment_method());
            
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
    
        
    public boolean Pre_Inserir(Bill conta){
        
        this.con = new Conectar().conectar();
        PreparedStatement stmt = null;
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("INSERT INTO sql10326340.CONTA(cpf,data,valor,pagamento)VALUES(?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            stmt.setString(1,conta.getClient().getCpf());
            stmt.setString(2,"NONE");
            stmt.setFloat(3,0.0f);
            stmt.setString(4,conta.getPayment_method());
            
            //Execução da SQL
            stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                conta.setId(rs.getInt(1));
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
    
    public boolean Atualizar_Pagamento(Bill conta){
        this.con = new Conectar().conectar();
        PreparedStatement stmt = null;
        
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("UPDATE sql10326340.CONTA SET pagamento = ? WHERE id = ?");
            stmt.setString(1,conta.getPayment_method());
            stmt.setInt(2,conta.getId());
            
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
    
    public Client BuscarClient(int id_conta){
        this.con = new Conectar().conectar();
        Client c1 = new Client();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT cpf FROM sql10326340.CONTA WHERE id = ?");   //Selecione todas as colunas da tabela produto
            stmt.setInt(1,id_conta);
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            if (rs.next()){
                Pessoa_DAO pessoa_dao = new Pessoa_DAO();
                c1 = pessoa_dao.Buscar_pCpf(rs.getString("cpf"));
            }
            
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }             
       
        return c1;
    }
    
    public Bill CarregarItems(Bill conta){
        Order_DAO order_dao = new Order_DAO();
        List<Order> pedidos = order_dao.Carregar_pConta(conta.getId());
        
        
        
        for(Order pedido : pedidos){
            Order_DAO order_dao2 = new Order_DAO();
            pedido = order_dao2.CarregarItems(pedido);
        }
            conta.setOrders(pedidos);
        return conta;
    }
}
