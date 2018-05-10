package ejercicios.EjerciciosVectores;

import java.util.Scanner;

public class VectoresOrdenadosParalelos3 {
    private Scanner teclado = new Scanner(System.in);
    private String[] alumno = new String[5];
    private int[] nota = new int[5];

    public void carga() {
        int i = 1;
        for (int f = 0; f < nota.length; f++) {
            System.out.print("Introduce el nombre del alumno " + i + ": ");
            alumno[f] = teclado.next();
            System.out.print("Introduce la nota del alumno " + i + ": ");
            nota[f] = teclado.nextInt();
            i++;
        }
    }

    public void ordenar() {
        for (int i = 0; i < nota.length; i++) {
            for (int f = 0; f < nota.length - 1; f++) {
                int temp;
                String tempo;
                if (nota[i] > nota[f]) {
                    temp = nota[i];
                    nota[i] = nota[f];
                    nota[f] = temp;
                    tempo = alumno[i];
                    alumno[i] = alumno[f];
                    alumno[f] = tempo;
                }
            }
        }
    }

    public void imprimir() {
        for (int f = 0; f < nota.length; f++) {
            System.out.println(alumno[f] + " - " + nota[f]);
        }

    }
    public static void main(String[] args){
        VectoresOrdenadosParalelos3 toma = new VectoresOrdenadosParalelos3();
        toma.carga();
        toma.ordenar();
        System.out.println("Notas de mayor a menor: ");
        toma.imprimir();
    }
}
/*Problema 1:

Confeccionar un programa que permita cargar los nombres de 5 alumnos y sus
 notas respectivas. Luego ordenar las notas de mayor a menor. Imprimir las
  notas y los nombres de los alumnos.*/