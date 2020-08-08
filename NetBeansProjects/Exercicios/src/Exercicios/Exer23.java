
package Exercicios;

import java.util.Scanner;

public class Exer23 {
    
    public static void main(String[]rgs){
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com uma nota");
        double nota1=scan.nextDouble();
        
        System.out.println("Entre com a Segunda Nota");
        double nota2=scan.nextDouble();
        
        double media=(nota1+nota2)/2;
        
        String aproveitamento="";
        
        if(media>=9 && media<=10){
            
            aproveitamento="Conceito A";
        
        }else if(media >=7.5 && media<9){
          
            aproveitamento="Conceito B";
   
        }else if(media>= 6 && media<7.5){
           
           aproveitamento="Conceito C";
            
    }else if(media>=4 && media <6){
        
           aproveitamento="Conceito D";
    }else if(media >=0 && media <4){
        
           aproveitamento="Conceito E"; 
        
    }
        
        
        System.out.println("Média"+ media);
        
        System.out.println(aproveitamento);
        
        
        
    }
    
}
