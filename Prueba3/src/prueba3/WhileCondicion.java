package prueba3;

public class WhileCondicion {
    static boolean condicion() {
        boolean resultado = Math.random() < 0.99;
        System.out.print(resultado + ", ");
        return resultado;
    }

    public void generarNumerosAleatorios() {
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        for (int i = 0; i < 25; i++) {
            int numeroAleatorio1 = (int) (1 + Math.random() * 10);
            int numeroAleatorio2 = (int) (1 + Math.random() * 10);
            if (numeroAleatorio1 > numeroAleatorio2) {
                System.out.println("El numero 1 es mayor." + numeroAleatorio1);
                contador1++;
            } else if (numeroAleatorio1 < numeroAleatorio2) {
                System.out.println("El numero 2 es mayor." + numeroAleatorio2);
                contador2++;
            } else {
                System.out.println("Son iguales.");
                contador3++;
            }
        }
        System.out.println("El numero 1 es mayor que el dos " + contador1 + " veces.");
        System.out.println("El numero 2 es mayor que el uno " + contador2 + " veces.");
        System.out.println("El numero 1 y el numero dos son iguales " + contador3 + " veces.");
    }

    public void whileInfinito() {
        int i = 0;
        while (i != 100) {
            int numeroAleatorio1 = (int) (1 + Math.random() * 10);
            int numeroAleatorio2 = (int) (1 + Math.random() * 10);
            if (numeroAleatorio1 > numeroAleatorio2) {
                System.out.println("El numero 1 es mayor." + numeroAleatorio1);

            } else if (numeroAleatorio1 < numeroAleatorio2) {
                System.out.println("El numero 2 es mayor." + numeroAleatorio2);

            } else {
                System.out.println("Son iguales.");
            }
        }
    }

    public void delUnoAlCien() {
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
        }
    }

    public void numerosPrimos() {
        int i = 2;
        int c = 1;
        boolean primo = true;
        for (i = 2; i < 100; i++) {
            for (c = 2; c < i; c++) {

                if (i % c == 0) {
                    break;
                }
                if (c == (i -1)) {
                    System.out.println("Número primo: " + i);
                } //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97 
            }
        }
    }

    public static void main(String[] args) {
//        while (condicion())
//            System.out.println("Inside 'while'");
//        System.out.println("Exited 'while'");
        WhileCondicion operaciones = new WhileCondicion();
//        operaciones.delUnoAlCien();
        //      operaciones.generarNumerosAleatorios();
        //operaciones.whileInfinito(); //lo detengo para poder seguir trabajando XD
        operaciones.numerosPrimos();
    }
}
