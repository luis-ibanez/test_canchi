package ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x, y, cuadrante;
        System.out.print("Ingresa el primer número de la coordenada: ");
        x = teclado.nextInt();
        System.out.print("Ingresa el segundo número de la coordenada: ");
        y = teclado.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1º Cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("2º Cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("3º Cuadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("5º Cuadrante");
        } else {
            System.out.println("Las coordenadas no pueden ser 0");
        }

    }
}
/*5.Escribir un programa que pida ingresar la coordenada de un punto en el plano, es
 decir dos valores enteros x e y (distintos a cero).
Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante
 si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.) */