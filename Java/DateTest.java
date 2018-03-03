/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetest;

class Date{
    int dia;
    int mes;
    int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia < 1)
            this.dia = 1;
        else if(dia > 31)
            this.dia = 31;
        else
            this.dia = dia;
            
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes < 1)
            this.mes = 1;
        else if(mes > 12)
            this.mes = 12;
        else
            this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano < 0)
            this.ano = 1;
        else
            this.ano = ano;
    }
    
    public void displayDate(){
        System.out.println(dia+"/"+mes+"/"+ano);
    }
    
}

/**
 *
 * @author gwachs
 */
public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date d = new Date();
        d.setDia(5);
        d.setMes(2);
        d.setAno(2018);
        d.displayDate();
        
        Date d2 = new Date();
        d2.setDia(37);
        d2.setMes(-2);
        d2.setAno(12);
        d2.displayDate();
    }
    
}
