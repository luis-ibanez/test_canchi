/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Pedroken
 */
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num1,num2,num3,num4;
        
        System.out.print("Introduce el número 1: ");
        num1=teclado.nextInt();
        
        System.out.print("Introduce el número 2: ");
        num2=teclado.nextInt();

        System.out.print("Introduce el número 3: ");
        num3=teclado.nextInt();

        System.out.print("Introduce el número 4: ");
        num4=teclado.nextInt();

        System.out.println("El resultado de la suma es de : "+(num1+num2));
        System.out.println("El resultado de la multiplicacion es de: "+(num3*num4));

      
        
        
        
    }
    
}
/**Escribir un programa en el cual se ingresen cuatro números, calcular e
   informar la suma de los dos primeros y el producto del tercero y el cuarto. **/