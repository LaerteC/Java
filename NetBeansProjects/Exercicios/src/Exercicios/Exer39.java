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
public class Exer39 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        int soma=0;
        
        System.out.println("Entre com um Número :");
        int num1=scan.nextInt();
        
        System.out.println("Entre com um Segundo Número :");
        int num2=scan.nextInt();
        
        for(int num=num1;num<=num2;num++){
            soma+=num;
            System.out.println(" " +num);
            
        }
        System.out.println(" " +soma);
    }
    
}
