package ejercicios;

import java.util.Scanner;

public class MatricesYVectoresParalelos4 {
    private Scanner teclado = new Scanner(System.in);
    private int[][] matriz = new int[5][];

    public void cargaColumnas() {
        int columna = 1;
        for (int fila = 0; fila < matriz.length; fila++) {
            matriz[fila] = new int[columna];
            columna++;
        }
    }

    public void cargaMatriz() {
        for (int fila = 0; fila < matriz.length; fila++) {
            System.out.println("fila " + fila + ".");
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.println("Ingresa el valor de la columna " + columna + ":");
                matriz[fila][columna] = teclado.nextInt();
            }
        }
    }

    public void imprimir() {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna]);
            }
            System.out.println();
            }
    }
    public static void main(String[] args){
        MatricesYVectoresParalelos4 matriz = new MatricesYVectoresParalelos4();
        matriz.cargaColumnas();
        matriz.cargaMatriz();
        matriz.imprimir();
    }
}
/*Confeccionar una clase para administrar una matriz irregular de 5 filas y 1 columna
 la primer fila, 2 columnas la segunda fila y así sucesivamente hasta 5 columnas la
  última fila (crearla sin la intervención del operador)
Realizar la carga por teclado e imprimir posteriormente. */