/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pedroken
 */
public class Ejercicio1 {
    public static void main(String[] args){
    
    double horas,precio,sueldo;
    Scanner operario=new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Introduce las horas realizadas: ");
    horas=operario.nextInt();
    System.out.println("Introduce el precio de la hora: ");
    precio=operario.nextDouble();    
    sueldo = horas*precio;
    System.out.println("tu salario es de: "+sueldo+"€");
    }
    
}
/**Calcular el sueldo mensual de un operario conociendo la cantidad de horas
 * trabajadas y el pago por hora.**/