package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio48 {
    private Scanner teclado;
    private int x, y;

    public void valor() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el valor X: ");
        x = teclado.nextInt();
        System.out.print("Introduce el valor Y: ");
        y = teclado.nextInt();
    }
    public void cuadrante(){
        if (x > 0 && y > 0){
            System.out.println("Cuadrante 1");
        }
        if (x > 0 && y < 0){
            System.out.println("Cuadrante 2");
        }
        if (x < 0 && y > 0){
            System.out.println("Cuadrante 3");
        }
        if (x < 0 && y < 0){
            System.out.println("Cuadrante 4");
        }
    }
    public static void main(String[] args){
        Ejercicio48 problema3 = new Ejercicio48();
        problema3.valor();
        problema3.cuadrante();
    }
}
/*Problema 3.
Desarrollar una clase que represente un punto en el plano y tenga los
siguientes métodos: cargar los valores de x e y, imprimir en que cuadrante
se encuentra dicho punto (concepto matemático, primer cuadrante si x e y
 son positivas, si x<0 e y>0 segundo cuadrante, etc.)
 */