package prueba3;

import java.util.Scanner;

public class Dog {

    String[] name = new String[2];
    String[] says = new String[2];


    public void cargar() {
        Scanner teclado = new Scanner(System.in);

        for (int f = 0; f < 2; f++) {
            System.out.println("Nombre del perro: ");
            name[f] = teclado.nextLine();
            System.out.println();
            System.out.println("Ladrido del perro: ");
            says[f] = teclado.nextLine();
        }
    }

    public void imprimir() {
        for (int f = 0; f < 2; f++) {
            System.out.println("El perro se llama: " + name[f] + ".");
            System.out.println(" y su ladrido es: " + says[f] + ".");

        }
    }


    public static void main(String[] args) {
        Dog ej = new Dog();
        ej.cargar();
        ej.imprimir();
    }


}


