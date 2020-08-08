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
public class Exer10 {
    
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        int [] vetorA=new int [5];
        
        int [] vetorB=new int [vetorA.length];
        
        for(int i=0; i<vetorA.length;i++){
            
            System.out.println("Entre com o Vetor A");
            vetorA[i]=scan.nextInt();
        }
        
        for(int i =0; i<vetorB.length;i++){
            
            vetorB[i]=vetorA[i]%2;
            
            
        }
        
        System.out.println();
        
        System.out.println(" Vetor A");
        
        for(int i=0;i<vetorA.length;i++){
            
            System.out.println(vetorA[i]);
        }
        
        
        System.out.println();
        
        System.out.println("Vetor B");
        
        for(int i =0; i<vetorB.length;i++){
            
            System.out.println(vetorB[i]);
        }
    }
    
}
