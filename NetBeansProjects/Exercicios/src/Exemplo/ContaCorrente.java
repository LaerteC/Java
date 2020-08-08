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
public class ContaCorrente {
    
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;
    double valorEspecialUsado;
    
    
    boolean realizarSaque(double quantia){
        
        // tem saldo
        if(saldo>=quantia){
            saldo-=quantia;
             return true;
        }else{
            
            if(especial){
                double limite=limiteEspecial+saldo;
                if(limite>=quantia){
                    
                    saldo-=quantia;
                    return true;
                }else{
                    
                    return false;
                }  
            }else{
                
                return false;
                
            }
            
        }
        
        
    }
    
    void depositar(double quantia){
        
        saldo+=quantia;
            
    }
    
    void consultaSaldo(){
        System.out.println(" O saldo é  :" +saldo);
        
    }
    
    boolean verificarUsoChequeEspecial(){
        if(saldo>0){
            return false;
        }else{
            return true;
        }
    }
    
}
