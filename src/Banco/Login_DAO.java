/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author qwerty
 */
public class Login_DAO {
    private final Connection con;
    private boolean achou = false;
    
    public Login_DAO(){
        this.con = new Banco().conectar();
    }
    
    public boolean login(String cpf, String senha){
        
        
        String sql = "SELECT cpf, senha FROM bd_restaurante.CLIENT WHERE cpf = ? AND senha = MD5(?)";
        
        try{
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, cpf);
                ps.setString(2, senha);
                
                ResultSet rs = ps.executeQuery(ps.toString().replaceAll("com.mysql.cj.jdbc.ClientPreparedStatement: ", ""));
                
                if(rs.next())
                    achou = true;
                
                ps.close();
            }
            
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return achou;
    }
}
