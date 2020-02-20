package Servicos;

public class Date {
    private int ano, mes, dia;

    public Date(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public boolean CheckDate(Date date){
        return ((date.getAno() == ano) && (date.getMes() == mes) && (date.getDia() == dia));
    }
    
    public void PrintDate(){
        System.out.println(ano + ':');
        System.out.println(mes + ':');
        System.out.println(dia + ':');
    }
}
