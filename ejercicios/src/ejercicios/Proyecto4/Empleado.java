package ejercicios.Proyecto4;

public class Empleado extends Persona {
    public int sueldo;
    void cargarSueldo() {
        System.out.println("Introduce el sueldo: ");
        sueldo = teclado.nextInt();
    }

    public void imprimirSueldo() {
        System.out.println(sueldo);
    }

}
/*Confeccionar una clase Persona que tenga como atributos el nombre y la edad.
 Definir como responsabilidades un método que cargue los datos personales y
 otro que los imprima.
Plantear una segunda clase Empleado que herede de la clase Persona. Añadir
un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
Definir un objeto de la clase Persona y llamar a sus métodos. También crear
 un objeto de la clase Empleado y llamar a sus métodos. */