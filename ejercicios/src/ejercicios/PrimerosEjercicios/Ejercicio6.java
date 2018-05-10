
package ejercicios.PrimerosEjercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pedroken
 */
public class Ejercicio6 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
    int i=0,cantidad=0;
    double precio=0,total=0;
    
    System.out.print("Introduce el precio del articulo:");
    precio=teclado.nextDouble();
    
    System.out.print("Introduce la cantida de articulos que lleva el cliente:");
    cantidad=teclado.nextInt();
    
    total=precio*cantidad;
    
    System.out.println("El cliente tiene que pagar: "+total+"€");
    
    
    }
    
}
/**4.Se debe desarrollar un programa que pida el ingreso del precio de un
  artículo y la cantidad que lleva el cliente. Mostrar lo que debe abonar
  el comprador. **/