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
public class Ejercicio2 {
    public static void main(String[] args){
        
    Scanner teclado = new Scanner(System.in);
    int num1, num2;
    System.out.print("Introduce el primer número: ");
    num1=teclado.nextInt();
    System.out.print("Introduce el segundo número: ");
    num2=teclado.nextInt();
    System.out.println("El resultado de la suma es: "+(num1+num2));
    System.out.println("El resultado de la multiplicacion es: "+(num1*num2));


   
    }
    
}
//Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.