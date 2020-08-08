/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_Novos;

import java.util.Date;

/**
 *
 * @author laerte
 */
public class Exer17 {
    
    public static void main(String [] args){
        
        LivroDeBiblioteca biblio=new LivroDeBiblioteca();
        
        biblio.nome=" Sobre o Estado da Matéria";
        biblio.autor="Laerte Souza Costa Neto";
        biblio.emprestimo="Laerte";
        biblio.dataEntrega=new Date();
        biblio.emprestado=true;
        
        System.out.println(" Nome do Livro :"+biblio.nome);
        System.out.println(" Autor do Livro: "+biblio.autor);
        System.out.println("Data de Entrega "+biblio.dataEntrega);
        
        
    }
    
}
