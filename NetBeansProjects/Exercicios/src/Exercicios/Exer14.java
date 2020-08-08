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
public class Exer14 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com uma letra: Preferencialmente 'm' e 'f'");
        String nome=scan.next();
        
        if(nome.equalsIgnoreCase("f")){
            System.out.println("Sexo Feminino:" +nome);
        }else if(nome.equalsIgnoreCase("m")){
            System.out.println("Sexo Masculino:" +nome);
        }else{
            System.out.println("Valor Inválido !!!");
        }
        
        
    }
    
}
