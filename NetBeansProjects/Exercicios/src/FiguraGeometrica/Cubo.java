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
public class Cubo extends Figura3D{
    
    private int lado;
    
    public int getLado(){
        return this.lado;
    }
    public void setLado(int lado){
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
   
         return 6*(lado*lado);
      
    }

    @Override
    public double calcularVolume() {

        return lado*lado*lado;
        //return Math.pow(lado, 3);
        
    }
    
    
}
