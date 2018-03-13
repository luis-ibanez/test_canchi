
package prueba3;

import java.util.Scanner;

/**
 *
 * @author Pedroken
 */
public class Prueba3 {

    public static void main(String[] args) {
    int empleados,sueldos,i=1,n=0,guau=0,suma=0;
    Scanner curritos = new Scanner(System.in);
    
    System.out.print("Introduce el numero de empleados: ");
    empleados=curritos.nextInt();
    
    while(i<=empleados){
        System.out.print("Introduce el salario de cada empleado: ");
        sueldos=curritos.nextInt();
        suma+=sueldos;

    
        i++;


        if(sueldos>=100&&sueldos<=300){
            n=n+1;       
        }
        else if(sueldos>=301&&sueldos<=500){
            guau=guau+1;        
        }
        }
            System.out.println("Los trabajadores que cobran entre 100$ y 300$ son: "+n);
            System.out.println("Los trabajadores que cobran entre 301$ y 500$ son: "+guau);
            System.out.println("A la empresa los sueldos le cuestan un total de : "+suma+"$");

    

    }
    
}
/**En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y
  $500, realizar un programa que lea los sueldos que cobra cada empleado e
  informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más
  de $300. Además el programa deberá informar el importe que gasta la empresa
  en sueldos al personal. **/
