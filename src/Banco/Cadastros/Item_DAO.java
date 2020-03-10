/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Pratos.Drink;
import Negocio.Pratos.Food;
import Negocio.Pratos.Menu_Item;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    public List<Drink> CarregarDados_Bebida(){
        List<Drink> bebidas = new ArrayList<>();
        
        String sql = "SELECT id_item, nome, preco FROM sql10326340.ITEM WHERE tp_item = 1";
        
        try {
            
            try(PreparedStatement stmt = con.prepareStatement(sql)){
                
                ResultSet rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
                
                while (rs.next()){
                    Drink bebida = new Drink();
                    bebida.setId(rs.getInt("id_item"));
                    bebida.setName(rs.getString("nome"));
                    bebida.setPrice(rs.getFloat("preco"));
                
                    bebidas.add(bebida);
                }
            
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }
        
        
        return bebidas;
    }
    
    public List<Food> CarregarDados_Comida(){
        List<Food> comidas = new ArrayList<>();
        
        String sql = "SELECT id_item, nome, descricao, preco FROM sql10326340.ITEM WHERE tp_item = 2";
        
        try {
            
            try(PreparedStatement stmt = con.prepareStatement(sql)){
                
                ResultSet rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
                
                while (rs.next()){
                    Food comida = new Food();
                    comida.setId(rs.getInt("id_item"));
                    comida.setName(rs.getString("nome"));
                    comida.setSteps(rs.getString("descricao"));
                    comida.setPrice(rs.getFloat("preco"));
                
                    comidas.add(comida);
                }
            
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }
            
        
        
        return comidas;
    }
    
    public Menu_Item CarregarDados_Item(int id){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Menu_Item item = new Menu_Item();
        
        try {
            stmt = con.prepareStatement("SELECT nome, preco FROM sql10326340.ITEM WHERE id_item = ?");  
            stmt.setInt(1,id);
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            if(rs.next()){
                item.setId(id);
                item.setName(rs.getString("nome"));
                item.setPrice(rs.getFloat("preco"));
            }
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }
        return item;
    }
}
