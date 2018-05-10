package ejercicios.EjerciciosVectores;

import java.util.Scanner;

public class VectoresOrdenadosParalelos {
    private Scanner teclado = new Scanner(System.in);

    private int[] notas = new int[5];
    private String[] alumnos = new String[5];

    public void carga() {
        for (int f = 0; f < notas.length; f++) {
            System.out.print("Introduce el nombre del alumno: ");
            alumnos[f] = teclado.next();
            System.out.print("Introduce la nota del alumno: ");
            notas[f] = teclado.nextInt();
        }
    }

    public void ordenar() {
        for (int i = 0; i < notas.length; i++) {
            for (int f = 0; f < notas.length; f++) {
                int temp;
                String tempo;
                if (notas[i] > notas[f]) {
                    temp = notas[i];
                    notas[i] = notas[f];
                    notas[f] = temp;
                    tempo = alumnos[i];
                    alumnos[i] = alumnos[f];
                    alumnos[f] = tempo;
                }
            }
        }
    }

    public void imprimir() {
        for (int f = 0; f < notas.length; f++) {
            System.out.println(alumnos[f] + " - " + notas[f]);
        }
    }

    public static void main(String[] args) {
        VectoresOrdenadosParalelos toma = new VectoresOrdenadosParalelos();
        toma.carga();
        toma.ordenar();
        toma.imprimir();
    }
}
/*Problema 1:

Confeccionar un programa que permita cargar los nombres de 5 alumnos y sus
 notas respectivas. Luego ordenar las notas de mayor a menor. Imprimir las
  notas y los nombres de los alumnos.*/