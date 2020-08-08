/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

/**
 *
 * @author laerte
 */
public class Upcas {
    
    public static void main(String [] args){
        
        Object obj=obterString();
        String string1=(String) obj;
        
        Object obj2=" Meu teste de Upcasting";
        String string2= (String) obj2;
        
        Object obj3=new Object();
        
        Object obj4=obterInt();
        String s1=(String)obj4;
        
        System.out.println(string2);
        
        System.out.println(string1);
    }
    
    public static String obterString(){
        return " Minha String fazendo Upcasting";    
    }
    public static int obterInt(){
        return 1;
    }
    
}
