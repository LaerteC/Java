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
public class Exer6 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com o Raio");
        double raio=scan.nextDouble();
        
        double area= Math.PI*Math.pow(raio,2);
        
        System.out.println("O valor da área é:" +area);
    }
    
}
