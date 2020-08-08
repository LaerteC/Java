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
public class Exer49 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de Idades !");
        int qtd=scan.nextInt();
        
        int idade=0; 
        int soma=0;
        double media=0;
        
        for(int i=0;i<qtd;i++){
            
            System.out.println("Entre com uma Idade da pessoa : "+(i+1));
            idade=scan.nextInt();
            
            soma+=idade;
            
        }
        
        media=soma/qtd;
        
        System.out.println("A média em anos é : " +media);
        
        if(media>0 && media<=25){
            
            System.out.println("É uma turma Jovem");
            
        }else if(media >=26 && media<60){
            
            System.out.println("É uma turma Adulta");
            
        }else if(media>=60){
            
            System.out.println("É uma turma Idosa");
        }
        
    }
}
