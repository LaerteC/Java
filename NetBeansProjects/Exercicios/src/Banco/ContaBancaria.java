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
public class ContaBancaria {
    
    private String nome;
    private String numConta;
    private double saldo;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getNumConta(){
        return this.numConta;
    }
    public void setNumConta(String numConta){
        this.numConta=numConta;
    }
    public double getSaldo(){
        return this.saldo;     
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }

    @Override
    public String toString(){
        
        String s=" Conta Bancária !!!" ;
        s+= "  Nome do Cliente : [ " + nome;
        s+= "  Número da Conta :" +numConta;
        s+= "  Saldo da Conta  :" +saldo;
        s+=" ]";
        return s; 
    }
    
    
    public void depositar(double valor){
        saldo+=valor;
    }
    
    public boolean sacar(double valor){
        if((saldo-valor)>=0){
            saldo-=valor;
            return true;
        }
        return false;
    }
    
}
