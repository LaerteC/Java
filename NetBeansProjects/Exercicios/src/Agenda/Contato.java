/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

/**
 *
 * @author laerte
 */
public class Contato {
    
    private String nome;
    private String telefone;
    private String email;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    
    public String getEmail(){
        
        return this.email;
    }
    public void setEmail(String email){
        
        this.email=email;
        
    }
    
    public String obterInfo(){
        
        return " nome" +this.nome+ ";" + " telefone"+this.telefone+ ";" + "Email" + this.email;
        
    }
}
