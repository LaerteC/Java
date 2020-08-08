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
public class Car {
    
    String nome;
    String modelo;
    int numPassageiro;
    double capCombustivel;
    double consumoCombustivel;
    
    void exibirAutonomia(){
        
        System.out.println("A autonomia do carro é :" +consumoCombustivel*capCombustivel+ " km ");
        
    }
    
    double obterAutonomia(){
        
        System.out.println(" Método Obter Autonomia foi chamado");
        
        return capCombustivel*consumoCombustivel ;
    }
    
    
    double calcularCombustivel(double km){
        
        
        double qtdCombustivel= km/consumoCombustivel;
        return qtdCombustivel;
    }
}
