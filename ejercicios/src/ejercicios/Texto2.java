package ejercicios;

import java.util.Scanner;

public class Texto2 {
    private Scanner teclado = new Scanner(System.in);
    private String cadena;
    private String cadena6;

    public void primeraMitad() {
        System.out.println("Escribe el texto: ");
        cadena = teclado.nextLine();
        int largo = cadena.length();
        int laMitad = largo / 2;
        String cadena2 = cadena.substring(0, laMitad);
        System.out.println(cadena2);
    }

    public void ultimoCaracter() {
        int largo = cadena.length();
        String cadena3 = cadena.substring((largo - 1), largo);
        System.out.println(cadena3);
    }

    public void aLaInversa() {
        int largo = cadena.length();
        for (int contador = 0; contador < cadena.length(); contador++) {
            String cadena4 = cadena.substring((largo - 1), largo);
            largo = largo - 1;
            System.out.print(cadena4);
        }
        System.out.println();
    }

    public void imprimirCaracterSeparado() {
        for (int fila = 0; fila < cadena.length(); fila++) {
            String cadena5 = cadena.substring(fila, (fila + 1));
            System.out.print(cadena5 + "-");
        }
        System.out.println();
    }

    public void imprimirVocales() {
        for (int fila = 0; fila < cadena.length(); ++fila) {
            char caracter = cadena.charAt(fila);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i'
                    || caracter == 'o' || caracter == 'u')
                System.out.print(caracter);
        }
        System.out.println();
    }

    public void comprobarSiSeLeeIgualAlReves() {
        System.out.println("Verificar si se puede leer igual al reves");
        int largo = cadena.length();
        for (int contador = 0; contador < cadena.length(); contador++) {
            String cadena5 = cadena.substring((largo - 1), largo);
            largo = largo - 1;
            cadena6 += cadena5;
        }
        int loNecesito = (cadena.length()) + 4;
        String cadena7 = cadena6.substring(4, loNecesito);
        if (cadena.equalsIgnoreCase(cadena7)) {
            System.out.println("La palabra es un palíndromo: " + cadena7);
        } else {
            System.out.println("La palabra no se puede leer al reves: " + cadena7);
        }
    }

    public static void main(String[] args) {
        Texto2 texto2 = new Texto2();
        texto2.primeraMitad();
        texto2.ultimoCaracter();
        texto2.aLaInversa();
        texto2.imprimirCaracterSeparado();
        texto2.imprimirVocales();
        texto2.comprobarSiSeLeeIgualAlReves();
    }
}

/*Cargar un String por teclado e implementar los siguientes métodos:
*a) Imprimir la primera mitad de los caracteres de la cadena.
*b) Imprimir el último caracter.
*c) Imprimirlo en forma inversa.
*d) Imprimir cada caracter del String separado con un guión.
*e) Imprimir la cantidad de vocales almacenadas.
*f) Implementar un método que verifique si la cadena se lee igual de izquierda
 a derecha tanto como de derecha a izquierda (ej. neuquen se lee igual en las
  dos direcciones) */