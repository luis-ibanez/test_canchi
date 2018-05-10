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
public class Ejercicio10 {
    public static void main(String[]ar){
    Scanner teclado=new Scanner(System.in);
    float nota1,nota2,nota3,promedio,suma;
    System.out.print("Introduce la primera nota: ");
    nota1=teclado.nextFloat();
    System.out.print("Introduce la segunda nota: ");
    nota2=teclado.nextFloat();
    System.out.print("Introduce la tercera nota: ");
    nota3=teclado.nextFloat();
    suma=nota1+nota2+nota3;
    promedio=suma/3;
    if(promedio>7)
        System.out.println("Promocionado");
    else
                System.out.println("Burreras de los cojones estudia mas cabron");

    }
    
}
/**2. Se ingresan tres notas de un alumno, si el promedio es mayor o igual a 
 * siete mostrar un mensaje "Promocionado".
**/