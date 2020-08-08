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
public class TesteCarro {
    
    public static void main(String [] args){
        
        Carro van=new Carro();
        
        van.marca="Mercedes";
        van.modelo="SUV";
        
        van.capCombustivel=150;
        van.consumoCombustivel=8.5;
        
        System.out.println(van.numPassageiros+"  Teste");
        
        
        Carro van2=new Carro("Toyota","pickup",7,150,15.8);
       
        System.out.println(van2.modelo);
        System.out.println(van2.numPassageiros);
        System.out.println(van2.capCombustivel);
        System.out.println(van2.consumoCombustivel);
        System.out.println(van2.marca);
        
    }
}
