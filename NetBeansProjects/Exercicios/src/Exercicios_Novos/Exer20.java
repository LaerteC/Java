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
public class Exer20 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        
        Aluno aluno=new Aluno();
        aluno.notaDisciplinas=new double[3][4];
        aluno.nomeDisciplina=new String[3];
        
        
        System.out.println(" Entre com o nome do Aluno");
        aluno.nome=scan.next();
        
        System.out.println(" Entre com o nome do Curso :");
        aluno.nomeCurso=scan.next();
        
        System.out.println(" Entre com a matrícula :");
        aluno.matricula=scan.next();
        
        for(int i=0;i<aluno.nomeDisciplina.length;i++){
            System.out.println(" Entre com o nome da disciplina :"+ (i+1));
            aluno.nomeDisciplina[i]=scan.next();
            
        }
        
        for(int i=0;i<aluno.notaDisciplinas.length;i++){
            
            System.out.println(" Obtendo notas da Disciplinas:" +aluno.nomeDisciplina[i]);
            
            for(int j=0;j<aluno.notaDisciplinas[i].length;j++){
                
                System.out.println(" Entre com a nota " +(j+1));
                aluno.notaDisciplinas[i][j]=scan.nextDouble();
                
            }
        }
        
        aluno.mostrarInfo();
    }
    
}
