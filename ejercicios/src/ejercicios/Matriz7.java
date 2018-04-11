package ejercicios;

import java.util.Scanner;

public class Matriz7 {
    private Scanner teclado = new Scanner(System.in);
    private int[][] matriz;
    private int fila, columna, temporal;

    public void cargar() {
        System.out.println("Introduce la cantidad de filas: ");
        fila = teclado.nextInt();
        System.out.println("Introduce la cantidad de columnas: ");
        columna = teclado.nextInt();
        matriz = new int[fila][columna];
        for (fila = 0; fila < matriz.length; fila++) {
            System.out.println("Fila " + fila + ".");
            for (columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print("Columna " + columna + ": ");
                matriz[fila][columna] = teclado.nextInt();
            }
        }
    }

    public void cambiarPrimeraPorSegunda() {
        for (fila = 0; fila < matriz.length; fila++) {
            for (columna = 0; columna < matriz[fila].length; columna++) {
                temporal = matriz[0][columna];
                matriz[0][columna] = matriz[1][columna];
                matriz[1][columna] = temporal;
            }
        }
    }

    public void imprimir() {
        for (fila = 0; fila < matriz.length; fila++) {
            for (columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz7 matriz = new Matriz7();
        matriz.cargar();
        System.out.println("Normal.");
        matriz.imprimir();
        matriz.cambiarPrimeraPorSegunda();
        System.out.println("Cambiado.");
        matriz.imprimir();
    }
}
/*Crear una matriz de n * m filas (cargar n y m por teclado) Intercambiar
la primer fila con la segundo. Imprimir luego la matriz. */