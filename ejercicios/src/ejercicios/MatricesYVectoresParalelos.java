package ejercicios;

import java.util.Scanner;

public class MatricesYVectoresParalelos {
    private Scanner teclado = new Scanner(System.in);
    private int[] empleados = new int[4];
    private int[][] sueldo = new int[4][3];
    private int[] sueldoTotales = new int[4];

    public void carga(){
        
    }
}
/*Problema 1:

Se tiene la siguiente información:
· Nombres de 4 empleados.
· Ingresos en concepto de sueldo, cobrado por cada empleado, en los últimos 3 meses.
Confeccionar el programa para:

a) Realizar la carga de la información mencionada.
b) Generar un vector que contenga el ingreso acumulado en sueldos en los
 últimos 3 meses para cada empleado.
c) Mostrar por pantalla el total pagado en sueldos a todos los empleados
 en los últimos 3 meses
d) Obtener el nombre del empleado que tuvo el mayor ingreso acumulado

vectores y matrices paralelos */