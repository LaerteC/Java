/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Exer3 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        int [][] matriz=new int [3][3];
        
        int par=0;
        int impar=0;
        
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                
                System.out.println("Entre com os valores");
                matriz[i][j]=scan.nextInt();
            
            }
        }
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                
                System.out.print(matriz[i][j] + "  ");
                
                if(matriz[i][j]%2==0){
                    par++;
                }else{
                    impar++;
                }
                
            }
            System.out.println();
        }
        
        System.out.println("Quantidade de numeros Pares : "+par);
        
        System.out.println("Quantidade de numeros Impares : "+impar);
        
        
    }
}
