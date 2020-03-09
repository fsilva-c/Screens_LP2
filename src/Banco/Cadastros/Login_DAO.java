/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Pessoas.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author qwerty
 */
public class Login_DAO {
    private final Connection con;
    private boolean achou = false;
    
    public Login_DAO(){
        this.con = new Conectar().conectar();
    }
    /*
    public boolean login(String cpf, String senha){
        
        
        String sql = "SELECT cpf, senha FROM sql10326340.CLIENTE WHERE cpf = ? AND senha = MD5(?)";
        
        try{
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, cpf);
                ps.setString(2, senha);
                
                ResultSet rs = ps.executeQuery(ps.toString().replaceAll("com.mysql.cj.jdbc.ClientPreparedStatement: ", ""));
                
                if(rs.next()){
                    achou = true;
                }
                
                ps.close();
                con.close();
            }
            
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return achou;
    }
    */
    public Client login(String cpf, String senha){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Client c1 = new Client();
        boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.CLIENTE WHERE cpf = ? and senha = MD5(?)");  
            stmt.setString(1,cpf);
            stmt.setString(2,senha);
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            if(rs.next()){
                check = true;
                c1.setCpf(rs.getString("cpf"));
                c1.setName(rs.getString("nome"));
            }
           
            con.close();
            stmt.close();
            rs.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }
        if(check)
            return c1;
        else
            return null;
    }
    
    
}

