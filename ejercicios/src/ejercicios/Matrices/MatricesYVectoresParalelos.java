package ejercicios.Matrices;

import java.util.Scanner;

public class MatricesYVectoresParalelos {
    private Scanner teclado = new Scanner(System.in);
    private String[] empleados = new String[4];
    private int[][] sueldo = new int[4][3];
    private int[] sueldoTotales = new int[4];
    private int fila, columna, suma, sumaTotal;

    public void carga() {

        for (int fila = 0; fila < sueldo.length; fila++) {
            System.out.println("Introduce el nombre del empleado " + fila + ": ");
            empleados[fila] = teclado.next();
            System.out.println("Fila " + fila + ".");
            suma = 0;
            for (int columna = 0; columna < sueldo[fila].length; columna++) {
                System.out.print("Columna " + columna + ": ");
                sueldo[fila][columna] = teclado.nextInt();
                suma += sueldo[fila][columna];
            }
            sueldoTotales[fila] += suma;
            sumaTotal += suma;
            if (sueldoTotales[0] < sueldoTotales[fila]){
                int temp = sueldoTotales[0];
                sueldoTotales[0] = sueldoTotales[fila];
                sueldoTotales[fila] = temp;
                String tempo = empleados[0];
                empleados[0] = empleados[fila];
                empleados[fila] = tempo;
                /*for(int f=0;f<sueldoTotales.length;f++) {
            if (sueldoTotales[f]>may) {
                temp=sueldoTotales[f];
                tempo=empleados[f];
                esto hace lo mismo pero mas corto*/
            }

        }

    }

    public void imprimir() {
        for (fila = 0; fila < sueldo.length; fila++) {
            System.out.print(empleados[fila] + ":");
            System.out.println(sueldoTotales[fila]);
        }
        System.out.println("El total pagado en sueldos es de: " + sumaTotal);
        System.out.println("El empleado que mas cobra es: " + empleados[0] + " - " + sueldoTotales[0]);
    }

    public static void main(String[] args) {
        MatricesYVectoresParalelos matriz = new MatricesYVectoresParalelos();
        matriz.carga();
        matriz.imprimir();
    }

}
/*Problema 1:

Se tiene la siguiente información:
· Nombres de 4 empleados.
· Ingresos en concepto de sueldo, cobrado por cada empleado, en los últimos 3 meses.
Confeccionar el programa para:

a) Realizar la cargaMatriz de la información mencionada.
b) Generar un vector que contenga el ingreso acumulado en sueldos en los
 últimos 3 meses para cada empleado.
c) Mostrar por pantalla el total pagado en sueldos a todos los empleados
 en los últimos 3 meses
d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado

vectores y matrices paralelos */