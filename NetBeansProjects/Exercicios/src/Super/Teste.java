/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super;

/**
 *
 * @author laerte
 */
public class Teste {
    
    public static void main(String [] args){
        
        
        
        Pessoa pessoa1=new Pessoa();
        Aluno aluno=new  Aluno();
        Professor professor=new Professor();
        
        if(pessoa1 instanceof Pessoa){
            System.out.println(" É do tipo Pessoa");
        }
        if(aluno instanceof Pessoa){
            System.out.println(" É do tipo Pessoa");
        }
        
        if(professor instanceof Pessoa){
            System.out.println(" É do tipo Pessoa");
        }
        
        
        
        
        
        
        
       /* 
        Pessoa pessoa = new Pessoa();
        
        Pessoa aluno=new Aluno();
        
        Pessoa professor=new Professor();
        
       pessoa.setEndereco(" Rua rivadavia correia");
       aluno.setEndereco("Rua Ana Berta Roskamp");
       professor.setEndereco(" Florianópolis");
       
       System.out.println(pessoa.obterEtiqueta());
       
       System.out.println(aluno.obterEtiqueta());
       
       System.out.println(professor.obterEtiqueta());
*/
    }
    
}
