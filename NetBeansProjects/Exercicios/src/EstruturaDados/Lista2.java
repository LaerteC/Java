/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstruturaDados;

/**
 *
 * @author laerte
 */
public class Lista2<T> extends EstruturaEstatica<T> {
    
    public Lista2(){
        super();
    }
    
    public Lista2(int capacidade){
        super(capacidade);

}
    
    public boolean adicionat(T elemento){
       
        return super.adicionar(elemento);
        
    }
    
    public boolean adicionar(int posicao,T elemento){
        
        return super.adicionar(posicao, elemento);
    }
    
    
    
}

