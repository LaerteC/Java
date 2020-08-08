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
public class Exer36 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        int num=0;
        int maior=Integer.MIN_VALUE;
        
        for(int i=0; i<5; i++){
            
            System.out.println("Entre com um número :");
            num=scan.nextInt();
         
            
             if(num>maior){
                
                maior=num; 
                
                System.out.println("O maior número mudou : "+maior);
            }
        }
        
            
            System.out.println("O maior número dentro todos é :" + maior);
    }
    
}
