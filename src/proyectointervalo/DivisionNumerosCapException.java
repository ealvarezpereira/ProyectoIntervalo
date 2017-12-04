/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointervalo;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class DivisionNumerosCapException {
    
    private int numerador;
    private int denominador;
    
    public void doDivision(){
        numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador"));
        denominador = Integer.parseInt(JOptionPane.showInputDialog("Teclea denominador"));
        while (numerador < 20 || numerador > 100){
            try{
                if (numerador < 20){                    
                    throw new PersonalException("El numerador no puede ser menor de 20");        
                } else if (numerador > 100){
                    throw new PersonalException("El numerador no puede ser mayor de 100");
                }/* else{
                    System.out.println(numerador/denominador);
                }*/
            }catch(PersonalException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            numerador = Integer.parseInt(JOptionPane.showInputDialog("Teclea numerador"));
            
        }
        
        JOptionPane.showMessageDialog(null, numerador/denominador);
        
    }
}
