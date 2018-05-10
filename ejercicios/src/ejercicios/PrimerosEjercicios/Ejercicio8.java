package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

/**
 *
 * @author Pedroken
 */
public class Ejercicio8 {
    public static void main(String[]ar){
    Scanner teclado=new Scanner(System.in);
    float num1=0,num2=0;
    System.out.print("Introduce el primer número: ");
    num1=teclado.nextFloat();
    
    System.out.print("Introduce el segundo número: ");
    num2=teclado.nextFloat();
    
    if(num1>num2)
        System.out.println("El primer número es mayor que el segundo: "+num1);
    else
            System.out.println("El segundo número es mayor que el primero: "+num2);

        
    }
    
}
/**Realizar un programa que solicite ingresar dos números distintos
 * y muestre por pantalla el mayor de ellos.**/