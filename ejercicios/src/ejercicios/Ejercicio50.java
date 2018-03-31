package ejercicios;

import java.util.Scanner;

public class Ejercicio50 {
    private Scanner teclado;
    private double sueldo;
    private String nombre;

    public void carga(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Introduce el sueldo: ");
        sueldo = teclado.nextDouble();
    }
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo: " + sueldo);
    }
    public void montoro(){
        if (sueldo > 3000){
            System.out.println("Montoro te rompe el cacas.");
        }else {
            System.out.println("Cobras una mierda, pero montoro no te rompe el cacas.");
        }
    }
    public static void main(String[] args){
        Ejercicio50 empleado = new Ejercicio50();
        empleado.carga();
        empleado.imprimir();
        empleado.montoro();
    }
}
/*1.
Confeccionar una clase que represente un empleado. Definir como atributos
su nombre y su sueldo. Confeccionar los métodos para la carga, otro para
imprimir sus datos y por último uno que imprima un mensaje si debe pagar
 impuestos (si el sueldo supera a 3000)
 */