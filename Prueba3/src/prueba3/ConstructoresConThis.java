package prueba3;

public class ConstructoresConThis {

    String coche;
    int motor;
    int cilindros = 4;
    int centimetrosCubicos = 400;
    String s;

    ConstructoresConThis() {
        s = "ford";
        coche = s;
        motor = cilindros * centimetrosCubicos;
    }

    ConstructoresConThis(int puf) {

        this.coche = coche;
        this.motor = motor;
        this.s = s;
    }

    public void ejemploCoche() {

        System.out.println("Marca del coche: " + coche);
        System.out.println("Cilindrada del coche: " + motor);
        System.out.println("Marca del coche: " + s);
    }

    public static void main(String[] args) {
        ConstructoresConThis constructoresConThis = new ConstructoresConThis();
        constructoresConThis.ejemploCoche();
    }

}
