/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Exer34 {
    
    public static void main(String []args){
        
        Scanner scan=new Scanner(System.in);
        
        boolean verificarCaracter=false;
        boolean verificarIdade=false;
        boolean verificarSalario=false;
        boolean verificarSexo=false;
        boolean verificarEstadoCivil=false;
        
        do{
            
        System.out.println("Entre com o Nome");
        String nome=scan.next();
        
        if(nome.length()>3){
            
            System.out.println("Nome correto : " + nome);
            verificarCaracter=true;
        }else{
            verificarCaracter=false;
        }
        
        
        }while(!verificarCaracter);
        
        do{
            
        System.out.println("Entre com a Idade");
        int idade=scan.nextInt();
        
        if(idade>=0 && idade<=150){
            
            System.out.println("Idade Plausível :"  +idade);
            verificarIdade=true;
                    
        }else{
            System.out.println("Idade Incorreta");
            verificarIdade=false;
            
        }
        
        }while(!verificarIdade);
        
        
        do{
        System.out.println("Entre com o Salário");
        double salario=scan.nextDouble();
        
        if(salario>0){
            
            System.out.println("Salário verificado e consistente : " + salario);
            verificarSalario=true;
            
        }else{
            System.out.println("Digite um salário maior que Zero");
            verificarSalario=false;
        }
        
        }while(!verificarSalario);
        
        
        do{
        
        System.out.println("Entre com o Sexo ");
        String sexo=scan.next();
        
        if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")){
            System.out.println("Sexo digitado corretamente : " +sexo);
            verificarSexo=true;
        }else{
            System.out.println("Digite um Sexo corretamente");
            verificarSexo=false;
        }
        
        }while(!verificarSexo);
        
        
        do{
        
        System.out.println("Entre com o Estado Civil");
        String estadoCivil=scan.next();
        
        if(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
                || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")){
            
            System.out.println("Seu estado Civil é : " +estadoCivil);
            verificarEstadoCivil=true;
            
        }else{
            System.out.println("Digite um Estado Civil Correto");
            verificarEstadoCivil=false;
        }
        
        }while(!verificarEstadoCivil);
    }
    
    
}
