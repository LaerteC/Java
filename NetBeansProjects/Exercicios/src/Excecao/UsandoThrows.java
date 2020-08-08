/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laerte
 */
public class UsandoThrows {
    
    public static void main(String [] args){
        
        System.out.println("Entre com um numero Decimal:");
        try {
            double num=lerNumero();
            System.out.println(" Você entrou com o numero :"+num);
        } catch (Exception ex) {
            System.out.println(" Ocorreu um erro na entrada");
            ex.printStackTrace();
            
        }

    }
   public static double lerNumero() throws Exception{
       
       Scanner scan=new Scanner(System.in);
       
       double numero=scan.nextDouble();
       
       return numero;
   }
}
