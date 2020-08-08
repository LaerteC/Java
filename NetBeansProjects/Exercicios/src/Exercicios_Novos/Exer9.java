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
public class Exer9 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        double [] vetorA=new double [5];
        double [] vetorB=new double [vetorA.length];
        double [] vetorC=new double [vetorA.length];
        
        for(int i=0;i<vetorA.length;i++){
            
            System.out.println("Entre com o vetor A : ");
            vetorA[i]=scan.nextDouble();
            
            
            
            
        }
        
        for(int i=0;i<vetorB.length;i++){
            
            System.out.println("Entre com o vetor B : ");
            vetorB[i]=scan.nextDouble();
            
           
            
            
        }
        
        for(int i =0;i<vetorC.length;i++){
            
            vetorC[i]=vetorA[i]/(vetorB[i]);
            
            System.out.println("Vetor C : " +vetorC[i]);
        }
        
        
        
        
    }
    
}
