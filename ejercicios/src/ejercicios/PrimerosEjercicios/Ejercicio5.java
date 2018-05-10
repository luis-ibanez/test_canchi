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
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num1,i=1,s=1;
        double promedio=0,suma=0;
        while(i<=4){
        System.out.println("Introduce el número "+s+":");
        num1=teclado.nextInt();
        suma+=num1;
        promedio=suma/4;
        i++;
        s++;
        }
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado promedio es: "+promedio);

     
        
    }
}
//Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio. 