package ejercicios.Proyecto6;

import java.util.Scanner;
import java.util.Stack;

class OtraForma {

    public static void main(String arg[]) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce la cadena a analizar.");
        String cadenano = teclado.nextLine();

        //String cadenasi = "(Cadena equilibrada en parentesis())";

        System.out.println("Verificación equilibrado en paréntesis para cadenano:");

        System.out.println(verificaParentesis(cadenano));

        //System.out.println("Verificación equilibrado en paréntesis para cadenasi:");

        //System.out.println(verificaParentesis(cadenasi));

    }


    public static boolean verificaParentesis(String cadena) {

        Stack<String> pila = new Stack<>();
        int i = 0;

        while (i < cadena.length()) {  // Recorremos la expresión carácter a carácter

            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
                pila.push("(");
            } // Si el paréntesis es de apertura apilamos siempre

            else if (cadena.charAt(i) == ')' || cadena.charAt(i) == ']' || cadena.charAt(i) == '}') {  // Si el paréntesis es de cierre actuamos según el caso

                if (!pila.empty()) {
                    pila.pop();
                } // Si la pila no está vacía desapilamos

                else {
                    pila.push(") || ] || }");
                    break;
                } // La pila no puede empezar con un cierre, apilamos y salimos

            }

            i++;

        }

        if (pila.empty()) {
            System.out.println("esta de lujo campeon.");
            return true;

        } else {
            System.out.println("Pero que mierda es esto.");
            return false;

        }

    }

}
