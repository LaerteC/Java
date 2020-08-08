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
public class Exer8 {
    
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com o valor/hora:");
        double valorhora=scan.nextDouble();
        
        System.out.println("Quantas horas por dia voçê trabalha:");
        double horas=scan.nextDouble();
        
        double valordia=valorhora*horas;
        
        double valormes=valordia*20;
        
        System.out.println("O valor mensal é :" +valormes);
    }
    
}
