/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FiguraGeometrica;

/**
 *
 * @author laerte
 */
public class Piramide extends Figura3D{
   
    private int altura;
    
    private double arestaBase;
    
    private double apotema;
    
        private Figura2D base;
    
    private int numPoliBase;
    
    
    public int getAltura(){
        return this.altura;
    }
    public void setAltura(int altura){
        this.altura=altura;
    }
    public double getArestaBase(){
        return this.arestaBase;
    }
    public void setArestaBase(double arestaBase){
        this.arestaBase=arestaBase;
    }
    public double getApotema(){
        return this.apotema;
    }
    public void setApotema(double apotema){
        this.apotema=apotema;
    }
    
    public Figura2D getBase(){
        return this.base;
    }
    public void setBase(Figura2D base){
        this.base=base; 
    }
    public int getNumPoliBase(){
        return this.numPoliBase;
    }
    public void setNumPoliBase(int numPoliBase){
        this.numPoliBase=numPoliBase;
    }
    

    @Override
    public double calcularArea() {
         
        if(base!=null){
            return (numPoliBase*((arestaBase*apotema)/2)) + base.calcularArea();
        }
        return 0;
        
        
      
    }

    @Override
    public double calcularVolume() {

        
        if(base!=null){
            
            return (base.calcularArea()*altura)/3;
            
        }
       
        return 0;
    }
    
}
