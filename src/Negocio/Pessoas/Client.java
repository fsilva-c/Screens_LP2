package Negocio.Pessoas;

import Banco.Cadastros.Bonus_DAO;
import Banco.Cadastros.Pessoa_DAO;
import Negocio.Servicos.Bonus;

public class Client extends Person{
    protected String cpf, email;
    protected Bonus bonus;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }
    
   
    public boolean CheckClient(Client client){
        return client.getCpf().equals(this.cpf);
    }
   
     public Bonus Buscar_myBonus(){
       Bonus b1;
       Bonus_DAO bonus_dao = new Bonus_DAO();
       b1 = bonus_dao.Buscar_pCpf(this);
       return b1;
   }
   
    public Bonus Buscar_myBonus(String data){
       Bonus b1;
       Bonus_DAO bonus_dao = new Bonus_DAO();
       b1 = bonus_dao.Buscar_pCpf(this, data);
       return b1;
   }
    
   public boolean Inserir(){
       Pessoa_DAO pessoa_dao = new Pessoa_DAO();
       return pessoa_dao.Inserir(this);
   }
   
   public Client getMe(){
       Pessoa_DAO pessoa_dao = new Pessoa_DAO();
       return pessoa_dao.Buscar_pCpf(cpf);
   }
   
   public boolean Atualizar(){
       Pessoa_DAO pessoa_dao = new Pessoa_DAO();
       return pessoa_dao.Atualizar(this);
   }
  
    public boolean Alterar_Senha(){
       Pessoa_DAO pessoa_dao = new Pessoa_DAO();
       return pessoa_dao.Alterar_Senha(this);
   }
   
    public Client Login(){
       Pessoa_DAO pessoa_dao = new Pessoa_DAO();
       return pessoa_dao.Login(this); 
    }
}
