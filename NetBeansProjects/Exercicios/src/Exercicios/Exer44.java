/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author laerte
 */
public class Exer44 {
    
    public static void main(String [] args){
        
        int proximo=0;
        int primeiro=1;
        int segundo=1;
        
        System.out.println("" +primeiro);
        
        System.out.println("" +segundo);
        
        
      while(proximo<500){
          
          proximo=primeiro + segundo;
          
          primeiro= segundo;
          
          segundo= proximo;
          
          System.out.println(" " + proximo);
          
      }
        
    }
    
}
