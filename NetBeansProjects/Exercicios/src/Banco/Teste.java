/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

/**
 *
 * @author laerte
 */
public class Teste {
    
    public static void main(String [] args){
        
        System.out.println(" *** Teste Conta Bancária *** ");
         
        ContaBancaria contaSimples=new ContaBancaria();
        
        contaSimples.setNome("Cliente com Conta Simples");
        contaSimples.setNumConta("123456");
         
        contaSimples.depositar(1500);
        
        realizarSaque(contaSimples,1700);
        System.out.println(contaSimples);
        
        
        System.out.println(" *** Conta Poupança  ***");
        
        ContaPoupanca contaPoupanca=new ContaPoupanca();
        
        contaPoupanca.setNome(" Laerte - Poupança");
        contaPoupanca.setNumConta("4518421");
        contaPoupanca.setDiaRendimento(8);
        
       
        
        
        
        contaPoupanca.depositar(50000);
        realizarSaque(contaPoupanca,1500);
        
        System.out.println(contaPoupanca);
        
       if(contaPoupanca.calcularNovoSaldo(0.9)){
           
           System.out.println(" O rendimento aplicado , novo saldo é de "+ contaPoupanca.getSaldo());
         
       }else{
           
           System.out.println(" Hoje não é dia de Rendimento :");
       }
        
       System.out.println(" *** Conta Especial");
       ContaEspecial contaEspecial=new ContaEspecial();
       contaEspecial.setNome(" Laerte Conta especial");
       contaEspecial.setNumConta("02514852");
       contaEspecial.depositar(1500);
       contaEspecial.setLimite(15000);
       
        realizarSaque(contaEspecial, 15800);
      
        realizarSaque(contaEspecial, 10000);
        
        
    }
    
    private static void realizarSaque(ContaBancaria conta, double valor){
        
        if(conta.sacar(valor)){
            System.out.println(" Saque Efetuado com Sucesso! novo saldo :"+conta.getSaldo());
            
        }else{
            System.out.println(" Não foi possível efetuar o Saque ! saldo atual :"+ conta.getSaldo());
        }
        
    }
    
}
