/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super;

/**
 *
 * @author laerte
 */
public class Professor extends Pessoa{
    
    private double salario;
    private String nomeCurso;
    
    public Professor(){
        this.nomeVisibilidade="tetse";
    }
    
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
    
    public String obterEtiqueta(){
        
        String s =" Endereço do Professor :";
        s+=super.getEndereco();
        
        return s;
    }
}
