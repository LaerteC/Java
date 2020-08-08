/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo;

/**
 *
 * @author laerte
 */
public class TesteCarro {
    
    public static void main(String [] args){
        
        Carro van=new Carro();
        van.marca="Mercedes";
        van.modelo="Micro";
        van.passageiros=12;
        van.consumoCombustivel=15;
        van.capombustivel=280;
        
        System.out.println(van.marca);
        System.out.println(van.modelo);
    
        Carro fusca=new Carro();
        fusca.marca="Volkswagen";
        fusca.modelo="Retrô";
        fusca.passageiros=3;
        fusca.consumoCombustivel=15;
        
        System.out.println(fusca.consumoCombustivel);
        System.out.println(fusca.marca);
       
    }
   
}
