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
public class Somatorio {
    
    public static int somatorio(int num){
        
        if(num==0){
            return 0;
        }
        
        return num + somatorio(num-1);
    }
    
}
