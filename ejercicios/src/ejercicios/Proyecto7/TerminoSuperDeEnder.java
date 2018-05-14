package ejercicios.Proyecto7;

import java.util.Random;

public class TerminoSuperDeEnder {

    private static final int MAX_PEOPLE_PER_QUEUE_MIN = 6;
    private static final int MIN_CAJERA_TIME_MIN = 7;
    private static final int MAX_CAJERA_TIME_MIN = 11;
    private static final int MIN_CLIENT_TIME_MIN = 2;
    private static final int MAX_CLIENT_TIME_MIN = 3;
    private static final int SIMULATION_TIME_MIN = 8 * 60;


    Cola colaCaja1;
    int cajera1 = -1;

    Cola colaCaja2;
    int cajera2 = -1;

    Cola colaCaja3;
    int cajera3 = -1;

    int last_client = -1;
    int promedio;

    private int clientesAtendidos, clientesAtendidos2, clientesAtendidos3, clientesAtendidos1;
    private int clientesQueSeMarcharon;
    private int tiempoAtendidoTotal;
    int promedio1, promedio2, promedio3;

    public TerminoSuperDeEnder() {
        colaCaja1 = new Cola();
        colaCaja2 = new Cola();
        colaCaja3 = new Cola();

        for (int tick = 0; tick < SIMULATION_TIME_MIN; tick++) {

            if (!colaCaja1.vacia() && cajera1 == -1) {
                cajera1 = cajeraGenerator(tick);
                colaCaja1.insertar(tick);
                System.out.println(tick + " - Cajera 1 atendiendo - " + cajera1 + " mas " + colaCaja1.cantidad() + colaCaja1.size());
            }
            if (cajera1 == tick) {
                int tickCliente = colaCaja1.extraer();
                tiempoAtendidoTotal += tick - tickCliente;
                cajera1 = -1;
                clientesAtendidos1++;
                System.out.println(tick + " - Cajera 1 Termina - " + clientesAtendidos1 + "resta?" + colaCaja1.cantidad());
            }
            if (last_client == -1) {
                last_client = clientGenerator(tick);
                System.out.println(tick + " - Cliente entra - " + last_client);
                last_client = -1;

            } else if (last_client == tick) {
                if (colaCaja1.size() < MAX_PEOPLE_PER_QUEUE_MIN) {

                    System.out.println(tick + " - Cliente 1 se queda" + " colaCaja1: " + colaCaja1.cantidad() + " size: " + colaCaja1.size());
                }
            }
            if (!colaCaja2.vacia() && cajera2 == -1) {
                cajera2 = cajeraGenerator(tick);
                System.out.println(tick + " - Cajera 2 atendiendo - " + cajera2 + " colaCaja2: " + colaCaja2.cantidad());
            }
            if (cajera2 == tick) {
                int tickCliente = colaCaja2.extraer();
                tiempoAtendidoTotal += tick - tickCliente;
                cajera2 = -1;
                clientesAtendidos2++;
                System.out.println(tick + " - Cajera 2 Termina - " + clientesAtendidos2);
            } else if (last_client == tick) {
                if (colaCaja2.size() < MAX_PEOPLE_PER_QUEUE_MIN) {
                    colaCaja2.insertar(tick);
                    System.out.println(tick + " - Cliente 2 se queda");
                }
            }
            if (!colaCaja3.vacia() && cajera3 == -1) {
                cajera3 = cajeraGenerator(tick);
                System.out.println(tick + " - Cajera 3 atendiendo - " + cajera3 + " colaCaja3 " + colaCaja3.cantidad());
            }
            if (cajera3 == tick) {
                int tickCliente = colaCaja3.extraer();
                tiempoAtendidoTotal += tick - tickCliente;
                cajera3 = -1;
                clientesAtendidos3++;
                System.out.println(tick + " - Cajera 3 Termina - " + clientesAtendidos3);
            } else if (last_client == tick) {
                if (colaCaja3.size() < MAX_PEOPLE_PER_QUEUE_MIN) {
                    colaCaja3.insertar(tick);
                    System.out.println(tick + " - Cliente 3 se queda");
                }
            }
            if (colaCaja1.cantidad() < colaCaja2.cantidad() && colaCaja1.cantidad() < colaCaja3.cantidad()) {
                colaCaja1.insertar(tick);
                System.out.println("elige 1");
            } else if (colaCaja2.cantidad() < colaCaja3.cantidad()) {
                colaCaja2.insertar(tick);
                System.out.println("elige 2");
            } else {
                colaCaja3.insertar(tick);
                System.out.println("elige 3");
            }

            if (colaCaja1.cantidad() == 6 && colaCaja2.cantidad() == 6 && colaCaja3.cantidad() == 6) {
                clientesQueSeMarcharon++;
                System.out.println(tick + " - Cliente se va");
            }

        }
        System.out.println(" - comprobacion - " + cajera1 + " colaCaja1 " + colaCaja1.cantidad() + " size " + colaCaja1.size());
        System.out.println(" - comprobacion - " + cajera2 + " colaCaja2 " + colaCaja2.cantidad() + " size " + colaCaja2.size());
        System.out.println(" - comprobacion - " + cajera3 + " colaCaja3 " + colaCaja3.cantidad() + " size " + colaCaja3.size());


        clientesAtendidos = clientesAtendidos1 + clientesAtendidos2 + clientesAtendidos3;
        promedio = (SIMULATION_TIME_MIN - 2) / clientesAtendidos;
        promedio1 = (SIMULATION_TIME_MIN - 2) / clientesAtendidos1;
        promedio2 = (SIMULATION_TIME_MIN - 2) / clientesAtendidos2;
        promedio3 = (SIMULATION_TIME_MIN - 2) / clientesAtendidos3;


    }

