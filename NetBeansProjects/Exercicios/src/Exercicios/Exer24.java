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


public class Exer24 {
    
    public static void main(String [] args){
       Scanner scan=new Scanner(System.in);
       
       System.out.println("Entre com o Lado 1");
       int lado1=scan.nextInt();
       
       System.out.println("Entre com o lado 2");
       int lado2=scan.nextInt();
       
       System.out.println("Entre com o lado 3");
       int lado3=scan.nextInt();
       
       
       if(((lado1+lado2)>lado3 )
               || ((lado2+lado3)>lado1)
               || ((lado1+lado3)>lado2)){
           
         if(lado1==lado2 && lado1==lado3){
             
             System.out.println("Triângulo Equilátero");
             
         }else if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3) {
             
             System.out.println("Triângulo Escaleno!!!");
             
         }else if(lado1==lado2 || lado1==lado3 || lado2==lado3) {
             
             System.out.println("Triângulo Isósceles");
             
         }  
}else{
           System.out.println("Não é um Triângulo");
       }
    }
}