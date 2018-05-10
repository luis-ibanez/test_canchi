package ejercicios.PrimerosEjercicios;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sueldo, año, por1 = 20, por2 = 5;
        double total;
        System.out.print("Introduce el sueldo del operario: ");
        sueldo = teclado.nextInt();
        System.out.print("Introduce la antigüedad: ");
        año = teclado.nextInt();
        if (sueldo < 500 && año > 9) {
            total = sueldo * por1 / 100;
            total = sueldo + total;
            System.out.println("Tu sueldo ahora es de: " + total + "€");
        } else if (sueldo < 500 && año < 10) {
            total = sueldo * por2 / 100;
            total = sueldo + total;
            System.out.println("Tu sueldo ahora es de: " + total + "€");
        } else if (sueldo > 500) {
            System.out.println("La pelas no te subo un pavo: " + sueldo + "€");
        }
    }
}
/*6.De un operario se conoce su sueldo y los años de antigüedad.
 Se pide confeccionar un programa que lea los datos de entrada e informe:
a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años,
 otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle
 un aumento de 5 %.
c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.*/