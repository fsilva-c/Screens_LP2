package Negocio.Servicos;

import Negocio.Pessoas.Client;
import Negocio.Pratos.Menu_Item;
import java.util.ArrayList;

public class Order {
    private int id;
    private static int contador;
    private int numero;
    ArrayList<Order_Item> items;
    private String status;
    private float value;
    private Client pedinte;

    public Order() {
        contador++;
        numero = contador;
        status = "Opened";
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

    public Client getPedinte() {
        return pedinte;
    }

    public void setPedinte(Client pedinte) {
        this.pedinte = pedinte;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
    
 
    
}
