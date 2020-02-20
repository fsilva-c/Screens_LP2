
package Estruturas;

import Pessoas.Cook;
import Servicos.Order;
import java.util.ArrayList;

public class Cozinha {
    private ArrayList<Order> comandas;
    private Cook cook;

    public Cozinha(Cook cook) {
        this.cook = cook;
        comandas = new ArrayList<Order>();
    }
    
    public void PrintClosedOrders(){
        Order order;
        for(int index = 0; index < comandas.size(); index++){
            order = comandas.get(index);
            if((order.getStatus()).equals("Closed")){
                order.PrintOrder();
            }
        } 
    }
    
        public void PrintOpenedOrders(){
        Order order;
        for(int index = 0; index < comandas.size(); index++){
            order = comandas.get(index);
            if((order.getStatus()).equals("Opened")){
                order.PrintOrder();
            }
        } 
    }
        
        public boolean CloseComandas(){
            Order order;
            for(int index = 0; index < comandas.size(); index++){
                order = comandas.get(index);
                if((order.getStatus()).equals("Opened")){
                    cook.CloseOrder(order);
                }
            }
            return true;
        }
        
}
    