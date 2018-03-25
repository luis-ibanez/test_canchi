package ejercicios;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado1, lado2, lado3, f, suma, equilátero = 0, isósceles = 0, escaleno = 0, num1 = 0, num2 = 0, num3 = 0;
        System.out.print("Introduce el numero de triangulos: ");
        suma = teclado.nextInt();
        for (f = 1; f <= suma; f++) {
            System.out.print("Introduce el primer lado: ");
            lado1 = teclado.nextInt();
            System.out.print("Introduce el segundo lado: ");
            lado2 = teclado.nextInt();
            System.out.print("Introduce el tercer lado: ");
            lado3 = teclado.nextInt();
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("El triangulo es equilátero.");
                num1 = teclado.nextInt();
                equilátero++;
            } else if (lado1 != lado2 && lado1 != lado3) {
                System.out.println("El triangulo es escaleno.");
                num2 = teclado.nextInt();
                escaleno++;
            } else {
                System.out.println("El triangulo es isósceles.");
                num3 = teclado.nextInt();
                isósceles++;
            }
        }
        System.out.println("Triangulos equiláteros: " + equilátero);
        System.out.println("Triangulos isósceles: " + isósceles);
        System.out.println("Triangulos escaleno: " + escaleno);
        if (equilátero < isósceles && equilátero < escaleno) {
            System.out.println("Tipo de triángulo que posee menor cantidad es el equilátero.");
        }
        if (isósceles < escaleno && isósceles < equilátero) {
            System.out.println("Tipo de triángulo que posee menor cantidad es el isósceles.");

        } else {
            System.out.println("Tipo de triángulo que posee menor cantidad es el escaleno.");

        }

    }
}
/*5.Realizar un programa que lea los lados de n triángulos, e informar:
a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
 isósceles (dos lados iguales), o escaleno (ningún lado igual)
b) Cantidad de triángulos de cada tipo.
c) Tipo de triángulo que posee menor cantidad.*/