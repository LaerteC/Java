/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class TesteAgenda {
    
    public static void main(String []args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println(" Entre com o nome da agenda:");
        String nome=scan.nextLine();
        
        
        Agenda agenda=new Agenda();
        
        agenda.setNome(nome);
        
        Contato[] contatos=new Contato[3];
        
        for(int i =0;i<contatos.length;i++){
            
            System.out.println(" Entre com as Informaçoes do contato"+ (i+1));
           
            Contato c=new Contato();
            
            System.out.println(" Entre com o nome :");
             nome=scan.nextLine();
             c.setNome(nome);
             
             System.out.println("Entre com o telefone");
             String telefone=scan.nextLine();
             c.setTelefone(telefone);
             
             System.out.println(" Entre com o email");
             String email=scan.nextLine();
             c.setEmail(email);
             
             contatos[i]=c;
             
        }
        
        agenda.setContatos(contatos);
       
        if(agenda!=null){
            
            System.out.println(agenda.ObterInfo());
            
        }
        
    }
    
}
