package ejercicios;

import java.util.Scanner;

public class Matriz {
    private Scanner teclado = new Scanner(System.in);
    private int[][] matriz = new int[3][5];

    public void carga() {

        for (int f = 0; f < 3; f++) {
            System.out.println("Introduce los datos de la fila " + f + ": ");


            for (int c = 0; c < 5; c++) {
                System.out.print("Introduce los datos de la columna " + c + ": ");
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

    public void Imprimir() {
        for (int f = 0; f < 3; f++) {

            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz toma = new Matriz();
        toma.carga();
        toma.Imprimir();
    }
}
/*Problema 1:

Crear una matriz de 3 filas por 5 columnas con elementos de tipo int, cargar
 sus componentes y luego imprimirlas.*/