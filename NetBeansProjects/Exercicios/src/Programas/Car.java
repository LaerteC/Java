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
public class Car {
    
   public  String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    
    public Car(String marca,String modelo,int numPassageiros,double capCombustivel,double consumoCombustivel){
        
        this.marca=marca;
        this.modelo=modelo;
        this.numPassageiros=numPassageiros;
        this.capCombustivel=capCombustivel;
        this.consumoCombustivel=consumoCombustivel;
        
    }
    public Car(){
        
    }
    
    
    public Car(String marca,String modelo,int numPassageiros){
        this.marca=marca;
        this.modelo=modelo;
        this.numPassageiros=numPassageiros;
        
        System.out.println(" Chamando um Construtor com 3 parâmetros");
        
    }
    
    public Car(String marca, String modelo){
       this(marca,modelo, 10);
       
       System.out.println(" Chamando um Construtor com 2 parâmetros");
        
    }
    
    
    public void exibirAutonomia(){
        
        System.out.println( " A autonomia é : "+ this.capCombustivel*this.consumoCombustivel);
        
        
    }
    
    private double KmCombustivel(double km){
        
        return km/this.consumoCombustivel;
    }
    
    public double calcularCombustivel(double km){
        
        return this.KmCombustivel(km);  
    }

    
}
