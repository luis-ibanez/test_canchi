package ejercicios;

import java.util.Scanner;

public class Ejercicio47 {
    private Scanner teclado;
    private int lado1, lado2, lado3;
    //private String equilatero;

    public void inicializar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor del primer lado: ");
        lado1 = teclado.nextInt();
        System.out.println("Introduce el valor del segundo lado: ");
        lado2 = teclado.nextInt();
        System.out.println("Introduce el valor del tercer lado: ");
        lado3 = teclado.nextInt();
    }
    public void imprimir(){
        if (lado1 > lado2 && lado1 > lado3){
            System.out.println("El primer lado es el mayor.");
        }
        if (lado2 > lado3 && lado2 > lado1){
            System.out.println("El segundo lado es el mayor.");
        }
        if (lado3 > lado1 && lado3 > lado2){
            System.out.println("El tercer lado es el mayor.");
        }else {
            System.out.println("Los lados mayores son iguales.");
        }
    }
    public void equilatero(){
        if (lado1 == lado2 && lado1 == lado3){
            System.out.println("El triangulo es equilatero.");
        }else {
            System.out.println("El triangulo no es equilatero.");
        }
    }
    public static void main(String[] args){
        Ejercicio47 triangulo;
        triangulo = new Ejercicio47();
        triangulo.inicializar();
        triangulo.imprimir();
        triangulo.equilatero();
    }
}
/*Desarrollar un programa que cargue los lados de un triángulo e implemente los
 siguientes métodos: inicializar los atributos, imprimir el valor del lado mayor
  y otro método que muestre si es equilátero o no.*/