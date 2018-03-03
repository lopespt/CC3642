/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1java;

class Funcionario {

    String nome;
    String sobrenome;
    double salario;

    public void setSobrenome(String novoSobrenome) {
        sobrenome = novoSobrenome;
    }

    public void setSalario(double novoSalario) {
        if(novoSalario < 0)
            salario = 0;
        else
            salario = novoSalario;

    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public double getSalario(){
        return salario;
    }

    public void imprime(){
        System.out.println("nome: " + getNome());
        System.out.println("sobrenome: " + getSobrenome());
        System.out.println("salario anual: " + getSalario()*12);
    }
    
}

/**
 *
 * @author gwachs
 */
public class Ex1Java {    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        f.setNome("Adriano");
        f.setSobrenome("Lopes");
        f.setSalario(30000.25);
        
        Funcionario g = new Funcionario();
        g.setNome("Gilmar");
        g.setSobrenome("Mendes");
        g.setSalario(9999999);
        
        
        f.imprime();
        g.imprime();
        
        
        f.setSalario(f.getSalario()*1.1);
        g.setSalario(g.getSalario()*1.1);
        
        f.imprime();
        g.imprime();
        
    }

}
