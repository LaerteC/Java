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
public class Exer31 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        boolean notaValida=false;
        
       
         
        
        do{
            
        System.out.println("Entre com uma nota de 0 -10 ");
        double nota=scan.nextDouble();
        
        if(nota>=0 && nota <=10)
        {
            System.out.println("Você digitou uma nota Certa" + nota);
            notaValida=true;
        }else{
            
            System.out.println("Você digitou uma nota Incorreta");
            
        }
    
        
        }while(!notaValida);
        }
}