package ejercicios.Proyecto7;

public class Cola {

    private Nodo raiz,fondo;
    private int size;

    public Cola() {
        raiz = null;
        fondo = null;
        size = 0;
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
        size ++;
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
            size --;
            return informacion;
        } else
            return Integer.MAX_VALUE;
    }

    public int cantidad() {
        int cant=0;
        Nodo reco=raiz;
        while (reco!=null) {
            cant++;
            reco=reco.siguiente;
        }
        //System.out.println("y esto que mierda hace que nome lodice bien: " + cant);
        return cant;
    }

    public int size(){
        return size;
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
        cola.insertar(5);
        cola.insertar(50);
        cola.insertar(200);
        cola.imprimir();
        cola.extraer();
        cola.imprimir();
        cola.cantidad();
    }

}
/*Confeccionaremos un programa que permita administrar una lista tipo cola.
Desarrollaremos los métodos de insertar, extraer, vacia e imprimir.*/