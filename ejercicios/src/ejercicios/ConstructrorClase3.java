package ejercicios;

import java.util.Scanner;

public class ConstructrorClase3 {
    private int num1, num2;
    private Scanner teclado = new Scanner(System.in);
    private int suma, resta, multiplicacion;
    private double division;

    public ConstructrorClase3() {
        System.out.println("Ingresa el número 1: ");
        num1 = teclado.nextInt();
        System.out.println("Ingresa el número 2: ");
        num2 = teclado.nextInt();
    }

    public void suma() {
        suma = num1 + num2;
    }

    public void resta() {
        resta = num1 - num2;
    }

    public void multiplicacion() {
        multiplicacion = num1 * num2;
    }

    public void division() {
        division = num1 / num2;
    }

    public void imprimir() {
        System.out.println("Suma" + ": " + suma);
        System.out.println("Resta" + ": " + resta);
        System.out.println("Multiplicacion" + ": " + multiplicacion);
        System.out.println("Division" + ": " + division);
    }

    public static void main(String[] args) {
        ConstructrorClase3 clase = new ConstructrorClase3();
        clase.suma();
        clase.resta();
        clase.multiplicacion();
        clase.division();
        clase.imprimir();

    }

}
/*Implementar la clase operaciones. Se deben cargar dos valores enteros en el
 constructor, calcular su suma, resta, multiplicación y división, cada una en
  un método, imprimir dichos resultados. */