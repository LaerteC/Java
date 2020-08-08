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
public class TesteCar {
    
    public static void main(String [] args){
        
        Car vann=new Car("Fiat","Ducato");
        
        System.out.println(vann.numPassageiros);
        
        vann.consumoCombustivel=14;
        vann.capCombustivel=150;
        
        vann.exibirAutonomia();
        vann.marca="Mercedes";
        vann.numPassageiros=10;
        
        System.out.println(" O consumo do Combustivel "+ vann.calcularCombustivel(150));
        
        
    }
    
}
