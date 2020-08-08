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
public class Exer19 {
    
    public static void main (String [] args){
      
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com uma letra: M de (Matutino), V de (Vespertino) ou N de (Noturno)!!!");
        String turno=scan.next();
        
      switch(turno){
          case "m":
          case "M": System.out.println("Bom dia!!!"); break;
          
          case "v":
          case "V": System.out.println("Boa Tarde!!");break;
          
          case "n":
          case "N": System.out.println("Boa Noite!");break;
          
          default: System.out.println("Você digitou um valor Inválido!!!");
      }
}
}
