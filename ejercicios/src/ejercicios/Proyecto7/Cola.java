package ejercicios.Proyecto7;

public class Cola {
    class Nodo {
        int informacion;
        Nodo siguiente;
    }
    private Nodo raiz,fondo;
    public Cola() {
        raiz = null;
        fondo = null;
    }

    public boolean vacia() {
        if (raiz == null)
            return true;
        else
            return false;
    }

    public void insertar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.informacion = x;
        nuevo.siguiente = null;
        if (vacia()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.siguiente = nuevo;
            fondo = nuevo;
        }
    }
    public int extraer() {
        if (! vacia()) {
            int informacion = raiz.informacion;
            if (raiz == fondo) {
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.siguiente;
            }
            return informacion;
        } else
            return Integer.MAX_VALUE;
    }

    public void imprimir() {
        Nodo reco = raiz;
        System.out.println("Listado de los elementos de la raiz");
        while (reco != null) {
            System.out.print(reco.informacion + "-");
            reco = reco.siguiente;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Cola cola = new Cola();
        cola.vacia();
        /*cola.insertar(5);
        cola.insertar(50);
        cola.insertar(200);*/
        cola.imprimir();
        cola.extraer();
        cola.imprimir();
    }

}
/*Confeccionaremos un programa que permita administrar una lista tipo cola.
Desarrollaremos los métodos de insertar, extraer, vacia e imprimir.*/