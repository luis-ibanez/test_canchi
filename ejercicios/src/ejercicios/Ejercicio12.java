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
public class Ejercicio12 {
    
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
    if(promedio>=7){
        System.out.println("Promocionado.");
    }
    else if(promedio>=4){
        System.out.println("Regular.");
    }
    else if(promedio<4){
        System.out.println("Burreras de los cojones estudia mas cabrón.");
     }
    }
    
}
/**Confeccionar un programa que pida por teclado tres notas de un alumno, calcule
 * el promedio e imprima alguno de estos mensajes:
Si el promedio es >=7 mostrar "Promocionado".
Si el promedio es >=4 y <7 mostrar "Regular".
Si el promedio es <4 mostrar "Reprobado". **/