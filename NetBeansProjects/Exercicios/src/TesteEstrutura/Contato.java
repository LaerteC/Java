/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteEstrutura;

/**
 *
 * @author laerte
 */
public class Contato {
    
    private String nome;
    
    private String telefone;
    
    private String email;
    
    
    public Contato(String nome, String telefone,String email)
    {
        super();
        this.nome=nome;
        this.telefone=telefone;
        this.email=email;
        
    }
    
    public Contato(){
        
    }
    
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

    @Override
    public String toString() {
        StringBuilder s=new StringBuilder();
        
        s.append("[ ");
        s.append(nome +" ");
        s.append(telefone+" ");
        s.append(email+" ");
        s.append(" ]");
    
           return s.toString();
    
}
}
