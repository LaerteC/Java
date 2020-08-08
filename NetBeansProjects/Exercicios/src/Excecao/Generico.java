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
public class Generico {
    public static void main(String []args){
        
        int[] numerador={2,4,8,16,32,64,128};
        
        int[] denominador={0,2,4,2,0,1};
        
        
        for(int i=0;i<numerador.length;i++){
            try{
                 System.out.println(numerador[i]+ "/"+denominador[i]+ " ="+ (numerador[i]/denominador[i]));
            }catch(ArithmeticException ex){
                
                System.out.println(" Deu uma exceção ao dividir , pode ser zero");
            }catch(Throwable ex){
                
                System.out.println(" Uma exceção pelo tamanho dos vetores serem diferente");
            }
           
        }
    }
    
}
