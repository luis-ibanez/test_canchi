
package prueba3;

import java.util.Scanner;


/**
 * @author Pedroken
 */
public class Prueba3 {

    private Scanner teclado = new Scanner(System.in);
    private String palabra1;
    private String palabra2;
    private String resultado;

    public void cargaDeString() {
        System.out.println("Introduce la primera cadena de caracteres.");
        palabra1 = teclado.nextLine();
        System.out.println("");
        System.out.println("Introduce la segunda cadena de caracteres.");
        palabra2 = teclado.nextLine();
    }

    public void siSonIguales() {
        if (palabra1.equals(palabra2)) {
            System.out.println("equals iguales: " + palabra1 + " y " + palabra2);
        } else {
            System.out.println("else equals distintas: " + palabra1 + " y " + palabra2);
        }
    }

    public void sinMayusculas() {
        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("equalsIgnoreCase iguales: " + palabra1 + " y " + palabra2);
        } else {
            System.out.println("else equalsIgnoreCase distintas: " + palabra1 + " y " + palabra2);
        }
    }

    public void comparaYDaUnInt() {
        if (palabra1.compareTo(palabra2) == 0) {
            System.out.println("compareTo iguales: " + palabra1 + " y " + palabra2);
        } else {
            System.out.println("else compareTo distintas: " + palabra1 + " y " + palabra2);
        }
        if (palabra1.compareToIgnoreCase(palabra2) == 0) {
            System.out.println("compareToIgnoreCase iguales: " + palabra1 + " y " + palabra2);
        } else {
            System.out.println("else compareToIgnoreCase distintas: " + palabra1 + " y " + palabra2);
        }
    }

    public void comprobarSiContieneChar() {
        String simbolo = "@";
        int posicion = palabra1.indexOf(simbolo);
        if (posicion == -1) {
            System.out.println("El correo no contiene @");
        } else {
            System.out.println("Si contiene @");
        }
    }

    public void imprimirPrimeraMitad() {
        int mitad = (palabra1.length() / 2);
        int largo = palabra1.length();
        System.out.println("primera mitad " + palabra1.substring(0, mitad));
        System.out.println("último caracter " + palabra1.substring(largo - 1, largo));
    }

    public void palabraAlReves() {
        System.out.println("cadena al reves.");
        int cola = palabra1.length();
        int cabeza = palabra1.length() - 1;
        System.out.println(cola);
        for (int f = 0; f < palabra1.length(); f++) {
            System.out.print(palabra1.substring(cabeza - f, cola - f));
        }
        System.out.println();
        System.out.println("separados con - ");
        for (int f = 0; f < palabra1.length(); f++) {
            int cabezaMasUno = f + 1;
            System.out.print(palabra1.substring(f, cabezaMasUno) + " - ");
        }
    }

    public void palindromoYContarVocales() {
        int contador = 0;
        String sumarLetras = "";
        String palabraAlReves = "";

        for (int f = 0; f < palabra1.length(); f++) {
            if ((palabra1.charAt(f) == 'a' || palabra1.charAt(f) == 'e' || palabra1.charAt(f) == 'i' || palabra1.charAt(f) == 'o' || palabra1.charAt(f) == 'u' )) {
                contador++;
            }
            int cabezaMasUno = f + 1;
            sumarLetras = palabra1.substring(f, cabezaMasUno);
            palabraAlReves = sumarLetras.concat(palabraAlReves);
        }
        System.out.println(palabraAlReves);
        if (palabra1.compareTo(palabraAlReves) == 0) {
            System.out.println("Palindromo iguales: " + palabra1 + " y " + palabraAlReves);
        } else {
            System.out.println(" son distintas: " + palabra1 + " y " + palabraAlReves);
        }
        System.out.println("La primera palabra tiene " + contador + " vocales");
    }

    public static void main(String[] args) {
        Prueba3 comparacionDeString = new Prueba3();
        comparacionDeString.cargaDeString();
        comparacionDeString.siSonIguales();
        comparacionDeString.sinMayusculas();
        comparacionDeString.comparaYDaUnInt();
        comparacionDeString.comprobarSiContieneChar();
        comparacionDeString.imprimirPrimeraMitad();
        comparacionDeString.palabraAlReves();
        comparacionDeString.palindromoYContarVocales();

    }

}

/**
 * 27
 *
 * Cargar un String por teclado e implementar los siguientes métodos:
 * a) Imprimir la primera mitad de los caracteres de la cadena.
 * b) Imprimir el último caracter.
 * c) Imprimirlo en forma inversa.
 * d) Imprimir cada caracter del String separado con un guión.
 * e) Imprimir la cantidad de vocales almacenadas.
 * f) Implementar un método que verifique si la cadena se lee igual de izquierda a derecha tanto como de
 * derecha a izquierda (ej. neuquen se lee igual en las dos direcciones)
 **/
//System.out.println("");
//TODO jajaja
//FIXME jajaaja
