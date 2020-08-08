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
public class Exer25 {
    
    public static void main(String []args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com o valor de A");
        int a=scan.nextInt();
        
        
        
        if(a==0){
            System.out.println("Não é equação quadrática!!!");
            
        }else{
            System.out.println("Entre com o valor de B");
        int b=scan.nextInt();
        
        System.out.println("Entre com o valor de C");
        int c=scan.nextInt();
        
        
        double delta=(b*b)-4*a*c;
        if(delta<0){
        System.out.println("Delta negativo não possui valores reais-- Suas Raízes " +delta);
        }
        System.out.println("O delta calculado da equação do segundo grau "+delta);
        
        
        
        
    }
}
}
