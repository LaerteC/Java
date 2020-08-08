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
public class Circulo extends Figura2D{
    
    private double raio;
    
    public double getRaio(){
        return this.raio;
    }
    public void setRaio(double raio){
        this.raio=raio;
    }

    @Override
    public double calcularArea() {
      return (raio *raio)*Math.PI;
     }
    
}
