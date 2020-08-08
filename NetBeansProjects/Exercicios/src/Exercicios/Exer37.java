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
public class Exer37 {
    
    public static void main(String []args){
        
        Scanner scan=new Scanner(System.in);
        int num=0;
        double   media=0;
        int soma=0;
        
        
        for(int i=0; i<5;i++){
            System.out.println("Entre com um Número");
            num=scan.nextInt();
            
            soma+=num;
        }
        
        media=soma/5;
        
        System.out.println("A soma total é : " +soma);
        
        System.out.println("A média total :" +media);
        
        
    }
    
}
