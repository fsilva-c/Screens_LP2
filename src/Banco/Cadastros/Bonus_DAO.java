/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Pessoas.Client;
import Negocio.Servicos.Bonus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Marizane
 */
public class Bonus_DAO {
    private Connection con;
    
    Bonus_DAO(){

    }
    
    public Float valorBonus(Client cliente0){
        this.con = new Conectar().conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        float valor_BonusAcumulado = 0.f;
        
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("SELECT valor FROM sql10326340.BONUS WHERE cpf_cliente = ?");
            stmt.setString(1,cliente0.getCpf());
                
            //Execução da SQL
            rs = stmt.executeQuery();
            
            while(rs.next()){
                valor_BonusAcumulado += rs.getFloat("valor");
            }
            
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return valor_BonusAcumulado;
    }
    
    public boolean Inserir(Bonus bonus, Client c1){
        this.con = new Conectar().conectar();        
        PreparedStatement stmt = null;
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("INSERT INTO sql10326340.BONUS(cpf_cliente,valor,data,situacao)VALUES(?,?,?,?)");
            stmt.setString(1,c1.getCpf());
            stmt.setFloat(2,bonus.getValue());
            stmt.setString(3,bonus.getDate());
            stmt.setInt(4,bonus.getSituacao());
            
            //Execução da SQL
            stmt.executeUpdate();
            
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir registro"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return true;
    }
    
    public boolean Atualizar_Situacao(Bonus bonus){
        this.con = new Conectar().conectar();
        PreparedStatement stmt = null;
        
        try {
            //Passagem de parametros
            stmt = con.prepareStatement("UPDATE sql10326340.BONUS SET situacao = ? WHERE id = ?");
            stmt.setInt(1,bonus.getSituacao());
            stmt.setInt(2,bonus.getId());
            
            //Execução da SQL
            stmt.executeUpdate();
 
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar registro"+ex);
            throw new RuntimeException(ex);
            //Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex); --> ex, acima
        }
        return true;
    }
    
    //Resgatar bonus validos cliente por cpf
    public Bonus Buscar_pCpf(Client c1, String date){
        this.con = new Conectar().conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Bonus bonus = new Bonus();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.BONUS WHERE (cpf = ? AND data != ? AND situacao = 0)");  
            stmt.setString(1,c1.getCpf());
            stmt.setString(2,date);
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            if(rs.next()){
                bonus.setId(rs.getInt("id"));
                bonus.setValue(rs.getFloat("valor"));
                bonus.setDate(rs.getString("data"));
                bonus.setSituacao(rs.getInt("situacao"));
            }else{
                return null;
            }
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }
        return bonus;
        
    }
    
    //Resgatar todas relacoes bonus - cliente
    public List<Client> CarregarBonus(){
        this.con = new Conectar().conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Client> clientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM sql10326340.BONUS");   //Selecione todas as colunas da tabela produto
            rs = stmt.executeQuery(); //Metodo responsavel por consultas ao banco
            
            while (rs.next()){
                Client c1 = new Client();
                Bonus b1 = new Bonus();
                c1.setCpf(rs.getString("cpf_cliente"));
                b1.setValue(rs.getFloat("valor"));
                b1.setDate(rs.getString("data"));
                b1.setSituacao(rs.getInt("situcao"));
                c1.setBonus(b1);
                clientes.add(c1);
            }
            
            con.close();
            stmt.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar registros"+ex);
            throw new RuntimeException(ex);
        }
 
        return clientes;
    }
}

