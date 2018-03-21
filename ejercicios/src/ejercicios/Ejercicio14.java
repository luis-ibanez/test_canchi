/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Pedroken
 */
public class Ejercicio14 {
    public static void main(String[] ar) {
        solucionAlternativa();
    }

    public static void solucionCanchi(){
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Introduce el primer número: ");
        num1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextInt();

        System.out.print("Introduce el tercer número: ");
        num3 = teclado.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El primer número es el mayor: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El segundo número es el mayor: " + num2);
        } else {
            System.out.println("El tercer número es el mayor: " + num3);
        }
    }

    public static void solucionAlternativa() {
        Scanner teclado = new Scanner(System.in);
        String line;
        boolean error = true;
        int num1, num2, num3;

        while (error) {
            try {
                System.out.println("Introduce tres números separados por comas:");
                line = teclado.nextLine();

                String[] numeros = line.split(",");

                if (numeros.length == 3) {

                    num1 = Integer.parseInt(numeros[0]);
                    num2 = Integer.parseInt(numeros[1]);
                    num3 = Integer.parseInt(numeros[2]);

                    if (num1 > num2 && num1 > num3) {
                        System.out.println("El primer número es el mayor: " + num1);
                    } else if (num2 > num1 && num2 > num3) {
                        System.out.println("El segundo número es el mayor: " + num2);
                    } else {
                        System.out.println("El tercer número es el mayor: " + num3);
                    }

                    error = false;
                }else{
                    System.out.println("Ha habido un error al introducir los números, inténtalo de nuevo");
                }
            } catch (Exception e) {
                error = true;
                System.out.print("Ha habido un error al introducir los números, inténtalo de nuevo");
            }
        }
    }

}
/**
 * Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
 **/
