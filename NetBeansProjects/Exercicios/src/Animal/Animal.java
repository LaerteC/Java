/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author laerte
 */
public abstract class Animal {
    
    private String nome;
    
    public abstract void emitirSom();
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    
}
