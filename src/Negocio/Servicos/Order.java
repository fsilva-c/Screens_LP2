package Negocio.Servicos;

import Banco.Cadastros.Order_DAO;
import Negocio.Pessoas.Client;
import Negocio.Pratos.Menu_Item;
import java.util.ArrayList;

public class Order {
    private int id;
    private static int contador = 1;
    private int numero;
    ArrayList<Order_Item> items;
    private String status;
    private float value;
    private int id_conta;

    public Order() {
        status = "Opened";
        numero = contador++;
        items = new ArrayList<Order_Item>();
    }
    
    public void AddItem(Order_Item item){
        items.add(item);
    }
    
    public void RemoveItem(int index){
        items.remove(index);
    }
    
    public ArrayList<Order_Item> ItensPedido(){
        ArrayList<Order_Item> produtos = new ArrayList<>();
        for(Order_Item item : items){
            produtos.add(item);
        }
        return produtos;
    }
    
    public float CalcValue(){
        Menu_Item item;
        value = 0.0f;
        for(int index = 0; index < items.size(); index++){
            item = (items.get(index)).getItem();
            value += item.getPrice();
        }
        return value;
    }

    public void PrintOrder(){
        System.out.println(numero);
        
        Menu_Item item;
        for(int index = 0; index < items.size(); index++){
            item = (items.get(index)).getItem();
            item.PrintItem();
        }
    }
    
    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }


    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
    public boolean Inserir(){
        Order_DAO order_dao = new Order_DAO();
        return order_dao.Inserir(this);
    }
    
    public boolean Excluir(){
        Order_DAO order_dao = new Order_DAO();
        return order_dao.Excluir(this);
    }
    
}
