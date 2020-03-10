
package Negocio.Estruturas;

import Negocio.Servicos.Bill;
import Negocio.Pessoas.Client;
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
    
    public void SearchBill(String date){
        Bill bill;
        for (Bill book1 : book) {
            bill = book1;
            if(date.equals(bill.getDate()))
                bill.PrintBill();
        }
    }
    
    public void SearchBill(Client client){
        Client bill_client;
        for (Bill book1 : book) {
            bill_client = (book1).getClient();
            if (bill_client.CheckClient(client)) {
                (book1).PrintBill();
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
