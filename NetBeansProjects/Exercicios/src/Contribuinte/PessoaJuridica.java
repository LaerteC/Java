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
public class PessoaJuridica extends Contribuinte {
    
    private String cnpj;
   
    public String getCnpj(){
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj=cnpj;
    } 

    @Override
    public double calcularImposto() {
        return this.getRendaBruta()*0.1;
        
    }

    @Override
    public String toString() {
        String s=" Pessoa Juridica ";
        s+= super.toString();
        s+=" ; CNPJ :"+ cnpj;
        s+=" Imposto a ser Calculado :" +calcularImposto();
       
         return s;
         
    }
    
    
    
    
}
