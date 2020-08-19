/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

/**
 *
 * @author laerte
 */
public class Palindromo {
    
    public static void main(String [] args){
        
        imprimirResultado("ABBA");
    }
    
    
    public static void imprimirResultado(String palavra){
        
        System.out.println( palavra +" É palindromo ?" +testarPalindromo(palavra));
    }
    
    public static boolean testarPalindromo(String palavra){
        
        Pilha<Character> pilha= new Pilha<>();
        
        for(int i=0;i<palavra.length();i++){
            pilha.empilhar(palavra.charAt(i));
            
        }
        String palavraInversa="";
        
        while(!pilha.estaVazio()){
            
            palavraInversa+=pilha.desempilhar();
        }
        
        if(palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }
        return false;
    }
    
   
}
