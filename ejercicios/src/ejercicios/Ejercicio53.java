package ejercicios;

import java.util.Scanner;

public class Ejercicio53 {
    private Scanner teclado;
    private int[] numord = new int[3];

    public void carga() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        numord[0] = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        numord[1] = teclado.nextInt();
        System.out.print("Introduce el tercer número: ");
        numord[2] = teclado.nextInt();
        ordenar();
    }

    public void ordenar() {
        if (numord[0] > numord[1]) {
            int temp = numord[0];
            numord[0] = numord[1];
            numord[1] = temp;
        }
        if (numord[1] > numord[2]) {
            int temp = numord[1];
            numord[1] = numord[2];
            numord[2] = temp;
        }
        if (numord[0] > numord[1]) {
            int temp = numord[0];
            numord[0] = numord[1];
            numord[1] = temp;
        }
    }
    public void imprimir(){
        System.out.println("El número mayor es el: " + numord[2]);
        System.out.println("El número menor es el: " + numord[0]);
    }
    public static void main(String[] args){
        Ejercicio53 ordenar = new Ejercicio53();
        ordenar.carga();
        ordenar.imprimir();
    }

}
/*Problema 2:

Confeccionar una clase que permita ingresar tres valores por teclado. Luego
 mostrar el mayor y el menor.*/