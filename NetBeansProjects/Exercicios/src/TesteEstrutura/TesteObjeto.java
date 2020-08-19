/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteEstrutura;

import EstruturaDados.Lista;
import EstruturaDados.VetorObjetos;



/**
 *
 * @author laerte
 */
public class TesteObjeto {
    
    
    
    public static void main(String [] args){
        
       VetorObjetos<String> vet=new VetorObjetos<String>(3);
       
       vet.adicionar("Laerte");
       vet.adicionar("Vai");
       vet.adicionar("Vencer");
       
       
       System.out.println(vet);
       
      boolean verificar= vet.conter("Laerte");
      
      System.out.println(vet.conter("lk0"));
      
      System.out.println(vet);
      
      if(verificar){
          System.out.println("Existe na Classe");
      }else{
          System.out.println("Não existe"); 
      }
         
    }
    
}