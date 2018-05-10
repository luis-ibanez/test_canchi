package ejercicios.EjerciciosWhile;

import java.util.Scanner;

/**
 * @author Pedroken
 */
public class While7 {
    public static void main(String[] args) {

        int i = 1, num, valor = 0, impar = 0, par = 0;

        Scanner operador = new Scanner(System.in);

        System.out.print("Introduce candidad de números que vas a comprobar: ");
        num = operador.nextInt();

        while (i <= num) {
            System.out.print("Introduce los números: ");
            valor = operador.nextInt();

            if (valor % 2 == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
                i++;
            }
        }
        System.out.println("son par: " + par);
        System.out.println("son impar: " + impar);
    }
}
/**
 * Desarrollar un programa que permita cargar n números enteros y luego nos
 * informe cuántos valores fueron pares y cuántos impares.
 * Emplear el operador ?%? en la condición de la estructura condicional:
 * <p>
 * if (valor%2==0)         //Si el if da verdadero luego es par.
 **/
