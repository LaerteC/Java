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
public class Aluno extends Pessoa {
    
   
    private String curso;
    private double[] notas;

    

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }
    
}
