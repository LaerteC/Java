/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contato_Agenda;

/**
 *
 * @author laerte
 */
public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {
   
         return " Agenda está Cheia";

    }
    
    
}
