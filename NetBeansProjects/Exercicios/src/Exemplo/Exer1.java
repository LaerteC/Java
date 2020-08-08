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
public class Exer1 {
    
    public static void main(String [] args){
        
        int [][] numeros=new int [4][4];
        
        Random aleatorio=new Random();
        
        int maior=Integer.MIN_VALUE;
        
        int linha=0;
        int coluna=0;
        
        
        for(int i=0;i<numeros.length;i++){
            for(int j =0;j<numeros[i].length;j++){
                numeros[i][j]=aleatorio.nextInt(200);
              
             
                }
            }
        
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                
                if(numeros[i][j]>maior){
                    maior=numeros[i][j];
                    linha=i;
                    coluna=j;
                }
            }
        }
        
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        
              System.out.println(maior+ " Aqui o maior Número " + " Na posição em i-Linha : "+ linha+ " E na posição em j- Coluna : "+coluna);

        
        
    }
    
}