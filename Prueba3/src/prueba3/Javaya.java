package prueba3;


import java.util.Random;
import java.util.Scanner;

public class Javaya {

    private Scanner teclado = new Scanner(System.in);
    private Random numero = new Random();
    private int numeroAleatorio = numero.nextInt(999);
    private int intentoNumeroJugador = -1;
    private int contadorDeIntentos;

    public void DesarrolloJuego() {
        while (intentoNumeroJugador != numeroAleatorio) {
            contadorDeIntentos++;
            System.out.println("Introduce un número entre 0 y 999: ");
            intentoNumeroJugador = teclado.nextInt();
            if (intentoNumeroJugador < numeroAleatorio) {
                System.out.println("Te has quedado cort@, intenta con otro número. ");
            } else if (intentoNumeroJugador > numeroAleatorio) {
                System.out.println("Prueba un número mas pequeño.");
            }
            if (contadorDeIntentos == 5) {
                System.out.println("*****************************Animo estas cerca***************************");
            }
            if (contadorDeIntentos == 10) {
                System.out.println("***********************Pues no parecias tan torpe************************");
            }
            if (contadorDeIntentos == 12) {
                System.out.println("*****************Sabes en que consiste el juego , ¿no?**************************");
            }
            if (contadorDeIntentos == 15) {
                System.out.println("*******************Creo que te estan llamando al telefono******************************");
            }
            if (contadorDeIntentos == 19) {
                System.out.println("********************Ya me estas dando pena en el proximo intento te lo digo********************");
            }
            if (contadorDeIntentos == 20) {
                System.out.println("*******************El numero es el " + numeroAleatorio + "******************************");
            }
            if (contadorDeIntentos == 21) {
                System.out.println("**************Sabes leer? te lo he dicho antes, el número es el " + numeroAleatorio + "************************");
            }
        }
        System.out.println("****************************************PREMIOOOOOOOOO***********************************************");
    }

    public void PuntuacionObtenida() {
        System.out.println("juego pasado en " + contadorDeIntentos + " intentos");
        if (contadorDeIntentos == 1) {
            System.out.println("Nivel Dios");
            System.out.println("Has obtenido tropecientos mil puntos.");
        } else if (contadorDeIntentos < 4) {
            System.out.println("Nivel 1: 100 puntos. ");
        } else if (contadorDeIntentos < 8) {
            System.out.println("Nvel 2: 50 puntos.");
        } else if (contadorDeIntentos < 10) {
            System.out.println("Nivel 3: 10 puntos.");
        } else if (contadorDeIntentos < 15) {
            System.out.println("Nivel 4: 1 punto.");
        } else if (contadorDeIntentos > 15) {
            System.out.println("Apaga el pc y vete a dormir, ya esta bien por hoy.");
        }
    }

    public void Imprimir() {
        System.out.println(numeroAleatorio);
    }

    public static void main(String[] args) {
        Javaya juegoNumeros = new Javaya();
        //juegoNumeros.Imprimir();
        juegoNumeros.DesarrolloJuego();
        juegoNumeros.PuntuacionObtenida();
    }

}


/*Juego
 * crear un juego que pida numeros hasta que aciertes el que genera el programa.*/

//System.out.println("");