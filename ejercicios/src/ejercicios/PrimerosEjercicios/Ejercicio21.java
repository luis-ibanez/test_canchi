package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Ingresa el número 1: ");
        num1 = teclado.nextInt();
        System.out.print("Ingresa el número 2: ");
        num2 = teclado.nextInt();
        System.out.print("Ingresa el número 3: ");
        num3 = teclado.nextInt();

        if (num1 < 10 && num2 < 10 && num3 < 10) {
            System.out.println("Todos los números son menores a diez.");
        } else {
            System.out.println("algún número es mayor que 10.");
        }

    }
}
/*3.Se ingresan por teclado tres números, si todos los valores ingresados son menores
 a 10, imprimir en pantalla la leyenda "Todos los números son menores a diez".*/