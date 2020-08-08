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
public class Exer8 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        int [] vetorA=new int[5];
        
        int [] vetorB=new int[vetorA.length];
        
        int [] vetorC=new int[vetorA.length];
        
        
        for(int i=0;i<vetorA.length;i++){
            
            System.out.println("Entre com números ");
            vetorA[i]=scan.nextInt();
          
        }
        
        for(int i=0;i<vetorB.length;i++){
            
            System.out.println("Entre com números :");
            vetorB[i]=scan.nextInt();
            
        }
        
        for(int i=0;i<vetorC.length;i++){
            
            vetorC[i]=vetorA[i]-vetorB[i];
            
        }
        
        System.out.println();
        
        System.out.println("Vetor A");
        
        for(int i=0;i<vetorA.length;i++){
            
            System.out.println(vetorA[i]);
        }
        
        System.out.println();
        
        System.out.println("Vetor B");
        
        for(int i=0;i<vetorB.length;i++){
          
            System.out.println(vetorB[i]);
            
        }
        
        System.out.println();
        
        System.out.println("Vetor C");
        
        for(int i=0;i<vetorC.length;i++){
            
            System.out.println(vetorC[i]);
            
        }
        
    }
    
}
