package ejercicios.ProyectoCola2;

public class ColaNueva {
    private NodoCola inicio, loUltimo;
    private int tamaño;

    public ColaNueva() {
       inicio = null;
       loUltimo = null;
       tamaño = 0;
    }

    public boolean estaVacia() {
        if (inicio == null)
            return true;
        else
            return false;

    }

    public void agregar(int x) {
        NodoCola nuevo = new NodoCola();
        nuevo.laInformacion = x;
        nuevo.loSiguiente = null;
        if (estaVacia()) {
            inicio = nuevo;
            loUltimo = nuevo;
        } else {
            loUltimo.loSiguiente = nuevo;
            loUltimo = nuevo;
        }
    }

    public int sacar() {
        if (! estaVacia()) {
            int laInformacion = inicio.laInformacion;
            if (inicio == loUltimo){
                inicio = null;
                loUltimo = null;
            } else {
                inicio = inicio.loSiguiente;
            }
            tamaño --;
            return laInformacion;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public int recalcularTamaño() {
        int laCantidad = 0;
        NodoCola recorerElNodo = inicio;
        while (recorerElNodo != null) {
            laCantidad ++;
            recorerElNodo = recorerElNodo.loSiguiente;
        }
        return laCantidad;
    }

    public int tamaño() {return tamaño;}

    public void imprimirCola() {
        NodoCola recorerLaCola = inicio;
        System.out.println("Listado de los elementos del NodoCola");
        while (recorerLaCola != null) {
            System.out.print(recorerLaCola.laInformacion + "-");
            recorerLaCola = recorerLaCola.loSiguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ColaNueva colaNueva = new ColaNueva();
        colaNueva.estaVacia();
        colaNueva.agregar(5);
        colaNueva.agregar(50);
        colaNueva.imprimirCola();
        colaNueva.sacar();
        colaNueva.recalcularTamaño();
        colaNueva.imprimirCola();
    }

}
