package Servicos;

public class Bonus {
//Atributos da classe
    private float value;
    private Date date;

    public Bonus(float value, Date date) {
        this.value = value;
        this.date = date;
    }


//Métodos da classe
    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
   
    
    
    
}
