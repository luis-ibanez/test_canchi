package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        int cantidad = 0, num1 = 0, num2 = 0, num3 = 0;
        double peso = 0, total = 0;

        do {
            cantidad++;
            System.out.print("Introduce el peso de las piezas en kilos( 0 termina): ");
            peso = teclado.nextDouble();
            total += peso;
            if (peso >= 10.3) {
                num3++;
            }
            if (peso <= 9.7) {
                num1++;
            } else {
                num2++;
            }

        }
        while (peso != 0);
        System.out.println(num2 + "-" + " Piezas tienen entre 9.8 y 10.2 kilos.");
        System.out.println(num1 + "-" + " Piezas tienen mas de 10.2 kilos .");
        System.out.println(num3 + "-" + " Piezas tienen menos de 9.8 kilos.");
        //como en la pregunta no entiendo si quiere la cantidad de piezas
        // o el peso total pongo las dos cosas
        System.out.println("De un total de " + (cantidad - 1) + " piezas procesadas.");
        System.out.println("El peso total de las piezas es de : " + total + " kilos");
    }
}
/*Realizar un programa que permita ingresar el peso (en kilogramos) de piezas.
 El proceso termina cuando ingresamos el valor 0. Se debe informar:
a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más
de 10.2 Kg.? y cuántas con menos de 9.8 Kg.?
b) La cantidad total de piezas procesadas. */