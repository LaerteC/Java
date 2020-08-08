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
public class UsandoMinhaException {
    
    public static void main(String []args){
        
        int[] numeros={4,8,5,16,32,21,64,128};
        
        int[] denominador={2,0,4,8,0,4};
        
        for(int i=0;i<numeros.length;i++){
            
            try{
                if(numeros[i]%2!=0){
                    //Lançar a Exception
                    throw new DivisaoNaoExata(numeros[i],denominador[i]);
                }
                System.out.println(numeros[i]+ " /" +denominador[i]+ "="+(numeros[i]/denominador[i]));
            }
            catch(ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e){
                
                System.out.println(" Aconteceu um Erro");
                e.printStackTrace();
                
            }
            
            
            
        }
    }
    
}
