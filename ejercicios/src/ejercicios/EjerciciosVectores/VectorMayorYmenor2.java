package ejercicios.EjerciciosVectores;

import java.util.Scanner;

public class VectorMayorYmenor2 {
    private Scanner teclado = new Scanner(System.in);
    private int[] elementos;

    public void carga(){
        int n = 0;
        System.out.print("Introduce el número de elementos: ");
        n = teclado.nextInt();
        elementos = new int[n];
        for (int f = 0; f < elementos.length; f++){
            System.out.print("cargaMatriz los valores: ");
            elementos[f] = teclado.nextInt();
        }
    }
    public void comparar(){
        float menor;
        int pos;
        menor = elementos[0];
        pos = 0;
        for (int f = 1; f < elementos.length;f++){
            if (elementos[f] < menor){
                menor = elementos[f];
                pos = f;
            }else if (menor == elementos[f]){//PARA SABER SI SE REPITE
                System.out.println("El menor valor se repite en el vector.");
            }
        }
        System.out.println("El menor valor es: " + menor);
    }
    public static void main(String[] args){
        VectorMayorYmenor2 toma = new VectorMayorYmenor2();
        toma.carga();
        toma.comparar();
    }

}
/*Cargar un vector de n elementos. imprimir el menor y un mensaje si se
 repite dentro del vector.*/

/* PARA SABER CUAL ES EL MAYOR.
float mayor;
        int pos;
        mayor=sueldos[0];
        pos=0;
        for(int f=1;f<nombres.length;f++) {
            if (sueldos[f]>mayor) {
                mayor=sueldos[f];
                pos=f;*/







