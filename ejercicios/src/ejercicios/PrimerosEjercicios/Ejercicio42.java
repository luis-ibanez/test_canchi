package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numcuenta = 0, saldo, suma = 0;
        do {
            System.out.println("Ingresa el número de cuenta: ");
            numcuenta = teclado.nextInt();
            System.out.println("Ingresa el saldo actual: ");
            saldo = teclado.nextInt();
            if (saldo > 0) {
                suma += saldo;
                System.out.println("El número de cuenta es: " + numcuenta);
                System.out.println("El saldo actual es de: " + saldo);
                System.out.println("Estado de la cuenta 'Acreedor' ");
            } else {
                if (saldo == 0) {
                    System.out.println("El número de cuenta es: " + numcuenta);
                    System.out.println("El saldo actual es de: " + saldo);
                    System.out.println("Estado de la cuenta 'Nulo' ");
                } else {
                    System.out.println("El número de cuenta es: " + numcuenta);
                    System.out.println("El saldo actual es de: " + saldo);
                    System.out.println("Estado de la cuenta 'Deudor' ");
                }
            }
        }
        while (numcuenta >= 0);
        System.out.println("La suma total de los saldos acreedores es de: " + suma);
    }
}
/*En un banco se procesan datos de las cuentas corrientes de sus clientes. De
 cada cuenta corriente se conoce: número de cuenta y saldo actual.
  El ingreso
  de datos debe finalizar al ingresar un valor negativo en el número de cuenta.

Se pide confeccionar un programa que lea los datos de las cuentas corrientes e
 informe:
a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo,
 sabiendo que:

Estado de la cuenta	'Acreedor' si el saldo es >0.
			'Deudor' si el saldo es <0.
			'Nulo' si el saldo es =0.

b) La suma total de los saldos acreedores. */