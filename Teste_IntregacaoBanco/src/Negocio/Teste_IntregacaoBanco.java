/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Banco.Banco;
import Banco.CadPessoa_DAO;

/**
 *
 * @author qwerty
 */
public class Teste_IntregacaoBanco {
    private String nome;
    private String email;

    /**
     * @param nome
     * @param email
     */
    
    /*
    public int incluir(){
        CadPessoa_DAO cd;
        cd = new CadPessoa_DAO();
        return cd.incluir(this);
    }
    */
    
    public Teste_IntregacaoBanco(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
}