    public void imprimir() {
        System.out.println("Clientes atendidos caja 1: " + clientesAtendidos1);
        System.out.println("Tiempo promedio de espera caja 1: " + promedio1);
        System.out.println("Clientes atendidos caja 2: " + clientesAtendidos2);
        System.out.println("Tiempo promedio de espera caja 2: " + promedio2);
        System.out.println("Clientes atendidos caja 3: " + clientesAtendidos3);
        System.out.println("Tiempo promedio de espera caja 3: " + promedio3);
        System.out.println("Clientes atendidos totales: " + clientesAtendidos);
        System.out.println("Clientes que se marcharon sin compra: " + clientesQueSeMarcharon);
        System.out.println("Tiempo promedio total de espera: " + promedio);
        System.out.println("Tiempo atencion total: " + tiempoAtendidoTotal);


    }

    public int clientGenerator(int tick) {
        Random random = new Random();
        return tick + MIN_CLIENT_TIME_MIN + random.nextInt(MAX_CLIENT_TIME_MIN - MIN_CLIENT_TIME_MIN);
    }

    public int cajeraGenerator(int tick) {
        Random random = new Random();
        return tick + MIN_CAJERA_TIME_MIN + random.nextInt(MAX_CAJERA_TIME_MIN - MIN_CAJERA_TIME_MIN);
    }


    public static void main(String[] args) {
        TerminoSuperDeEnder terminoSuperDeEnder = new TerminoSuperDeEnder();
        terminoSuperDeEnder.imprimir();
    }
}
/*

    Un supermercado tiene tres cajas para la atención de los clientes.
    Las cajeras tardan entre 7 y 11 minutos para la atención de cada cliente.
    Los clientes llegan a la zona de cajas cada 2 ó 3 minutos. (Cuando el cliente llega,
     si todas las cajas tienen 6 personas, el cliente se marcha del supermercado)
    Cuando el cliente llega a la zona de cajas elige la caja con una cola menor.

    Realizar una simulación durante 8 horas y obtener la siguiente información:
    a - Cantidad de clientes atendidos por cada caja.
    b - Cantidad de clientes que se marcharon sin hacer compras.
    c - Tiempo promedio en cola.
*/
