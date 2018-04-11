package ejercicios;

import java.util.Scanner;

public class Matriz8 {
    private Scanner teclado = new Scanner(System.in);
    private int[][] matriz;
    private int fila, columna;

    public void carga(){
        System.out.print("Introduce la cantidad de filas: ");
        fila = teclado.nextInt();
        System.out.print("Introduce la cantidad de columnas: ");
        columna = teclado.nextInt();
        matriz = new int[fila][columna];

        for (fila = 0; fila < matriz.length; fila++){
            System.out.println("Fila " + fila + ".");
            for (columna = 0; columna < matriz[fila].length; columna++){
                System.out.print("Columna " + columna + ":");
                matriz[fila][columna] = teclado.nextInt();
            }
        }
    }
    public void elegirVertices(){
        System.out.println(matriz[0][0]);
        System.out.println(matriz[0][columna -1]);
        System.out.println(matriz[fila -1][0]);
        System.out.println(matriz[fila -1][columna -1]);
    }
    public static void main(String[] args){
        Matriz8 matriz = new Matriz8();
        matriz.carga();
        matriz.elegirVertices();
    }
}
/*Crear una matriz de n * m filas (cargar n y m por teclado) Imprimir los
cuatro valores que se encuentran en los vértices de la misma (mat[0][0] etc.) */