/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Negocio.Client;

/**
 *
 * @author qwerty
 */
public class CadPessoa_DAO {
    
    public int incluir(Client newClient){
        int r;
        
        Banco ac = new Banco();
        ac.conectar();

        r = ac.atualizar("INSERT INTO db_restaurante.CLIENTE (cpf, nome, email, senha) VALUES (" + newClient.getCpf() + ",'"+ newClient.getName()+ ",'"+ newClient.getEmail() + ",'"+ newClient.getPswd()+"')" );
        
        ac.Fechar();
        return r;
        
    }

}
