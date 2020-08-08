/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoologico;

/**
 *
 * @author laerte
 */
public class Mamifero extends Animal{
    
    private String alimento;
    
    public Mamifero(){
        super();
        this.setCor("Castanho");
        this.alimento=" Mel";
        this.setAmbiente(" Terra");
        
    }
    
    public String getAlimento(){
        return this.alimento;
    }
    
    public void setAlimento(String alimento){
        this.alimento=alimento;
    }

    @Override
    public String toString() {
        String s=super.toString();
        s+=" \n Alimento "+alimento;
        return s;
    }
    
    
} 
