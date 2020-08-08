/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoologico;

/**
 *
 * @author laerte
 */
public class Animal {
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    
    
    public Animal()
    {
        this.patas=4;
        this.ambiente="Terra";
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the comprimento
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * @return the patas
     */
    public int getPatas() {
        return patas;
    }

    /**
     * @param patas the patas to set
     */
    public void setPatas(int patas) {
        this.patas = patas;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ambiente
     */
    public String getAmbiente() {
        return ambiente;
    }

    /**
     * @param ambiente the ambiente to set
     */
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    /**
     * @return the velocidade
     */
    public double getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
          String s="Animal : "+ nome;
          s+="\n Comprimento "+ comprimento+ " Cm";
          s+="\n Patas : "+patas;
          s+="\n Cor : "+cor;
          s+="\n Ambiente "+ambiente;
          s+="\n Velocidade :"+velocidade +" m/s";
              
         
        return s;
    }
    
    
    
}
