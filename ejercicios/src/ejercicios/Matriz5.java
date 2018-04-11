package ejercicios;

import java.util.Scanner;

public class Matriz5 {
    private Scanner teclado = new Scanner(System.in);
    private int[][] matriz;
    private int fila, columna;
    private int f, c;

    public void carga() {
        System.out.println("Introduce la cantidad de filas: ");
        fila = teclado.nextInt();
        System.out.println("Introduce la cantidad de columnas: ");
        columna = teclado.nextInt();
        c = columna;
        f = fila;
        matriz = new int[fila][columna];
        for (fila = 0; fila < f; fila++) {
            System.out.println("Fila " + fila + ".");
            for (columna = 0; columna < c; columna++) {
                System.out.print("Columna " + columna + ": ");
                matriz[fila][columna] = teclado.nextInt();
            }
        }
    }

    public void imprimirMatriz() {
        for (int fila = 0; fila < f; fila++) {
            for (int columna = 0; columna < c; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirFila() {
        for (int columna = 0; columna < c; columna++) {
            System.out.print(matriz[f - 1][columna] + " ");
            //aki si no le pongo - 1 a f se sale de la grafica y peta ;(
        }
    }

    public static void main(String[] args) {
        Matriz5 matriz = new Matriz5();
        matriz.carga();
        matriz.imprimirMatriz();
        matriz.imprimirFila();
    }
}
/*Problema 1:

Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir la
matriz completa y la última fila.*/