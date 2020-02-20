
package Servicos;

import Pratos.Menu_Item;

public class Order_Item {
    private Menu_Item item;
    private int quantity;

    public Order_Item(Menu_Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public Menu_Item getItem() {
        return item;
    }

    public void setItem(Menu_Item item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
