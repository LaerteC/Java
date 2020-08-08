/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class TesteCal {
    
    public static void main(String [] args){
        
        imprimirTela(Calculadora.somar(45, 590));
        Scanner scan=new Scanner(System.in);
        
        System.out.println(" Entre com um numero :");
        double num1=scan.nextDouble();
        
        System.out.println(" ENtre com outro numero :");
        double num2=scan.nextDouble();
        
        imprimirTela(Calculadora.multiplicar(num1, num2));
        imprimirTela(Calculadora.dividir(num1, num2));
        imprimirTela(Calculadora.somar(num1, num2));
        imprimirTela(Calculadora.potencia(num1, num2));
        
    }
    
    static void imprimirTela(double num){
        
        System.out.println(num);
        
    }
    
}
