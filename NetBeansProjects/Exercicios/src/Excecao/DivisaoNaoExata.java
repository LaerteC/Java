/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excecao;

/**
 *
 * @author laerte
 */
public class DivisaoNaoExata extends Exception{
    
    private int num;
    private int denominador;
    
    public DivisaoNaoExata(int num,int denominador){
        
        super();
        this.num=num;
        this.denominador=denominador;
        
    }

    @Override
    public String toString() {
        return " Resultado= " + num +" /" +denominador+ " Não é um inteiro";
    }
    
    
}
