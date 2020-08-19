/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

import java.util.Stack;

/**
 *
 * @author laerte
 */
public class LivroTeste {
    
    public static void main(String [] args){
        
        Stack<Livro> pilha=new Stack<>();
        
        Livro livro1=new Livro();
        
        livro1.setNome(" Algorhitmos");
        livro1.setAutor(" Laerte Souza");
        livro1.setAnoLancamento(2023);
        livro1.setIsbn("152185");
        
        Livro livro2=new Livro();
        
        livro2.setNome(" Estrutura de Dados");
        livro2.setAutor(" Laerte Souza");
        livro2.setAnoLancamento(2058);
        livro2.setIsbn("125485454");
        
        
        System.out.println(" Pilha Criada,  Ela está Vazia ??"+ pilha.isEmpty());
        
        System.out.println(" Empilhando Livros na Pilha :");
        
        pilha.push(livro1);
        
        pilha.push(livro2);
        
        System.out.println(pilha.size()+ " Livros foram Empilhados");
        
        System.out.println(pilha);
         
        
        System.out.println(" Desempilhando !!!");
        
        while(!pilha.isEmpty()){
            
            System.out.println(pilha.pop());
        }
        
        System.out.println(pilha);
        
    }
    
}
