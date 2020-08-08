/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_Novos;

/**
 *
 * @author laerte
 */
public class TesteLamp {
    
    
    public static void main(String[] args){
        
       Lamp lampada=new Lamp();
       
       lampada.ligada=true;
      
       lampada.tipos=new String[5];
       
       lampada.tipos[0]="Amarela";
       
       lampada.ligar();
       
       lampada.mostrarEstado();
       
       lampada.desligar();
       
       lampada.mostrarEstado();
       
       lampada.mudarEstado();
       
       lampada.mostrarEstado();
    }
    
}
