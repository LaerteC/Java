/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula41;

/**
 *
 * @author laerte
 */
public class Teste {
    
    public static void main(String [] args){
        
        Pessoa pessoa=new Pessoa();
      //  Pessoa aluno=new Aluno();
      //  Pessoa professor=new Professor();
        
        
       Aluno aluno=new Aluno();
       double [] notas={10,2,9,8};
       
       aluno.setCurso("Ciência da Computação");
       aluno.setNotas(notas);
       
      
        System.out.println(aluno);
        
        String nome1="Laerte";
        
        String nome2="LAERTE";
        
        System.out.println(nome1.equalsIgnoreCase(nome2));
        
        Aluno aluno1=new Aluno();
        
        aluno1.setCurso("Análise de Sistemas");
        
        double[] nota={45,48,56};
        
        aluno1.setNotas(nota);
        
        System.out.println(aluno==aluno1);
        
    }
    
}
