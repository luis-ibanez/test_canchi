package ejercicios;

import java.util.Scanner;

public class VectoresOrdenados2 {
    private Scanner teclado = new Scanner(System.in);
    private String[] paises = new String[5];

    public void carga() {
        for (int f = 0; f < 5; f++) {
            System.out.print("Escribe el nombre del país: ");
            paises[f] = teclado.next();
        }
    }

    public void comparar() {
        for (int i = 0; i < (paises.length - 1); i++) {
            for (int f = i + 1; f < paises.length; f++) {
                if (paises[i].compareToIgnoreCase(paises[f]) > 0) {
                    String temp;
                    temp = paises[i];
                    paises[i] = paises[f];
                    paises[f] = temp;
                }
            }

        }
    }

    public void imprimir() {
        for (int f = 0; f < 5; f++) {
            System.out.println(paises[f]);
        }
    }

    public static void main(String[] args) {
        VectoresOrdenados2 toma = new VectoresOrdenados2();
        toma.carga();
        toma.comparar();
        toma.imprimir();
    }
}
/*Problema 2:

Definir un vector donde almacenar los nombres de 5 paises. Confeccionar
 el algoritmo de ordenamiento alfabético.*/









