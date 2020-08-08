/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contribuinte;

/**
 *
 * @author laerte
 */
public abstract class Contribuinte {
    
    private String nome;
    
    private double rendaBruta;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    
    public double getRendaBruta(){
        return this.rendaBruta;
    }
    public void setRendaBruta(double rendaBruta){
        this.rendaBruta=rendaBruta;
    }
    
    public abstract double calcularImposto();

    @Override
    public String toString() {
        String s= " Renda Bruta" +rendaBruta;
        s+=" \n ; Nome :" +nome;
        
        return s;
    }
    
    
    
    
}
