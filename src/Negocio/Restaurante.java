
package Estruturas;
import Pessoas.Client;
import Servicos.Bill;
import Servicos.Date;
import java.util.ArrayList;

public class Restaurante {
    private String nome;
    private Cozinha cozinha;
    private ArrayList<Bill> book;

    public Restaurante(String nome, Cozinha cozinha) {
        this.nome = nome;
        this.cozinha = cozinha;
        book = new ArrayList<Bill>();
    }
    
    public void SearchBill(Date date){
        Bill bill;
        for(int index = 0; index < book.size(); index++){
            bill = book.get(index);
            if(date.CheckDate(bill.getDate()))
                bill.PrintBill();
        }
    }
    
    public void SearchBill(Client client){
        Client bill_client;
        for(int index = 0; index < book.size(); index++){
            bill_client = (book.get(index)).getClient();
            if(bill_client.CheckClient(client)){
                (book.get(index)).PrintBill();
            }
        }
    }
    
    public float CalcIncome(){
        float income = 0f;
        for(int index = 0; index < book.size(); index++){
            income += (book.get(index)).CalcBill();
        }
        return income; 
    }
}
