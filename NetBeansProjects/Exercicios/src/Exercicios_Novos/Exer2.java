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
public class Exer2 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        int [] vetorA=new int[5];
        
        int [] vetorB=new int[vetorA.length];
        
        for(int i=0;i<vetorA.length;i++){
            
            System.out.println("Entre com o valor da posição "+i);
            vetorA[i]=scan.nextInt();
            
            
        }
        
        System.out.println("Aqui fica os numeros do Vetor de A: " );
        
        for(int i=0;i<vetorA.length;i++){
            
            System.out.print(vetorA[i]+" ");
        }
        
       for(int i =0;i<vetorA.length;i++){
           
           vetorB[i]=vetorA[i];
       }
       
         System.out.println();
         System.out.print("Aqui fica os vetores de B :");
        
       for(int i=0;i<vetorB.length;i++){
           
           System.out.print(vetorB[i]+" ");
       }
       
     
       
     
         
         
        
    }
    
}
