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
public class Excecao {
    
    public static void main(String []args){
       
        try{
            int[] vetor=new int [4];
        
        System.out.println("ESSA MENSAGEM SERÁ EXIBIDA");
        
        vetor[4]=1;
        
        }catch(ArrayIndexOutOfBoundsException exception){
            
            System.out.println(" Aqui eu pego a exceção");
        }
        
       
    }
    
}
