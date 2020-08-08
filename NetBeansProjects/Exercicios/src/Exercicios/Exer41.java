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
public class Exer41 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com um número :");
        int base=scan.nextInt();
        
        System.out.println("Entre com o Segundo Número :");
        int potencia=scan.nextInt();
        
        int resultado=base;
        
        for(int i=1;i<potencia;i++){
            resultado *=base;
        }
        
        System.out.println(resultado);
    }
    
}
