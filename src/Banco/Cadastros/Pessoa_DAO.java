/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Pessoas.Client;
import Negocio.Servicos.Bill;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class Pessoa_DAO {
    private Connection con;
    
    //construtor
    public Pessoa_DAO(){
        this.con = new Conectar().conectar();
    }
    
    public boolean Inserir(Client c0){
        
       String sql = "INSERT INTO sql10326340.cliente(cpf, nome, email, senha)VALUES(?, ?, ?, MD5(?))"; 
       
       try {     
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, c0.getCpf());
            stmt.setString(2, c0.getName());        
            stmt.setString(3, c0.getEmail());
            stmt.setString(4, c0.getPswd());
            
            stmt.executeUpdate(); //executa comando       
            stmt.close();
            
            con.close();
            return true;
            
        }catch (SQLException ex) {
            System.out.println( "Erro ao Inserir cliente - Pessoa_DAO.Inserir-"+ex);
            throw new RuntimeException(ex);        
        } 
    }
    
    public Client Buscar_pCpf(String cpf){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Client c1 = new Client();
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.cliente WHERE cpf = ?");  
            stmt.setString(1,cpf);
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            if(rs.next()){
                check = true;
                c1.setCpf(rs.getString("cpf"));
                c1.setName(rs.getString("nome"));
                c1.setEmail(rs.getString("email"));
            }
           
            con.close();
            stmt.close();
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println( "Erro ao Buscar cliente por CPF- Pessoa_DAO.Buscar_pCpf -"+ex);
            throw new RuntimeException(ex);
        }
        if(check)
            return c1;
        else
            return null;
    }
    
    @SuppressWarnings("empty-statement")
    public List<Client> CarregarDados(Client c1){
        List<Client> clientes = new ArrayList<>();
        String sql;
        String campo;
        
        if(c1.getCpf().equals("")){
            sql = "SELECT cpf, nome, email FROM sql10326340.cliente WHERE nome LIKE ?";
            campo = c1.getName();
        }
        else{
            sql = "SELECT cpf, nome, email FROM sql10326340.cliente WHERE cpf LIKE ?";
            campo = c1.getCpf();
        }
        
        try {
            
            try(PreparedStatement stmt = con.prepareStatement(sql)){
                stmt.setString(1, "%" + campo + "%");
                
                ResultSet rs = stmt.executeQuery(stmt.toString().replaceAll("com.mysql.cj.jdbc.ClientPreparedStatement: ", "")); //Metodo responsavel por consultas ao banco
                
                while (rs.next()){
                    Client cliente = new Client();
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setName(rs.getString("nome"));
                    cliente.setEmail(rs.getString("email"));
                
                    clientes.add(cliente);
                }
            
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println( "Erro ao Carreagr todos os clientes - Pessoa_DAO.CarregarDados-"+ex);
            throw new RuntimeException(ex);   
        }
        
        
        return clientes;
    }
    
    public boolean Atualizar(Client c1){
        PreparedStatement stmt = null;
        
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("UPDATE sql10326340.cliente SET nome = ?,email = ? WHERE cpf = ?");
            stmt.setString(1,c1.getName());
            stmt.setString(2,c1.getEmail());
            stmt.setString(3, c1.getCpf());
            
            //Execução da SQL
            stmt.executeUpdate();
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            System.out.println( "Erro ao Atualizar cliente - Pessoa_DAO.Atualizar-"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return true;
    }
    
    public boolean Excluir(Client c1){
        Bonus_DAO bonus_dao = new Bonus_DAO();
        bonus_dao.Excluir_pCpf(c1);
        Bill_DAO bill_dao = new Bill_DAO();
        List<Bill> contas = bill_dao.CarregarContas_pCPF(c1);
        for(Bill conta : contas){
            conta.Excluir();
        }
        
        this.con = new Conectar().conectar();
        PreparedStatement stmt = null;
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("DELETE FROM sql10326340.cliente WHERE cpf = ?");
            stmt.setString(1,c1.getCpf());
            
            //Execução da SQL
            stmt.executeUpdate();
            
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            System.out.println( "Erro ao Excluir cliente - Pessoa_DAO.Excluir-"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return true;
    }
    
    public boolean Alterar_Senha(Client c1){
        PreparedStatement stmt = null;
        this.con = new Conectar().conectar();
        
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("UPDATE sql10326340.cliente SET senha = MD5(?) WHERE cpf = ?");
            stmt.setString(1,c1.getPswd());
            stmt.setString(2, c1.getCpf());
            
            //Execução da SQL
            stmt.executeUpdate();
 
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            System.out.println( "Erro ao Alterar senha cliente - Pessoa_DAO.Alterar_Senha-"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return true;
    }
    
    public Client Login(Client c1){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.cliente WHERE cpf = ? and senha = MD5(?)");  
            stmt.setString(1,c1.getCpf());
            stmt.setString(2,c1.getPswd());
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            if(rs.next()){
                check = true;
                c1.setName(rs.getString("nome"));
            }
           
            con.close();
            stmt.close();
            rs.close();
            
        } catch (SQLException ex) {
            System.out.println( "Erro ao Logar cliente - Pessoa_DAO.Login -"+ex);
            throw new RuntimeException(ex);
        }
        if(check)
            return c1;
        else
            return null;
    }
}

