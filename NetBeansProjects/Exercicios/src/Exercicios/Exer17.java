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
public class Exer17 {
    
    public static void main (String [] args){
        Scanner scan=new Scanner (System.in);
        
        System.out.println("Entre com um numero");
        double num1=scan.nextDouble();
        
        System.out.println("Entre com o segundo numero");
        double num2=scan.nextDouble();
        System.out.println("Entre com o terceiro Numero");
        double num3=scan.nextDouble();
        
        if(num1>num2 && num1 >num3){
            System.out.println("O numero 1 é o maior :"+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("Numero 2 é o maior :" +num2);
        }else{
            System.out.println("O numero 3 é o maior :" +num3);
        }
        
    }
    
}
