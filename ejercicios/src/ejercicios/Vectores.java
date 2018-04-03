package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Vectores {
    private Scanner teclado;
    private float[] altura = new float[5];
    private float promedio = 0, altos, bajos, suma;
    private int i = 1, f;

    public void carga() {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
        for (int f = 0; f < 5; f++) {

            System.out.println("Introduce la altura del sujeto " + i + ": ");
            altura[f] = teclado.nextFloat();
            suma += altura[f];
            i++;
        }
    }

    public void comparar() {
        promedio = suma / 5;
        //promedio = (altura[1] +altura[2]+altura[3]+altura[4]+altura[0]) / 5;
        for ( f = 0; f < altura.length; f++){
        if (altura[f] > promedio) {
            altos++;
        } else {
            bajos++;
        }
        }
    }

    public void imprimir() {
        System.out.println("la altura media es de :" + promedio);
        System.out.println("Personas por encima del promedio:" + altos);
        System.out.println("Personas por debajo del promedio:" + bajos);

    }

    public static void main(String[] args) {
        Vectores alturas = new Vectores();
        alturas.carga();
        alturas.comparar();
        alturas.imprimir();
    }
}
/*Problema 2:

Definir un vector de 5 componentes de tipo float que representen las alturas
de 5 personas.
Obtener el promedio de las mismas. Contar cuántas personas son más altas que
el promedio y cuántas más bajas.*/