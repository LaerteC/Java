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
public class TesteEstrutura1 {
    
    public static void main(String [] args){
        
        
        Vetor vetor=new Vetor(8);
        
        vetor.adicionar("B");
        vetor.adicionar("C");
        vetor.adicionar("E");
        vetor.adicionar("F");
        vetor.adicionar("G");
        
      
        System.out.println(vetor.tamanhoVetor()+ "  O tamanho do Vetor !!!");
        
        System.out.println(vetor);
        
        
        
        vetor.remover(1);
        
        System.out.println(vetor);
        
        
        int posi=vetor.buscar("F");
        
        if(posi>=0){
            vetor.remover(posi);
        }
        
        System.out.println(vetor);
    }
    
}
