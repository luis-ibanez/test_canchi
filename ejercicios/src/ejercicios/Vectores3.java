package ejercicios;

import java.util.Scanner;

public class Vectores3 {
    private Scanner teclado;
    private int [] num1 = new int[4];
    private int [] num2 = new int[4];
    private int [] suma = new int[4];
    private int suma2;

    public void carga(){
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        for (int f = 0; f < 4; f++){
            System.out.print("Vector 1 introduce el valor " + i + ":");
            num1[f] = teclado.nextInt();
            System.out.print("Vector 2 introduce el valor " + i + ":");
            num2[f] = teclado.nextInt();
            i++;
            suma2 += (num2[f] + num1[f]);
        }
    }
    public void operaciones(){
        suma[0] = num1[0] + num2[0];
        suma[1] = num1[1] + num2[1];
        suma[2] = num1[2] + num2[2];
        suma[3] = num1[3] + num2[3];
    }
    public void imprimir(){

        System.out.println("La suma total es de : " + suma2);
        System.out.println("La suma de los componentes 1 es de : " + suma[0]);
        System.out.println("La suma de los componentes 2 es de : " + suma[1]);
        System.out.println("La suma de los componentes 3 es de : " + suma[2]);
        System.out.println("La suma de los componentes 4 es de : " + suma[3]);
    }
    public static void main(String[] args){
        Vectores3 toma = new Vectores3();
        toma.carga();
        toma.operaciones();
        toma.imprimir();
    }

    }
/*Realizar un programa que pida la carga de dos vectores numéricos enteros
de 4 elementos. Obtener la suma de los dos vectores, dicho resultado guardarlo
en un tercer vector del mismo tamaño. Sumar componente a componente. */