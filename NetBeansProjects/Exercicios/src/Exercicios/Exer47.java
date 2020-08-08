/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Exer47 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        double nota=0;
        double parar=0;
        double contador=0;
        double media=0;
        
        do{
            
            System.out.println("Entre com um Nota:");
            nota+=scan.nextDouble();
            
            contador++;
            
            
            System.out.println("Deseja Parar ? - Digite 1 , se não qualquer tecla e prossiga");
            parar=scan.nextDouble();
            
            
            
        }while(parar!=1);
        
        
        media=nota/contador;
        
        System.out.println("A média das " +contador+ " Notas é: "+media);
        
        
    }
    
}
