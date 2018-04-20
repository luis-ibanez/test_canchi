package ejercicios;

import java.util.Scanner;

public class Texto3 {
    private Scanner teclado = new Scanner(System.in);
    private String[] nombres = new String[5];
    private String[] correo = new String[5];
    private String comprobar;

    public Texto3() {
        for (int fila = 0; fila < nombres.length; fila++) {
            System.out.println("Introduce el nombre de la persona.");
            nombres[fila] = teclado.nextLine();
            System.out.println("Introduce su correo electronico. ");
            correo[fila] = teclado.nextLine();
        }
    }

    public void imprimirDatos() {
        for (int fila = 0; fila < nombres.length; fila++) {
            System.out.println("nombre: " + nombres[fila] + ". correo: " + correo[fila]);
        }
    }

    public void ponerNombreYSaleCorreo() {
        System.out.println("Introduce el nombre a buscar: ");
        for (int fila = 0; fila < 5; fila++) {
            comprobar = teclado.nextLine();
            //aquí tambien he probado con un "if" y tambien se detiene
            //funciona pero se para
            while (comprobar.equalsIgnoreCase(nombres[fila])) {
                System.out.println("Nombre: " + nombres[fila] + ". Y su correo es: " + correo[fila]);
             break;
            }
        }
    }

    public void comprobarSiTieneArroba() {
        for (int fila = 0; fila < 5; fila++) {
            String mirarSiContiene = new String("@");
            int posicion = correo[fila].indexOf(mirarSiContiene);
            if (posicion == -1) {
            } else {
                System.out.println("este correo contie @: " + correo[fila]);
            }
        }
    }

    public static void main(String[] args) {
        Texto3 texto = new Texto3();
        texto.imprimirDatos();
        texto.ponerNombreYSaleCorreo();
        texto.comprobarSiTieneArroba();
    }
}
/*Confeccionar un programa que permita cargar los nombres de 5 personas y sus
 mail, luego implementar los siguientes métodos:
a) Mostrar por pantalla los datos.
b) Consulta del mail ingresando su nombre.
c) Mostrar los mail que no tienen el carácter @. */