/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Negocio.Teste_IntregacaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author qwerty
 */
public class CadPessoa_DAO {
    private Connection con;
    /*
    public int incluir(Teste_IntregacaoBanco c1){

      Banco ac = new Banco();
      ac.conectar();

      //int r = ac.atualizar("insert into bd_restaurante.TESTE (nome, email) values (" + c1.getNome()+ ",'"+ c1.getEmail()+"')" );
      int r = ac.atualizar("INSERT INTO bd_restaurante.TESTE (nome, email) values ('Filipe Silva', 'filipe@gmail.com')");
      
      ac.Fechar();
      return r;
    }
    */
    
    //construtor
    public CadPessoa_DAO(){
        this.con = new Banco().conectar();
    }
    
    public void Inserir(Teste_IntregacaoBanco c0){
        
       String sql = "INSERT INTO bd_restaurante.TESTE(nome, email)values(?, ?)"; 
       
       try {     
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, c0.getNome());        
            stmt.setString(2, c0.getEmail());
            
            stmt.execute(); //executa comando       
            stmt.close();
        }catch (SQLException u) {        
            throw new RuntimeException(u);        
        } 
    }
}
