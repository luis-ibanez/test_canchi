package ejercicios.Proyecto3;

import java.util.Scanner;

public class Socio {
    private String nombre;
    private int antiguedad;
    private Scanner teclado = new Scanner(System.in);

    public Socio() {
        System.out.println("Introduce el nombre del socio.");
        nombre = teclado.nextLine();
        System.out.println("Introduce la antiguedad del socio en el club en años.");
        antiguedad = teclado.nextInt();
    }
    public String getNombre() {
        return nombre;
    }
    public int getAntiguedad() {
        return antiguedad;
    }

}
/*Plantear una clase Club y otra clase Socio.
La clase Socio debe tener los siguientes atributos privados:
 nombre y la antigüedad en el club (en años).
 En el constructor pedir la carga del nombre y su antigüedad.

  La clase Club debe tener como atributos
   3 objetos de la clase Socio. Definir una responsabilidad para imprimir
    el nombre del socio con mayor antigüedad en el club. */