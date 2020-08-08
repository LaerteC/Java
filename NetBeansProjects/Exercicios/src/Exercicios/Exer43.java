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
public class Exer43 {
    
    
    
     static int fib(int n){
            
            if(n<2){
                
                return n;
            }else{
                return fib(n-1)+fib(n-2);
            }
        
        
        }
    
    public static void main(String [] args){
        
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com um Número");
        int num1=scan.nextInt();
        
        for(int i=0;i<num1;i++){
        
            System.out.println(" "+ Exer43.fib(i)+ "\t");
    }
    
}
}