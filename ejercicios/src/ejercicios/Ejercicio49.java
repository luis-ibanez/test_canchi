package ejercicios;

import java.util.Scanner;

public class Ejercicio49 {
    private Scanner teclado;
    private double lado;

    public void cargar(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el valor del lado: ");
        lado = teclado.nextDouble();
    }
    public void imprimir(){
        System.out.println("La superficie del cuadrado es de: " + (lado * lado));
        System.out.println("El perimetro del cuadrado es de: " + (lado * 4) );
    }
    public static void main(String[] args){
        Ejercicio49 problema4 = new Ejercicio49();
        problema4.cargar();
        problema4.imprimir();
    }
}
/*Problema 4.
Desarrollar una clase que represente un Cuadrado y tenga los siguientes
métodos: cargar el valor de su lado, imprimir su perímetro y su superficie.
 */