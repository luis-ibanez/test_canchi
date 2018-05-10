package ejercicios.EjerciciosVectores;

import java.util.Scanner;

public class VectoresOrdenados3 {
    private Scanner teclado = new Scanner(System.in);
    private int[] elementos;

    public void carga(){
        int n;
        System.out.print("Introduce la cantidad de elementos a ordenar: ");
        n = teclado.nextInt();
        elementos = new int[n];
        for (int f = 0; f < elementos.length; f++){
            System.out.print("Introduce los elementos : ");
            elementos[f] = teclado.nextInt();
        }

    }
    public void ordenar(){
        int temp;
        for (int i = 0; i < elementos.length; i++){
            for (int f = 0; f < elementos.length - 1; f++){
                if (elementos[i] < elementos[f]){
                    temp = elementos[i];
                    elementos[i] = elementos[f];
                    elementos[f] = temp;
                }
            }
        }
    }
    public void imprimir(){
        for (int f = 0; f < elementos.length; f++){
            System.out.println(elementos[f]);
        }
    }
    public static void main(String[] args){
        VectoresOrdenados3 toma = new VectoresOrdenados3();
        toma.carga();
        toma.ordenar();
        toma.imprimir();

    }
}
//Cargar un vector de n elementos de tipo entero. Ordenar posteriormente el vector.