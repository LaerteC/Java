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
public class Triangulo extends Figura2D{
    
    private double base;
    
    private double altura;
    
    public double getBase(){
        return this.base;
    }
    public void setBase(double base){
        this.base=base;
    }
    
    public double getAltura(){
        return this.altura;    
    }
    public void setAltura(double altura){
        this.altura=altura;
    }

    @Override
    public double calcularArea() {
            
        return (altura*base)/2;
        
    } 
    
    
}
