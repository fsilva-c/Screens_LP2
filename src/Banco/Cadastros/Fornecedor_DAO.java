/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Servicos.Provider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author dcet1-lami11-ubuntu
 */
public class Fornecedor_DAO {
    private Connection con;
    
    //construtor
    public Fornecedor_DAO(){
        this.con = new Conectar().conectar();
    }
    
    public boolean Inserir(Provider fornecedor0){
        
       String sql = "INSERT INTO bd_restaurante.FORNECEDOR(cnpj, nome, telefone)VALUES(?, UPPER(?), ?)"; 
       
       try {     
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, fornecedor0.getCnpj());
            stmt.setString(2, fornecedor0.getNome());        
            stmt.setString(3, fornecedor0.getTelefone());
            
            stmt.executeUpdate(); //executa comando       
            stmt.close();
            
            return true;
            
        }catch (SQLException u) {        
            throw new RuntimeException(u);        
        } 
    }
    
}
