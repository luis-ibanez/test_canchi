package ejercicios.Proyectocola;

import ejercicios.Proyecto7.Cola;

public class ejercicioCola extends Cola {

    int estado = 0;
    int llegada = 2 + (int) (Math.random() * 2);
    int salida = -1;
    int cantAtendidas = 0;
    int tiempo = 600;

    Cola cola = new Cola();

    public void simulacion() {

        for (int minuto = 0; minuto < tiempo; minuto++) {
            if (llegada == minuto) {
                if (estado == 0) {
                    estado = 1;
                    salida = minuto + 2 + (int) (Math.random() * 3);
                } else {
                    cola.insertar(minuto);
                }
                llegada = minuto + 2 + (int) (Math.random() * 2);
            }
            if (salida == minuto) {
                estado = 0;
                cantAtendidas++;
                if (!cola.vacia()) {
                    cola.extraer();
                    estado = 1;
                    salida = minuto + 2 + (int) (Math.random() * 3);
                }
            }
        }

    }

    public void imprimir() {
        System.out.println("Cantidad de atendidos" + " = " + cantAtendidas);
        System.out.println("En espera" + " = " + estado);
        System.out.println("Tiempo" + " = " +  cola.extraer());
    }

    public static void main(String[] args) {
        ejercicioCola ejercicioCola = new ejercicioCola();
        ejercicioCola.simulacion();
        ejercicioCola.imprimir();
    }

}
/*Desarrollar un programa para la simulación de un cajero automático.
Se cuenta con la siguiente información:
- Llegan clientes a la puerta del cajero cada 2 ó 3 minutos.
- Cada cliente tarda entre 2 y 4 minutos para ser atendido.

Obtener la siguiente información:
1 - Cantidad de clientes que se atienden en 10 horas.
2 - Cantidad de clientes que hay en cola después de 10 horas.
3 - Hora de llegada del primer cliente que no es atendido luego de 10 horas
 (es decir la persona que está primera en la cola cuando se cumplen 10 horas)*/