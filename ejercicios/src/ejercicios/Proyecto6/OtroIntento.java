package ejercicios.Proyecto6;

import java.util.Scanner;

public class OtroIntento {

    String caracteres;

    class Nodo {
        int info;
        Nodo siguiente;
        char simbolo;

    }

    private Nodo raiz;

    OtroIntento() {
        raiz = null;
    }

    private void carga() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena a analizar");
        caracteres = teclado.nextLine();
    }

    public int extraer() {
        if (raiz != null) {//si la lista no esta vacia( != )
            int informacion = raiz.info;//guardamos la informacion del primer Nodo en una variable local
            raiz = raiz.siguiente;//Avanzamos raiz al segundo nodo de la lista, ya que borraremos el primero
            return informacion;//retornamos la informacion
        } else {
            return Integer.MAX_VALUE;
        }
    }



    public void insertar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        if (raiz == null) {
            nuevo.siguiente = null;
            raiz = nuevo;
        } else {
            nuevo.siguiente = raiz;
            raiz = nuevo;
        }
    }

    public void primerIntentoParentesis() {
        int largo = caracteres.length();
        char c = '*';
        int i = 0;
        while (i < largo){
            if (c == '(' || c == '[' || c == '{') {
              //  raiz.push(1);
            } else {
                if (c == ')') {
                    extraer();
                }
                //faltan comentarios
            }
        }
    }

    public static void main(String[] args) {
        OtroIntento intento = new OtroIntento();
        intento.carga();
    }

}
