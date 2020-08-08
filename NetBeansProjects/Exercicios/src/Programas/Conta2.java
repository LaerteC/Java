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
public class Conta2 {
    
    public static void main(String []args){
        
        Conta conta1=new Conta();
        conta1.setNumero("45285");
        conta1.setAgencia("2425");
        conta1.setSaldo(1500);
        conta1.setEspecial(true);
         
        System.out.println(" Saldo na Conta :" + conta1.getSaldo()+ "Número da conta "+conta1.getNumero());
        
        boolean saqueEfetuado=conta1.realizarSaque(150);
        
        if(saqueEfetuado){
            System.out.println(" Saque Efetuado com Sucesso !");
            conta1.consultarSaldo();
        }else{
            System.out.println(" Não foi  possível realizar o saque");
        }
        
        conta1.depositar(19000);
        conta1.consultarSaldo();
    }
    
}
