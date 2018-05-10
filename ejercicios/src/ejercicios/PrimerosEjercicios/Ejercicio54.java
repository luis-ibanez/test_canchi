package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio54 {
    private Scanner teclado;
    private int[] sueldo = new int[5];//aki tenia un 4 en lugar de un 5 y no va ni patras
    private int i = 1, p = 1;

    public void carga() {
        Scanner teclado = new Scanner(System.in);
        for (int f = 0; f < 5; f++) {

            System.out.print("Introduce el salario del trabajador " + i + ":");
            sueldo[f] = teclado.nextInt();
            i++;
        }

    }
    public void imprimir(){
        for (int f = 0; f < 5; f++){
            System.out.println("El sueldo del trabajador " + p + ":" + sueldo[f]);
            p++;
        }
    }
    public static void main(String[] args){
        Ejercicio54 salarios = new Ejercicio54();
        salarios.carga();
        salarios.imprimir();
    }
}
/*Problema 1:

Se desea guardar los sueldos de 5 operarios.
Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto
 momento los 5 sueldos almacenados en memoria.
Empleando un vector solo se requiere definir un único nombre y accedemos a cada
 elemento por medio del subíndice.*/