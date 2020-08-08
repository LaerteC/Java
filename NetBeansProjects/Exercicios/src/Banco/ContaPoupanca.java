/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.Calendar;

/**
 *
 * @author laerte
 */
public class ContaPoupanca extends ContaBancaria{
  
    private int diaRendimento;
    
    public int getDiaRendimento(){
        return this.diaRendimento;
    }
    public void setDiaRendimento(int diaRendimento){
        this.diaRendimento=diaRendimento;
    }

    @Override
    public String toString() {
        
        String s=" Conta Poupança [";
        s+=" ; Dia Rendimento : " + this.diaRendimento;
        s+=super.toString();
        s+= "]";
         return s;
    }
    public boolean calcularNovoSaldo(double taxaRendimento){
        Calendar hoje=Calendar.getInstance();
        
        if(diaRendimento==hoje.get(Calendar.DAY_OF_MONTH)){
            super.setSaldo(this.getSaldo()+ this.getSaldo()*taxaRendimento);
           return true;
        }
        return false;
    }
    
    
}
