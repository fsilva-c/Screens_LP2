
package Negocio.Pratos;

public class Menu_Item{
	protected String name;
	protected float price;
	
	public Menu_Item(String name, float price){
		this.name = name;
		this.price = price;
	}
	
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
	
}// END class
