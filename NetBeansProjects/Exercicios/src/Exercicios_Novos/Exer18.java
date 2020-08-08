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
public class Exer18 {
    
    public static void main(String [] args){
        
        ContaCorrente conta=new ContaCorrente();
        conta.numero="2124";
        conta.agencia="Zarhan";
        conta.limiteEspecial=8900;
        conta.saldo=5700;
        
        System.out.println(" A conta pertence ao Laerte : "+conta.numero);
        System.out.println(" A agência da Conta : " +conta.agencia);
        System.out.println(" O limite é :"+ conta.limiteEspecial);
        
    }
    
}
