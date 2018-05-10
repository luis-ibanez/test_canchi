package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota = 0, sus = 0, f, mientras = 0;
        for (f = 1; f <= 10; f++) {
            System.out.print("Introduce la nota del alumno " + f + ": ");
            mientras = teclado.nextInt();

            if (mientras >= 7) {

                nota++;
            } else {

                sus++;
            }
        }
        System.out.println("El número de alumnos aprobados es de : " + nota);
        System.out.println("El número de alumnos suspendidos es de : " + sus);

    }
}
/*Escribir un programa que lea 10 notas de alumnos y nos informe cuántos tienen
 notas mayores o iguales a 7 y cuántos menores.*/