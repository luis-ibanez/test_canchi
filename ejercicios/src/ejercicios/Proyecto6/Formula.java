package ejercicios.Proyecto6;

import java.util.Scanner;
import java.util.Stack;

public class Formula {

    private static String caracteres;// hay que hacerlo privado para poder ponerlo en el main
    //String caracteres;


    public void carga() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena a analizar");
        caracteres = teclado.nextLine();
    }



    public static boolean primerIntentoParentesis(String cadena) {
        Stack <String> raiz = new Stack<String>();

        int i = 0;

        while (i < cadena.length()) {  // Recorremos la expresión carácter a carácter

            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
                raiz.push("(");
            } // Si el paréntesis es de apertura apilamos siempre

            else if (cadena.charAt(i) == ')' || cadena.charAt(i) == ']' || cadena.charAt(i) == '}') {  // Si el paréntesis es de cierre actuamos según el caso

                if (!raiz.empty()) {
                    raiz.pop();
                } // Si la pila no está vacía desapilamos

                else {
                    raiz.push(") || ] || }");
                    break;
                } // La pila no puede empezar con un cierre, apilamos y salimos

            }
            i++;
        }
        if (raiz.empty()) {
            System.out.println("esta de lujo campeon.");
            return true;

        } else {
            System.out.println("Pero que mierda es esto.");
            return false;

        }

    }


    public static void main(String[] args) {
        Formula formula = new Formula();
        formula.carga();
        formula.primerIntentoParentesis(caracteres);
    }

}
/*Se debe desarrollar una clase que tenga las siguientes responsabilidades (clase Formula):

- Ingresar una fórmula que contenga paréntesis, corchetes y llaves.
- Validar que los ( ) [] y {} estén correctamente balanceados.

Para la solución de este problema la clase formula tendrá un atributo de la clase Pila.*/