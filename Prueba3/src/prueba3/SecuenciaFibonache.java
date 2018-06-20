package prueba3;

public class SecuenciaFibonache {
    public void Fibonnacci() {

        int resultado;
        int i = 1;

        System.out.println(i);

        for (int c = 1; c < 100; ) {
            System.out.println(c);
            resultado = i + c;
            i = c;
            c = resultado;
        }
    }

    public void EjemploSwitch() {
        int numero = 0;
        for (int i = 1; i < 10; i++) {
            numero = i;

            switch (numero) {

                case 1:
                    System.out.println("El numero es el 1.");
                    continue;
                case 2:
                    System.out.println("El numero es el 2.");
                    continue;
                case 3:
                    System.out.println("El numero es el 3.");
                    continue;
                case 4:
                    System.out.println("El numero es el 4.");
                    continue;
                case 5:
                    System.out.println("El numero es el 5, y en el 5 quiero que pare.");
                    break;
            }
        }

    }

    public void NumeroVampiro() {
        int[] vampiros = new int[50];
        int numero;
        int numero1;
        int cuarto;
        int tercero;
        int segundo;
        int primero;
        int primerColmillo;
        int segundoColmillo;
        int tercerColmillo;
        int cuartoColmillo;
        int numeroColmillo1;
        int numeroColmillo2;

        for (int colmillo1 = 10; colmillo1 < 100; colmillo1++) {
            for (int colmillo2 = 10; colmillo2 < 100; colmillo2++) {
                numeroColmillo1 = colmillo1;
                numeroColmillo2 = colmillo2;
                numero = colmillo1 * colmillo2;
                numero1 = numero;
                if (numero > 1000 && numero < 10000) {
//                    System.out.println("Número a comprobar: " + numero);
//                    System.out.println("Número colmillo1: " + colmillo1);
//                    System.out.println("Número colmillo2: " + colmillo2);
                    primero = numero % 10;

                    numero = numero / 10;
                    segundo = numero % 10;

                    numero = numero / 10;
                    tercero = numero % 10;

                    numero = numero / 10;
                    cuarto = numero % 10;
                    //System.out.println("cuarto: " + cuarto + " tercero: " + tercero + " segundo: " + segundo + " primero: " + primero);
                    for (int i = 0; i < 4; i++) {
                        if (cuarto < tercero) {
                            int temp;
                            temp = cuarto;
                            cuarto = tercero;
                            tercero = temp;

                        }
                        if (tercero < segundo) {
                            int temp;
                            temp = tercero;
                            tercero = segundo;
                            segundo = temp;

                        }
                        if (segundo < primero) {
                            int temp;
                            temp = segundo;
                            segundo = primero;
                            primero = temp;
                        }
                       //System.out.println("cuarto: " + cuarto + " tercero: " + tercero + " segundo: " + segundo + " primero: " + primero + "<<<<<<<<<<<<<<<");
                    }
                    tercerColmillo = numeroColmillo1 % 10;
                    numeroColmillo1 = numeroColmillo1 / 10;
                    cuartoColmillo = numeroColmillo1 % 10;

                    primerColmillo = numeroColmillo2 % 10;
                    numeroColmillo2 = numeroColmillo2 / 10;
                    segundoColmillo = numeroColmillo2 % 10;
                   // System.out.println("cuartoColmillo: " + cuartoColmillo + " tercerColmillo: " + tercerColmillo + " segundoColmillo: " + segundoColmillo + " primerColmillo: " + primerColmillo);
                    for (int i = 0; i < 4; i++) {
                        if (cuartoColmillo < tercerColmillo) {
                            int temp;
                            temp = cuartoColmillo;
                            cuartoColmillo = tercerColmillo;
                            tercerColmillo = temp;
                        }
                        if (tercerColmillo < segundoColmillo) {
                            int temp;
                            temp = tercerColmillo;
                            tercerColmillo = segundoColmillo;
                            segundoColmillo = temp;
                        }
                        if (segundoColmillo < primerColmillo) {
                            int temp;
                            temp = segundoColmillo;
                            segundoColmillo = primerColmillo;
                            primerColmillo = temp;
                        }
                        //System.out.println("cuartoColmillo: " + cuartoColmillo + " tercerColmillo: " + tercerColmillo + " segundoColmillo: " + segundoColmillo + " primerColmillo: " + primerColmillo);
                    }
                    if (cuarto == cuartoColmillo && tercero == tercerColmillo && segundo == segundoColmillo && primero == primerColmillo) {
                        int contador = 0;
                        vampiros[contador] = numero1;
                        System.out.println("Los números vampiro son: " + numero1 + ".");
                        contador++;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        SecuenciaFibonache secuencia = new SecuenciaFibonache();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>secuencia Fibonnacci<<<<<<<<<<<<<<<<<<<<<<<<<");
        secuencia.Fibonnacci();
        System.out.println("*>>>>>>>>>>>>>>>>>>>>>>>Ejemplo swich<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        secuencia.EjemploSwitch();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>Números vampiro<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        secuencia.NumeroVampiro();
    }
}
/*Ejercicio 8:
(.2) Cree una instrucción switch que imprima un mensaje para cada case. y coloque el switch dentro de un
bucle for en el que se pruebe cada uno de los vaJores de case. Incluya una instrucción break después de
cada case y compruebe los resultados; a continuación. elimine las lnstrucciones break y vea lo que suce-
de.
Ejercicio 9: (4) Una secuencia de Fibonnacci es la secuencia de números l. 1, 2. 3. 5, 8. 13, 21. 34. etc., donde cada
             numero (a partir del tercero) es la suma de los dos anteriores. Cree un método que tome un entero como
             argumento y muestre esa cantidad de números de Fibonacci comenzando por el principio de la secuencia;
             por eJemplo, si ejecuta java Fibonacci 5 (donde Fibonacci es el nombre de la clase) la salida sería: 1, 1.
             2. 3, 5
EJercicio 10: (5) Un número vampiro tiene un número par de dígitos y se forma multiplicando una pareja de números
                 que contengan la mitad del numero de digitos del resultado. Los dígitos se toman del número original en
                cualquier orden. No se permiten utilizar parejas de ceros finales Entre los ejemplos tendríamos:
               l260 = 21 * 60
               1827 = 21 * 87
               2187 = 27 * 81
               los 7 numeros que tienen que salir son:
               1260, 1395, 1435, 1530, 1827, 2187 y 6880.
               Escriba un programa que determine todos los números vampiro de 4 dígitos (problema sugerido por Dan
               Forhan).
*/