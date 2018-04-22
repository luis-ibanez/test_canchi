package ejercicios.Proyecto3;

public class Club {
    private Socio socio1, socio2, socio3;

    public Club() {
        socio1 = new Socio();
        socio2 = new Socio();
        socio3 = new Socio();
    }
    public void mayorAntiguedad() {

        if (socio1.getAntiguedad() > socio2.getAntiguedad() && socio1.getAntiguedad() > socio3.getAntiguedad()) {
            System.out.println("El socio que tiene mas antiguedad es: " + socio1.getNombre());
            System.out.println("Y " + socio1.getNombre() + " tiene " + socio1.getAntiguedad() + " años en el Club.");

        }
        else if (socio2.getAntiguedad() > socio3.getAntiguedad()) {
            System.out.println("El socio que tiene mas antiguedad es: " + socio2.getNombre());
            System.out.println("Y " + socio2.getNombre() + " tiene " + socio2.getAntiguedad() + " años en el Club.");

        } else {
            System.out.println("El socio que tiene mas antiguedad es: " + socio3.getNombre());
            System.out.println("Y " + socio3.getNombre() + " tiene " + socio3.getAntiguedad() + " años en el Club.");
        }
    }

    public static void main(String[] args) {
        Club club = new Club();
        club.mayorAntiguedad();
    }

}
/*Plantear una clase Club y otra clase Socio.
La clase Socio debe tener los siguientes atributos privados:
 nombre y la antigüedad en el club (en años).
 En el constructor pedir la carga del nombre y su antigüedad.

  La clase Club debe tener como atributos
   3 objetos de la clase Socio. Definir una responsabilidad para imprimir
    el nombre del socio con mayor antigüedad en el club. */