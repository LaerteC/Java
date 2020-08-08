/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao;

/**
 *
 * @author laerte
 */
public class VariosExcecao {
    
    public static void main(String [] args){
        int[] numerador={2,4,8,16,32,64,128};
        
        int[] denominador={0,2,4,2,0,1};
        
        
        for(int i=0;i<numerador.length;i++){    
            try{
                 System.out.println(numerador[i]+ "/"+denominador[i]+ " ="+ (numerador[i]/denominador[i]));
            }catch(ArithmeticException |ArrayIndexOutOfBoundsException ex){
                
                System.out.println(" Aconteceu um Erro !!!!!");
            }
           
        
        
    }
    }
}
