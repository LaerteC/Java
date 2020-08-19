/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

/**
 *
 * @author laerte
 */
public class Expressao {
    
    public static void main(String[]args){
        
        imprimirResultado(" A+B");
        imprimirResultado("A+B+(D+C)");
        imprimirResultado("A+B+(C+D))");
    }
    
    
    final static String ABRE="([{";
    
    final static String FECHAR=")]}";
    
     
    public static void imprimirResultado(String expressao){
        
        System.out.println(expressao + " Está Balanceada ?"+verificarExpressao(expressao));
    }
    public static boolean verificarExpressao(String expressao){
        
        boolean balanceado=true;
        
        Pilha <Character> pilha=new Pilha <>();
        int index=0;
        char simbolo, topo;
        
        while(index<expressao.length()){
            
            simbolo=expressao.charAt(index);
            
            if(ABRE.indexOf(simbolo) >-1){
                
                pilha.empilhar(simbolo);
            }else if(FECHAR.indexOf(simbolo)>-1){
                
                if(pilha.estaVazio()){
                    return false;
                }else{
                    topo=pilha.desempilhar();
                    
                    if(ABRE.indexOf(topo)!= FECHAR.indexOf(simbolo)){
                        return false;
                    }
                }
              
            }
            
            index++;
            
            
        }
        
        return true;
    }
}
