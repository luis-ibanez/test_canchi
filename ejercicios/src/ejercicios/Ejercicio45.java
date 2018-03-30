package ejercicios;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nom1, nom2;
        System.out.print("Introduce el apellido de la primera persona.");
        nom1 = teclado.next();
        System.out.print("Introduce el apellido de la segunda persona.");
        nom2 = teclado.next();
        //if (nom1 == nom2){   esto no funciona
        if (nom1.equals(nom2)){
            System.out.println("Los apellidos son iguales.");
        }else{
            System.out.println("Los apellidos son distintos.");
        }
    }
}
/*Solicitar el ingreso de dos apellidos. Mostrar un mensaje si son iguales o distintos.*/