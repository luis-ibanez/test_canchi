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
public class Ejercicio17 {
    public static void main(String[] pedroKen){
    Scanner teclado=new Scanner(System.in);
    int pregunta, correct;
    float porcentaje=0;
    System.out.println("Introduce la cantidad total de preguntas: ");
    pregunta=teclado.nextInt();
    
    System.out.println("Introduce la cantidad de preguntas que contesto correctamente: ");
    correct=teclado.nextInt();
    porcentaje=((correct*100)/pregunta);
    
    if(porcentaje>89){
        System.out.println("Nivel máximo."+porcentaje+"%");
    }
    else if(porcentaje>74&&porcentaje<90){
        System.out.println("Nivel medio."+porcentaje+"%");
    }
    else if(porcentaje>49&&porcentaje<75){
        System.out.println("Nivel regular."+porcentaje+"%");
    } 
    else if(porcentaje<50){
        System.out.println("Fuera de nivel."+porcentaje+"%");        
            }
    else
        System.out.println("Hay un error, intentalo de nuevo.");        

        
    }
    
}
/**4.Un postulante a un empleo, realiza un test de capacitación, se obtuvo la 
 * siguiente información: cantidad total de preguntas que se le realizaron y 
 * la cantidad de preguntas que contestó correctamente. Se pide confeccionar un 
 * programa que ingrese los dos datos por teclado e informe el nivel del mismo
 * según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:

	Nivel máximo:	Porcentaje>=90%.
	Nivel medio:	Porcentaje>=75% y <90%.
	Nivel regular:	Porcentaje>=50% y <75%.
	Fuera de nivel:	Porcentaje<50%.
**/