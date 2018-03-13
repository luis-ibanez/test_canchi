
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Pedroken
 */
public class While6 {
    public static void main (String[] args){
        int i=0,num1=0,num2=0;
        while(i<5){
        
        
        Scanner lista1=new Scanner(System.in);
        System.out.print("Introduce valor en la lista 1: ");
        num1=lista1.nextInt();
        
        Scanner lista2=new Scanner(System.in);
        System.out.print("Introduce valor en la lista 2: ");
        num2=lista2.nextInt();
        i++;
        }
        if(num1>num2){
            System.out.println("Lista 1 mayor que la lista 2");
        }
        else if(num1<num2){
            System.out.println("Lista 2 mayor que la lista 1");
    
        }
        else{
            System.out.println("Las dos listas son iguales");

        }
    }
}
/**6.Realizar un programa que permita cargar dos listas de 15 valores cada una.
 * Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor
  (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales")
Tener en cuenta que puede haber dos o más estructuras repetitivas en un algoritmo.**/