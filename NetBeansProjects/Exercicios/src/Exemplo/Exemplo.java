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
public class Exemplo {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        double [][] notasAlunos=new double[2][4];
        
        notasAlunos[0][0]=8.2;
        notasAlunos[0][1]=5.6;
        notasAlunos[0][2]=9.7;
        notasAlunos[0][3]=4.8;
        
        
        notasAlunos[1][0]=7.5;
        notasAlunos[1][1]=4.6;
        notasAlunos[1][2]=2.3;
        notasAlunos[1][3]=1.8;
        
      
        
        for(int i=0;i<notasAlunos.length;i++){
            
            for(int j=0;j<notasAlunos[i].length;j++){
                
                System.out.println(notasAlunos[i][j]+"  ");
            }
        }
        System.out.println();
        
        notasAlunos[1][3]=8.5;
        
        for(int i=0; i<notasAlunos.length;i++){
            
            for(int j=0;j<notasAlunos[i].length;j++){
                
                System.out.println(notasAlunos[i][j] + " ");
            }
        }
        
        System.out.println("Calculo da Média");
        
        double soma=0;
        double media=0;
        for(int i=0;i<notasAlunos.length;i++){
            for(int j=0;j<notasAlunos[i].length;j++){
                soma+=notasAlunos[i][j];
                media=soma/4;
         
                
                
        }
            
             System.out.println(" Média do Aluno: " +i+ "é =" +media );
            
    }
    
}
}
