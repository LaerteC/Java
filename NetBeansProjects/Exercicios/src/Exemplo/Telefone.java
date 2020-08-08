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
public class Telefone {
    
    private String tipo;
    private String ddd;
    private String numero;
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public String getDdd(){
        return this.ddd;
        
    }
    public void setDdd(String ddd){
        this.ddd=ddd;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    
}
