/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointervalo;

/**
 *
 * @author quique
 */
public class PersonalException extends Exception {
    
    public PersonalException(){
        super("Info of exception");
    }
    
    public PersonalException(String msg){
        super (msg);
    }
}
