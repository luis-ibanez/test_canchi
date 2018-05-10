package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numerosOrdenados = new int[3];

        System.out.print("Introduce el número 1: ");
        numerosOrdenados[0] = teclado.nextInt();
        System.out.print("Introduce el número 2: ");
        numerosOrdenados[1] = teclado.nextInt();
        System.out.print("Introduce el número 3: ");
        numerosOrdenados[2] = teclado.nextInt();

        //10 9 8 7 6 5 4 3 2 1
        //9 8 7 6 5 4 3 2 1 10
        //8 7 6 5 4 3 2 1 9 10

        //10x10 = 100
        //100x100 = 10000
        //coste cuadratico

        //3 2 1
        //if num[0] > num[1]
        //num[0] = num[1], num[1] = num[0]
        //2 3 1
        //if num[1] > num[2]
        //num[1] = num[2], num[2] = num[1]
        //2 1 3
        //if num[0] > num[1]
        //num[0] = num[1], num[1] = num[0]
        //1 2 3

        if (numerosOrdenados[0] > numerosOrdenados[1]){
            int temp = numerosOrdenados[0];
            numerosOrdenados[0] = numerosOrdenados[1];
            numerosOrdenados[1] = temp;
        }

        if (numerosOrdenados[1] > numerosOrdenados[2]){
            int temp = numerosOrdenados[1];
            numerosOrdenados[1] = numerosOrdenados[2];
            numerosOrdenados[2] = temp;

            if(numerosOrdenados[0] > numerosOrdenados[1]){
                temp = numerosOrdenados[0];
                numerosOrdenados[0] = numerosOrdenados[1];
                numerosOrdenados[1] = temp;
            }
        }

        System.out.println("El número mayor es el: "+numerosOrdenados[2]);
        System.out.println("El número menor es el: "+numerosOrdenados[0]);
    }
}
/*7.Escribir un programa en el cual: dada una lista de tres valores numéricos distintos
 se calcule e informe su rango de variación (debe mostrar el mayor y el menor de ellos) */