package ejercicios.Proyecto4;

import java.util.Scanner;

public class Persona {
    protected Scanner teclado = new Scanner(System.in);
    protected String nombre;
    protected int edad;

    public void cargarPersona() {
        System.out.println("Introduce el nombre: ");
        nombre = teclado.next();

        System.out.println("Introduce la edad: ");
        edad = teclado.nextInt();
    }

    public void imprimirPersona() {
        System.out.println(nombre + " - " + edad);

    }

}
/*Confeccionar una clase Persona que tenga como atributos el nombre y la edad.
 Definir como responsabilidades un método que cargue los datos personales y
 otro que los imprima.
Plantear una segunda clase Empleado que herede de la clase Persona. Añadir
un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
Definir un objeto de la clase Persona y llamar a sus métodos. También crear
 un objeto de la clase Empleado y llamar a sus métodos. */