/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_Novos;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Exer13 {
    
    public static void main(String [] args){
        
       
        Scanner scan=new Scanner(System.in);
        
        char [] []  jogoVelha=new char [3][3];
        
        System.out.println(" Jogador 1 = X ");
        
        System.out.println(" Jogador 2 = O ");
        
        boolean ganhou=false;
        int jogada=1;
        char sinal;
        
        int linha=0, coluna=0;
        
        
        while(!ganhou){
            
            if(jogada%2==1){
                
                 System.out.println(" Vez do Jogador 1 : Escolha Linha e Coluna : ");
                 sinal='X';
            }else{
                
                System.out.println(" Vez do Jogador 2 : Escolha Linha e Coluna : ");
                sinal='O';  
            }
            
            boolean linhaValida=false;
            
                while(!linhaValida){
                    System.out.println(" Entre com a Linha: 1  - 2  - 3  "); 
                    linha=scan.nextInt();
                    
                    if(linha>=1 && linha<=3){
                        
                        linhaValida=true;
                    }else{
                        
                        System.out.println(" Entrada Inválida, tente novamente ");
                        
                    }
                }
                
                boolean colunaValida=false;
                
                while(!colunaValida){
                    System.out.println(" Entre com uma Coluna: 1  -  -3 ");
                    coluna=scan.nextInt();
                    
                   if(coluna>=1 && coluna <=3){
                       colunaValida=true;
                   }else{
                       System.out.println(" Entrada Inválida, tente novamente ");
                   }
                }
                
                linha--;
                coluna--;
                if(jogoVelha[linha][coluna]=='X' || jogoVelha[linha][coluna]=='O'){
                    
                    System.out.println("Posição já Usada, Tente novamente");
                    
                }else{
                    
                    jogoVelha[linha][coluna]=sinal;
                    jogada++;
                }
                
                for(int i=0;i<jogoVelha.length;i++){
                    for(int j=0;j<jogoVelha[i].length;j++){
                      
                        System.out.print(jogoVelha[i][j] + "|");
                        
                    }
                    System.out.println();
                    
                }
                
                
                if((jogoVelha[0][0]=='X' && jogoVelha[0][1]=='X' && jogoVelha[0][2]=='X') ||            //linha 1
                   (jogoVelha[1][0]=='X' && jogoVelha[1][1]=='X' && jogoVelha[1][2]=='X')  ||          // linha 2
                        (jogoVelha[2][0]=='X' && jogoVelha[2][1]=='X' && jogoVelha[2][2]=='X') ||        //  linha 3
                       (jogoVelha[0][0]=='X' && jogoVelha[1][0]=='X' && jogoVelha[2][0]=='X') ||
                        (jogoVelha[0][1]=='X' && jogoVelha[1][1]=='X' && jogoVelha[2][1]=='X') ||
                        (jogoVelha[0][2]=='X' && jogoVelha[1][2]=='X' && jogoVelha[2][2]=='X') ||
                        (jogoVelha[0][0]=='X' && jogoVelha[1][1]=='X' && jogoVelha[2][2]=='X')
                        
                        ){
                    
                    ganhou=true;
                    
                    System.out.println(" Parabéns , Jogador 1 Ganhou !!!");
                    
                }else if((jogoVelha[0][0]=='O' && jogoVelha[0][1]=='O' && jogoVelha[0][2]=='O') ||            //linha 1
                   (jogoVelha[1][0]=='O' && jogoVelha[1][1]=='O' && jogoVelha[1][2]=='O')  ||          // linha 2
                        (jogoVelha[2][0]=='O' && jogoVelha[2][1]=='O' && jogoVelha[2][2]=='O') ||        //  linha 3
                       (jogoVelha[0][0]=='O' && jogoVelha[1][0]=='O' && jogoVelha[2][0]=='O') ||
                        (jogoVelha[0][1]=='O' && jogoVelha[1][1]=='O' && jogoVelha[2][1]=='O') ||
                        (jogoVelha[0][2]=='O' && jogoVelha[1][2]=='O' && jogoVelha[2][2]=='O') ||
                        (jogoVelha[0][0]=='O' && jogoVelha[1][1]=='O' && jogoVelha[2][2]=='O')){
                    
                    ganhou=true;
                    
                    System.out.println(" Parabéns , Jogador 2 Ganhou !!!");
                    
                    
                }else if(jogada>9){
                    
                    ganhou=true;
                    
                    System.out.println(" Ninguém Ganhou a Partida !!!");
                }
            
        }
        
    }
    
}
