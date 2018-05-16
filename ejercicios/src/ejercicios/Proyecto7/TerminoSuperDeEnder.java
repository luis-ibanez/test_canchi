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

    private int clientesAtendidos;
    private int clientesQueSeMarcharon;
    private int tiempoAtendidoTotal;

    public TerminoSuperDeEnder() {
        colaCaja1 = new Cola();
        colaCaja2 = new Cola();
        colaCaja3 = new Cola();

        //Empieza simulacion desde 0 hasta SIMULATION_TIME_MIN -1
        for (int tick = 0; tick < SIMULATION_TIME_MIN; tick++) {

            //Si la caja1 no esta vacia, y la cajera no esta asignada, activamos la cajera
            if (!colaCaja1.vacia() && cajera1 == -1) {
                cajera1 = cajeraGenerator(tick);
                colaCaja1.insertar(tick);
                System.out.println(tick + " - Cajera 1 atendiendo - " + cajera1 + " colaCaja1: " + colaCaja1.cantidad() + " size: " + colaCaja1.size());
            }

            if (!colaCaja2.vacia() && cajera2 == -1) {
                cajera2 = cajeraGenerator(tick);
                colaCaja2.insertar(tick);
                System.out.println(tick + " - Cajera 2 atendiendo - " + cajera2 + " colaCaja2: " + colaCaja2.cantidad());
            }

            if (!colaCaja3.vacia() && cajera3 == -1) {
                cajera3 = cajeraGenerator(tick);
                colaCaja3.insertar(tick);
                System.out.println(tick + " - Cajera 3 atendiendo - " + cajera3 + " colaCaja3: " + colaCaja3.cantidad());
            }

            //Si la cajera ha terminado de atender en este tick
            if (cajera1 == tick) {
                //saco cliente de la cola si hay alguno
                if (colaCaja1.cantidad() > 0) {
                    int tickCliente = colaCaja1.extraer();
                    //Anyado el tiempo de atencion al tiempo total
                    tiempoAtendidoTotal += tick - tickCliente;
                    //incremento el numero de clientes atendidos
                    clientesAtendidos++;
                }
                //pongo la cajera en modo espera
                cajera1 = -1;
                System.out.println(tick + " - Cajera 1 Termina - " + clientesAtendidos + "resta? " + colaCaja1.cantidad());
            }

            //Si la cajera ha terminado de atender en este tick
            if (cajera2 == tick) {
                //saco cliente de la cola si hay alguno
                if (colaCaja2.cantidad() > 0) {
                    int tickCliente = colaCaja2.extraer();
                    //Anyado el tiempo de atencion al tiempo total
                    tiempoAtendidoTotal += tick - tickCliente;
                    //incremento el numero de clientes atendidos
                    clientesAtendidos++;
                }
                //pongo la cajera en modo espera
                cajera2 = -1;
                System.out.println(tick + " - Cajera 2 Termina - " + clientesAtendidos + "resta? " + colaCaja2.cantidad());
            }

            //Si la cajera ha terminado de atender en este tick
            if (cajera3 == tick) {
                //saco cliente de la cola si hay alguno
                if (colaCaja3.cantidad() > 0) {
                    int tickCliente = colaCaja3.extraer();
                    //Anyado el tiempo de atencion al tiempo total
                    tiempoAtendidoTotal += tick - tickCliente;
                    //incremento el numero de clientes atendidos
                    clientesAtendidos++;
                }
                //pongo la cajera en modo espera
                cajera3 = -1;
                System.out.println(tick + " - Cajera 3 Termina - " + clientesAtendidos + "resta? " + colaCaja3.cantidad());
            }

            //si no hay cliente
            if (last_client == -1) {
                last_client = clientGenerator(tick);
                System.out.println(tick + " - Cliente entra - " + last_client);
            } else if (last_client == tick) {
                //cuando entra el cliente, elije la cola con menos tamaño, si el tamaño es 6 en todas, se va
                int caja1Cola = colaCaja1.cantidad();
                int caja2Cola = colaCaja2.cantidad();
                int caja3Cola = colaCaja3.cantidad();
                System.out.println(" - comprobacion - " + cajera1 + " colaCaja1 " + colaCaja1.cantidad() + " size " + colaCaja1.size());
                System.out.println(" - comprobacion - " + cajera2 + " colaCaja2 " + colaCaja2.cantidad() + " size " + colaCaja2.size());
                System.out.println(" - comprobacion - " + cajera3 + " colaCaja3 " + colaCaja3.cantidad() + " size " + colaCaja3.size());
                last_client = -1; //he puesto esto por que si no no entra nunca otro cliente nuevo

                //si la caja1 es menor que 2 y 3
                if (caja1Cola < caja2Cola && caja1Cola < caja3Cola) {
                    if (colaCaja1.cantidad() < MAX_PEOPLE_PER_QUEUE_MIN) {
                        colaCaja1.insertar(tick);
                        System.out.println("elige 1" + " que hay en colaCaja1: " + colaCaja1.cantidad());
                        System.out.println("que hay en colaCaja2: " + colaCaja2.cantidad() + " que hay en colaCaja3: " + colaCaja3.cantidad());

                    } else {
                        clientesQueSeMarcharon++;
                        System.out.println(tick + " - Cliente 1 se va");
                    }
                    //si la caja2 es menor que 1 y que 3
                } else if (caja2Cola < caja1Cola && caja2Cola < caja3Cola) {
                    if (colaCaja2.cantidad() < MAX_PEOPLE_PER_QUEUE_MIN) {
                        colaCaja2.insertar(tick);
                        System.out.println("elige 2");
                    } else {
                        clientesQueSeMarcharon++;
                        System.out.println(tick + " - Cliente 2 se va");
                    }
                    //si la caja3 es menor que 1 y que 2
                } else {
                    if (colaCaja3.cantidad() < MAX_PEOPLE_PER_QUEUE_MIN) {
                        colaCaja3.insertar(tick);
                        System.out.println("elige 3");
                        System.out.println(" que hay en colaCaja1: " + colaCaja1.cantidad() + "caja1Cola: " + caja1Cola);
                        System.out.println("que hay en colaCaja2: " + colaCaja2.cantidad() + " que hay en colaCaja3: " + colaCaja3.cantidad() + "caja3Cola: " + caja3Cola);

                    } else {
                        clientesQueSeMarcharon++;
                        System.out.println(tick + " - Cliente 3 se va");
                    }
                }
            }
        }//fin de simulacion

        System.out.println(" - comprobacion - " + cajera1 + " colaCaja1 " + colaCaja1.cantidad() + " size " + colaCaja1.size());
        System.out.println(" - comprobacion - " + cajera2 + " colaCaja2 " + colaCaja2.cantidad() + " size " + colaCaja2.size());
        System.out.println(" - comprobacion - " + cajera3 + " colaCaja3 " + colaCaja3.cantidad() + " size " + colaCaja3.size());

        //calcular promedio
        promedio = tiempoAtendidoTotal / clientesAtendidos;
    }

    public void imprimir() {
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
