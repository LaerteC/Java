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
public class VetorObjetos<T> {
   
    
    private  T[] elementos;
    
    private int tamanho;
    
    public VetorObjetos (int capacidade){
        this.elementos= (T[])new Object[capacidade];
        this.tamanho=0;
        
    }
    
       
    
    
    public boolean adicionar(T elemento){
        this.aumentarCapacidade();
        if(this.tamanho<elementos.length){  
            this.elementos[this.tamanho]=elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }
    
   public boolean adicionar(int posicao, T elemento){
       
       if(!(posicao>=0 && posicao<tamanho)){
           
           throw new IllegalArgumentException(" Não é possivel adicionar");
       }
       this.aumentarCapacidade();
       
       for(int i=this.tamanho-1;i>=posicao;i--){
           this.elementos[i+1]=this.elementos[i];
       }
       
       this.elementos[posicao]=elemento;
       this.tamanho++;
       
       return true;
   }
   
   private void aumentarCapacidade(){
       if(tamanho==elementos.length){
           T[] elementosNovos=(T[])new Object[this.elementos.length*2];  
           for(int i=0;i<elementos.length;i++){
               elementosNovos[i]=elementos[i];
           }
           this.elementos=elementosNovos;
       }
   }
   
   public void limpar(){
       
       this.elementos=(T[]) new Object [this.elementos.length];
       this.tamanho=0;
   }
   
   public T Obter(int posicao){
      
       return this.buscar(posicao);
   }
   
    public T buscar(int posicao){
        if(!(posicao>=0 && posicao<tamanho)){
               
          throw new IllegalArgumentException("Posição Não Existe");
              
        }
         return this.elementos[posicao];
    }
    
    public int ultimaPosicao(T elemento){
        
       int ultimaPos=-1;
       
       for(int i=this.tamanho-1;i>=0;i--){
           if(this.elementos[i].equals(elemento)){
               return ultimaPos=i;
           }
       }
       return ultimaPos;
    }
    
    
    public void remove(T elemento){
        int pos=this.buscar(elemento);
        
        if(pos>-1){
            this.remover(pos);
        }
        
    }
    
    public void remover(int posicao){
        if(!(posicao>=0 && posicao<this.tamanho)){
            
            throw new IllegalArgumentException(" Posição Inválida");
        }
        for(int i=posicao;i<this.tamanho-1;i++){
            this.elementos[i]=this.elementos[i+1];
        }
        this.tamanho--;
    }
    
    
    public int buscar(T elemento){
        for(int i =0;i<this.tamanho;i++){
            if(this.elementos[i].equals(elemento)){
                return i;
               
            }
        }
               return -1;    
    }
   
    public int tamanhoVetor(){
        
        return this.tamanho;
    }
    
    public boolean conter(T elemento){
    
        int pos=buscar(elemento);
        
        if(pos>-1){
            return true;
        }
    
        return false;
    }
    

    @Override
    public String toString() {
     
         StringBuilder s=new StringBuilder();
         
         s.append("[");
         
         for(int i =0;i<this.tamanho-1;i++){
             s.append(this.elementos[i]);
             s.append(" , ");
             
         }
         if(this.tamanho>0){
             
             s.append(this.elementos[this.tamanho-1]);
         }
         s.append("]");
         
         return s.toString();
    }
    
    
            
}

    

