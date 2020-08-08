/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

/**
 *
 * @author laerte
 */
public class Lampada {
    
   private String modelo;
   private String tensao;
   private int potencia;
   private String cor;
   private String tipoLuz;
   private int garantiaMes;
   private String[] tipos;
   private boolean abajur;
   private boolean ligada;
   
   public Lampada(){
       
   }
   
   public Lampada(String modelo,String tensao,int potencia,String cor,String tipoLuz,int garantiaMes,String[]tipos,boolean abajur,boolean ligada){
       this.modelo=modelo;
       this.tensao=tensao;
       this.potencia=potencia;
       this.cor=cor;
       this.tipoLuz=tipoLuz;
       this.garantiaMes=garantiaMes;
       this.tipos=tipos;
       this.abajur=abajur;
       this.ligada=ligada;
   }
   
   public Lampada(String modelo,String tensao){
       this.modelo=modelo;
       this.tensao=tensao;
   }
   
   
   public String getModelo(){
       
       return this.modelo;
   }
   public void setModelo(String modelo){
       this.modelo=modelo;
       
   }
   public String getTensao(){
       
       return this.tensao;
       
   }
   public void setTensao(String tensao){
       this.tensao=tensao;
   }
   public int getPotencia(){
       return this.potencia;
       
   }
   public void setPotencia(int potencia){
       this.potencia=potencia;
   }
   public String getCor(){
       return this.cor;
   }
   public void setCor(String cor){
       this.cor=cor;
   }
   public String getTipoLuz(){
       return this.tipoLuz;
   }
   public void setTipoLuz(String tipoLuz){
       this.tipoLuz=tipoLuz;
   }
   public int getGarantiaMes(){
       return this.garantiaMes;
   }
   public void setGarantiaMes(int garantiaMes){
       
       this.garantiaMes=garantiaMes;
   }
   public String [] getTipos(){
       return this.tipos;
   }
   public void setTipos(String [] tipos){
       
       this.tipos=tipos;
   }
   public boolean isAbajur(){
       return this.abajur;
   }
   public void setAbajur(boolean abajur){
       
       this.abajur=abajur;
       
   }
   public boolean isLigada(){
       return this.ligada;
   }
   public void setLigada(boolean ligada){
       
       this.ligada=ligada;  
   }
   
    
   public void ligar(){
        
        setLigada(true);
        
    }
    
  public void desligar(){
        
       setLigada(false);
    }
    
   public void mostrarEstado(){
        
        if(isLigada()){
            
            System.out.println(" A lampada está ligada");
        }else{
            
            System.out.println(" A lampada não está ligada");
            
        }
        
    }
    
   public void mudarEstado(){
        if(isLigada()){
            desligar();
        }else{
           ligar();
        }
    }
    
}
