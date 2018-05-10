package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

/**
 *
 * @author Pedroken
 */
public class Ejercicio7 {
    public static void main(String[] ar){
    Scanner teclado=new Scanner(System.in);
    double sueldo=0;
    System.out.print("Introduce tu sueldo: ");
    sueldo=teclado.nextDouble();
    if(sueldo>3000)
    System.out.println("Esta persona debe abonar impuestos.");
    else
    System.out.println("puto pobre de mierda curra mas cabron.");
    }
    
}
/**Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un
 * mensaje en pantalla indicando que debe abonar impuestos.**/