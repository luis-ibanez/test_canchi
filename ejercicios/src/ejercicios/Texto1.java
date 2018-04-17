package ejercicios;

import java.util.Scanner;

public class Texto1 {
    private Scanner teclado = new Scanner(System.in);
    private String email, contiene;

    public Texto1(){
        System.out.println("Introduce la dirección de e-mail. ");
        email = teclado.nextLine();
        System.out.println("Introduce lo que quieras comparar ");
        contiene = teclado.nextLine();
    }
    public void mirarSiContiene(){
        int posicion = email.indexOf(contiene);
        if (posicion == -1){
            System.out.println("No contiene el parametro introducido. ");
        } else {
            System.out.println("Si contiene el parametro " + contiene + " en el e-mail");
        }
    }
    public static void main(String[] args) {
        Texto1 texto = new Texto1();
        texto.mirarSiContiene();
    }

}
/*Realizar una clase, que permita cargar una dirección de mail en el constructor
, luego en otro método mostrar un mensaje si contiene el caracter '@'. */