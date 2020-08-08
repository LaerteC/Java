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
public class Lamp {
    
    public static void main(String [] args){
        
        Lampada lampada=new Lampada("Led-Ultra","127");
        
        
        System.out.println( " O modelo da lâmpada " +lampada.getModelo());
        System.out.println(" A tensão da Lâmpada "+ lampada.getTensao());
        
       lampada.ligar();
        lampada.mostrarEstado();
        
        lampada.mudarEstado();
        lampada.mostrarEstado();
         lampada.desligar();
    }
    
}
