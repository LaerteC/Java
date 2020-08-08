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
public class Agenda {
    
    private String nome;
    
    private Contato[] contatos;
    
    
    
    public Agenda(){
        
    }
    
    public Agenda(String nome){
        this.nome=nome;
        
    }
    
    
    public String getNome(){
        
        return this.nome;
    }
    public void setNome(String nome){
        
        this.nome=nome;
        
    }
    
    public Contato[] getContatos(){
        return this.contatos;
    }
    public void setContatos(Contato[] contatos){
        
        this.contatos=contatos;
    }
    public String ObterInfo(){
        
        String info=" Nome" + this.nome +"\n";
        
        if(contatos!=null){
            
            for(Contato c:contatos){
                info+=c.obterInfo()+ "\n";
            }
        }
        
        return info;
    }
    
}
