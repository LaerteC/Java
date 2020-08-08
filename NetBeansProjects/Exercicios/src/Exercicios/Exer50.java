/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Exer50 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de turmas");
        int turmas=scan.nextInt();
        
        int alunos=0;
        int soma=0;
        boolean invalido=true;
        
        
        
        
            for(int i=1; i<=turmas;i++){
                
                invalido=true;
                
                do{
                
                System.out.println("Entre com o número de ALunos da turma" +i);
                alunos=scan.nextInt();
                
                if(alunos<=40){
                    
                    invalido=false;
                    
                }else{
                    
                    System.out.println("Número de ALunos é Inválido");
                }
                
                
            }while(invalido);
                
                soma+=alunos;
        
    }
            
            double media=soma/turmas; 
            
            System.out.println("Média : "+media);
    
}
}
