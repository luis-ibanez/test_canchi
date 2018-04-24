package ejercicios.Proyecto5;

public class Pila {

    class Nodo {  // se crea la pila
        int info;
        Nodo sig; // se crea el puntero que marca al siguiente Nodo
    }


    private Nodo raiz; // se crea el puntero que marca la primera casilla del Nodo

    public Pila() {
        raiz = null; // para empezar el Nodo esta vacio (null)
    }

    public void insertar(int x) {//metodo para insertar elementos en la pila. En este caso enteros
        Nodo nuevo;         //creacion del Nodo en dos pasos (se puede hacer en uno)
        nuevo = new Nodo(); //Nodo nuevo = new Nodo(); Aki ya esta creado el nodo
        nuevo.info = x; //En el campo info almacenamos lo que llegue al parámetro X
        if (raiz == null) { //si raiz esta vacio
            nuevo.sig = null; //sig indica que no hay otro Nodo detras
            raiz = nuevo;  // y el puntero raiz y nuevo apuntan a la misma casilla
        } else {            // si la lista no esta vacia
            nuevo.sig = raiz;  // el puntero sig marca al Nodo  que apunta la raiz actualmente
            raiz = nuevo;  // y raiz y Nodo siguen apuntando a la misma casilla
        }
    }

    public int extraer() {//El objetivo del método extraer es retornar la información del primer nodo y además borrarlo de la lista.
        if (raiz != null) {//si la lista no esta vacia( != )
            int informacion = raiz.info;//guardamos la informacion del primer Nodo en una variable local
            raiz = raiz.sig;//Avanzamos raiz al segundo nodo de la lista, ya que borraremos el primero
            return informacion;//retornamos la informacion
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public void imprimir() {//creamos metodo repetitivo para poder imprimir la lista completa

        Nodo reco = raiz;//definimos variable local para que apunte a la primera casilla de la lista
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco != null) {//mientra que la lista no este vacia
            System.out.print(reco.info + "-");//imprime posicion
            reco = reco.sig;//y avanza un puesto dentro de la lista
        }                   //cuando reco apunta a null se sale del while
        System.out.println();
    }

    public void cantidadDeNodos() {
        int contador = 0; //para contar el numero de nodos que tiene la pila
        Nodo reco = raiz;
        while (reco != null) { //metodo para recorrer todo el nodo
            reco = reco.sig;
            contador++;   // cada vez lo recorre se suma un contador
        }
        System.out.println("El numero de nodos es de: " + contador);
    }

    public void siLaListaEstaVacia() {
        int contador = 0; //lo mismo que el metodo anterior
        Nodo reco = raiz;
        while (reco != null) {
            reco = reco.sig;
            contador++;
        }
        if (contador == 0)  // si no se llega a sumar nada el nodo esta vacio
        System.out.println("El nodo esta vacio");
    }

    public static void main(String[] args) {
        Pila pila1 = new Pila();
        pila1.insertar(10);//insertar numeros
        pila1.insertar(40);
        pila1.insertar(3);
        pila1.imprimir();
        System.out.println("Extraemos de la pila:" + pila1.extraer());//extraer numeros
        pila1.imprimir();
        pila1.cantidadDeNodos();
        pila1.siLaListaEstaVacia();
    }

}
/*Problema 1:

Confeccionar una clase que administre una lista tipo pila (se debe poder
 insertar, extraer e imprimir los datos de la pila)
 Problema 2:

Agregar a la clase Pila un método que retorne la cantidad de nodos y otro que indique si esta vacía.*/




















