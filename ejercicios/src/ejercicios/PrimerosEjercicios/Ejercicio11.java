/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.PrimerosEjercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Pedroken
 */
public class Ejercicio11 {
    public static void main(String[]ar){
    String consola=JOptionPane.showInputDialog("Introduce un número del 1 al 99");
    double num=Double.parseDouble(consola);
    if (num<=9)
        System.out.println("El número tiene un dígito.");
    else
        System.out.println("El número tiene dos dígitos.");

    }
    
}
/**Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) 
 * mostrar un mensaje indicando si el número tiene uno o dos dígitos.
(Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero) **/