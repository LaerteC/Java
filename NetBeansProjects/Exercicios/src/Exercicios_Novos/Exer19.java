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
public class Exer19 {
    
    public static void main(String [] args){
        
        Contato contato1=new Contato();
        
       contato1.nome=" Laerte Souza Costa Neto";
       contato1.email=" laerte-netoo@outlook.com";
       contato1.telefones=new String[5];
       
        contato1.telefones[0]="98887459";
        contato1.telefones[1]="33457485";
        contato1.telefones[2]="41597848";
        
        System.out.println(" Nome :" +contato1.nome);
        System.out.println(" Email : "+contato1.email);
        System.out.println(" Telefone: "+contato1.telefones[0]);
        
       
        
    }
    
}
