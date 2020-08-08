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
public class Exer9 {
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com a temperatura:");
        double faren=scan.nextDouble();
         
        double celsius= (5*(faren-32)/9);
        
        System.out.println(" A temperatura em Celsius é :" +celsius);
    }
}
