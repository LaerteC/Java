/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super;

/**
 *
 * @author laerte
 */
public class Aluno extends Pessoa{
    
    private String curso;
    private double[] notas;
    
    
    
    public Aluno(){
        super();
    }
    public Aluno(String nome,String endereco,String telefone,String curso){
        
        super(nome,endereco,telefone);
        this.curso=curso;
        
    }
    
    
    public void verificarAcesso(){
        
        this.nomeVisibilidade="Teste";
        
        
    }
    
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }
    public double[] getNotas(){
        return this.notas;
    }
    public void setNotas(double[] notas){
        this.notas=notas;
    }
    
    public double calcularMedio(){
        return 0;
    }
    
    public boolean verificarAprovado(){
        return true;
    }
    public void metodoQualquer(){
        super.setCpf("154851");
        this.setCpf("026157668485");
    }
    public String obterEtiqueta(){
        String s=" Endereço do Aluno :";
        s+=super.getEndereco();
        return s;
    }
}
