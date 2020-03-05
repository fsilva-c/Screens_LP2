package Negocio.Pratos;

public class Food extends Menu_Item {
    private String steps;

    public Food(String name, float price, String steps) {
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
    
   