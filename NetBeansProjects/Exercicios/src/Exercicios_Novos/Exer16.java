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
public class Exer16 {
    
    public static void main(String [] args){
        
        LivroLivraria livraria=new LivroLivraria();
        
        livraria.nome="Amazon";
        livraria.autor="Jeff Bezos";
        livraria.preco=45;
        livraria.isbn="Biografia";
        
        
        System.out.println(" O nome da Biografia :" +livraria.nome);
        System.out.println(" O autor e fundador :" +livraria.autor);
        System.out.println(" O Código ISBN" +livraria.isbn);
    }
    
}
