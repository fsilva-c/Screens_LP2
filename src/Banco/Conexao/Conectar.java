/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 

/**
 *
 * @author apmagalhaes
 * 
 */
public class Conectar {
    private Connection con;
    private Statement stm;

    public Conectar(){
    
    }
    
    public Connection conectar(){
        try{
            //return DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_restaurante","root", "123456");
            return DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net:3306/sql10326340","sql10326340", "UCNxlVgRFq");
            

        }catch (SQLException e) { 
            throw new RuntimeException(e);
        }
   }
}
