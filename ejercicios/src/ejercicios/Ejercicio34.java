package ejercicios;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int x, y, cu1 = 0, cu2 = 0, cu3 = 0, cu4 = 0, f, n;
        System.out.print("Cantidad de puntos a procesar: ");
        n = teclado.nextInt();
        for (f = 1; f <= n; f++){
            System.out.print("Ingresa la coordenada X :");
            x = teclado.nextInt();
            System.out.print("Ingresa la coordenada Y :");
            y = teclado.nextInt();
            if (x > 0 && y > 0){
                cu1++;
            }
            else if (x > 0 && y < 0){
                cu2++;
            }
            else if (x < 0 && y > 0){
                cu3++;
            }
            else{
                cu4++;
            }
        }
        System.out.println("los puntos en el cuadrante 1 son : " + cu1);
        System.out.println("los puntos en el cuadrante 2 son : " + cu2);
        System.out.println("los puntos en el cuadrante 3 son : " + cu3);
        System.out.println("los puntos en el cuadrante 4 son : " + cu4);
    }
}
/*6.Escribir un programa que pida ingresar coordenadas (x,y) que representan
 puntos en el plano.
Informar cuántos puntos se han ingresado en el primer, segundo, tercer y cuarto
cuadrante. Al comenzar el programa se pide que se ingrese la cantidad de puntos
a procesar. */