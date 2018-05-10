package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.print("Escribe un número del 0 al 999(escribe 0 para salir): ");
            num = teclado.nextInt();

            if (num > 0 && num < 10) {
                System.out.println("Tu número tiene un digito.");
            } else if (num > 9 && num < 100) {
                System.out.println("Tu número tiene dos digitos.");
            } else if (num > 99 && num < 1000) {
                System.out.println("Tu número tiene tres digitos.");
            } else if (num >= 1000 || num <= -1){
                System.out.println("Tont@ de los cojones lee bien.");
            }
        }
        while (num != 0);
        System.out.println("Gracias por tus 5 duros.");
    }
}
/*Escribir un programa que solicite la carga de un número entre 0 y 999, y nos
 muestre un mensaje de cuántos dígitos tiene el mismo. Finalizar el programa
  cuando se cargue el valor 0.*/