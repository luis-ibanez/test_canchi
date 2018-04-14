package ejercicios;

import java.util.Scanner;

public class MatricesYVectoresParalelos3 {
    private Scanner teclado = new Scanner(System.in);
    private int[][] matriz;
    private int fila, columna;

    public void cargaMatriz() {
        System.out.println("Introduce la cantidad de filas.");
        fila = teclado.nextInt();
        matriz = new int[fila][];
        //se crean en la matriz las filas
        int contador = fila;
        for (fila = 0; fila < contador; fila++) {
            columna = 0;
            System.out.println("Introduce la cantidad de columnas en la fila " + fila + ".");
            columna = teclado.nextInt();
            matriz[fila] = new int[columna];
            //con las filas ya creadas se crean las columnas
        }
    }

    public void cargaParametros() {
        for (fila = 0; fila < matriz.length; fila++) {
            System.out.println("fila " + fila + ".");
            for (columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("Introduce los parametros columna " + columna + ": ");
                matriz[fila][columna] = teclado.nextInt();
            }
        }
    }


    public void imprimir() {
        for (fila = 0; fila < matriz.length; fila++) {
            for (columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        MatricesYVectoresParalelos3 matriz = new MatricesYVectoresParalelos3();
        matriz.cargaMatriz();
        matriz.cargaParametros();
        matriz.imprimir();
    }
}
/*Problema 1:

Confeccionaremos un programa que permita crear una matriz irregular y luego
imprimir la matriz en forma completa. */