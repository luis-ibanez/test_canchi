package ejercicios.Matrices;

import java.util.Scanner;

public class Matriz4 {
    private Scanner teclado = new Scanner(System.in);
    private int[][] matriz = new int[2][5];

    public void carga() {
        for (int columna = 0; columna < 5; columna++) {
            System.out.println("Columna " + columna + ": ");
            for (int fila = 0; fila < 2; fila++) {
                System.out.print("Introduce la fila " + fila + ": ");
                matriz[fila][columna] = teclado.nextInt();
            }
        }
    }

    public void imprimirMatriz() {
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz4 matriz = new Matriz4();
        matriz.carga();
        matriz.imprimirMatriz();
    }
}
/*Crear una matriz de 2 filas y 5 columnas. Realizar la cargaMatriz de componentes
 por columna (es decir primero ingresar toda la primer columna, luego la
 segunda columna y así sucesivamente)
Imprimir luego la matriz.*/