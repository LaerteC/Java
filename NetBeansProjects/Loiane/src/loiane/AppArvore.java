

package loiane;

public class AppArvore{
    
    public static void main(String []args){
        
        Arvore arvore=new Arvore(new Elemento(10));
        
        arvore.inserir(new Elemento(5));
        arvore.inserir(new Elemento(1));
        arvore.inserir(new Elemento(8));
        arvore.inserir(new Elemento(15));
        arvore.inserir(new Elemento(18));
        
        System.out.println(" O elemento  11 "+ (arvore.buscar(11)?" Existe na Arvore ":"Não Existe"));
        
        
    }
}