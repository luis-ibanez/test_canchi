package ejercicios.EjerciciosVectores;

import java.util.Scanner;

public class VectoresOrdenados {
    private Scanner teclado = new Scanner(System.in);
    private int[] sueldos = new int[5];

    public void carga(){
        int i = 1;
        for (int f = 0; f < 5; f++){
            System.out.print("Introduce el sueldo " + i + ": ");
            sueldos[f] = teclado.nextInt();
            i++;
        }
    }
    public void comparar(){

            if (sueldos[0] > sueldos[1]){
                int temp = sueldos[0];
                sueldos[0] = sueldos[1];
                sueldos[1] = temp;
            }
            if (sueldos[1] > sueldos[2]){
                int temp = sueldos[1];
                sueldos[1] = sueldos[2];
                sueldos[2] = temp;
            }
            if (sueldos[2] > sueldos[3]){
                int temp = sueldos[2];
                sueldos[2] = sueldos[3];
                sueldos[3] = temp;
            }
            if (sueldos[3] > sueldos[4]){
                int temp = sueldos[3];
                sueldos[3] = sueldos[4];
                sueldos[4] = temp;
            }
            if (sueldos[0] > sueldos[1]){
                int temp = sueldos[0];
                sueldos[0] = sueldos[1];
                sueldos[1] = temp;
            }
            /*if (numerosOrdenados[0] > numerosOrdenados[1]){
            int temp = numerosOrdenados[0];
            numerosOrdenados[0] = numerosOrdenados[1];
            numerosOrdenados[1] = temp;
        }*/

    }
    public void imprimir(){
        for (int f = 0; f < 5; f++){
            System.out.println(sueldos[f]);
        }
    }
    public static void main(String[] args){
        VectoresOrdenados toma = new VectoresOrdenados();
        toma.carga();
        toma.comparar();
        toma.imprimir();
    }
}
/*Problema 1:

Se debe crear un vector donde almacenar 5 sueldos.
 Ordenar el vector sueldos de menor a mayor.*/

/*PARA PROBAR
 public void ordenar() {
        for(int k=0;k<4;k++) {
            for(int f=0;f<4-k;f++) {
                if (sueldos[f]>sueldos[f+1]) {
                    int aux;
                    aux=sueldos[f];
                    sueldos[f]=sueldos[f+1];
                    sueldos[f+1]=aux;
                }
            }
        }
    }*/