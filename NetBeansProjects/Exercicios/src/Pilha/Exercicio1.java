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
public class Exercicio1 {
    
    public static void main(String [] args){
        
        Pilha <Integer> par=new Pilha<>();
        
        Pilha <Integer> impar=new Pilha<>();
        
        Scanner scan=new Scanner(System.in);
        
        for(int i=1;i<=10;i++){
            
            System.out.println(" Entre com um número ");
            int num=scan.nextInt();
            
            
            if(num==0){
                
                // Desempilhando de Tudo !!!
                
                Integer desempilhado=par.desempilhar();
                
                if(desempilhado==null){
                    System.out.println(" Pilha Par está Vazia");
                }else{
                    System.out.println(" Desempilhando da Pilha Par !!!" +desempilhado);
                }
                
                
                
                desempilhado=impar.desempilhar();
                
                if(desempilhado==null){
                    System.out.println(" Pilha Impar está Vazia");
                }else{
                    
                    System.out.println(" Desempilhando da Pilha Impar !!!"+desempilhado);
                }
                
                
            }
            else if(num%2==0){
                
                par.empilhar(num);
                
                System.out.println(" Número par , Empilhando na Pilha Par");
                
            }else{
                
                impar.empilhar(num);
                
                System.out.println(" Número impar , Empilhando na Pilha Impar");
            }
        }
        
        System.out.println(" Desempilhando todos os números da Pilha Par");
        
        
        while(!par.estaVazio()){
            
            System.out.println(" Desempilhando da Pilha Par :"+ par.desempilhar());
        }
        
        
        
        System.out.println(" Desempilhando da Pilha Impar ");
        
        while(!impar.estaVazio()){
            
            System.out.println(" Desempilhando da Pilha Impar"+ impar.desempilhar());
        }
    }
    
}
