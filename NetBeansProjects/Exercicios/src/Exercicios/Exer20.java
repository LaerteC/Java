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
public class Exer20 {
    
    public static void main(String [] args){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com o Salário do Funcionário!!!");
        Double Salario=scan.nextDouble();
        
        
        if(Salario<=280){
            double SalAjuste=(Salario*20)/100;
            System.out.println("Houve um Acréscimo do Salário de 20 % ! " + (SalAjuste+Salario));
        }else if(Salario>280 && Salario<=700){
            double SalAjuste=(Salario*15)/100;
            System.out.println("Houve um Acréscimo no Salário de 15 % ! " +(SalAjuste+Salario));
        }else if(Salario>700 && Salario<=1500){
            double SalAjuste=(Salario*10)/100;
            System.out.println("Houve um Acréscimo no Salário de 10% ! "+ (SalAjuste+Salario));
        }else{
            double SalAjuste=(Salario*5)/100;
            System.out.println("Salários Acima de 1500 reais á um Acréscimo de 5% " +(SalAjuste+Salario));
        }
    }
    
}
