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
public class Calculadora {
    
    
    public static double somar(double num1,double num2){
        
        return num1+num2;
        
    }
    
    public static double subtrair(double num1,double num2){
        
        return num1-num2;
        
    }
    
    public static double multiplicar(double num1,double num2){
        
        return num1*num2;
        
    }
    
    public static double dividir(double num1,double num2){
        
        return num1/num2;
        
    }
    
    public static double potencia(double num1,double num2){
        
        double total=1;
        for(int i=1;i<=num2;i++){
          
           total*=num1;
        
        }
        
              return total;
            //return Math.pow(num1, num2);
        
    }
    
}
