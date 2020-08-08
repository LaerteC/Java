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
public class Conta {
    
   private String numero;
   private String agencia;
   private boolean especial;
   private double limiteEspecial;
   private double saldo;
   
   public Conta(){
       
   }
   
   public Conta(String numero,String agencia,boolean especial,double limiteEspecial,double saldo){
       this.numero=numero;
       this.agencia=agencia;
       this.especial=especial;
       this.limiteEspecial=limiteEspecial;
       this.saldo=saldo;
   }
   
   public String getNumero(){
       return this.numero;
   }
   
   public void setNumero(String numero){
       this.numero=numero;
   }
   public String getAgencia(){
       return this.agencia;
   }
   public void setAgencia(String agencia){
       this.agencia=agencia;
   }
   
   public boolean isEspecial(){
       return this.especial;
   }
   public void setEspecial(boolean especial){
       this.especial=especial;
   }
   public double getLimiteEspecial(){
       return this.limiteEspecial;
   }
   public void setLimiteEspecial(double limiteEspecial){
       this.limiteEspecial=limiteEspecial;
   }
   public double getSaldo(){
       return this.saldo;
   }
   public void setSaldo(double saldo){
       this.saldo=saldo;
   }
   
   public boolean realizarSaque(double quantiaSacar){
       
       if(saldo>=quantiaSacar){
           saldo-=quantiaSacar;
           return true;
       }else{
           if(especial){
               double limite=saldo+limiteEspecial;
               if(limite>=quantiaSacar){
                   saldo-=quantiaSacar;
                   return true;
               }else{
                   return false;
               }
               
           }
           else{
               return false;
           }
       }
       
   }
   
   public void depositar(double valorDepositado){
       saldo+=valorDepositado;
   }
   
   public void consultarSaldo(){
       
       System.out.println(" O saldo da conta é :" +saldo);
       
   }
   
   public boolean verificarUsoChequeEspecial(){
       return saldo<0;
       
   }
   
}
