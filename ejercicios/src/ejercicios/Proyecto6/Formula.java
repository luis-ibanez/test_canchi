package ejercicios.Proyecto6;

import java.util.Stack;
import java.io.*;
import java.util.Scanner;

import static com.sun.activation.registries.LogSupport.log;

public class Formula {

    Stack<Character> pila = new Stack<>();
    String archivo; String cadena; String nombre; String nick; String pow;

    public void parentesis() {
        int largo = cadena.length();
        int posicion = 0;
        Character c = '*';
        Boolean ev = true;

        for (int fila = 0; fila < largo; fila++) {
            posicion = 0;
            c = cadena.charAt(fila);
            if (c == '(') {
                pila.push(c);
            } else if (c == '[') {
                pila.push(c);
            } else if (c == '{') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) {
                    if (pow.compareTo("admin") == 0) {
                       // despliega(nombre, nick, cadena, fila, c, false);
                        log("bien balanceado");System.exit(0);
                    } else {log("Mal balanceado con parentesis"); System.exit(1);}
                }
            }
        }

    }


    public static void main(String[] args) {
        Formula formula = new Formula();
        formula.parentesis();
    }

}
/*Se debe desarrollar una clase que tenga las siguientes responsabilidades (clase Formula):

- Ingresar una fórmula que contenga paréntesis, corchetes y llaves.
- Validar que los ( ) [] y {} estén correctamente balanceados.

Para la solución de este problema la clase formula tendrá un atributo de la clase Pila.*/