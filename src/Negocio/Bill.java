
package Negocio;

public class Bill{
    private static int contador;
    private int numero;
    private Client client;
    private Date date;
    private float value;
    private String payment_method;
    private Order order;

    public Bill(Client client, Date date) {
        this.client = client;
        this.date = date;
        contador++;
        numero = contador;
    }

    public void PrintBill(){
        System.out.println(numero);
        date.PrintDate();
        client.getCpf();
        order.PrintOrder();
        System.out.println(payment_method);
        System.out.println(value);
    }
    
    public float CalcBill(){
        value = order.CalcValue();
        if(CheckBonus()){
            value -= (client.getBonus()).getValue();
        }
        if(value < 0)
            value = 0;
        return value;
    }
             
    public boolean MakeOrder(Menu_Item item, int quantity){
        if(payment_method == null){
            //Menu.PrintMenu(); Responsabilidade da interface grafica
            Order_Item new_item = new Order_Item(item, quantity);
            order.AddItem(new_item);
        }
        return true;
    }
    
       
    public boolean CloseBill(String payment_method){
        System.out.println(CalcBill());
        this.payment_method = payment_method;
        CalcBonus();
        return true;
    }
    
    private boolean CheckBonus(){
        Bonus bonus = client.getBonus();
        return !(date.CheckDate(bonus.getDate()));
    }
    
    public float CalcBonus(){
        float client_bonus = 0f;
        if(payment_method != null){
            client_bonus = order.CalcValue()*0.10f;
            if((client.getBonus()).getValue() > order.CalcValue())
                client_bonus += ((client.getBonus()).getValue() - order.CalcValue());
            Bonus new_bonus = new Bonus(client_bonus, this.getDate());
            client.AttBonus(new_bonus);
            return client_bonus;
        }
        System.out.println("A conta ainda nao foi fechada");
        return client_bonus;
    }
    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }
    
    
}

