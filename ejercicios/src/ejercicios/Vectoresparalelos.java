package ejercicios;

import java.util.Scanner;

public class Vectoresparalelos {
    private Scanner teclado = new Scanner(System.in);
    private String[] nombre = new String[5];
    private int[] edad = new int[5];

    public void carga(){
        for (int i = 1, f = 0; f < 5; f++) {

            System.out.println("Introduce el nombre " + i + ": ");
            nombre[f] = teclado.nextLine();
            i++;
        }
        for (int i = 1, f = 0; f < 5; f++){

            System.out.println("Introduce la edad " + i +": ");
            edad[f] = teclado.nextInt();
            i++;
        }
    }
    public void comprobar(){
        for (int f = 0; f < 5; f++) {
            if (edad[f] >= 18){
                System.out.println("personas mayores de edad: " + nombre[f] + " - " + edad[f]);
            }
        }
    }
    public static void main(String[] args){
        Vectoresparalelos toma = new Vectoresparalelos();
        toma.carga();
        toma.comprobar();
    }
}
/*Problema 1:

Desarrollar un programa que permita cargar 5 nombres de personas y sus
edades respectivas. Luego de realizar la cargaMatriz por teclado de todos los
datos imprimir los nombres de las personas mayores de edad (mayores o
 iguales a 18 años)*/