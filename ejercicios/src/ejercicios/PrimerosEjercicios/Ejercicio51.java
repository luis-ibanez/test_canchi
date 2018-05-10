package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio51 {
    private Scanner teclado;
    private int suma = 0, resta = 0, multipli = 0, num1, num2;
    private double division = 0;

    public void carga() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        num1 = teclado.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = teclado.nextInt();
    }

    public void sumar() {
        suma = num1 + num2;
    }

    public void restar() {
        resta = num1 - num2;
    }

    public void multiplicar() {
        multipli = num1 * num2;
    }

    public void dividir() {
        division = num1 / num2;
    }

    public void imprimir() {
        System.out.println("el resultado de la suma es de: " + suma);
        System.out.println("el resultado de la resta es de: " + resta);
        System.out.println("el resultado de la multipli es de: " + multipli);
        System.out.println("el resultado de la division es de: " + division);
    }

    public static void main(String[] args) {
        Ejercicio51 operaciones = new Ejercicio51();
        operaciones.carga();
        operaciones.sumar();
        operaciones.restar();
        operaciones.multiplicar();
        operaciones.dividir();
        operaciones.imprimir();
    }
}

/*2.
Implementar la clase operaciones. Se deben cargar dos valores enteros, calcular
 su suma, resta, multiplicación y división, cada una en un método, imprimir
 dichos resultados.
 */