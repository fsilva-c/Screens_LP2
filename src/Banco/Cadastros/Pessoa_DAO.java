/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Pessoas.Client;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author qwerty
 */
public class Pessoa_DAO {
    private final Connection con;
    
    //construtor
    public Pessoa_DAO(){
        this.con = new Conectar().conectar();
    }
    
    public boolean Inserir(Client c0){
        
       String sql = "INSERT INTO sql10326340.CLIENTE(cpf, nome, email, senha)VALUES(?, ?, ?, MD5(?))"; 
       
       try {     
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, c0.getCpf());
            stmt.setString(2, c0.getName());        
            stmt.setString(3, c0.getEmail());
            stmt.setString(4, c0.getPswd());
            
            stmt.executeUpdate(); //executa comando       
            stmt.close();
            
            con.close();
            return true;
            
        }catch (SQLException u) {        
            throw new RuntimeException(u);        
        } 
    }
    
    @SuppressWarnings("empty-statement")
    public List<Client> CarregarDados(String textoBusca) throws SQLException{
        List<Client> clientes = new ArrayList<>();
        
        String sql = "SELECT cpf, nome, email FROM sql10326340.CLIENTE WHERE cpf LIKE ? OR nome LIKE ?";
        
        try {
            
            try(PreparedStatement stmt = con.prepareStatement(sql)){
                stmt.setString(1, "%" + textoBusca + "%");
                stmt.setString(2, "%" + textoBusca + "%");
                
                ResultSet rs = stmt.executeQuery(stmt.toString().replaceAll("com.mysql.cj.jdbc.ClientPreparedStatement: ", "")); //Metodo responsavel por consultas ao banco
                
                while (rs.next()){
                    Client cliente = new Client();
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setName(rs.getString("nome"));
                    cliente.setEmail(rs.getString("email"));
                
                    clientes.add(cliente);
                }
            
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar registros"+ex);
        }finally{
            con.close();
        }
        
        
        return clientes;
    }
}
