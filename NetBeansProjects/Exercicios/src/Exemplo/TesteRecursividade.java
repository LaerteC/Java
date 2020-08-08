/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo;

/**
 *
 * @author laerte
 */
public class TesteRecursividade {
    
    public static void main(String [] args){
        Recursivo.fatorial(5);
        
        
        System.out.println(" O valor da função recursiva :");
        
        System.out.println( Recursivo.fatorialNaoRecursivo(5));
        
        System.out.println(Recursivo.fatorial(5));

        
    }
    
}
