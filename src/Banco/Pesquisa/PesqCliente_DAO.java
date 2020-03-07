/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Pesquisa;

import Banco.Conexao.Conectar;
import Negocio.Pessoas.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author qwerty
 */
public class PesqCliente_DAO {
    private Connection con;
    
    //construtor
    public PesqCliente_DAO(){
        this.con = new Conectar().conectar();
    }
    
    public boolean Inserir(String textoBusca){
        
       String sql = "SELECT cpf, nome, email FROM sql10326340.CLIENTE WHERE cpf LIKE %?% OR nome LIKE %?%"; 
       
       try {     
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, textoBusca);      
            
            stmt.executeUpdate(); //executa comando       
            stmt.close();
            
            con.close();
            return true;
            
        }catch (SQLException u) {        
            throw new RuntimeException(u);        
        } 
    }
}
