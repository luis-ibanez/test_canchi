package prueba3;

import java.util.Scanner;

public class NoMeToquesLosBoleanos {

    String nombre1 = new String();
    String nombre2 = new String();

    public void carga() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el primer nombre a comparar: ");
        nombre1 = teclado.nextLine();
        System.out.println("Introduce el segundo nombre a comparar: ");
        nombre2 = teclado.nextLine();
    }

    public void compararConEquals() {

        if (nombre1.equals(nombre2)) {
            System.out.println("Son iguales los dos nombres con equals.");
        } else {
            System.out.println("Son distintos con equals.");
        }
    }

    public void compararConIgual() {

        if (nombre1 == nombre2) {
            System.out.println("Son iguales los dos nombres con (==).");

        } else if (nombre1 != nombre2) {
            System.out.println("Son distintos con (!=).");

        }
        if (nombre1 == nombre1) {
            System.out.println("Nombre1 es igual a nombre1 con(==)? ");
        } else {
            return;
        }
    }

    public boolean conBoleanos() {
        boolean boleano = nombre1.equals(nombre2);
        System.out.println("Que resultado nos da: " + boleano);
        return boleano;
    }

    public void intentoGastarBoleano() {
        if (conBoleanos() == true) {
            System.out.println("El resultado es verdad.");
        } else {
            System.out.println("Es falso.");

        }
    }

    public void otraForma(int valor1, int valor2) {
        boolean operacionesVF = valor1 < valor2;
        System.out.println("Que resultado nos da otra Forma <: " + operacionesVF);
        operacionesVF = valor1 > valor2;
        System.out.println("Que resultado nos da otra Forma >: " + operacionesVF);
        operacionesVF = (valor1 == valor2);
        System.out.println("Que resultado nos da otra Forma ==: " + operacionesVF);
        operacionesVF = (valor1 != valor2);
        System.out.println("Que resultado nos da otra Forma !=: " + operacionesVF);
        if (operacionesVF == true) { //para que se cumpla valor1 y valor2 tienen que ser distintos
            System.out.println("Ya se hacer algo mas: " + operacionesVF);
        } else {
            System.out.println("No tengo ni idea: " + operacionesVF);
        }
    }


    public static void main(String[] args) {
        NoMeToquesLosBoleanos pruebasBolean = new NoMeToquesLosBoleanos();
        pruebasBolean.carga();
        pruebasBolean.compararConEquals();
        pruebasBolean.compararConIgual();
        //pruebasBolean.conBoleanos(); // con llamar a un metodo ya se utiliza
        pruebasBolean.intentoGastarBoleano();
        pruebasBolean.otraForma(7, 3);
    }
}
/*Ejercicio 14:
(3) Escriba un método que tome dos argumentos de tipo String y utilice todas las comparaciones
boolean para comparar las dos cadenas de caracteres e imprimir los resultados. Para las comparaciones
==y != , realice también la prueba con equals( ) En main( ), invoque el método que haya escrito. utili-
zando varios obJetos String diferentes.
*/