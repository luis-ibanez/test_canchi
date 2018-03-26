package ejercicios;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int f, num, multi = 0, par = 0, pos = 0, neg = 0;
        for (f = 1; f <= 10; f++) {
            System.out.print("Introduce el valor " + f + " :");
            num = teclado.nextInt();
            if (num % 2 == 0) {
                par++;
            }
            if (num % 15 == 0) {
                multi++;
            }
            if (num >= 0) {
                pos++;
            }
            if (num < 0) {
                neg++;
            }
        }
        System.out.println("valores negativos: " + neg);
        System.out.println("valores positivos: " + pos);
        System.out.println("valores pares: " + par);
        System.out.println("valores multiplos de 15: " + multi);
    }
}
/*Se realiza la carga de 10 valores enteros por teclado. Se desea conocer:
a) La cantidad de valores ingresados negativos.
b) La cantidad de valores ingresados positivos.
c) La cantidad de múltiplos de 15.
d) El valor acumulado de los números ingresados que son pares. */