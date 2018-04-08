package ejercicios;

import java.util.Scanner;

public class VectoresOrdenadosParalelos2 {
    private Scanner teclado = new Scanner(System.in);
    private String[] pais = new String[5];
    private int[] habitantes = new int[5];

    public void carga() {
        int i = 1;
        for (int f = 0; f < habitantes.length; f++) {
            System.out.print("Introduce el nombre del pais " + i + ": ");
            pais[f] = teclado.next();
            System.out.print("Introduce el número de habitantes del pais " + i + ": ");
            habitantes[f] = teclado.nextInt();
            i++;
        }
    }

    public void OrdenPais() {
        for (int i = 0; i < habitantes.length; i++) {
            for (int f = 0; f < habitantes.length - 1; f++) {
                String temp;
                int tempo;
                if (pais[i].compareToIgnoreCase(pais[f]) < 0) {
                    temp = pais[i];
                    pais[i] = pais[f];
                    pais[f] = temp;
                    tempo = habitantes[i];
                    habitantes[i] = habitantes[f];
                    habitantes[f] = tempo;
                }
            }
        }

    }

    public void ImprimirOrdenAlfabetico() {
        System.out.println("Por orden alfabetico.");
        for (int f = 0; f < habitantes.length; f++) {
            System.out.println(pais[f] + " - " + habitantes[f]);
        }
    }

    public void OrdenPorHabitantes() {
        for (int i = 0; i < habitantes.length; i++) {
            for (int f = 0; f < habitantes.length - 1; f++) {
                String temp;
                int tempo;
                if (habitantes[i] > habitantes[f]){
                    tempo = habitantes[i];
                    habitantes[i] = habitantes[f];
                    habitantes[f] = tempo;
                    temp = pais[i];
                    pais[i] = pais[f];
                    pais[f] = temp;
                }
            }
        }
    }
    public void ImprimirOrdenHabitantes() {
        System.out.println("Ordenado por habitantes de mayor a menor.");
        for (int f = 0; f < habitantes.length; f++) {
            System.out.println(pais[f] + " - " + habitantes[f]);
        }
    }
    public static void main(String[] args){
        VectoresOrdenadosParalelos2 toma = new VectoresOrdenadosParalelos2();
        toma.carga();
        toma.OrdenPais();
        toma.ImprimirOrdenAlfabetico();
        toma.OrdenPorHabitantes();
        toma.ImprimirOrdenHabitantes();
    }
}
/*Cargar en un vector los nombres de 5 paises y en otro vector paralelo
 la cantidad de habitantes del mismo. Ordenar alfabéticamente e imprimir
 los resultados. Por último ordenar con respecto a la cantidad de habitantes
 (de mayor a menor) e imprimir nuevamente.*/