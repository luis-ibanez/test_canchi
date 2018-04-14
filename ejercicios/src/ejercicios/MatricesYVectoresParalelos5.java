package ejercicios;

import java.util.Scanner;

public class MatricesYVectoresParalelos5 {
    private Scanner teclado = new Scanner(System.in);
    private String[] empleados = new String[3];
    private int[][] diasFalta = new int[3][];
    private int[] sumaDeDias = new int[3];
    private int suma;

    public void carga() {
        for (int fila = 0; fila < empleados.length; fila++) {
            int columna = 0;
            System.out.println("Introduce el nombre del empleado: ");
            empleados[fila] = teclado.next();
            System.out.println("Introduce la cantidad de faltas del" +
                    " empleado " + empleados[fila] + ".");
            columna = teclado.nextInt();
            diasFalta[fila] = new int[columna];
        }
    }

    public void cargaMatriz() {
        for (int fila = 0; fila < diasFalta.length; fila++) {
            suma = 0;
            for (int columna = 0; columna < diasFalta[fila].length; columna++) {
                diasFalta[fila][columna] = 1;
                suma += columna;
            }
            sumaDeDias[fila] = suma;
        }
    }

    public void comprobarMenor() {
        String temporal = empleados[0];
        int menor = sumaDeDias[0];
        for (int fila = 0; fila < diasFalta.length; fila++) {
                if (sumaDeDias[0] > sumaDeDias[fila]){
                    menor = sumaDeDias[fila];
                    temporal = empleados[fila];
            }
        }
        System.out.print(temporal + ": " + menor + " dias de falta.");
    }

    public void imprimir() {
        for (int fila = 0; fila < empleados.length; fila++) {
            System.out.print(empleados[fila] + ": ");
            for (int columna = 0; columna < diasFalta[fila].length; columna++) {
                System.out.print(diasFalta[fila][columna]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatricesYVectoresParalelos5 matriz = new MatricesYVectoresParalelos5();
        matriz.carga();
        matriz.cargaMatriz();
        matriz.imprimir();
        matriz.comprobarMenor();
    }
}
/*Confeccionar una clase para administrar los días que han faltado los 3 empleados
de una empresa.
Definir un vector de 3 elementos de tipo String para cargar los nombres y una
 matriz irregular para cargar los días que han faltado cada empleado (cargar el
 número de día que faltó)
Cada fila de la matriz representan los días de cada empleado.
Mostrar los empleados con la cantidad de inasistencias.
Cuál empleado faltó menos días. */