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
public class Exer4 {
    
    public static void main(String [] args){
        
        ContaCorrente conta=new ContaCorrente();
        conta.agencia="1234";
        conta.numero="154218";
        conta.especial=true;
        conta.limiteEspecial=1900;
        conta.saldo=4500;
        conta.valorEspecialUsado=0;
        
        
        System.out.println(" Saldo da conta : " +conta.saldo+ "  Agência " +conta.agencia);
       
        boolean saqueEfetuado=conta.realizarSaque(10000);
        
        if(saqueEfetuado){
            
            System.out.println(" Saque efetuado com Sucesso");
            conta.consultaSaldo();
        }else{
            
            System.out.println(" Não foi possivel realizar o saque ! Saldo Insuficiente");
            
        }
        
        
        System.out.println(" Depósito de 1500 reais");
        conta.depositar(1500);
        
        System.out.println(" Saldo atual da conta : " +conta.saldo);
        
        conta.consultaSaldo();
        
        
        boolean clienteEspecial=conta.verificarUsoChequeEspecial();
        
        if(clienteEspecial){
            System.out.println(" O cliente está usando Cheque especial");
            
        }else{
            
            System.out.println(" O cliente não Utiliza o cheque especial");
            
        }
    }
    
}
