
package Negocio.Estruturas;

import Banco.Cadastros.Bill_DAO;
import Negocio.Servicos.Bill;
import Negocio.Pessoas.Client;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nome;
    private List<Bill> book;

    public Restaurante(String nome) {
        this.nome = nome;
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
            income += (book.get(index)).getValue();
        }
        return income;
    }
    
    public List<Bill> CarregarContas(){
        Bill_DAO bill_dao = new Bill_DAO();
        book = bill_dao.CarregarContas();
        return book;
    }
    
    public List<Bill> CarregarContas_pCPF(Client c1){
        Bill_DAO bill_dao = new Bill_DAO();
        book = bill_dao.CarregarContas_pCPF(c1);
        return book;
    }
}
