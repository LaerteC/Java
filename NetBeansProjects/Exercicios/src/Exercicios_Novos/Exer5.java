/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_Novos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Exer5 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        int [] vetorA=new int[5];
        double [] vetorB=new double[vetorA.length];
        
        
        for(int i=0;i<vetorA.length;i++){
            
          System.out.println("Entre com numeros");
          vetorA[i]=scan.nextInt();
          
          vetorB[i]=Math.sqrt(vetorA[i]);
            
    }
        
        DecimalFormat df=new DecimalFormat("###,#####.###");
        
        System.out.println();
        
        System.out.println("Vetor A :");
        
        for(int i=0; i<vetorA.length;i++){
            
            System.out.println(df.format(vetorA[i])+"");
        }
        
        System.out.println();
        
        System.out.println("Vetor B");
        
        for(int i=0;i<vetorB.length;i++){
            
            System.out.println(df.format(vetorB[i]) +"");
            
        }
    }
    
}
