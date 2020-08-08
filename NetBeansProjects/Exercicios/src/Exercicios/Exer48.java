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
public class Exer48 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com o número de Notas :");
        int qtd=scan.nextInt();
        
        double nota=0;
        double media=0;
        double soma=0;
        
        for(int i =1;i<=qtd;i++){
            
            System.out.println("Entre com um nota :");
            nota=scan.nextDouble();
            
            soma+=nota;
        }
        
        media=soma/qtd;
        
        System.out.println(" Soma : " +soma);
        
        System.out.println("A média é :" + media);
    }
}
