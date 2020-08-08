/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_Novos;

/**
 *
 * @author laerte
 */
public class Exer1 {
    
    public static void main(String [] args){
        
       double [] temp=new double[5];
       temp[0]=33.2;
       temp[1]=45.1;
       temp[2]=14.4;
       temp[3]=5.1;
       
       
      for(int i=0;i<temp.length;i++){
          
          System.out.println("A s temperaturas :" +temp[i]);
          
          System.out.println("O tamanho do array  " +temp.length);
          
      }
      for(double temp1: temp){
          
          System.out.println(temp1);
      }
      
       
    }
    
}
