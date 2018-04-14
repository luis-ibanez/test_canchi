package ejercicios;

import java.util.Scanner;

public class MatricesYVectoresParalelos2 {
    private Scanner teclado = new Scanner(System.in);
    private String[] pais = new String[4];
    private int[][] temperaturas = new int[4][3];
    private int[] media = new int[4];
    int fila, columna, suma;

    public void carga() {
        for (fila = 0; fila < temperaturas.length; fila++) {
            System.out.println("Introduce el nombre del pais.");
            pais[fila] = teclado.next();
            System.out.println("Introduce la temperatura media mensual del pais.");
            for (columna = 0; columna < temperaturas[fila].length; columna++) {
                System.out.print("Introduce la temperatura media del mes " + columna + ":");
                temperaturas[fila][columna] = teclado.nextInt();
            }
        }
    }

    public void calcularTemperaturas() {
        for (fila = 0; fila < temperaturas.length; fila++) {
            suma = 0;
            for (columna = 0; columna < temperaturas[fila].length; columna++) {
                suma += temperaturas[fila][columna];
            }
            media[fila] = suma;
        }
    }

    public void imprimirTemperaturas() {
        System.out.println("Temperaturas de los paises. ");
        for (int fila = 0; fila < temperaturas.length; fila++) {
            System.out.print(pais[fila] + ": ");

            for (int columna = 0; columna < temperaturas[fila].length; columna++) {
                System.out.print(temperaturas[fila][columna] + " ");
            }
            System.out.println();

        }
    }

    public void imprimirMedia() {
        System.out.println("Temperaturas trimestrales de los paises. ");
        for (fila = 0; fila < temperaturas.length; fila++) {
            System.out.print(pais[fila] + ": ");
            System.out.println(media[fila] / 3);
        }
    }

    public void paisTemperaturaMayor() {
        int mayor = media[0];
        String temporal = pais[0];
        for (fila = 0; fila < temperaturas.length; fila++) {
            if (media[fila] > mayor) {
                mayor = media[fila];
                temporal = pais[fila];
            }
        }
        System.out.println("El pais con la temperatura mas alta es " + temporal +
                " con una temperatura media de: " + (mayor / 3));
    }

    public static void main(String[] args) {
        MatricesYVectoresParalelos2 matriz = new MatricesYVectoresParalelos2();
        matriz.carga();
        matriz.imprimirTemperaturas();
        matriz.calcularTemperaturas();
        matriz.imprimirMedia();
        matriz.paisTemperaturaMayor();
    }

}
/*Se desea saber la temperatura media trimestral de cuatro paises. Para ello se
tiene como dato las temperaturas medias mensuales de dichos paises.
Se debe ingresar el nombre del país y seguidamente las tres temperaturas medias
mensuales.
Seleccionar las estructuras de datos adecuadas para el almacenamiento de los datos
 en memoria.
a - Cargar por teclado los nombres de los paises y las temperaturas medias mensuales.
b - Imprimir los nombres de los paises y las temperaturas medias mensuales de las
    mismas.
c - Calcular la temperatura media trimestral de cada país.
c - Imprimr los nombres de las provincias y las temperaturas medias trimestrales.
b - Imprimir el nombre de la provincia con la temperatura media trimestral mayor. */