/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayLista;

import EstruturaDados.VetorObjetos;
import java.util.ArrayList;

/**
 *
 * @author laerte
 */
public class ArrayLista {
    
    public static void main(String [] args){
       
        
        VetorObjetos <String> lista=new VetorObjetos<String>(4);
        
        
        lista.adicionar("Laerte");
        lista.adicionar("Vai");
        lista.adicionar("Vencer !!!!");
        
       String nome= lista.Obter(2);
       
       System.out.println(lista);
       
       lista.limpar();
       
       System.out.println(lista);
       
       
      
    
    }
    
}
