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
public class Exer27 {
    
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com um número: ");
        int num=scan.nextInt();
        
        if(num%2==0){
            System.out.println("É um numero Par");
        }else{
            System.out.println("É um numero Impar");
        }
    }
    
}
