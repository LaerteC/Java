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
public class Exer7 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        int [] vetorA=new int[5];
        int [] vetorB=new int[vetorA.length];
        int [] vetorC=new int[vetorA.length];
        
        
        System.out.println("Vetor A ");
        
        for(int i=0;i<vetorA.length;i++){
            
            System.out.println(" Entre com um valor : ");
            vetorA[i]=scan.nextInt();
            
          
            
            
        }
        
        System.out.println("Vetor C");
        
        for(int i=0;i<vetorC.length;i++){
            
            System.out.println("Entre com um valor : ");
            vetorC[i]=scan.nextInt();
            
            
        }
        
        for(int i=0;i<vetorB.length;i++){
            
            vetorB[i]=vetorA[i]+vetorC[i];
            
        }
        
        
        
        System.out.println();
        
        System.out.println("Vetor A ");
        
        for(int a: vetorA){
            
            System.out.println(a);
        }
        
        System.out.println();
        
        System.out.println("Vetor c ");
        
        for(int c: vetorC){
            
            System.out.println(c);
        }
        
        System.out.println();
        
        System.out.println("Vetor B");
        
        for(int b: vetorB ){
            
            
            System.out.println(b);
        }
        
        
        System.out.println();
        
        
    }
    
}
