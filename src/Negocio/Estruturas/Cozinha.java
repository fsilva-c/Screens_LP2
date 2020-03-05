
package Negocio.Estruturas;

import Negocio.Pessoas.Cook;
import Negocio.Servicos.Order;
import java.util.ArrayList;

public class Cozinha {
    private final ArrayList<Order> comandas;
    private final Cook cook;

    public Cozinha(Cook cook) {
        this.cook = cook;
        comandas = new ArrayList<Order>();
    }
    
    public void PrintClosedOrders(){
        Order order;
        for (Order comanda : comandas) {
            order = comanda;
            if((order.getStatus()).equals("Closed")){
                order.PrintOrder();
            }
        } 
    }
    
        public void PrintOpenedOrders(){
        Order order;
        for (Order comanda : comandas) {
            order = comanda;
            if((order.getStatus()).equals("Opened")){
                order.PrintOrder();
            }
        } 
    }
        
        public boolean CloseComandas(){
            Order order;
        for (Order comanda : comandas) {
            order = comanda;
            if((order.getStatus()).equals("Opened")){
                cook.CloseOrder(order);
            }
        }
            return true;
        }
        
}
    