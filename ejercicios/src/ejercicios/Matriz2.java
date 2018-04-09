package ejercicios;

import java.util.Scanner;

public class Matriz2 {
    private Scanner teclado = new Scanner(System.in);
    private int[][] matriz = new int[4][4];

    public void Carga() {
        for (int f = 0; f < 4; f++) {
            System.out.println("Introduce los datos de la fila " + f + ": ");
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Introduce los datos de la columna " + columna + ": ");
                matriz[f][columna] = teclado.nextInt();
            }
        }
    }

    public void Imprimir() {
        for (int fila = 0; fila < 4; fila++) {
            System.out.print(matriz[fila][fila] + " ");
        }
    }


    public static void main(String[] args) {
        Matriz2 matriz = new Matriz2();
        matriz.Carga();
        matriz.Imprimir();
    }
}
/*Problema 2:

Crear y cargar una matriz de 4 filas por 4 columnas. Imprimir la diagonal principal.*/