/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Media {
    
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        
        boolean sair=false;
        double soma=0;
        double media=0;
        int contador=0;
        
        while(!sair){
            
            System.out.println(" Entre com uma Nota ou 1 para sair :");
            String nota=scan.next();
          
            if(nota.equalsIgnoreCase("S")){
                
                sair=true;
            }else{
         
            double num = Double.parseDouble(nota);
            soma+=num;
            contador++;
            
            
            
        }
            media=soma/contador;
            
            System.out.println(" Sua média é :"+media);
        
    }
    
}
}
