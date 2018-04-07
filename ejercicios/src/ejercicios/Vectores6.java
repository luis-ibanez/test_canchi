package ejercicios;

import java.util.Scanner;

public class Vectores6 {
    private Scanner teclado = new Scanner(System.in);
    private int[] sueldos;

    public void cantidad() {
        System.out.print("Introduce la cantidad de sueldos :");
        int temp;
        temp = teclado.nextInt();

        sueldos = new int[temp];

    }

    public void carga() {
        for (int f = 0; f < sueldos.length; f++) {
            System.out.print("Introduce los sueldos:");
            sueldos[f] = teclado.nextInt();

        }
    }

    public void imprimir() {
        for (int f = 0; f < sueldos.length; f++) {
            System.out.println(sueldos[f]);
        }
    }

    public static void main(String[] args) {
        Vectores6 toma = new Vectores6();
        toma.cantidad();
        toma.carga();
        toma.imprimir();
    }
}
/*Problema 1:

Se desea almacenar los sueldos de operarios. Cuando se ejecuta el
 programa se debe pedir la cantidad de sueldos a ingresar. Luego crear
  un vector con dicho tamaño.*/