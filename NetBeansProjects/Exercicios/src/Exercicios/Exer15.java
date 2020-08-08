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
public class Exer15 {
    
    public static void main (String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com uma Letra:");
        String letra=scan.next();
        
        //if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
         //       || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
            
        //    System.out.println("É uma Vogal");
       // }else{
       //     System.out.println("É uma consoante!!");
       // }
       
       if(letra.length()>1){
           
           System.out.println("Mais de uma Letra , Não pode!!!");
       }else{
       
       
       switch(letra){
           case "a": 
            
           case "e": 
           
           case "i": 
           
           case "o": 
            
           case "u": System.out.println("É uma vogal!!");
            break;
           default: System.out.println("É uma consoante!!!");
       }
       }
    }
}
