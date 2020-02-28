package Negocio;

public class Drink extends Menu_Item{
    private String provider;

    public Drink(String fornecedor, String name, float price) {
        super(name, price);
        this.provider = fornecedor;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String fornecedor) {
        this.provider = fornecedor;
    }
    
    @Override
        public void PrintItem(){
        super.PrintItem();
        System.out.println(provider);
    }
}
