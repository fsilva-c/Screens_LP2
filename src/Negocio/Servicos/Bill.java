
package Negocio.Servicos;

import Negocio.Pratos.Menu_Item;
import Negocio.Pessoas.Client;
import java.util.List;

public class Bill{
    private static int contador = 1;
    private int numero;
    private Client client;
    private Date date;
    private float value = 0.0f;
    private String payment_method = "None";
    private List<Order> orders = null;
    private int id;

    public Bill(Client client) {
        this.client = client;
        numero = contador++;
    }

    public void PrintBill(){
        System.out.println(numero);
        date.PrintDate();
        client.getCpf();
        for(Order order : orders)
            order.PrintOrder();
        System.out.println(payment_method);
        System.out.println(value);
    }
    
    public float CalcBill(){
        for(Order order : orders)
            value += order.getValue();
        if(CheckBonus()){
            value -= (client.getBonus()).getValue();
        }
        if(value < 0)
            value = 0;
        return value;
    }
    
    public void AddItem(Order pedido){
        orders.add(pedido);
    }
    /*  Metodo inserir da classe Order_Item
    public boolean MakeOrder(Menu_Item item, int quantity){
        if(payment_method == null){
            //Menu.PrintMenu(); Responsabilidade da interface grafica
            Order_Item new_item = new Order_Item(item, quantity);
            order.AddItem(new_item);
        }
        return true;
    }
    */
       
    public boolean CloseBill(String payment_method){
        System.out.println(CalcBill());
        this.payment_method = payment_method;
        CalcBonus();
        return true;
    }
    
    private boolean CheckBonus(){
        Bonus bonus = client.getBonus();
        return !(date.CheckDate(bonus.getDate()));
    }
    
    public float CalcBonus(){
        float client_bonus = 0f;
        if(payment_method != null){
            client_bonus = value*0.10f;
            if((client.getBonus()).getValue() > value)
                client_bonus += ((client.getBonus()).getValue() - value);
            Bonus new_bonus = new Bonus(client_bonus, this.getDate());
            client.AttBonus(new_bonus);
            return client_bonus;
        }
        System.out.println("A conta ainda nao foi fechada");
        return client_bonus;
    }
    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    
    
    
    
}

