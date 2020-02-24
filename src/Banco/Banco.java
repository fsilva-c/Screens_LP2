/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

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
public class Banco {
     // driver JDBC e a URL para o banco
    static final String JDBC_DRIVER = "com.mysql.jdbc.driver";

    // MySQL
    //static final String URL = "jdbc:mysql://localhost:3306/SistAcademico";

    // access
    static final String URL = "jdbc:odbc:db_restaurante";

    // Autenticacao
    static final String login="root";
    static final String senha="123456";


    private Connection con;
    private Statement stm;

   public Banco(){
   }
   public Connection conectar(){
       try{
        // registro do driver JDBC pelo MySql
        Class.forName(JDBC_DRIVER).newInstance();
        // abrindo a conexao
        con = DriverManager.getConnection(URL,login,senha);
        return con;

      }
       catch(SQLException e){
           System.out.println(e.getMessage());
       }
       catch(ClassNotFoundException c){
           System.out.println(c.getMessage());
       }
        catch(InstantiationException i){
            System.out.println(i.getMessage());
       }
        catch(IllegalAccessException il){
            System.out.println(il.getMessage());
       }
       return null;
   }

   public ResultSet Consulta(String sql){
        try{
         // executa um comando select e recebe o retorno no resultset

        stm = con.createStatement();
        ResultSet res = stm.executeQuery(sql);
        return res;

        }
        catch (SQLException e){
           return null;
        }
    }
    public int atualizar(String sql){
        try{
        return stm.executeUpdate(sql);
        }
        catch (SQLException e){
            return -1;
        }
        

    }
    public void Fechar(){
        try{
         // executa um comando select e recebe o retorno no resultset
        stm.close();
        con.close();
        }
        catch (SQLException e){
        }
    }
}
