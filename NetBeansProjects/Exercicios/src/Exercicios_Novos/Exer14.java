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
public class Exer14 {
    
    public static void main(String [] args){
        Lampada lampad=new Lampada();
        lampad.modelo= "Grande";
        lampad.potencia=150;
        lampad.cor="Branca";
        
        lampad.tipo=new String[2];
        
        lampad.tipo[0]="Abajur";
        lampad.tipo[1]="Luminaria";
        
        System.out.println(lampad.modelo);
        System.out.println(lampad.cor);
        System.out.println(lampad.potencia);
        System.out.println(lampad.tipo[0]);
        
        
        
        
    }
    
}
