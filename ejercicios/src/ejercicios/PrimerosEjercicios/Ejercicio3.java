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
public class Ejercicio3 {
    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
        int lado;
        System.out.print("Introduce el valor del lado: ");
        lado = teclado.nextInt();
        System.out.println("El perimetro del cuadrado es de: "+(lado*4));


    }
    
}
//Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del 
//mismo (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro) 