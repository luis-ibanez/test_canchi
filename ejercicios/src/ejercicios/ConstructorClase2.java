package ejercicios;

import java.util.Scanner;

public class ConstructorClase2 {
    private Scanner teclado = new Scanner(System.in);
    private String nombre;
    private int sueldo;

    public ConstructorClase2() {
        System.out.println("Nombre del empleado");
        nombre = teclado.next();
        System.out.println("Sueldo del empleado");
        sueldo = teclado.nextInt();
    }
    public void imprimir() {
        System.out.println(nombre + ": " + sueldo);
    }
    public void impuestos() {
        if (sueldo >= 3000){
            System.out.println("Tienes que pagar impuestos.");
        } else {
            System.out.println("No tienes que pagar impuestos");
        }
    }

    public static void main(String[] args){
        ConstructorClase2 clase = new ConstructorClase2();
        clase.imprimir();
        clase.impuestos();
    }

}
/*Confeccionar una clase que represente un empleado. Definir como atributos su
 nombre y su sueldo. En el constructor cargar los atributos y luego en otro
 método imprimir sus datos y por último uno que imprima un mensaje si debe pagar
  impuestos (si el sueldo supera a 3000) */