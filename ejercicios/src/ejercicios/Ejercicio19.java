/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 * @author Pedroken
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes;
        System.out.print("Introduce el día: ");
        dia = teclado.nextInt();
        System.out.print("Introduce el mes: ");
        mes = teclado.nextInt();
        if (dia == 25 && mes == 12) {
            System.out.println("Dicha fecha corresponde a Navidad.");
        }

    }

}
/**
 * 1.Realizar un programa que pida cargar una fecha cualquiera, luego verificar
 * si dicha fecha corresponde a Navidad.
 **/