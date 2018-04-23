package ejercicios.Erencia;

import java.util.Scanner;

public class Operacion {
    protected int valor1, valor2, resultado;
    private Scanner teclado = new Scanner(System.in);

    public void cargar1() {
        System.out.println("Introduce el primer valor");
        valor1 = teclado.nextInt();
    }

    public void cargar2() {
        System.out.println("Introduce el segundo valor");
        valor2 = teclado.nextInt();

    }

    public void imprimir() {
        System.out.println(resultado);
    }



}
/*Solamente el método operar es distinto para las clases Suma y Resta (esto
 hace que no lo podamos disponer en la clase Operacion), luego los métodos
  cargar1, cargar2 y mostrarResultado son idénticos a las dos clases, esto
   hace que podamos disponerlos en la clase Operacion. Lo mismo los atributos
   valor1, valor2 y resultado se definirán en la clase padre Operacion.

Crear un proyecto y luego crear cuatro clases llamadas: Operacion, Suma, Resta y Prueba*/