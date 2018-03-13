/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Pedroken
 */
public class Anidadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int operacion = 4, num_uno = 8, num_dos = 4, resultado = 0;
   
   if(operacion == 1){
       resultado = (num_uno + num_dos);
       System.out.println("El resultado de la suma es: " + resultado);
   }
   else if(operacion == 2){
       resultado = (num_uno - num_dos);
       System.out.println("El resultado de la resta es: " + resultado);
   }
   else if(operacion == 3){
       resultado = (num_uno * num_dos);
       System.out.println("El resultado de la multiplicacion es: " + resultado);
   }
   else if(operacion == 4){
       resultado = (num_uno / num_dos);
       System.out.println("El resultado de la division es: " + resultado);
   }
   else{
        System.out.println("codigo de operacion incorrecto");
    }
    }
    
}

