package ejercicios;

import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, altura, superficie, f, cantidad, mayor = 0;
        System.out.print("¿Cuantos triangulos vas ha ingresar?");
        cantidad = teclado.nextInt();
        for (f = 1; f <= cantidad; f++) {
            System.out.print("Ingresa la base del triangulo " + f + " :");
            base = teclado.nextInt();
            System.out.print("Ingresa la altura del triangulo " + f + " :");
            altura = teclado.nextInt();
            superficie = base * altura / 2;
            System.out.println("La base es: " + base + " Altura: " + altura + " Superficie: " + superficie);
            if (superficie > 12){
                mayor++;
            }
        }
        System.out.print("La cantidad de triángulos cuya superficie es mayor a 12: " + mayor);
    }
}
/*1.Confeccionar un programa que lea n pares de datos, cada par de datos corresponde
 a la medida de la base y la altura de un triángulo. El programa deberá informar:
a) De cada triángulo la medida de su base, su altura y su superficie.
b) La cantidad de triángulos cuya superficie es mayor a 12. */