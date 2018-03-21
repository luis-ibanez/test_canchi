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
public class Ejercicio14 {
    public static void main(String[]ar){
    Scanner teclado=new Scanner(System.in);
    int num1,num2,num3;
    
    System.out.print("Introduce el primer número: ");
    num1=teclado.nextInt();
    
    System.out.print("Introduce el segundo número: ");
    num2=teclado.nextInt();
    
    System.out.print("Introduce el tercer número: ");
    num3=teclado.nextInt();
    
    if(num1>num2&&num1>num3){
        System.out.println("El primer número es el mayor: "+num1);
    }
    else if (num2>num1&&num2>num3){
        System.out.println("El segundo número es el mayor: "+num2);
    }
    else{
        System.out.println("El tercer número es el mayor: "+num3);
    }       
            
    
    }
    
}
/**Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.**/