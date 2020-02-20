
package Pessoas;

import Servicos.Order;

public class Cook extends Person{
    
    Cook(String name, String login, String pswd){
        super(name,login,pswd);
    }
    
    public boolean CloseOrder(Order order){
            order.setStatus("Closed");
        return true;
    }
}
