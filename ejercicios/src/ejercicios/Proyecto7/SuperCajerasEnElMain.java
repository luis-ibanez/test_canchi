package ejercicios.Proyecto7;


public class SuperCajerasEnElMain {
    private static final int MAX_PEOPLE_PER_QUEUE_MIN = 6;
    private static final int CAJERA_TIME_MIN = 7 + (int) (Math.random() * 10);
    private static final int CLIENT_TIME_MIN = 2 + (int) (Math.random() * 2);
    private static final int SIMULATION_TIME_MIN = 8 * 60;
    private Nodo raiz;

    Cola colaCaja = new Cola();
    int cajera = -1;

    Cola colaCaja1 = new Cola();
    int cajera1 = -1;

    Cola colaCaja2 = new Cola();
    int cajera2 = -1;

    Cola colaCaja3 = new Cola();
    int cajera3 = -1;

    int last_client = -1;

    int tick = 0;

    private int clientesAtendidos, clientesAtendidos2, clientesAtendidos3, clientesAtendidos1;
    private int clientesQueSeMarcharon;
    private int tiempoAtendidoTotal;



    public void caja() {


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


    public void imprimirSuperNuevo() {
        System.out.println("Clientes atendidos: " + clientesAtendidos);
        System.out.println("Clientes marchados: " + clientesQueSeMarcharon);
        System.out.println("Media de espera: " + (tiempoAtendidoTotal / clientesAtendidos));
    }

    public int clientGenerator(int tick) {
        return tick + CLIENT_TIME_MIN;
    }

    public int cajeraGenerator(int tick) {
        return tick + CAJERA_TIME_MIN;
    }

    public static void main(String[] args) {
        SuperCajerasEnElMain cajeras = new SuperCajerasEnElMain();
        Cola colaCaja1 = new Cola();
        int cajera1 = -1;

        Cola colaCaja2 = new Cola();
        int cajera2 = -1;

        Cola colaCaja3 = new Cola();
        int cajera3 = -1;

        int last_client = -1;
        for (int tick = 0; tick < SIMULATION_TIME_MIN; tick++) {
            if (colaCaja1.size() < colaCaja2.size() && colaCaja1.size() < colaCaja3.size()) {
                 cajeras.caja();
            } else if (colaCaja2.size() < colaCaja3.size()) {
                cajeras.caja();
            } else {
                cajeras.caja();
            }

        }
    }
}


