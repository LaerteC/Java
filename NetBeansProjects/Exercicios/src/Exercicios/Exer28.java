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

public class Exer28 {
    
    public static void main(String []args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com o primeiro Numero");
        int num1=scan.nextInt();
        
        System.out.println("Entre com o Segundo Numero");
        int num2=scan.nextInt();
        
        System.out.println("Entre com a operação (+ - * / )");
        String operacao=scan.next();
        
        boolean valida=true;
        double resultado=0;
        
        switch(operacao){
            
            case "+": resultado=num1+num2;break;
            case "-": resultado=num1-num2;break;
            case "*": resultado=num1*num2;break;
            case "/": resultado=num1/num2;break;
            default: 
                System.out.println("Valor Inválido!!!");
                valida=false;break;
        }
        
        System.out.println("Valor do Cálculo:" +resultado);
        
        if(valida){
        
        if(resultado<0){
            System.out.println("Valor Negativo!");
        }else{
            System.out.println("Valor Positivo!");
        }
        
        if(resultado%2==0){
            System.out.println("Resultado é Par");
        }else{
            System.out.println("Resultado é Impar");
        }
    }else{
            System.out.println("Operação Inválida");
        }
    }
}
