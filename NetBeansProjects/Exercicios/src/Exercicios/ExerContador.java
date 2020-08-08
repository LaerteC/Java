/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author laerte
 */
public class ExerContador {
    
    static void imprimirValor(){
        
        System.out.println(Contador.obterValor());
        
    }
    
    public static void main(String []args){
        
        imprimirValor();
         
        Contador.incrementar();
        
        imprimirValor();
        
        Contador.zerarContador();
        
        imprimirValor();
        
       Contador.incrementar();
       
       Contador.incrementar();
       
       imprimirValor();
       
       Contador c1=new Contador();
       
       Contador c2=new Contador();
       
       imprimirValor();
        
        
    }
    
}
