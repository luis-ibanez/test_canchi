package ejercicios.Proyecto7;


class ColaSupermercado extends Cola {

    int estado = 0;
    int tiempo = 480;
    int caja, caja1, caja2, caja3;
    int llegada = 2 + (int) (Math.random() * 2);
    int salida = 6+(int) (Math.random()*10);
    int salida1 = -1, salida2 = -1, salida3 = -1;
    int cantidadAtendidas = 0, cantidadAtendidas1 = 0, cantidadAtendidas2 = 0, cantidadAtendidas3 = 0;
    int personasQueSeMarchan = 0;

    Cola cola1 = new Cola();
    Cola cola2 = new Cola();
    Cola cola3 = new Cola();


    public void simulacionSupermercado() {
        System.out.println("EXPEDIENTE X");
        System.out.println("salida: " + salida);
        System.out.println("llegada: " + llegada);
        salida = salida - llegada;
        System.out.println("paflipar: " + salida);


        for (int minuto = 0; minuto < tiempo; minuto++) {
            System.out.println(minuto);

            if (llegada == minuto) {
                if (caja1 == 0) {
                    caja1 = 1;
                    System.out.println("Atendidos caja1: " + caja1);

                    salida1 = minuto + 5 + (int) (Math.random() * 8);
                    System.out.println("salida caja1: " + salida1);

                }
                if (caja2 == 0) {
                    caja2 = 1;
                    System.out.println("Atendidos caja2: " + caja2);

                    salida2 = minuto + 7 + (int) (Math.random() * 10);
                    System.out.println("salida caja2: " + salida2);

                }
                if (caja3 == 0) {
                    caja3 = 1;
                    System.out.println("Atendidos caja3: " + caja3);

                    salida3 = minuto + 7 + (int) (Math.random() * 10);
                    System.out.println("salida caja3: " + salida3 + " por ver " + cola3.size());

                } else {
                    if (cola1.size() == 6) {
                        cola2.insertar(minuto);
                        System.out.println("se une a la cola1: " + cola1.cantidad());

                    } else {
                        if (cola2.size() == 6) {
                            cola3.insertar(minuto);
                            System.out.println("se une a la cola2: " + cola2.extraer());

                        } else {
                            if (cola3.size() == 6) {
                                cola1.insertar(minuto);
                                System.out.println("se une a la cola3: " + cola3.extraer());
                            }
                        }
                        if (cola1.size() == 6 && cola2.size() == 6 && cola3.size() == 6) {
                            personasQueSeMarchan++;

                        }
                    }
                }


                llegada = minuto + 2 + (int) (Math.random() * 2);
            }
            if (salida1 == minuto) {
                caja1 = 0;
                cantidadAtendidas1++;
                if (!cola1.vacia()) {
                    cola1.extraer();
                    caja1 = 1;
                    salida1 = minuto + 7 + (int) (Math.random() * 10);

                    System.out.println("a ver que mierda hace la caja 1: " + caja1);
                    System.out.println(" a ver si suma: " + cantidadAtendidas1);
                }
            }

            if (salida2 == minuto) {
                caja2 = 0;
                cantidadAtendidas2++;
                if (!cola1.vacia()) {
                    cola1.extraer();
                    caja1 = 1;
                    salida2 = minuto + 7 + (int) (Math.random() * 10);
                    System.out.println("a ver que mierda hace la caja 2: " + caja2);
                    System.out.println(" a ver si suma2: " + cantidadAtendidas2);
                }
            }

            if (salida3 == minuto) {
                caja3 = 0;
                cantidadAtendidas3++;
                if (!cola1.vacia()) {
                    cola1.extraer();
                    caja1 = 1;
                    salida3 = minuto + 7 + (int) (Math.random() * 10);
                    System.out.println("a ver que mierda hace la caja 3: " + caja3);
                    System.out.println(" a ver si suma 3: " + cantidadAtendidas3);
                }
            }


        }
        //salida = salida1 + salida2 + salida3;
        //caja = caja1 + caja2 + caja3;
        cantidadAtendidas = cantidadAtendidas1 + cantidadAtendidas2 + cantidadAtendidas3;
    }

    public void imprimir() {

        System.out.println("Atendidos caja 1: " + cantidadAtendidas1);
        System.out.println("Atendidos caja 2: " + cantidadAtendidas2);
        System.out.println("Atendidos caja 3: " + cantidadAtendidas3);
        System.out.println("Atendidos caja: " + caja);


        System.out.println("Promedio total en la cola: " + (tiempo - 2) / cantidadAtendidas);
        System.out.println("Promedio en la cola 1: " + (tiempo - 2) / cantidadAtendidas1);
        System.out.println("Promedio en la cola 2: " + (tiempo - 2) / cantidadAtendidas2);
        System.out.println("Promedio en la cola 3: " + (tiempo - 2) / cantidadAtendidas3);

        System.out.println("Atendidas: " + cantidadAtendidas);
        System.out.println("Personas que se marchan: " + personasQueSeMarchan);
        System.out.println("EXPEDIENTE X");
        System.out.println("salida: " + salida);
        System.out.println("llegada: " + llegada);
        salida = salida - llegada;
        System.out.println("paflipar: " + salida);

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