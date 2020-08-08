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
public class Exer42 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        int par=0;
        int impar=0;
        
        
        for(int i=0;i<10;i++){
            
            System.out.println("Entre com um Número");
            int num=scan.nextInt();
            
            if(num%2==0){
                par++;
            }else{
                impar++;
            }
            
        }
        
        System.out.println("Números Ímpares " + impar);
        
        System.out.println("Números Pares" + par);
    }
    
}
