package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Vectores1 {
    private Scanner teclado;
    private float num1, num2, f;
    private float[] tarde = new float[4];
    private float[] mañana = new float[4];
    private int i = 1;
    public void carga() {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        for (int f = 0; f < 4; f++) {//aki tenia un 5 en lugar de un 4 y......
            System.out.print("Sueldos mañana " + i + ": ");
            mañana[f] = teclado.nextFloat();
            num1 += mañana[f];
            System.out.print("Sueldos tarde " + i + ": ");
            tarde[f] = teclado.nextFloat();
            num2 += tarde[f];

            i++;
        }
    }

    public void imprimir() {
        System.out.println("Los sueldos de la mañana son: " + num1);
        System.out.println("Los sueldos de la tarde son: " + num2);

    }
    public static void main(String[] args){
        Vectores1 sueldos = new Vectores1();
        sueldos.carga();
        sueldos.imprimir();
    }
}
/*Problema 3:

Una empresa tiene dos turnos (mañana y tarde) en los que trabajan 8 empleados (4 por
 la mañana y 4 por la tarde)
Confeccionar un programa que permita almacenar los sueldos de los empleados
agrupados por turno.
Imprimir los gastos en sueldos de cada turno.*/