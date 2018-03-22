package ejercicios;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Introduce el número 1: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el número 2: ");
        num2 = teclado.nextInt();
        System.out.print("Introduce el número 3: ");
        num3 = teclado.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El número 1 es el mayor: " + num1);

        } else if (num2 > num3) {
            System.out.println("El número 2 es el mayor: " + num2);
        } else {
            System.out.println("El número 3 es el mayor: " + num3);
        }if (num1 < num2 && num1 < num3){
            System.out.println("El número 1 es el menor: "+num1);
        }else if (num2 < num3){
            System.out.println("El número 2 es el mayor: "+num2);
        }else{
            System.out.println("El número 3 es el mayor: "+num3);
        }
    }
}
/*7.Escribir un programa en el cual: dada una lista de tres valores numéricos distintos
 se calcule e informe su rango de variación (debe mostrar el mayor y el menor de ellos) */