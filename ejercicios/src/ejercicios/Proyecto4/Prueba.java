package ejercicios.Proyecto4;

public class Prueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.cargarPersona();
        System.out.println("El nombre y la edad de la persona es: ");
        persona1.imprimirPersona();
        Empleado empleado1 = new Empleado();
        empleado1.cargarSueldo();
        System.out.println("y el sueldo del empleado es: ");
        empleado1.imprimirSueldo();
    }
}
/*Confeccionar una clase Persona que tenga como atributos el nombre y la edad.
 Definir como responsabilidades un método que cargue los datos personales y
 otro que los imprima.
Plantear una segunda clase Empleado que herede de la clase Persona. Añadir
un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.
Definir un objeto de la clase Persona y llamar a sus métodos. También crear
 un objeto de la clase Empleado y llamar a sus métodos. */