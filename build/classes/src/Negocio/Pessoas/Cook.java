
package Negocio.Pessoas;

import Negocio.Servicos.Order;

public class Cook extends Person{
    
    public boolean CloseOrder(Order order){
            order.setStatus("Closed");
        return true;
    }
}
