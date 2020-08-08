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
public class Teste {
    
    public static void main(String [] args){
        
        Animal camelo=new Animal();
        
        camelo.setNome("Camelo");
        camelo.setComprimento(189);
        camelo.setCor(" Amarelo");
        camelo.setVelocidade(2.0);
        
        
        Peixe tubarao=new Peixe();
        
        tubarao.setNome("Tubarao");
        tubarao.setVelocidade(1.59);
        tubarao.setComprimento(358);
        
       
        Mamifero urso=new Mamifero();
        
        urso.setNome(" Urso do Canadá ");
        urso.setComprimento(198);
        urso.setCor("Vermelho");
        urso.setVelocidade(2.5);
        
        Animal[] animais=new Animal[3];
        
        animais[0]=camelo;
        animais[1]=tubarao;
        animais[2]=urso;
        
        System.out.println(" ---------------------------------");
        for(Animal animal:animais){
            
            System.out.println(animal.toString());
            
         System.out.println("---------------------------------");
        }
        
       
    }
    
}
