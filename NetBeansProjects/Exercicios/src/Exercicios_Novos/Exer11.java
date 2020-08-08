/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_Novos;

import java.util.Scanner;

/**
 *
 * @author laerte
 */
public class Exer11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[][] compromisso = new String[31][24];

        boolean sair = false;
        boolean diaValido = false;
        int dia = 0;
        int hora=0;
        boolean horaValida=false;
        

        byte opcao;

        while (!sair) {

            System.out.println(" Digite 1 para Adicionar Compromisso . ");
            System.out.println(" Digite 2 para Verificar Compromisso . ");
            System.out.println(" Digite 0 para Sair . ");

            opcao = scan.nextByte();

            if (opcao == 1) {  // Adicionar Compromisso .

                while (!diaValido) {

                    System.out.println("Entre com o dia do Mês :");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                       
                        diaValido = false;
                        System.out.println("Entre com um mês correto ");
                    }
                }
                
                while(!horaValida){
                  
                 System.out.println("Entre com o Horario :");
                 hora=scan.nextInt();
                 if(hora>0 && hora<=24){
                     
                     horaValida=true;
                 }else{
                    System.out.println("Entre com um Horário Correto : ");
                 }
                 
                
            }
                  dia--;
                 System.out.println("Digite o Compromisso : ");
                 compromisso[dia][hora]=scan.next();
                 
            }else if (opcao == 2) { 

                while (!diaValido) {

                    System.out.println("Entre com o dia do Mês :");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                       
                        diaValido = false;
                        System.out.println("Entre com um mês correto ");
                    }
                }
                
                while(!horaValida){
                  
                 System.out.println("Entre com o Horario :");
                 hora=scan.nextInt();
                 if(hora>0 && hora<=24){
                     
                     horaValida=true;
                 }else{
                    System.out.println("Entre com um Horário Correto : ");
                 }
                 
                
            }
                
                dia--;
                System.out.println("O Compromisso agendado é : ");
                
                System.out.println(compromisso[dia][hora]); 
                
            } else if (opcao == 0) {

                sair = true;
            } else {

                System.out.println(" Opção Inválida . Digite Novamente ");
            }

        }

    }

}
