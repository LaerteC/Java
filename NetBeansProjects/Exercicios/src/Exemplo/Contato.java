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
public class Contato {
    
    private String nome;
    private Endereco  endereco;
    private Telefone [] telefones;
    
    public Contato(){
        
    }
    
    public String getNome(){
        return this.nome;  
    }
    public void setNome(String nome){
        this.nome=nome;
    }
   public Endereco getEndereco(){
       return endereco;
   }
   public void setEndereco(Endereco endereco){
       this.endereco=endereco;
   }

    public Telefone[] getTelefones(){
        return this.telefones;
        
    }
    public void setTelefones(Telefone[] telefones){
        this.telefones=telefones;
    }
    
}
