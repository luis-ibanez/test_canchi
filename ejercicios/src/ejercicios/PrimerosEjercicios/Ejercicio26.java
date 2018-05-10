package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0, num, i, valores=0;
        for (i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i+" :");
            suma = teclado.nextInt();
            valores+=suma;
        }
        num = valores / 10;
        System.out.println("La suma de los valores es:" + valores);
        System.out.println("El valor promedio es :" + num);
    }
}
/*: Desarrollar un programa que permita la carga de 10 valores por teclado y nos
 muestre posteriormente la suma de los valores ingresados y su promedio. Este
  problema ya lo desarrollamos , lo resolveremos empleando la estructura for.*/