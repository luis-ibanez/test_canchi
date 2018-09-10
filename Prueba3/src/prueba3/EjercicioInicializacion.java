package prueba3;

public class EjercicioInicializacion {


    EjercicioInicializacion(int i) {

        String vacio = " casi vacio";
        System.out.println("El valor de String por defecto es: " + vacio + " " + i);

    }

    public void paraCrearUnString() {
        String lleno = "Totalmente lleno";
        System.out.println("Esta lleno: " + lleno);

    }

    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            new EjercicioInicializacion(5);
        }
        EjercicioInicializacion ejercicioInicializacion = new EjercicioInicializacion(8);
        new EjercicioInicializacion(3);
        ejercicioInicializacion.paraCrearUnString();
    }
}
