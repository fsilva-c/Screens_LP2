package Negocio.Pessoas;

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
}
