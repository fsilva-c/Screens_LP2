package Servicos;
import Pratos.Menu_Item;
import java.util.ArrayList;

public class Order {
    private static int contador;
    private int numero;
    ArrayList<Order_Item> items;
    private String status;
    private float value;

    public Order() {
        contador++;
        numero = contador;
        status = "Opened";
        items = new ArrayList<Order_Item>();
    }
    
    public void AddItem(Order_Item item){
        items.add(item);
    }
    
    public float CalcValue(){
        Menu_Item item;
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
    
    
}
