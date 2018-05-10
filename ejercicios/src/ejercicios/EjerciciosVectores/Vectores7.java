package ejercicios.EjerciciosVectores;

import java.util.Scanner;

public class Vectores7 {
    private Scanner teclado = new Scanner(System.in);
    private int suma, n;
    private int[] elementos;

    public void carga(){
        System.out.print("ingresa el número de elementos: ");
        n = teclado.nextInt();
        elementos = new int[n];
        for (int f = 0; f < elementos.length; f++){//poner "n" tambien funciona
            System.out.print("ingresa los elementos: ");
            elementos[f] = teclado.nextInt();
            suma += elementos[f];
        }
    }
    public void imprimir(){
        System.out.println("La suma de los elementos es: " + suma);
    }
    public static void main (String[] args){
        Vectores7 toma = new Vectores7();
        toma.carga();
        toma.imprimir();
    }
}
/*Desarrollar un programa que permita ingresar un vector de n elementos,
 ingresar n por teclado. Luego imprimir la suma de todos sus elementos */