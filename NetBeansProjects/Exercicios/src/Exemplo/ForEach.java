
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo;

import java.util.Random;

/**
 *
 * @author laerte
 */
public class ForEach {
    
    public static void main(String [] args){
        
        int [] notas=new int [10];
        
        Random aleatorio=new Random();
        
        for(int i=0;i<notas.length;i++){
                 
            notas[i]=aleatorio.nextInt(10);
            
        }
        
        for(int i=0;i<notas.length;i++){
            
            int nota=notas[i];
            
            System.out.println(nota + " ");
            
        }
        
        System.out.println();
        
        System.out.println(" Usando o For Each");
        
        for(int nota: notas){
            
            System.out.println(nota);
            
        }
    }
    
}
