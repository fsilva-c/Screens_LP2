
package Negocio;

public class Cook extends Person{
    
    Cook(String name, String pswd){
        super(name,pswd);
    }
    
    public boolean CloseOrder(Order order){
            order.setStatus("Closed");
        return true;
    }
}
