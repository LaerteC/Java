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
public class Exer32 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        String nome ,senha;
        boolean validaSenha=false;
        
        
        do{
        System.out.println("Entre com o Nome");
        nome=scan.next();
        
        System.out.println("Entre com uma Senha");
         senha=scan.next();
        
        
        if(nome.equalsIgnoreCase(senha)){
             validaSenha=false;
            System.out.println("Você digitou um nome igual a senha digite novamente");
           
        }else{
            validaSenha=true;
            System.out.println("Digitado com Sucesso o Nome e Senha");
        }
        
        
    }while(!validaSenha);
    
}
}
