/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_Novos;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Exer6 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        double [] vetorA=new double [5];
        double [] vetorB=new double [vetorA.length];
        
        
        for(int i=0; i<vetorA.length;i++){
            
            System.out.println("Entre com números do vetor A");
            vetorA[i]=scan.nextDouble();
            
            vetorB[i]=vetorA[i]*i;
            
        }
        
        System.out.println();
        
        System.out.println("Vetor A : ");
        
        for(double j: vetorA){
            
            System.out.print(j +" ");
            
        }
        
        System.out.println();
        
        System.out.println("Vetor B : ");
        
        for(double m: vetorB){
            
            System.out.print(m +" ");
        }
        
        
    }
    
}
