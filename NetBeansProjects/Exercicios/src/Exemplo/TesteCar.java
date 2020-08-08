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
public class TesteCar {
    
    public static void main(String [] args){
        
         Car punto=new Car();
         punto.nome="Forte";
         punto.modelo=" Fiat";
         punto.consumoCombustivel=0.9;
         punto.capCombustivel=190;
         
         System.out.println(" Nome do Carro : " +punto.nome);
         System.out.println(" Modelo do Carro : " +punto.modelo);
         System.out.println(" Consumo de Combustível :" +punto.consumoCombustivel);
         
         System.out.println(" A autonomia do carro é :" +punto.obterAutonomia()); 
         
          double qtdCombustivel=punto.calcularCombustivel(10);
          
          System.out.println(" A quantidade de Combustível é : " +qtdCombustivel);
        
        
    }
    
   
    
    
    
}
