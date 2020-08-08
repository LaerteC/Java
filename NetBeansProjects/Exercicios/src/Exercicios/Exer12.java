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
public class Exer12 {
    
    public static void main(String [] args)
    {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com o primeiro numero:");
        int num1=scan.nextInt();
        
        System.out.println("Entre com o Segundo número:");
        int num2=scan.nextInt();
        
        if(num1>num2){
            System.out.println("Num1- O primeiro número é o maior :"+num1);
        }else{
            System.out.println("NUm2- O Segundo número é o maior : " +num2);
        }
        
    }
    
}
