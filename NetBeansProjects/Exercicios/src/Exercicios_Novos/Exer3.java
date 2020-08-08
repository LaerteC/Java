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
public class Exer3 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        int [] vetorA=new int[8];
        int [] vetorB=new int[vetorA.length];
        
        
        for(int i=0;i<vetorA.length;i++){
            
            System.out.println("Entre com os elementos do vetor A: "+i);
            vetorA[i]=scan.nextInt();
            
            vetorB[i]=2*vetorA[i];
            
        }
        
        System.out.println();
        
        System.out.println("Os valores do Vetor A : ");
        
        for(int i=0;i<vetorA.length;i++){
            
            System.out.print(vetorA[i]+" ");
        }
        
        System.out.println();
        
        System.out.println("Os valores do Vetor B : ");
        
        for(int i=0;i<vetorB.length;i++){
            
            System.out.print(vetorB[i]+" ");
            
        }
        
    }
}
