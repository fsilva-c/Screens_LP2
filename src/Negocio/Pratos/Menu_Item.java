
package Negocio.Pratos;

public class Menu_Item{
        protected int id;
	protected String name;
	protected float price;
	
	public void PrintItem(){
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
 
        public float getPrice(){
		return price;
	}
	
	public void setPrice(float price){
		this.price = price;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
	
        
}// END class
