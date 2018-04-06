package ejercicios;

import java.util.Scanner;

public class Vectores5 {
    private Scanner teclado;
    private int[] num = new int[10];

    public void carga() {
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        for (int f = 0; f < 10; f++) {

            System.out.print("Introduce el número " + i + ":");
            num[f] = teclado.nextInt();
            i++;
        }
    }

    public void comprobar() {
        /*for (int f = 0; f < 10; f++) {//trampa GORDA lo se, pero funciona
            if (num[0] > num[1]) {
                int temp = num[0];
                num[0] = num[1];
                num[1] = temp;
            }
            if (num[1] > num[2]) {
                int temp = num[1];
                num[1] = num[2];
                num[2] = temp;
            }
            if (num[2] > num[3]) {
                int temp = num[2];
                num[2] = num[3];
                num[3] = temp;
            }
            if (num[3] > num[4]) {
                int temp = num[3];
                num[3] = num[4];
                num[4] = temp;
            }
            if (num[4] > num[5]) {
                int temp = num[4];
                num[4] = num[5];
                num[5] = temp;
            }
            if (num[5] > num[6]) {
                int temp = num[5];
                num[5] = num[6];
                num[6] = temp;
            }
            if (num[6] > num[7]) {
                int temp = num[6];
                num[6] = num[7];
                num[7] = temp;
            }
            if (num[7] > num[8]) {
                int temp = num[7];
                num[7] = num[8];
                num[8] = temp;
            }
            if (num[8] > num[9]) {
                int temp = num[8];
                num[8] = num[9];
                num[9] = temp;
            }
            if (num[0] > num[1]) {
                int temp = num[0];
                num[0] = num[1];
                num[1] = temp;
            }
        }*/
        if (num[0] < num[1] && num[1] < num[2] && num[2] < num [3] &&  num[3] < num[4]
                && num[4] < num[5] && num[5] < num [6] &&  num[6] < num[7]
                && num[7] < num[8] && num[8] < num [9] ){
            System.out.println("Los numeros estan ordenados");
        }else {
            System.out.println("Los numeros no estan ordenados");
        }
    }

    public void imprimir() {
        for (int f = 0; f < 10; f++) {
            System.out.println(num[f]);
        }
        System.out.println("Siempre va ha estar ordenado de menor a mayor.");
    }


    public static void main(String[] args) {
        Vectores5 toma = new Vectores5();
        toma.carga();
        toma.comprobar();
        toma.imprimir();
    }
}
/*5.Cargar un vector de 10 elementos y verificar posteriormente si el
 mismo está ordenado de menor a mayor.
  */