package ejercicios;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, promedio, contador = 0, i = 0;
        do {
            contador++;
            System.out.print("Introduce los numeros que quieras obtener el promedio (0 detiene): ");
            num = teclado.nextInt();
            i += num;

            promedio = i / contador;
        }
        while (num != 0);

        System.out.print("El promedio de los números es: " + promedio);
    }
}
/*Escribir un programa que solicite la cargaMatriz de números por teclado, obtener
 su promedio. Finalizar la cargaMatriz de valores cuando se cargue el valor 0.*/