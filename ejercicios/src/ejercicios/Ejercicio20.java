package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, suma;
        System.out.print("Ingresa el número 1: ");
        num1 = teclado.nextInt();
        System.out.print("Ingresa el número 2: ");
        num2 = teclado.nextInt();
        System.out.print("Ingresa el número 3: ");
        num3 = teclado.nextInt();
        suma = (num1+num2)*num3;
        if (num1==num2&&num1==num3){
            System.out.println(suma);
        }
    }
}
/*2.Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del
primero con el segundo y a este resultado se lo multiplica por el tercero. */