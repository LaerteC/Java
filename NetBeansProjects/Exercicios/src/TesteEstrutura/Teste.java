/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteEstrutura;

import EstruturaDados.Vetor;

/**
 *
 * @author laerte
 */
public class Teste {
    
    public static void main(String [] args){
        

        Vetor vetor=new Vetor(10);
      
       vetor.adicionar("Laerte");
       vetor.adicionar("Vai");
       vetor.adicionar("Vencer");
       vetor.adicionar("Muito");
    
       System.out.println(vetor);
       
       String nome=vetor.buscar(3);
       
       System.out.println(nome);
    }
}
