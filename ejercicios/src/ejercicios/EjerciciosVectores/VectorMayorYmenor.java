package ejercicios.EjerciciosVectores;

import java.util.Scanner;

public class VectorMayorYmenor {
    private Scanner teclado = new Scanner(System.in);
    private String[] nombre = new String[5];
    private int[] sueldo = new int[5];

    public void carga() {
        for (int f = 0; f < sueldo.length; f++) {
            System.out.print("Introduce el nombre del operario: ");
            nombre[f] = teclado.next();
            System.out.print("Introduce el sueldo del operario: ");
            sueldo[f] = teclado.nextInt();
        }
    }

    public void comparar() {
        if (sueldo[0] > sueldo[1] && sueldo[0] > sueldo[2] && sueldo[0] >
                sueldo[3] && sueldo[0] > sueldo[4]) {
            System.out.print("El sueldo mayor es el de: " + nombre[0]);
        }
        if (sueldo[1] > sueldo[0] && sueldo[1] > sueldo[2] && sueldo[1] >
                sueldo[3] && sueldo[1] > sueldo[4]) {
            System.out.print("El sueldo mayor es el de: " + nombre[1]);
        }
        if (sueldo[2] > sueldo[1] && sueldo[2] > sueldo[0] && sueldo[2] >
                sueldo[3] && sueldo[2] > sueldo[4]) {
            System.out.print("El sueldo mayor es el de: " + nombre[2]);
        }
        if (sueldo[3] > sueldo[1] && sueldo[3] > sueldo[2] && sueldo[3] >
                sueldo[0] && sueldo[3] > sueldo[4]) {
            System.out.print("El sueldo mayor es el de: " + nombre[3]);
        }else{
            System.out.print("El sueldo mayor es el de: " + nombre[4]);
        }
    }
    public static void main(String[] args){
        VectorMayorYmenor toma = new VectorMayorYmenor();
        toma.carga();
        toma.comparar();
    }
}
/*Problema 1:

Confeccionar un programa que permita cargar los nombres de 5 operarios y
sus sueldos respectivos. Mostrar el sueldo mayor y el nombre del operario.*/