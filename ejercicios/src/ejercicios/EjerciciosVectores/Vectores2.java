package ejercicios.EjerciciosVectores;

import java.util.Scanner;

public class Vectores2 {
    private Scanner teclado;
    private int[] elementos = new int[8];
    private int may1, may2, suma, i = 1;

    public void carga() {
        Scanner teclado = new Scanner(System.in);
        for (int f = 0; f < 8; f++) {
            System.out.print("Intruce el valor " + i + ": ");
            elementos[f] = teclado.nextInt();
            suma += elementos[f];
            i++;
        }
    }

    public void comparacion() {
        for (int f = 0; f < 8; f++) {
            if (elementos[f] > 36) {
                may1 += elementos[f];
            }
            if (elementos[f] > 50) {
                may2 += elementos[f];
            }
        }
    }

    public void imprimir() {
        System.out.println("El valor acumulado total es de: " + suma);
        System.out.println("El valor acumulado de los elementos mayores a 36 es: " + may1);
        System.out.println("El valor acumulado de los elementos mayores a 50 es: " + may2);
    }

    public static void main(String[] args) {
        Vectores2 elem = new Vectores2();
        elem.carga();
        elem.comparacion();
        elem.imprimir();
    }
}
/*1.Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
El valor acumulado de todos los elementos del vector.
El valor acumulado de los elementos del vector que sean mayores a 36.
Cantidad de valores mayores a 50.*/