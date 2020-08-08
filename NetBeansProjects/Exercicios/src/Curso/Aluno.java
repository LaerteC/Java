/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curso;

/**
 *
 * @author laerte
 */
public class Aluno {
    
    private String nome;
    private String matricula;
    private double[] notas;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public double[] getNotas(){
        return this.notas;
    }
    public void setNotas(double[] notas){
        this.notas=notas;
    }
    
    public String obterInfo(){
        
        String info =" Nome do Aluno :"+ this.nome + " - " ;
        info+= " Matrícula :"+ this.matricula +" - ";
        info+= " Notas ";
        
        double soma=0;
        
        for(double nota: notas){
            soma+=nota;
            info+=nota +" ";
        }
        double media=soma/4;
        
        info+= " \n" + " Média = " + media + " - ";
        
        if(media>=7){
            
            info+= " AProvado";
        }else{
            info+= " Reprovado";
        }
                
        return info;
    }
    public double obterMedia(){
        double soma=0;
        
        for(double nota:notas)
        {
            soma+=nota;
        }
          return soma/4;
    }
            
}
