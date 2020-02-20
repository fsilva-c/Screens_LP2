
package Pratos;
import java.util.ArrayList;

public class Food extends Menu_Item {
    private String steps;

    public Food(String steps, String name, float price) {
        super(name, price);
        this.steps = steps;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }
    
    @Override
    public void PrintItem(){
        super.PrintItem();
        System.out.println(steps);
    }
}
    
   