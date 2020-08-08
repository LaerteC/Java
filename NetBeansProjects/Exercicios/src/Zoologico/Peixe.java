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
public class Peixe extends Animal {
    
    private String caracteristicas;
    
    public Peixe(){
        super();
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas=" Barbatanas e Cauda ";
    }
    
    public String getCaracteristicas(){
        return this.caracteristicas;
    }
    public void setCaracteristicas(String caracteristicas){
        this.caracteristicas=caracteristicas;
    }

    @Override
    public String toString() {  
        String s=super.toString();
        s+=" \n Características :"+caracteristicas;
        return s;
        
    }
    
    
    
}
