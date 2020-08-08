/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Curso;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class TesteCurso {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println(" Entre com o nome do Curso :");
        String nomeCurso=scan.nextLine();
        
        System.out.println(" Entre com o horário do Curso :");
        String horario=scan.nextLine();
        
        System.out.println(" Entre com o nome do Professor: ");
        String nomeProf=scan.nextLine();
        
        System.out.println(" Entre com o Departamento :");
        String departamento=scan.nextLine();
        
        System.out.println(" Entre com o Email :");
        String email=scan.nextLine();
        
        //Cria um objeto do tipo Curso e coloco as variáveis dentro dele.
        Curso curso=new Curso();
        
        curso.setNome(nomeCurso);
        curso.setHorario(horario);
        
        
        // Cria um objeto do tipo Professor e coloco as variáveis dentro dele.
        Professor professor=new Professor();
        
        professor.setNome(nomeProf);
        professor.setDepartamento(departamento);
        professor.setEmail(email);
        
        curso.setProfessor(professor);
        
        
        System.out.println(" ---- Alunos ----");
        
        
        Aluno[] alunos=new Aluno[5];
        
        for(int i=0;i<5;i++){
            
            scan.nextLine();
            
            System.out.println(" Entre com o nome do Aluno :" + (i+1));
            String nomeAluno=scan.nextLine();
            
            System.out.println(" Entre com a Matrícula :");
            String matricula=scan.nextLine();
            
            
            double[] notas=new double[4];
            
            for(int j=0;j<notas.length;j++){
                
                System.out.println(" Entre com as notas :" +(j+1));
                notas[j]=scan.nextDouble();
                
            }
            
            Aluno aluno=new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);
            
            alunos[i]=aluno;
        }
        
        curso.setAlunos(alunos);
        
        System.out.println(curso.obterInfo());
        
        System.out.println(curso.obterMediaTurma());
    }
}
