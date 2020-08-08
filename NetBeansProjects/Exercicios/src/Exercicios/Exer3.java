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
public class Exer3 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero :");
        int num1=scan.nextInt();
        
        System.out.println("Digite o segundo numero:");
        int num2=scan.nextInt();
        
        int soma=num1+num2;
        
        System.out.println("A soma dos dois números é :" + soma);
    }
    
}
