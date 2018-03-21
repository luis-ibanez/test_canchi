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
        System.out.println("Con el monton de gente que hay en paro y te toca a ti poner dos numeros.");        

        
    }
    
}
/**import java.util.Scanner;

public class EstructuraCondicionalAnidada5 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int totalPreguntas,totalCorrectas;
        System.out.print("Ingrese la cantidad total de preguntas del examen:");
        totalPreguntas=teclado.nextInt();
        System.out.print("Ingrese la cantidad total de preguntas contestadas correctamente:");
        totalCorrectas=teclado.nextInt();
        int porcentaje=totalCorrectas * 100 / totalPreguntas;
        if (porcentaje>=90) {
            System.out.print("Nivel máximo");
        } else {
            if (porcentaje>=75) {
                System.out.print("Nivel medio");
            } else {
                if (porcentaje>=50) {
                    System.out.print("Nivel regular");
                } else {
                    System.out.print("Fuera de nivel");
                }
            }
        }
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