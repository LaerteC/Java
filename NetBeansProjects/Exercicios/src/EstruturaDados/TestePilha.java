/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDados;

import Pilha.Pilha;
import java.util.Stack;

/**
 *
 * @author laerte
 */
public class TestePilha {
    
    public static void main(String [] args){
        
        
           
           Stack <Integer> pilha=new Stack<Integer>();
           
          for(int i=1;i<10;i++){
           pilha.push(i);
           
          }
          
          System.out.println(pilha);
          
          System.out.println(pilha.size()+ " Tamanho ");
          
          System.out.println(pilha.empty() +" Se está VAZIO");
          
          System.out.println(pilha.pop()+" Desempilhar");
          
          System.out.println(pilha.pop()+" Desempilhar");
          
          System.out.println(pilha);
          
          System.out.println(pilha.size()+ " Tamanho");
          
           
           
         
    }
}
