/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

/**
 * @author Pedroken
 */
public class Ejercicio18 {
    public static void main(String[] pedroKen) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, año;
        System.out.println("Introduce el día");
        dia = teclado.nextInt();
        System.out.println("Introduce el mes");
        mes = teclado.nextInt();
        System.out.println("Introduce el año");
        año = teclado.nextInt();
        //if(mes>=1||mes<=3){

        if (mes == 1 || mes == 2 || mes == 3) {//esto ya va XD

            System.out.println("pertenece al primer trimestre");
            System.out.println("dia:" + dia + " mes:" + mes + " año:" + año);

        } else {
            System.out.println("dia:" + dia + " mes:" + mes + " año:" + año);
        }
    }
}
/**
 * Se carga una fecha (día, mes y año) por teclado. Mostrar un mensaje si
 * corresponde al primer trimestre del año (enero, febrero o marzo) Cargar
 * por teclado el valor numérico del día, mes y año.
 * Ejemplo: dia:10 mes:1 año:2010.
 **/