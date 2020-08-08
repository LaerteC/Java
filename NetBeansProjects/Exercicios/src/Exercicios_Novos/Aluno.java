/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_Novos;

/**
 *
 * @author laerte
 */
public class Aluno {
    
    String nome;
    String matricula;
    String nomeCurso;
    String [] nomeDisciplina;
    double [][] notaDisciplinas;
    
    void mostrarInfo(){
        
        System.out.println(" Nome :"+ nome);
        System.out.println(" Matricula : " + matricula);
        System.out.println(" Nome do Curso :"+ nomeCurso);
        
        
        for(int i=0;i<notaDisciplinas.length;i++){
            
            System.out.println(" Notas da Disciplina " +nomeDisciplina[i]); 
            for(int j=0;j<notaDisciplinas[i].length;j++){
                
                System.out.println(notaDisciplinas[i][j]);
            }
            System.out.println();
        }
    }
    
}
