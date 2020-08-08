/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

/**
 *
 * @author laerte
 */
public class TesteCherokee {
    
    public static void main(String [] args){
        
        Cherokee jeep=new Cherokee();
        
        jeep.setMarca("Jeep / Laerte");
        
        System.out.println(" Obtendo dados pelo get e set :"+ jeep.getMarca());
        
    }
    
}
