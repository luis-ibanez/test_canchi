/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Pedroken
 */
public class Ejercicio9 {
    public static void main(String[]ar){
    Scanner teclado=new Scanner(System.in);
    float num1=0,num2=0,suma,resta,multi,divi;
    System.out.print("Introduce el primer número: ");
    num1=teclado.nextFloat();
    System.out.print("Introduce el segundo número: ");
    num2=teclado.nextFloat();
    suma=num1+num2;
    resta=num1-num2;
    multi=num1*num2;
    divi=num2/num1;
    if(num1>num2){
        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
    }
    else{
        System.out.println("El resultado de la multiplicación es: "+multi);
        System.out.println("El resultado de la división es: "+resta);
    }
    }
    
}

/**1.Realizar un programa que lea por teclado dos números, si el primero es
 * mayor al segundo informar su suma y diferencia, en caso contrario informar 
 * el producto y la división del primero respecto al segundo.**/