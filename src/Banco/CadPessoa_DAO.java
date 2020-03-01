/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Negocio.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author qwerty
 */
public class CadPessoa_DAO {
    private Connection con;
    
    //construtor
    public CadPessoa_DAO(){
        this.con = new Banco().conectar();
    }
    
    public boolean Inserir(Client c0){
        
       String sql = "INSERT INTO bd_restaurante.CLIENTE(cpf, nome, email, senha)VALUES(?, ?, ?, MD5(?))"; 
       
       try {     
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, c0.getCpf());
            stmt.setString(2, c0.getName());        
            stmt.setString(3, c0.getEmail());
            stmt.setString(4, c0.getPswd());
            
            stmt.executeUpdate(); //executa comando       
            stmt.close();
            
            return true;
            
        }catch (SQLException u) {        
            throw new RuntimeException(u);        
        } 
    }
}
