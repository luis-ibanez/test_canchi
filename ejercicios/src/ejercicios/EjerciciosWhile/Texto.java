package ejercicios.EjerciciosWhile;

import java.util.Scanner;

public class Texto {


    public static void main(String[] args) {
        String nombre1, nombre2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer nombre: ");
        nombre1 = teclado.nextLine();
        System.out.println("Introduce el segundo nombre: ");
        nombre2 = teclado.nextLine();
        if (nombre1.equals(nombre2)) {
            System.out.println("Son iguales: " + nombre1 + ", " + nombre2);
        } else {
            System.out.println("Son distintos: " + nombre1 + ", " + nombre2);
        }
        if (nombre1.equalsIgnoreCase(nombre2)) {
            System.out.println("Son iguales: " + nombre1 + ", " + nombre2);
        } else {
            System.out.println("Son distintos: " + nombre1 + ", " + nombre2);
        }
        if (nombre1.compareTo(nombre2) == 0) {
            System.out.println("Es mayor alfabeticamente: " + nombre1);
        } else {
            System.out.println("Es menor alfabeticamente: " + nombre2);
        }
        char caracter1 = nombre1.charAt(0);
        System.out.println("El primer caracter de " + nombre1 + " es: " + caracter1);
        int largo = nombre1.length();
        System.out.println("El largo de " + nombre1 + " es: " + largo);
        String cadena3 = nombre1.substring(0, 3);
        System.out.println("Los primeros tres caracteres de " + nombre1 + " son " + cadena3);
        int posicion = nombre1.indexOf(nombre2);
        if (posicion == -1) {
            System.out.println(nombre2 + " no está contenido en " + nombre1);
        } else {
            System.out.println(nombre2 + " está contenido en " + nombre1 + " a partir de la posición " + posicion);
        }
        System.out.println(nombre1 + " convertido a mayúsculas es " + nombre1.toUpperCase());
        System.out.println(nombre1 + " convertido a minúsculas es " + nombre1.toLowerCase());

    }
}
/*Problema 1:

Confeccionar una clase que solicite el ingreso de dos String y luego emplee
 los métodos más comunes de la clase String.*/