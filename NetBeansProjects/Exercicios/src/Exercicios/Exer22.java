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
public class Exer22 {
    
    public static void main( String[] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com um numero que corresponde ao dia da Semana: (1--7)");
        int dia=scan.nextInt();
        
        switch(dia){
            case 1:System.out.println("Segunda-Feira");break;
            case 2:System.out.println("Terça-Feira");break;
            case 3:System.out.println("Quarta-Feira");break;
            case 4:System.out.println("Quinta-Feira");break;
            case 5:System.out.println("Sexta-Feira");break;
            case 6:System.out.println("Sábado");break;
            case 7:System.out.println("Domingo");break;
            default:System.out.println("Valor Inválido!!!");
        }
        
    }
    
}
