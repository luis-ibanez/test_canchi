package ejercicios.Proyecto7;


public class ColaSupermercado extends Cola {

    int estado = 0;
    int tiempo = 480;
    int caja1, caja2, caja3;
    int llegada = 2 + (int) (Math.random() * 2);
    int salida = -1;
    int cantidadAtendidas = 0;
    Cola supermercado = new Cola();

    public void simulacionSupermercado() {
        for (int minuto = 0; minuto < tiempo; minuto++) {
            if (llegada == minuto) {
                if (caja1 == 0 ) {
                    caja1 = 1;
                    salida = minuto + 7 + (int) (Math.random() * 10);
                } else  {
                    supermercado.insertar(minuto);
                }
                if (caja2 == 0 ) {
                    caja2 = 1;
                    salida = minuto + 7 + (int) (Math.random() * 10);
                } else  {
                    supermercado.insertar(minuto);
                }
                if (caja3 == 1 ) {
                    caja3= 1;
                    salida = minuto + 7 + (int) (Math.random() * 10);
                } else  {
                    supermercado.insertar(minuto);
                }
            }
            if (salida == minuto) {
                caja1 = 0;
                cantidadAtendidas++;
                if (!supermercado.vacia()) {
                    supermercado.extraer();
                    caja1 = 1;
                    salida = minuto + 7 + (int) (Math.random() * 10);
                }
            }
        }
    }


   /* public void simulacion() {
        int estado = 0;
        int llegada = 2 + (int) (Math.random() * 2);
        int salida = -1;
        int cantAtendidas = 0;
        Cola cola = new Cola();
        for (int minuto = 0; minuto < 600; minuto++) {
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
        System.out.println("Atendidos:" + String.valueOf(cantAtendidas));
        System.out.println("En cola" + String.valueOf(estado));
        System.out.println("Minuto llegada:" + String.valueOf(cola.extraer()));
    }*/

   public void imprimir() {
       System.out.println("Atendidos caja 1: " + String.valueOf(caja1));
       System.out.println("Atendidos caja otra 1: " + caja1);
       System.out.println("Atendidos caja otra 2: " + String.valueOf(caja2));
       System.out.println("Atendidos caja 3: " + String.valueOf(caja3));
       System.out.println("Atendidos caja 2: " + caja2);

       System.out.println("En cola" + String.valueOf(llegada));
       System.out.println("Minuto llegada:" + String.valueOf(supermercado.extraer()));
       System.out.println("Atendidas: " + cantidadAtendidas);
   }

    public static void main(String[] ar) {
        ColaSupermercado cajero1 = new ColaSupermercado();
        cajero1.simulacionSupermercado();
        cajero1.imprimir();


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