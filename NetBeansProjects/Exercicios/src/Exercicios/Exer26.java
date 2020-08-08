/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author laerte
 */

import java.util.Scanner;

public class Exer26 {
    
    public static void main(String []args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com um ano");
        int ano=scan.nextInt();
        
        if((ano%4==0 && ano%100!=0)||ano%400==0){
            
            System.out.println("É um Ano Bissexto!!!");
        }else{
            
            System.out.println("É um Ano Normal!!!");
        }
    }
    
}
