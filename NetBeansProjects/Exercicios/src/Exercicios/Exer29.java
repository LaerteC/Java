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
public class Exer29 {
    
    public static void main(String []args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com a Quantidade de Morango em Kg");
        double qtdMorango=scan.nextDouble();
        
        System.out.println("Entre com a quantidade de Maçã em Kg");
        double qtdMaca=scan.nextDouble();
        
        double precoMorango=0;
        
        if(qtdMorango<=5){
            precoMorango=2.5;
        }else{
            precoMorango=2.2;
        }
        
        double precoMaca=0;
        
        if(qtdMaca<=5){
            precoMaca=1.8;
        }else{
            precoMaca=1.5;
        }
        
        double precoTotalMorango=qtdMorango*precoMorango;
        
        double precoTotalMaca=qtdMaca*precoMaca;
        
        double precoParcial=precoTotalMorango+precoTotalMaca;
        double precoTotal=precoParcial;
        
        
        if((qtdMorango+qtdMaca>8)||precoParcial>25) {
            
            precoTotal=precoParcial - (precoParcial/100)*10;
            
        }
        System.out.println("Preço Total:" +precoTotal);
    }
    
}
