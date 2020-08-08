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
public class MultiplosCatch {
    
    public static void main(String [] args){
        
        int [] numeros={4,8,16,32,64,128};
        
        int [] denominador={2,0,4,8,0};
        
        for(int i=0; i<numeros.length;i++){
            try{
                System.out.println(numeros[i] +"/"+ denominador[i]+ " ="+(numeros[i]/denominador[i]));
               }
            // Captura o erro !!!
            catch(Exception e1){
                
                System.out.println(e1.getMessage());  
                e1.printStackTrace();
            }
        }
    }
    
}
