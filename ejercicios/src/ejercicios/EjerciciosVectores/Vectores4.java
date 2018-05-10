package ejercicios.EjerciciosVectores;

import java.util.Scanner;

public class Vectores4 {
    private Scanner teclado;
    private int[] cursoa = new int[5];
    private int[] cursob = new int[5];
    private float promedio1, promedio2;

    private void carga() {
        Scanner teclado = new Scanner(System.in);
        for (int f = 0; f < 5; f++) {
            int i = 1;
            System.out.print("Introduce la nota " + i + " del curso A: ");
            cursoa[f] = teclado.nextInt();
            promedio1 += cursoa[f];
            System.out.print("Introduce la nota " + i + " del curso B: ");
            cursob[f] = teclado.nextInt();
            promedio2 += cursob[f];
            i++;
        }
    }
    public static int divideEntreCinco (int numero){
        return numero / 5;
    }
/*
    public void comparar() {
        promedio1 = promedio1 / 5;
        promedio2 = promedio2 / 5;
    }
*/

    public void imprimir() {
        if (promedio1 > promedio2) {
            System.out.println("El curso A obtuvo el mayor promedio general:" + (promedio1 ));
        } else {
            System.out.println("El curso B obtuvo el mayor promedio general:" + (promedio2 ));

        }
    }

    public static void main(String[] args) {
        Vectores4 toma = new Vectores4();
        toma.carga();
       // toma.comparar();
        toma.imprimir();
    }
}
/*3.Se tienen las notas del primer parcial de los alumnos de dos cursos, el
curso A y el curso B, cada curso cuenta con 5 alumnos.
Realizar un programa que muestre el curso que obtuvo el mayor promedio general. */