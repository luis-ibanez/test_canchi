
package prueba3;

import java.util.Scanner;


/**
 * @author Pedroken
 */
public class Prueba3 {

    private Scanner teclado = new Scanner(System.in);
    private String personas[] = new String[2];
    private String mailDeLasPersonas[] = new String[2];

    public void cargaDeDatos() {
        for (int f = 0; f < personas.length; f++) {
            System.out.println("Introduce el nombre de la persona " + (f + 1));
            personas[f] = teclado.nextLine();
            System.out.println();
            System.out.println("Introduce el e-mail de la persona " + (f + 1));
            mailDeLasPersonas[f] = teclado.nextLine();

        }
    }

    public void imprimirDatosPersonales() {
        for (int f = 0; f < personas.length; f++) {
            System.out.println("nombre " + personas[f] + " y correo: " + mailDeLasPersonas[f]);
        }
    }

    public void comprobarArroba() {

        for (int f = 0; f < personas.length; f++) {
            int contador = 0;
            for (int c = 0; c < mailDeLasPersonas[f].length(); c++) {
                if (mailDeLasPersonas[f].charAt(c) == '@') {
                    contador++;
                }
            }
            if (contador == 0) {
                System.out.println("El correo no contiene @: " + personas[f] + " - " + mailDeLasPersonas[f]);
            }
        }
    }

    public void sacarMailConNombre() {
        String nombreABuscar = "";
        int finalizar = 1;

        while (finalizar != 0) {
            System.out.println("Introduce el nombre para saber el correo.");
            nombreABuscar = teclado.next();
            for (int f = 0; f < personas.length; f++) {
                if (nombreABuscar.equalsIgnoreCase(personas[f])) {
                    System.out.println(mailDeLasPersonas[f]);
                }
            }
            System.out.println("escribe 0 para salir, cualquier numero para continuar");
            finalizar = teclado.nextInt();
        }
    }

    public void separarPalabras() {
        for (int f = 0; f < personas.length; f++){
            for (int c = 0; c < personas[f].length(); c++) {
                if (personas[f].charAt(c) == ' ') {
                    System.out.println();
            } else{
                System.out.print(personas[f].charAt(c));
            }
            }
        }
    }

    public static void main(String[] args) {
        Prueba3 pruebasConString = new Prueba3();
        pruebasConString.cargaDeDatos();
        pruebasConString.imprimirDatosPersonales();
        pruebasConString.comprobarArroba();
        pruebasConString.sacarMailConNombre();
        pruebasConString.separarPalabras();
    }

}

/**
 * 27
 * Confeccionar un programa que permita cargar los nombres de 5 personas y sus mail, luego implementar los siguientes métodos:
 * a) Mostrar por pantalla los datos.
 * b) Consulta del mail ingresando su nombre.
 * c) Mostrar los mail que no tienen el carácter @.
 **/
//System.out.println("");
//TODO jajaja
//FIXME jajaaja
