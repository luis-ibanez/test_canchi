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

    private int clientesAtendidos, clientesAtendidos2, clientesAtendidos3, clientesAtendidos1;
    private int clientesQueSeMarcharon;
    private int tiempoAtendidoTotal;

    public TerminoSuperDeEnder() {
        colaCaja1 = new ColaSupermercado();
        colaCaja2 = new ColaSupermercado();
        colaCaja3 = new ColaSupermercado();
    }

    public void comparar() {
        for (int tick = 0; tick < SIMULATION_TIME_MIN; tick++) {
            cajera1 = cajeraGenerator(tick);
            System.out.println(tick + " - Cajera1 atendiendo - " + cajera1);
            if (colaCaja1.size() < colaCaja2.size() && colaCaja1.size() < colaCaja3.size()) {

                if (cajera1 == tick) {
                    int tickCliente = colaCaja1.extraer();
                    tiempoAtendidoTotal += tick - tickCliente;
                    cajera1 = -1;
                    clientesAtendidos1++;
                    System.out.println(tick + " - Cajera1 Termina - " + clientesAtendidos);
                }
                if (last_client == -1) {
                    last_client = clientGenerator(tick);
                    System.out.println(tick + " - Cliente1 entra - " + last_client);

                } else if (last_client == tick) {
                    if (colaCaja1.size() < MAX_PEOPLE_PER_QUEUE_MIN) {
                        colaCaja1.insertar(tick);
                        System.out.println(tick + " - Cliente1 se queda");
                    }
                    last_client = -1;
                }
            }
            if (colaCaja2.size() < colaCaja1.size() && colaCaja2.size() < colaCaja3.size()) {

                cajera2 = cajeraGenerator(tick);
                System.out.println(tick + " - Cajera 2 atendiendo - " + cajera2);

                if (cajera2 == tick) {
                    int tickCliente = colaCaja2.extraer();
                    tiempoAtendidoTotal += tick - tickCliente;
                    cajera2 = -1;
                    clientesAtendidos2++;
                    System.out.println(tick + " - Cajera2 Termina - " + clientesAtendidos);

                }
                if (last_client == -1) {
                    last_client = clientGenerator(tick);
                    System.out.println(tick + " - Cliente2 entra - " + last_client);

                } else if (last_client == tick) {
                    if (colaCaja2.size() < MAX_PEOPLE_PER_QUEUE_MIN) {
                        colaCaja2.insertar(tick);
                        System.out.println(tick + " - Cliente2 se queda");
                    }
                    last_client = -1;
                }
            }
            if (colaCaja3.size() < colaCaja2.size() && colaCaja3.size() < colaCaja1.size()) {

                if (cajera3 == tick) {
                    cajera3 = cajeraGenerator(tick);
                    System.out.println(tick + " - Cajera 3 atendiendo - " + cajera3);

                    int tickCliente = colaCaja3.extraer();
                    tiempoAtendidoTotal += tick - tickCliente;
                    cajera3 = -1;
                    clientesAtendidos3++;
                    System.out.println(tick + " - Cajera3 Termina - " + clientesAtendidos);
                }
                if (last_client == -1) {
                    last_client = clientGenerator(tick);
                    System.out.println(tick + " - Cliente3 entra - " + last_client);

                } else if (last_client == tick) {
                    if (colaCaja3.size() < MAX_PEOPLE_PER_QUEUE_MIN) {
                        colaCaja3.insertar(tick);
                        System.out.println(tick + " - Cliente3 se queda");
                    }
                    last_client = -1;
                }
            }

            if (cajera1 >= 6 && cajera2 >= 6 && cajera3 >= 6) {
                clientesQueSeMarcharon++;
                System.out.println(tick + " - Cliente se va");
            }
        }
        clientesAtendidos = (clientesAtendidos1 + clientesAtendidos2 + clientesAtendidos3);
    }

    /*public void caja() {
        for (int tick = 0; tick < SIMULATION_TIME_MIN; tick++) {
            //cola no vacia, y la cajera no trabaja, empiezo con el cliente
            if (!colaCaja.vacia() && cajera == -1) {
                cajera = cajeraGenerator(tick);
                System.out.println(tick + " - Cajera atendiendo - " + cajera);
            }
            if (cajera == tick) {
                int tickCliente = colaCaja.extraer();
                tiempoAtendidoTotal += tick - tickCliente;
                cajera = -1;
                clientesAtendidos++;
                System.out.println(tick + " - Cajera Termina - " + clientesAtendidos);
            }
            if (last_client == -1) {
                last_client = clientGenerator(tick);
                System.out.println(tick + " - Cliente entra - " + last_client);

            } else if (last_client == tick) {
                if (colaCaja.size() < MAX_PEOPLE_PER_QUEUE_MIN) {
                    colaCaja.insertar(tick);
                    System.out.println(tick + " - Cliente se queda");
                } else {
                    clientesQueSeMarcharon++;
                    System.out.println(tick + " - Cliente se va");
                }
                last_client = -1;
            }
        }
    }*/

    public void imprimir() {
        System.out.println("Clientes atendidos: " + clientesAtendidos);
        System.out.println("Clientes marchados: " + clientesQueSeMarcharon);
        System.out.println("Media de espera: " + (tiempoAtendidoTotal / clientesAtendidos));
    }

    public int clientGenerator(int tick) {
        Random random = new Random();
        return tick + MIN_CLIENT_TIME_MIN + random.nextInt(MAX_CLIENT_TIME_MIN - MIN_CLIENT_TIME_MIN);
    }

    public int cajeraGenerator(int tick) {
        Random random = new Random();
        return tick + MIN_CAJERA_TIME_MIN + random.nextInt(MAX_CAJERA_TIME_MIN - MIN_CAJERA_TIME_MIN);
    }

    public static void main(String args[]) {
        TerminoSuperDeEnder colaSupermercado = new TerminoSuperDeEnder();
        colaSupermercado.comparar();
        colaSupermercado.imprimir();


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
