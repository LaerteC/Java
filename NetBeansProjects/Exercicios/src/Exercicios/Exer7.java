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
public class Exer7 {
    
    
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println(" Digite uma área de um quadrado:");
        double area=scan.nextDouble();
        
        double quad=area*area;
        double quad2=Math.pow(area, 4);
        
        System.out.println("O valor correspondente é :"+ quad);
        System.out.println("O valor correspondente 2 é :"+quad2);
    }
}
