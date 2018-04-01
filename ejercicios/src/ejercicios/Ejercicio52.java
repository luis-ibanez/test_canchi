package ejercicios;

import java.util.Scanner;

public class Ejercicio52 {
    private Scanner teclado;
    private int num , i ;

    public void carga(){
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Ingresa el número para hacer la tabla de multiplicar: ");
            num = teclado.nextInt();
            if (num != -1){
                tabla(num);

            }
        }while (num != -1);
    }
    public void tabla(int v){
        for( i = 1;i <= 10;i++) {
            System.out.println(num + "x" + i + "=" + (num * i));

        }
    }

    public static void main(String[] args){
        Ejercicio52 pro1 = new Ejercicio52();
        pro1.carga();
       // pro1.tabla();

    }
}
/*Problema 1:

Confeccionar una clase que permita ingresar valores enteros por teclado y nos
 muestre la tabla de multiplicar de dicho valor. Finalizar el programa al
 ingresar el -1.*/