package prueba3;


import java.util.Random;
import java.util.Scanner;

public class Javaya {

    private Scanner teclado = new Scanner(System.in);
    private Random numero = new Random();
    private int numeroAleatorio = numero.nextInt(999);
    private int jugador = -1;

    public void DesarrolloJuego() {
        while (jugador != numeroAleatorio) {
            System.out.println("Introduce un número entre 0 y 999: ");
            jugador = teclado.nextInt();
            if (jugador < numeroAleatorio) {
                System.out.println("Te has quedado cort@, intenta con otro número. ");
            } else if (jugador > numeroAleatorio) {
                System.out.println("Prueba un número mas pequeño.");
            }
        }
        System.out.println("PREMIOOOOOOOOO");
    }

    public void Imprimir() {
        System.out.println(numeroAleatorio);
    }

    public static void main(String[] args) {
        Javaya juegoNumeros = new Javaya();
        juegoNumeros.Imprimir();
        juegoNumeros.DesarrolloJuego();
    }

}


/*Juego
* crear un juego que pida numeros hasta que aciertes el que genera al programa.*/

//System.out.println();