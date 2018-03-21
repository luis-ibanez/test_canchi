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
public class Ejercicio16 {
    public static void main(String[] pedroKen){
    Scanner teclado=new Scanner(System.in);
    int num;
    System.out.println("Introduce un número del 1 al 999");
    num=teclado.nextInt();
    if(num>0&&num<10){
        System.out.println("Tu número tiene una sola cifra.");
    }
    else if(num>9&&num<100){
        System.out.println("Tu número tiene dos cifras.");
    }
    else if(num>99&&num<1000){
        System.out.println("Tu número tiene tres cifras.");
    }
    else
        System.out.println("O eres múúúú tonto o no sabes leer.");
    }
    
}
/**3.Confeccionar un programa que permita cargar un número entero positivo de 
 * hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
 * Mostrar un mensaje de error si el número de cifras es mayor.**/