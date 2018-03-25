package ejercicios;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int f, num, suma = 0, alma;
        for (f = 1; f <= 10; f++) {
            System.out.print("Ingresa el numero " + f + " :");
            alma = teclado.nextInt();
            if (f > 5){
                suma += alma ;
            }
        }
        System.out.println("La suma de los 5 ultimos valores es de : " + suma);
    }
}
//2. Desarrollar un programa que solicite la carga de 10 números e imprima
// la suma de los últimos 5 valores ingresados.