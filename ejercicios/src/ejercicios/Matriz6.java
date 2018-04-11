package ejercicios;

import java.util.Scanner;

public class Matriz6 {
    private Scanner teclado = new Scanner(System.in);
    private int[][] matriz;
    private int numeroMayor;

    public void carga() {
        System.out.print("Introduce la cantidad de filas: ");
        int fila = teclado.nextInt();
        System.out.print("Introduce la cantidad de columnas: ");
        int columna = teclado.nextInt();
        matriz = new int[fila][columna];
        for (fila = 0; fila < matriz.length; fila++) {
            System.out.println("Fila " + fila + ".");
            for (columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print("Columna " + columna + ": ");
                matriz[fila][columna] = teclado.nextInt();
            }
        }
    }

    public void comprobarNumeroMayor() {
        int filaMayor = 0, columnaMayor = 0;
        numeroMayor = matriz[0][0];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] > numeroMayor) {
                    numeroMayor = matriz[fila][columna];
                    filaMayor = fila;
                    columnaMayor = columna;
                  //  System.out.println(columnaMayor);
                    //System.out.println(filaMayor);
                    System.out.println(numeroMayor);
                }
            }
        }
        System.out.println("columna mayor: " );
        for (int fila = 0; fila < matriz.length; fila++){

            System.out.print(matriz[fila][columnaMayor] + " ");
        }
        System.out.println();
        System.out.println("Fila mayor: " );
        for (int columna = 0; columna < matriz[filaMayor].length; columna++){
            System.out.print(matriz[filaMayor][columna] + " ");
        }
    }

    public void imprimirMatriz() {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matriz6 matriz = new Matriz6();
        matriz.carga();
        matriz.imprimirMatriz();
        matriz.comprobarNumeroMayor();
    }
}
/*Problema 2:

Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir el mayor
 elemento y la fila y columna donde se almacena.*/