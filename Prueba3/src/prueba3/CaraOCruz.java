package prueba3;

public class CaraOCruz {

    int moneda;

    public void generarTirada() {

        moneda = 1 + (int) (Math.random() * 2);
    }

    public void caraOCruz() {
        System.out.println(moneda);
        if (moneda == 1) {
            System.out.println("Cara");
        } else {
            System.out.println("Cruz");
        }
    }

    public void demostrarValoresExadecimales() {
        long n1 = 200l;
        long n2 = 200L;
        long n3 = 0x2f;
        long n4 = 0177;
        System.out.println("Resultados l: " + Long.toBinaryString(n1));
        System.out.println("Resultados L: " + Long.toBinaryString(n2));
        System.out.println("Resultados f: " + Long.toBinaryString(n3));
        System.out.println("Resultados F: " + Long.toBinaryString(n4));
    }

    public static void main(String[] args) {
        CaraOCruz cara = new CaraOCruz();
        cara.generarTirada();
        cara.caraOCruz();
        cara.demostrarValoresExadecimales();
    }
}
