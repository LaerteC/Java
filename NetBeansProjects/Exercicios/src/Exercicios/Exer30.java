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
public class Exer30 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com o Numero/Tipo da Carne( 1- File Duplo ; 2-Alcatra ; 3-Picanha");
        int tipo=scan.nextInt();
        
        System.out.println("Entre com a Quantidade em Quilos da Carne");
        double qtdCarne=scan.nextDouble();
        
       
        
        if(tipo==1){
            System.out.println("File Duplo");
        }else if(tipo==2){
            System.out.println("Alcatra");
        }else if(tipo==3){
            System.out.println("Picanha");
        }
        
         double precoCarne=0;
        
        switch (tipo) {
            case 1:
                if(qtdCarne<=5){
                    precoCarne=4.90;
                }else{
                    precoCarne=5.80;
                }   break;
            case 2:
                if(qtdCarne<=5){
                    precoCarne=5.90;
                }else{
                    precoCarne=6.80;
                }   break;
            case 3:
                if(qtdCarne<=5){
                    precoCarne=6.90;
                }else{
                    precoCarne=7.80;
                }   break;
            default:
                System.out.println("Valor inválido");
                break;
        }
        
        double total=precoCarne*qtdCarne;
        
        System.out.println("O Valor total da Carne é " +total);
        
    }
    
}
