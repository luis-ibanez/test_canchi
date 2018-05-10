package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("9999 detiene el programa.");
        int num, suma = 0;
        do {
            System.out.print("Ingresa el valor a sumar : ");
            num = teclado.nextInt();
            suma += num;
        }
        while (num != 9999);
        suma = suma - 9999;
        System.out.println("A finalizado la cargaMatriz.");
        System.out.println("El resultado de la suma es de : " + suma);
        if (suma == 0) {
            System.out.println("El resultado de la suma es cero.");
        }else if (suma < 0) {
            System.out.println("El resultado de la suma es menor que cero.");
        } else {
            System.out.println("El resultado de la suma es mayor que cero.");
        }
    }
}
/*
    Realizar un programa que acumule (sume) valores ingresados por teclado hasta
     ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la cargaMatriz).

     Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero
     o menor a cero.

*/