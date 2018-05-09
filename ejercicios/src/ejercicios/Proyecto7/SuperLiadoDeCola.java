package ejercicios.Proyecto7;

import java.util.Random;

public class SuperLiadoDeCola {
    private static final int MAX_PEOPLE_PER_QUEUE_MIN = 6;
    private static final int CAJERA_TIME_MIN = 7 + (int) (Math.random() * 10);
    private static final int CLIENT_TIME_MIN = 2 + (int) (Math.random() * 2);
    private static final int SIMULATION_TIME_MIN = 8 * 60;
    private Nodo raiz;

    Cola colaCaja1 = new Cola();
    int cajera1 = -1;

    Cola colaCaja2 = new Cola();
    int cajera2 = -1;

    Cola colaCaja3 = new Cola();
    int cajera3 = -1;

    int last_client = -1;

    private int clientesAtendidos, clientesAtendidos2, clientesAtendidos3, clientesAtendidos1;
    private int clientesQueSeMarcharon;
    private int tiempoAtendidoTotal;


    public SuperLiadoDeCola() {

        for (int tick = 0; tick < SIMULATION_TIME_MIN; tick++) {
            if (!colaCaja1.vacia() && cajera1 == -1) {
                cajera1 = cajeraGenerator(tick);
                System.out.println(tick + " - Cajera atendiendo - " + cajera1);
            }
            if (cajera1 == tick) {
                int tickCliente = colaCaja1.extraer();
                tiempoAtendidoTotal += tick - tickCliente;
                cajera1 = -1;
                clientesAtendidos1++;
                System.out.println(tick + " - Cajera Termina - " + clientesAtendidos1);
            }
            if (last_client == -1) {
                last_client = clientGenerator(tick);
                System.out.println(tick + " - Cliente entra - " + last_client);

            } else if (last_client == tick) {
                if (colaCaja1.size() < MAX_PEOPLE_PER_QUEUE_MIN) {
                    colaCaja1.insertar(tick);
                    System.out.println(tick + " - Cliente se queda");
                }
                last_client = -1;
                cajera2 = cajeraGenerator(tick);
                System.out.println(tick + " - Cajera 2 atendiendo - " + cajera2);
            }
            if (cajera2 == tick) {
                int tickCliente = colaCaja2.extraer();
                tiempoAtendidoTotal += tick - tickCliente;
                cajera2 = -1;
                clientesAtendidos2++;
                System.out.println(tick + " - Cajera 2 Termina - " + clientesAtendidos2);
            }
            if (last_client == -1) {
                last_client = clientGenerator(tick);
                System.out.println(tick + " - Cliente 2 entra - " + last_client);

            } else if (last_client == tick) {
                if (colaCaja2.size() < MAX_PEOPLE_PER_QUEUE_MIN) {
                    colaCaja2.insertar(tick);
                    System.out.println(tick + " - Cliente 2 se queda");
                }
                last_client = -1;
                cajera3 = cajeraGenerator(tick);
                System.out.println(tick + " - Cajera 3 atendiendo - " + cajera3);
            }
            if (cajera3 == tick) {
                int tickCliente = colaCaja3.extraer();
                tiempoAtendidoTotal += tick - tickCliente;
                cajera3 = -1;
                clientesAtendidos3++;
                System.out.println(tick + " - Cajera 3 Termina - " + clientesAtendidos3);
            }
            if (last_client == -1) {
                last_client = clientGenerator(tick);
                System.out.println(tick + " - Cliente 3 entra - " + last_client);

            } else if (last_client == tick) {
                if (colaCaja3.size() < MAX_PEOPLE_PER_QUEUE_MIN) {
                    colaCaja3.insertar(tick);
                    System.out.println(tick + " - Cliente 3 se queda");
                } else {
                    clientesQueSeMarcharon ++;
                    System.out.println(tick + " - Cliente se va");
                }
                last_client = -1;
            }


        }
        clientesAtendidos = (clientesAtendidos1 + clientesAtendidos2 + clientesAtendidos3);


    }
    public  void imprimirSuperNuevo() {
        System.out.println("Clientes atendidos: "+clientesAtendidos);
        System.out.println("Clientes marchados: "+clientesQueSeMarcharon);
        System.out.println("Media de espera: "+ (tiempoAtendidoTotal/clientesAtendidos));
    }
    public int clientGenerator(int tick){
        Random random = new Random();
        return tick + CLIENT_TIME_MIN;
    }

    public int cajeraGenerator(int tick){
        Random random = new Random();
        return tick + CAJERA_TIME_MIN;
    }


    public static void main(String[] args) {
        SuperLiadoDeCola superliado = new SuperLiadoDeCola();
        superliado.imprimirSuperNuevo();
    }
}



