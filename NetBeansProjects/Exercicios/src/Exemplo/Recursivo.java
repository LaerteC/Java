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
public class Recursivo {
    
    
    
    public static int fatorialNaoRecursivo(int num){
        
        if(num==0){
            return 1;
        }
        int total=1;
        
        for(int i=num;i>1;i--){
            total*=i;
        }
        return total;
        
    }
    
    
    public static int fatorial(int num){
        
        if(num==0){
            
            return 1;
        }
        
        return num* fatorial(num-1);
    }
}
