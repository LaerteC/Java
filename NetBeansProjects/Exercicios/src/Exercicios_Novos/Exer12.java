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
public class Exer12 {
    
    public static void main(String [] args){
        
        Scanner scan= new Scanner(System.in);
        
        String [] [] [] compromissos=new String  [12][31][24];
        
        boolean sair=false;
        
        int opcao;
        
        while(!sair){
            
            System.out.println(" Digite 1 - para adicionar Compromisso :" );
            System.out.println(" Digite 2 - para Verificar Compromisso :" );
            System.out.println(" Digite 0 para sair :");
            
            
            opcao=scan.nextInt();
            
            if(opcao==1){
                
                boolean mesValido=false;
                int mes=0;
                
                while(!mesValido){
                    
                    System.out.println("Entre com o mês do Ano : ");
                    mes=scan.nextInt();
                    
                    if(mes>0 && mes<=12){
                        
                        mesValido=true;
                    }else{
                        
                        System.out.println("Entre com um mês Válido");
                    }
                }
               
                
                
                
                
                boolean diaValido=false;
                int dia=0;
                
                while(!diaValido){
                    
                    System.out.println("Entre com o dia do Mês :");
                    dia=scan.nextInt();
                    
                    if(dia>0 && dia<=31){
                        
                        diaValido=true;
                    }else{
                        
                        System.out.println(" Dia inválido , digite novamente ");
                        
                    }
                    
                }
                
                boolean horaValido=false;
                int hora=0;
                
                while(!horaValido){
                    
                    System.out.println(" Entre com a hora do Compromisso : ");
                    hora=scan.nextInt();
                    
                    if(hora>=0 && hora<=8){
                        
                        horaValido=true;
                    }else{
                        System.out.println("Hora Inválida. Digite Novamente");
                    }
                    
                }
                
                mes--;
                dia--;
                System.out.println("Digite o Compromisso : ");
                compromissos[mes][dia][hora]=scan.next();
                
                
            }else if(opcao==2){
                
                boolean mesValido=false;
                int mes=0;
                
                while(!mesValido){
                    
                    System.out.println("Entre com o Mês do ano :");
                    mes=scan.nextInt();
                    
                    if(mes>0 && mes<=12){
                        mesValido=true;
                    }else{
                        
                        System.out.println("Digite um mês correto : 0");
                        
                    }
                }
                
                
                boolean diaValido=false;
                int dia=0;
                
                while(!diaValido){
                    System.out.println("Entre com o Dia do Mês :");
                    dia=scan.nextInt();
                    
                    if(dia>0 && dia<=31){
                        diaValido=true;
                    }else{
                            System.out.println("Dia Inválido. Digite Novamente");
                    }
                }
                
                boolean horaValida=false;
                int hora=0;
                while(!horaValida){
                    System.out.println("Entre com a hora do Compromisso : ");
                    hora=scan.nextInt();
                    if(hora>=0 && hora<=8){
                        horaValida=true;
                    }else{
                        System.out.println("Hora Inválida. Digite Novamente");
                    }
                }
                
                mes--;
                dia--;
                System.out.println("O compromisso Agendado é :");
                
                System.out.println(compromissos[mes][dia][hora]);
                
                
                
            }else if(opcao==0){
                
                sair=true;
                
            }else{
                
                System.out.println("Opção Inválida, Digite Novamente ");
            }
          
            
        }
        
        
    }
    
}
