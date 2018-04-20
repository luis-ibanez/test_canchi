package ejercicios;

import java.util.Scanner;

public class Texto4 {
    private Scanner teclado = new Scanner(System.in);
    private String[] frase;
    private int palabras;

    public void carga() {
        System.out.println("Introduce la cantidad de palabras de la frase");
        palabras = teclado.nextInt();
        frase = new String[palabras];
        System.out.println("Introduce las palabras de la frase dando al intro despues de cada palabra");
        for (int fila = 0; fila < frase.length; fila++) {
            System.out.println("palabra " + fila);
            frase[fila] = teclado.next();
        }
    }

    public void imprimir() {
        for (int fila = 0; fila < frase.length; fila++){
            System.out.println(frase[fila]);
        }
    }

    public static void main(String[] args){
        Texto4 texto = new Texto4();
        texto.carga();
        texto.imprimir();
    }

}
/*Codifique un programa que permita cargar una oración por teclado, luego
 mostrar cada palabra ingresada en una línea distinta.


Por ejemplo si cargo:
  La mañana está fría.
Debe aparecer:

La
mañana
está
fría.
*/