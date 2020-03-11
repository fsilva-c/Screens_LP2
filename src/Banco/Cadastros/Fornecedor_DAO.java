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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        
       String sql = "INSERT INTO sql10326340.fornecedor(cnpj, nome, telefone)VALUES(?, UPPER(?), ?)"; 
       
       try {     
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, fornecedor0.getCnpj());
            stmt.setString(2, fornecedor0.getNome());        
            stmt.setString(3, fornecedor0.getTelefone());
            
            stmt.executeUpdate(); //executa comando       
            stmt.close();
            
            con.close();
            return true;
            
        }catch (SQLException u) {
            System.out.println( "Erro ao inserir fornecedor - Fornecedor_DAO.Inserir-"+u);
            throw new RuntimeException(u);        
        } 
    }
    
    public List<Provider> Carregar(){
        this.con = new Conectar().conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Provider> fornecedores = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.fornecedor");   //Selecione todas as colunas da tabela produto
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            while (rs.next()){
                Provider f1 = new Provider();
                f1.setCnpj(rs.getString("cnpj"));
                f1.setNome(rs.getString("nome"));
                f1.setTelefone(rs.getString("telefone"));
                
                fornecedores.add(f1);
            }
            
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            System.out.println( "Erro ao Carregar fornecedores - Fornecedor_DAO.Crregar-"+ex);
            throw new RuntimeException(ex);
        }
 
        return fornecedores;
    }
    
}
