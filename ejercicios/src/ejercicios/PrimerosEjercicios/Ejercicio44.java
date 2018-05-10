package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nom1, nom2;
        int edad1, edad2;
        System.out.print("Introduce nombre y apellido de la primera persona: ");
        nom1 = teclado.nextLine();
        System.out.print("Introduce nombre y apellido de la segunda persona: ");
        nom2 = teclado.nextLine();
        System.out.print("Introduce la edad de la primera persona: ");
        edad1 = teclado.nextInt();
        System.out.print("Introduce la edad de la segunda persona: ");
        edad2 = teclado.nextInt();
        if (edad1 > edad2){
            System.out.print(nom1 + " es la persona de mas edad.");
        }else {
            System.out.print(nom2 + " es la persona de mas edad.");
        }
    }
}
/*Solicitar el ingreso del apellido, nombre y edad de dos personas. Mostrar el
nombre de la persona con mayor edad. Realizar la carga del apellido y nombre
 en una variable de tipo String.*/