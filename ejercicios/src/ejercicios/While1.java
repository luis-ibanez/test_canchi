
package ejercicios;

/**
 *
 * @author Pedroken
 */
import java.util.Locale;
import java.util.Scanner;
public class While1 {

   
    
    public static void main(String[] args) {
           Scanner vendedor= new Scanner(System.in).useLocale(Locale.US);
       
        int n=0,i=1;
        double largo,piezas;
        
            System.out.print("Introduce la cantidad de piezas: ");
            piezas = vendedor.nextDouble();
            
            
        while ( i <= piezas) {    

            System.out.print("Introduce la lungitud del perfil: ");
            largo = vendedor.nextDouble();
            
            i++;
        
            if (largo>=1.20&&largo <=1.30){
                n=n+1;
                }
            }
            System.out.println("El número de piezas aptas en el lote son: "+n);
            
        
     
    }
    
}
/**Una planta que fabrica perfiles de hierro posee un lote de n piezas.
Confeccionar un programa que pida ingresar por teclado la cantidad de
 piezas a procesar y luego ingrese la longitud de cada perfil; sabiendo
 que la pieza cuya longitud esté comprendida en el rango de 1,20 y 1,30
 son aptas. Imprimir por pantalla la cantidad de piezas aptas que hay en el lote.**/








/**15) Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
 si no lo es lo volverá a pedir (do while), después muestra ese número por consola.**/
/**Scanner in = new Scanner(System.in);
        int numero = 0 ;
        do {            
        System.out.println("Introduce un numero igual o mayor que 0: ");
        numero = in.nextInt();
        
        while (numero>=0);
        System.out.println("Tu número: " + numero + ", es igual o mayor que 0  ");
     
        }    **/