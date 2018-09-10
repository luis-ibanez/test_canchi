package prueba3;


import java.util.Scanner;

public class Javaya {
    private Scanner teclado = new Scanner(System.in);
    private String pais[] = new String[5];
    private int poblacion[] = new int[5];

    public void Imprimir() {
        for (int f = 0; f < pais.length; f++) {
            System.out.println(pais[f] + ": " + poblacion[f]);
        }
    }

    public void CargarPaisPoblacion() {
        for (int f = 0; f < pais.length; f++) {
            System.out.println("Introduce el " + (f + 1) + "º " + "pais: ");
            pais[f] = teclado.next();
            System.out.println("Introduce la poblacion del " + (f + 1) + "º " + "pais: ");
            poblacion[f] = teclado.nextInt();
        }
    }

    public void CompararPaisOrdenAlfabetico() {
        for (int c = 0; c < pais.length - 1; c++) {
            for (int f = 0; f < pais.length -1; f++) {
                String nombreTemporal;
                int cantidadDeGenteTemporal = 0;
                int x = (f +1);
                if (pais[f].compareTo(pais[x]) > 0) {
                    nombreTemporal = pais[f];
                    pais[f] = pais[x];
                    pais[x] = nombreTemporal;

                    cantidadDeGenteTemporal = poblacion[f];
                    poblacion[f] = poblacion[x];
                    poblacion[x] = cantidadDeGenteTemporal;
                }
            }
        }
    }

    public void CompararPaisPorPoblacion() {
        for (int c = 0; c < pais.length - 1; c++) {
            for (int f = 0; f < pais.length -1; f++) {
                String nombreTemporal;
                int poblacionTemporal = 0;
                int x = (f + 1);
                if (poblacion[f] < poblacion[x]) {
                    poblacionTemporal = poblacion[f];
                    poblacion[f] = poblacion[x];
                    poblacion[x] = poblacionTemporal;

                    nombreTemporal = pais[f];
                    pais[f] = pais[x];
                    pais[x] = nombreTemporal;
                }
            }
        }
    }

    public static void main(String[] args) {
        Javaya ordenPaisPoblacion = new Javaya();
        ordenPaisPoblacion.CargarPaisPoblacion();
        ordenPaisPoblacion.CompararPaisOrdenAlfabetico();
        System.out.println("Orden alfabetico de los paises.");
        ordenPaisPoblacion.Imprimir();
        ordenPaisPoblacion.CompararPaisPorPoblacion();
        System.out.println("Orden de los paises por poblacion.");
        ordenPaisPoblacion.Imprimir();
    }

}


/*Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad de habitantes del mismo.
 Ordenar alfabéticamente e imprimir los resultados. Por último ordenar con respecto a la cantidad de habitantes (de mayor a menor) e imprimir nuevamente.*/

//System.out.println();