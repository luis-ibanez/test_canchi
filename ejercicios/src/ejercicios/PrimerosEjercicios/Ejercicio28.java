package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int mult3 = 0, mult5 = 0, buff, f;
        for (f = 1; f <= 10; f++) {
            System.out.println("Introduce el número " + f + " :");
            buff = teclado.nextInt();
            if (buff % 3 == 0){
                mult3++;
            }
            if (buff % 5 == 0){
                mult5++;
            }
        }
        System.out.println("Los numeros divisibles entre 3 son: " + mult3);
        System.out.println("Los numeros divisibles entre 5 son: " + mult5);
    }
}
/*Escribir un programa que lea 10 números enteros y luego muestre cuántos valores
ingresados fueron múltiplos de 3 y cuántos de 5. Debemos tener en cuenta que hay
números que son múltiplos de 3 y de 5 a la vez.*/