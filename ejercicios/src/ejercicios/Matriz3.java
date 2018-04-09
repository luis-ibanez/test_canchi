package ejercicios;

import java.util.Scanner;

public class Matriz3 {
    private Scanner teclado = new Scanner(System.in);
    private int[][] matriz = new int[3][5];

    public void Carga() {
        for (int f = 0; f < 3; f++) {
            System.out.println("Fila " + f);
            for (int c = 0; c < 5; c++) {
                System.out.print("Columna " + c + ": ");
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

    public void imprimirPrimeraFila() {
        int f = 0;
        for (int c = 0; c < 5; c++) {

            System.out.print(matriz[f][c] + " ");
        }
    }

    public void imprimirUltimaFila() {
        int f = 2;
        for (int c = 0; c < 5; c++) {
            System.out.print(matriz[f][c] + " ");
        }
    }

    public void imprimirPrimeraColumna() {
        int c = 0;
        for (int f = 0; f < 3; f++) {

            System.out.print(matriz[f][c] + " ");
        }
    }
    public void imprimirColumna(int columna) {
        for (int f = 0; f < 3; f++) {
            System.out.print(matriz[f][columna] + " ");
        }
    }
    public void imprimirFila(int fila) {
        for (int columna = 0; columna < 5; columna++) {
            System.out.print(matriz[fila][columna] + " ");
        }
    }

    public static void main(String[] agrs) {
        Matriz3 toma = new Matriz3();
        toma.Carga();
        //toma.imprimirPrimeraFila();
        toma.imprimirFila(0);
        //toma.imprimirUltimaFila();
        toma.imprimirFila(2);
        //toma.imprimirPrimeraColumna();
        toma.imprimirColumna(0);
    }
}
/*Problema 3:

Crear y cargar una matriz de 3 filas por 4 columnas. Imprimir la primer fila.
Imprimir la última fila e imprimir la primer columna.*/