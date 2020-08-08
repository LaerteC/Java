/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

/**
 *
 * @author laerte
 */
public class Professor extends Pessoa{
    
   
    private double salario;
    private String nomeCurso;
     
   
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario=salario;
    }
    public String getNomeCurso(){
        return this.nomeCurso;
    }
    public void setNomeCurso(String nomeCurso){
        this.nomeCurso=nomeCurso; 
    }
    public double calcularSalario(){
        
        return 0;
    }
    
}
