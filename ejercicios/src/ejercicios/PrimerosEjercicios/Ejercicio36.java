package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mañana = 0, tarde = 0, noche = 0, f, promedio1, promedio2, promedio3, mayor, num1, num2, num3;
        for (f = 1; f <= 5; f++) {
            System.out.print("Introduce las edades del turno de mañana: ");
            num1 = teclado.nextInt();
            mañana += num1;
        }
        for (f = 1; f <= 6; f++) {
            System.out.print("Introduce las edades del turno de tarde: ");
            num2 = teclado.nextInt();
            tarde += num2;
        }
        for (f = 1; f <= 11; f++) {
            System.out.print("Introduce las edades del turno de noche: ");
            num3 = teclado.nextInt();
            noche += num3;
        }
        promedio1 = mañana / 5;
        promedio2 = tarde / 6;
        promedio3 = noche / 11;

        System.out.println("La media de edades de la mañana es: " + promedio1);
        System.out.println("La media de edades de la tarde es: " + promedio2);
        System.out.println("La media de edades de la noche es: " + promedio3);

        if (promedio1 > promedio2 && promedio1 > promedio3) {
            System.out.println("La media de edad mayor es la del turno de mañana. ");
        } else if (promedio2 > promedio1 && promedio2 > promedio3) {
            System.out.println("La media de edad mayor es la del turno de tarde. ");
        } else {
            System.out.println("La media de edad mayor es la del turno de noche. ");
        }
    }
}
/*8.Se cuenta con la siguiente información:
Las edades de 50 estudiantes del turno mañana.
Las edades de 60 estudiantes del turno tarde.
Las edades de 110 estudiantes del turno noche.
Las edades de cada estudiante deben ingresarse por teclado.
a) Obtener el promedio de las edades de cada turno (tres promedios)
b) Imprimir dichos promedios (promedio de cada turno)
c) Mostrar por pantalla un mensaje que indique cual de los tres
   turnos tiene un promedio de edades mayor. */