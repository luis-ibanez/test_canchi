package ejercicios;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int f, num;
        System.out.print("Ingresa un valor del 1 al 10 :");
        num = teclado.nextInt();
        for (f = 1; f <= 12; f++){
            System.out.println(num + "*" + f + "=" + num*f);
        }
    }
}
/*4.Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre
la tabla de multiplicar del mismo (los primeros 12 términos)
Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36. */