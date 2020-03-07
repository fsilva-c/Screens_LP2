/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Pratos.Drink;
import Negocio.Pratos.Food;
import Negocio.Servicos.Provider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author dcet1-lami11-ubuntu
 */
public class Item_DAO {
    private Connection con;
    
    //construtor
    public Item_DAO(){
        this.con = new Conectar().conectar();
    }
    
    public boolean Inserir(Drink drink0, short tp_item){
        
       String sql = "INSERT INTO sql10326340.ITEM(nome, preco, fornecedor, tp_item)VALUES(UPPER(?), ?, ?, ?)"; 
       
       try {     
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, drink0.getName());
            stmt.setFloat(2, drink0.getPrice());        
            stmt.setString(3, drink0.getProvider());
            stmt.setShort(4, tp_item);
            
            stmt.executeUpdate(); //executa comando       
            stmt.close();
            
            con.close();
            return true;
            
        }catch (SQLException u) {        
            throw new RuntimeException(u);        
        } 
    }
    
    public boolean Inserir(Food food0, short tp_item){
        
       String sql = "INSERT INTO sql10326340.ITEM(nome, preco, descricao, tp_item)VALUES(UPPER(?), ?, ?, ?)"; 
       
       try {     
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, food0.getName());
            stmt.setFloat(2, food0.getPrice());        
            stmt.setString(3, food0.getSteps());
            stmt.setShort(4, tp_item);
            
            stmt.executeUpdate(); //executa comando       
            stmt.close();
            
            con.close();
            return true;
            
        }catch (SQLException u) {        
            throw new RuntimeException(u);        
        } 
    }
    
}
