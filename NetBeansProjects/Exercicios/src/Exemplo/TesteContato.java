/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo;

/**
 *
 * @author laerte
 */
public class TesteContato {
    
    public static void main(String [] args){
        
            Contato contato=new Contato();
            contato.setNome("Laerte Souza");
            
            
            // Criar o Objeto Endereço !
            Endereco end=new Endereco();
            end.setNomeRua(" Rua de  Florianópolis");
            end.setNumero("N/A");
            end.setComplemento("Numa Startup bem boa");
            end.setCidade("Florianópolis/Blumenau");
            end.setEstado("Santa Catarina");
            
            // Criar objeto Telefone !
            
            
            Telefone telefone=new Telefone();
            telefone.setTipo("Celular");
            telefone.setNumero("1525189");
            telefone.setDdd("48");
            
            Telefone telefone2=new Telefone();
            telefone2.setTipo("Orelhao");
            telefone2.setDdd("48");
            telefone2.setNumero("1589581");
            
            Telefone [] telefones=new Telefone[2];
            
            telefones[0]=telefone;
            telefones[1]=telefone2;
            
            contato.setTelefones(telefones);
            
            contato.setEndereco(end);
             if(contato!=null && contato.getEndereco()!=null){
                    System.out.println(contato.getEndereco().getEstado());
            }
            
                    
            
                
            System.out.println (contato.getNome());
            
           
            //contato.setTelefone(telefone);
           
         if(contato!=null && contato.getTelefones()!=null){
             
             for(Telefone t:contato.getTelefones()){
                 System.out.println(t.getDdd()+ " " +t.getNumero());
                 
             }
         }
            
            
    }
    
}
