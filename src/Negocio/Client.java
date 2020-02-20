
package Pessoas;
import Servicos.Bonus;

public class Client extends Person{
    protected String cpf, email;
    protected Bonus bonus;

    public Client(String name, String login, String pswd, String cpf, String email, Bonus bonus) {
        super(name, login, pswd);
        this.cpf = cpf;
        this.email = email;
        this.bonus = bonus;
    }

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

    public void AttBonus(Bonus bonus) {
        this.bonus = bonus;
    }
    
   public boolean CheckClient(Client client){
        return (client.getCpf()).equals(cpf);
    }
}
