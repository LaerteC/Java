/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Exercicio {
    
    public static void main(String [] args){
        
        Pilha<Integer> pilha=new Pilha<>();
        
        Scanner scan= new Scanner(System.in); 
        
        for(int i =0;i<=10;i++){
            
            System.out.println(" Entre com um número");
            
            int num=scan.nextInt();
            
            if(num%2==0){
                pilha.empilhar(num);
                
                System.out.println(" Empilhando o Número");
            }else{
                
                     Integer desempilhado =pilha.desempilhar();
                     
                     if(desempilhado==null){
                         System.out.println(" Pilha está Vazia");
                     }else{
                         System.out.println(" Número Ímpar , A pilha será desempilhada "+ desempilhado);
                     }
                
            }
        }
        
        System.out.println(" Todos os números foram lidos, Desempilhando Números da Pilha");
        
        while(!pilha.estaVazio()){
            
            Integer desempilhado=pilha.desempilhar();
            
            System.out.println(" Desempilhando a Pilha"+ desempilhado);
           
        }
        
        System.out.println(" Todos os Elementos foram Desempilhados");
    }
    
}
