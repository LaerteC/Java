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
public class ContaEspecial extends ContaBancaria {

    private double limite;
    

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "Conta Especial ";
        s += " Limite " + limite;
        s+=" "+super.toString();
        return s;
    }
    
    @Override
    public boolean sacar(double valor){
      double saldoLimite=this.getSaldo()+limite;
      if(saldoLimite-valor>=0){
          this.setSaldo(this.getSaldo()-valor);
          return true;
      }
      return false; 
    }

}
