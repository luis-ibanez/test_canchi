package ejercicios.ProyectoCola2;

public class SimulacionCajeroAutomatico {
    private static final int TIEMPO_MAXIMO = 60 * 10;
    int tiempoEnElQueEntraUnClienteNuevo = getTiempoDeEntrada();
    int clientesQueEntran = 0;
    int tiempoQueTardaEnSalirUnCliente = -1;
    int clientesAtendidos = 0;
    static ColaNueva colaNueva = new ColaNueva();

    public SimulacionCajeroAutomatico() {

        for (int minutoActual = 0; minutoActual < TIEMPO_MAXIMO; minutoActual++) {
            System.out.println("Minuto: " + minutoActual);
            if (minutoActual == tiempoEnElQueEntraUnClienteNuevo) {
                colaNueva.agregar(minutoActual);
                clientesQueEntran++;
                tiempoEnElQueEntraUnClienteNuevo = minutoActual + getTiempoDeEntrada();
                System.out.println("Minuto en el que entra el cliente: " + tiempoEnElQueEntraUnClienteNuevo);
            }
            if (!colaNueva.estaVacia() && tiempoQueTardaEnSalirUnCliente == -1) {
                int tiempoDeEntrada = colaNueva.sacar();
                int tiempoDeEspera = minutoActual - tiempoDeEntrada;
                tiempoQueTardaEnSalirUnCliente = getTiempoEnElCajero() + minutoActual;

            }

            if (minutoActual == tiempoQueTardaEnSalirUnCliente) {
                tiempoQueTardaEnSalirUnCliente = -1;
                clientesAtendidos++;
            }

           /* if (colaNueva.estaVacia()) {

                tiempoQueTardaEnSalirUnCliente = minutoActual + getTiempoEnElCajero();
                System.out.println("Cliente utilizando el tiempoQueTardaEnSalirUnCliente: " + minutoActual + colaNueva.estaVacia());
            }else if (tiempoQueTardaEnSalirUnCliente == minutoActual) {
                colaNueva.sacar();
                clientesQueEntran--;
                System.out.println("Minuto: " + minutoActual + colaNueva.recalcularTamaño());
                clientesAtendidos++;
                tiempoQueTardaEnSalirUnCliente = minutoActual + getTiempoEnElCajero();
            }*/


        }
        System.out.println("Cantidad de clientesQueEntran: " + clientesQueEntran);
        System.out.println("Cantidad de clientesQueEntran atendidos: " + clientesAtendidos);
        System.out.println("Cuanta gente queda en la cola: " + colaNueva.recalcularTamaño());
        System.out.println("Hora de llegada del primer cliente que no es atendido: " + colaNueva.sacar());
    }

    public static int getTiempoDeEntrada() {
        return 2 + (int) (Math.random() * 2);
    }

    public static int getTiempoEnElCajero() {
        return 2 + (int) (Math.random() * 3);
    }

    public static void main(String[] args) {
        SimulacionCajeroAutomatico simulacionCajeroAutomatico = new SimulacionCajeroAutomatico();
    }
}
/*Desarrollar un programa para la simulación de un tiempoQueTardaEnSalirUnCliente automático.
Se cuenta con la siguiente información:
- Llegan clientesQueEntran a la puerta del tiempoQueTardaEnSalirUnCliente cada 2 ó 3 minutos.
- Cada cliente tarda entre 2 y 4 minutos para ser atendido.

Obtener la siguiente información:
1 - Cantidad de clientesQueEntran que se atienden en 10 horas.
2 - Cantidad de clientesQueEntran que hay en cola después de 10 horas.
3 - Hora de llegada del primer cliente que no es atendido luego de 10 horas
(es decir la persona que está primera en la cola cuando se cumplen 10 horas)*/