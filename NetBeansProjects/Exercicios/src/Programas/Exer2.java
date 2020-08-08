/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Exer2 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        Aluno aluno1=new Aluno();
        
        System.out.println(" Entre com o nome do Aluno :");
        aluno1.setNome(scan.next());
        
        System.out.println(" Entre com o nome do Curso :");
        aluno1.setNomeCurso(scan.next());
        
        System.out.println(" Entre com a matrícula :");
        aluno1.setMatricula(scan.next());
        
        for(int i=0;i<aluno1.getNomeDisciplina().length();i++){
            System.out.println(" Entre com o nome da Disciplina :" +i);
            aluno1.setNomeDisciplinaPos(i, scan.next());
        }
        
        /* for(int i=0;i<aluno1.getNotaDisciplina().length();i++){
          System.out.println(" Obtendo notas da Disciplina :"+aluno1.getNomeDisciplina());
          for(int j=0;j<aluno1.getNotaDisciplina()[i].length;j++){
              System.out.println(" Entre com a Nota : "+ (j+1));
            aluno1.setNotaDisciplina(i, j, scan.nextDouble()); */
      }
       
       
    }
    

