/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointervalo;

import javax.swing.JOptionPane;


//Codificar un programa que lea dos números para calcular la división de modo que el numerador tiene que estar
//entre 20 y 100, caso contrario, saltará una excepción que debemos capturar.

public class ProyectoIntervalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Excepcion hecha en el metodo sin ser propagada.
        DivisionNumerosCapException err1 = new DivisionNumerosCapException();

        //Excepcion popagada y capturada en el  main.
        DivisionNumerosPropException err2 = new DivisionNumerosPropException();

        int op = Integer.parseInt(JOptionPane.showInputDialog("****MENU****\n1.-Excepcion sin propagar\n2.-Excepcion propagada"));

        switch (op) {

            case 1:
                err1.doDivision();
                break;

            case 2:
                try {
                    err2.doDivision();
                } catch (PersonalException ex) {
                    System.out.println(ex.getMessage());
                }
                break;
        }
    }

}
