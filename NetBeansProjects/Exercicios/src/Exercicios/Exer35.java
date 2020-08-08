
package Exercicios;

import java.util.Scanner;

public class Exer35{
    
    public static void main(String [] args){
        
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Entre com a população de A");
        int popA=scan.nextInt();
        
        System.out.println("Entre com a população de B");
        int popB=scan.nextInt();
        
        System.out.println("Entre com a porcentagem / Ou Taxa de Crescimento da População de A!");
        double taxaA=scan.nextDouble();
        
        System.out.println("Entre com a porcentagem / Ou Taxa de Crescimento da População de B!");
        double taxaB=scan.nextDouble();
        
        
        int anos=0;
        
        while(popA<popB){
            
            popA+=(popA/100)*taxaA;
            
            popB+=(popB/100)*taxaB; 
            
            anos++;
            
        }
        
         System.out.println("Precisou de " + anos + " anos Para a População de A ultrapassar a População de B ");
    }
    
    
    
}