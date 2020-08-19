/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

/**
 *
 * @author laerte
 */
public class Livro {
    
    private String isbn;
    
    private String autor;
    
    private int anoLancamento;
    
    private String nome;

    
    public Livro(){
        super();
    }
    public Livro(String isbn,String autor,int anoLancamento,String nome){
        this.isbn=isbn;
        this.autor=autor;
        this.anoLancamento=anoLancamento;
        this.nome=nome; 
        
    }
    
    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the anoLancamento
     */
    public int getAnoLancamento() {
        return anoLancamento;
    }

    /**
     * @param anoLancamento the anoLancamento to set
     */
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  "Livro : [ ISBN:"+isbn +" Autor :"+autor + " Ano Lançamento :"+ anoLancamento + " Nome :" +nome +" ]" ;
     
}
}
