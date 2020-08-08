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
public class Exer21 {
    
    public static void main(String[]args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com o Valor hora:");
        double valorhora=scan.nextDouble();
      
        System.out.println("Entre com a quantitade horas trabalhadas");
        double horatra=scan.nextDouble();
        
        double salarioBruto=valorhora*horatra;
        
        int percentualIR=0;
        
        if(salarioBruto<=900){
                percentualIR=0;
        }else if(salarioBruto>900 && salarioBruto<=1500){
                percentualIR=5;
        }else if(salarioBruto>1500 && salarioBruto<=2500){
                percentualIR=10;
        }else if(salarioBruto>2500){
                percentualIR=20;
        } 
        
        double ir=(salarioBruto/100)*percentualIR; 
        double inss=(salarioBruto/100)*10;
        double fgts=(salarioBruto/100)*11;
        double totalDescontos=ir+inss;
        double salarioLiquido=salarioBruto-totalDescontos;
         
        System.out.println("Percentual do IR:"+percentualIR);
        System.out.println("Salário Bruto:"+ valorhora + " * "+ horatra+" : "+ salarioBruto);
        System.out.println("Imposto de Renda:" +ir);
        System.out.println("FGTS :" +fgts);
        System.out.println("O total de Desconto:"+totalDescontos);
        System.out.println("Salário Líquido:" +salarioLiquido);
        
    }
    
}
