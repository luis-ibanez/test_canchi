package ejercicios;

import java.util.Scanner;

public class ConstructorClase {
    public ConstructorClase() {
        String[] operarios = new String[5];
        int[] sueldos = new int[5];
        Scanner teclado = new Scanner(System.in);
        for (int fila = 0; fila < sueldos.length; fila++) {
            System.out.println("Introduce los nombres de los operarios.");
            operarios[fila] = teclado.next();
            System.out.println("Introduce el salario de los operarios.");
            sueldos[fila] = teclado.nextInt();
        }

        for (int fila = 0; fila < 5; fila++) {
            System.out.print(operarios[fila] + ": ");
            System.out.println(sueldos[fila]);
        }
    }

    public static void main(String args[]) {
        ConstructorClase constructor = new ConstructorClase();

    }
}
/*Problema 1:

Se desea guardar los sueldos de 5 operarios en un vector. Realizar la creación
 y carga del vector en el constructor.*/