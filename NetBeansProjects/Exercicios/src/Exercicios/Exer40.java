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
public class Exer40 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Informe um Número :");
        int num1=scan.nextInt();
        
        System.out.println("Tabuada do "+num1);
        
        for(int i=1;i<=10; i++){
            
            
            
            System.out.println(" "+ num1 +" x "+ i +" =" +num1*i);
         
            
        }
        
        
        
    }
    
}
