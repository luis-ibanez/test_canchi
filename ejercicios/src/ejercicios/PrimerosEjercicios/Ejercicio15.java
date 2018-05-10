/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

/**
 *
 * @author Pedroken
 */
public class Ejercicio15 {
    public static void main(String[] pedroKen){
    Scanner teclado=new Scanner(System.in);
    int num;
    System.out.print("Introduce un número entero: ");
    num=teclado.nextInt();
    if(num>0){
        System.out.println("El número es positivo");
    }
    else if(num<0){
        System.out.println("El número es negativo");

    }
    else
        System.out.println("El número es nulo");

    }
    
}
/**2.Se ingresa por teclado un valor entero, mostrar una leyenda que indique 
 * si el número es positivo, nulo o negativo. **/