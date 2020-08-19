/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

import EstruturaDados.EstruturaEstatica;

/**
 *
 * @author laerte
 */
public class Pilha <T> extends EstruturaEstatica <T>{
    
    
    public Pilha(){
        
        super();
    }
    
    public Pilha(int capacidade){
        
         super(capacidade);
    }
    
    public void empilhar(T elemento){
        
        super.adicionar(elemento);
        
    }
    
    public  T topo(){
        
        if(this.estaVazio()){
            return null;
        }
        
        return this.elementos[tamanho-1];
    }
    
    public T desempilhar(){
        
        if(this.estaVazio()){
            return null;
        }
        
        T elemento=this.elementos[tamanho-1];
        tamanho --;
        
        return elemento;
    }
}
