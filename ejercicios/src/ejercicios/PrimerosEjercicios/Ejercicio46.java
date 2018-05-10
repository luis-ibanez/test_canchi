package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int edad;
        String nombre;
        System.out.print("Introduce el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Introduce la edad: ");
        edad = teclado.nextInt();
        System.out.println(nombre + " con " + edad + " años");
        if (edad >= 18){
            System.out.println("Es mayor de edad.");
        }else {
            System.out.print("Es menor de edad.");

        }
    }
}
/*Problema 1.
Confeccionar una clase que permita carga el nombre y la edad de una persona.
 Mostrar los datos cargados. Imprimir un mensaje si es mayor de edad (edad>=18)*/