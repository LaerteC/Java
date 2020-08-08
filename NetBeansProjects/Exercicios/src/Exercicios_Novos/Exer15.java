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
public class Exer15 {
    
    public static void main(String [] args){
        
        Livro livro=new Livro();
        
        livro.nome="Em busca do Tempo Perdido";
        livro.anoLancamento=1940;
        livro.qtdPaginas=560;
        livro.autores="Marcel Proust";
        
        System.out.println(" Nome do Livro : " +livro.nome);
        System.out.println(" Autor do Livro : " +livro.autores);    
        System.out.println(" Quantidade de Páginas :" +livro.qtdPaginas);
        
        
    }
    
}
