package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad1, edad2;
        String nom1, nom2;

        System.out.println("Introduce el nombre de la primera persona: ");
        nom1 = teclado.nextLine();
        //si quitas de aqui la segunda persona y la pones abajo no hace la pregunta?????
       // System.out.println("Introduce el nombre de la segunda persona: ");
       // nom2 = teclado.nextLine();
        System.out.println("Introduce la edad de la primera persona: ");
        edad1 = teclado.nextInt();
        System.out.println("Introduce el nombre de la segunda persona: ");
        //valla la solucion es ponerlo doble esto es brujeria
        teclado.nextLine();
        nom2 = teclado.nextLine();

        System.out.println("Introduce la edad de la segunda persona: ");
        edad2 = teclado.nextInt();

        if (edad1 > edad2){
            System.out.println(nom1 + " es la persona de mas edad: ");
        }else {
            System.out.println(nom2 + " es la persona de mas edad: ");
        }
    }
}
/*Solicitar el ingreso del nombre y edad de dos personas. Mostrar el nombre de
 la persona con mayor edad.*/