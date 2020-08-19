/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDados;

import java.util.Arrays;

/**
 *
 * @author laerte
 */
public class Vetor {
    
    private String [] elementos;
    
    private int tamanho;
    
    public Vetor(int capacidade){
        this.elementos=new String[capacidade];
        this.tamanho=0;
        
    }
    
       
    
    
    public boolean adicionar(String elemento){
        this.aumentarCapacidade();
        if(this.tamanho<elementos.length){  
            this.elementos[this.tamanho]=elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    
   public boolean adicionar(int posicao, String elemento){
       
       if(!(posicao>=0 && posicao<tamanho)){
           
           throw new IllegalArgumentException(" Não é possivel adicionar");
       }
       this.aumentarCapacidade();
       
       for(int i=this.tamanho-1;i>=posicao;i--){
           this.elementos[i+1]=this.elementos[i];
       }
       
       this.elementos[posicao]=elemento;
       this.tamanho++;
       
       return true;
   }
   
   private void aumentarCapacidade(){
       if(tamanho==elementos.length){
           String[] elementosNovos=new String[this.elementos.length*2];  
           for(int i=0;i<elementos.length;i++){
               elementosNovos[i]=elementos[i];
           }
           this.elementos=elementosNovos;
       }
   }
   
    public String buscar(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
               
          throw new IllegalArgumentException("Posição Não Existe");
              
        }
         return this.elementos[posicao];
    }
    
    public void remover(int posicao){
        if(!(posicao>=0 && posicao<this.tamanho)){
            
            throw new IllegalArgumentException(" Posição Inválida");
        }
        for(int i=posicao;i<this.tamanho-1;i++){
            this.elementos[i]=this.elementos[i+1];
        }
        this.tamanho--;
    }
    
    public int buscar(String elemento){
        for(int i =0;i<this.tamanho;i++){
            if(this.elementos[i].equalsIgnoreCase(elemento)){
                return i;
               
            }
        }
               return -1;    
    }
   
    
    
    public int tamanhoVetor(){
        
        return this.tamanho;
    }
    
    

    @Override
    public String toString() {
     
         StringBuilder s=new StringBuilder();
         
         s.append("[");
         
         for(int i =0;i<this.tamanho-1;i++){
             s.append(this.elementos[i]);
             s.append(" , ");
             
         }
         if(this.tamanho>0){
             
             s.append(this.elementos[this.tamanho-1]);
         }
         s.append("]");
         
         return s.toString();
    }
    
    
            
}
