/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

/**
 *
 * @author laerte
 */
public class TesteCalculadora {
    
    public static void main(String [] args){
        
        MinhaCalculadora calc= new MinhaCalculadora();
       
       
        calc.soma(1.5, 1.9);
        
        System.out.println(" A soma :" +calc.soma(4,5));
        
        System.out.println(" A soma de Doubles : " +calc.soma(1.9,8.3));
        
        //System.out.println(" A soma do  Vetor :" +calc.soma([4,5,2]));
    }
    
}
