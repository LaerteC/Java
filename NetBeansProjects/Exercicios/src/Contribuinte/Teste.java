/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contribuinte;

/**
 *
 * @author laerte
 */
public class Teste {
    
    public static void main(String [] args){
        
        PessoaFisica pessoaFisica1=new PessoaFisica();
        
        pessoaFisica1.setNome(" Laerte Souza");
        pessoaFisica1.setRendaBruta(8900);
        pessoaFisica1.setCpf("02615788455");
        
        PessoaFisica pessoaFisica2=new PessoaFisica();
        
        pessoaFisica2.setNome(" Fernando Pralheiros");
        pessoaFisica2.setRendaBruta(5250);
        pessoaFisica2.setCpf("02518485415");
        
        PessoaJuridica pessoaJuridica1=new PessoaJuridica();
        
        pessoaJuridica1.setNome(" Laerte Souza");
        pessoaJuridica1.setRendaBruta(890000);
        pessoaJuridica1.setCnpj("02185194849548");
        
        PessoaJuridica pessoaJuridica2=new PessoaJuridica();
        
        pessoaJuridica2.setNome(" Fatima");
        pessoaJuridica2.setCnpj("02581485265123");
        pessoaJuridica2.setRendaBruta(500000000);
        
        Contribuinte[] contribuinte=new Contribuinte[4];
        contribuinte[0]=pessoaFisica1;
        contribuinte[1]=pessoaFisica2;
        
        contribuinte[2]=pessoaJuridica1;
        contribuinte[3]=pessoaJuridica2;
        
        for(Contribuinte pessoa: contribuinte){
            
            System.out.println(pessoa.toString());
        }
        
        
    }
    
}
