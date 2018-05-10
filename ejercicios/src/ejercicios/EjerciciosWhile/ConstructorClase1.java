package ejercicios.EjerciciosWhile;

import java.util.Scanner;

public class ConstructorClase1 {
    private Scanner teclado = new Scanner(System.in);
    private String alumno;
    private int edad;

    public ConstructorClase1() {
        System.out.println("Nombre del alumno");
        alumno = teclado.next();
        System.out.println("Edad del alumno");
        edad = teclado.nextInt();
    }

    public void imprimir() {
        System.out.println(alumno + ": " + edad);
    }

    public void mayorEdad() {
        if (edad >= 18) {
            System.out.println("El alumno es mayor de edad.");
        } else {
            System.out.println("El alumno es menor de edad.");
        }
    }

    public static void main(String[] args) {
        ConstructorClase1 alumno = new ConstructorClase1();
        alumno.imprimir();
        alumno.mayorEdad();
    }
}
/*Problema 2:

Plantear una clase llamada Alumno y definir como atributos su nombre y su edad.
 En el constructor realizar la carga de datos. Definir otros dos métodos para
 imprimir los datos ingresados y un mensaje si es mayor o no de edad (edad >=18)*/