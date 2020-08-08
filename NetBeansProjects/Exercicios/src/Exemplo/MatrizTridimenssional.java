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
public class MatrizTridimenssional {
    
    public static void main(String [] args){
        
        int [] [] [] matriz= new int [3][3][3];
        
        for(int i=0; i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                for(int k=0;k<matriz[i][j].length;k++){
                    
                    System.out.println(" i ="+ i + " - j ="+ j + " - k =" + k);
                    
                    matriz[i][j][k]=i+j+k;
                    
                  
                }
            }
        }
        
        int soma=0;
        int pares=0;
        int impar=0; 
       
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                for(int k=0;k<matriz[i][j].length;k++){
                    
                   soma+=matriz[i][j][k];
                   
                   if(matriz[i][j][k]%2==0){
                       
                       pares+=matriz[i][j][k];
                   }else{
                       
                       impar+=matriz[i][j][k];
                       
                   }
                }
            }
        }
        
       System.out.println(" A som total:" +soma);
       
       System.out.println("A soma dos Ímpares : " +pares);
       
       System.out.println("A soma dos Pares : " +impar);
    }
    
}
