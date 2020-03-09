/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.Cadastros;

import Banco.Conexao.Conectar;
import Negocio.Pessoas.Client;
import Screens.Bonus.Bonus;
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
    
    public List<Bonus> CarregarBonus(){
        List<Bonus> bonus = new ArrayList<>();
        
        
        return bonus;
    }
}

