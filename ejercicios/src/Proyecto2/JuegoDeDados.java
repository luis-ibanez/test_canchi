package Proyecto2;

public class JuegoDeDados {
    private Dado dado1, dado2, dado3;

    public JuegoDeDados() {
    dado1 = new Dado();
    dado2 = new Dado();
    dado3 = new Dado();
    }

    public void jugar() {
        dado1.tirar();
        dado2.tirar();
        dado3.tirar();
        dado1.imprimir();
        dado2.imprimir();
        dado3.imprimir();
        dado1.retornarValor();
        dado2.retornarValor();
        dado3.retornarValor();
        if (dado1.retornarValor() == dado2.retornarValor() && dado1.retornarValor() == dado3.retornarValor()){
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }

    public static void main(String[] args) {
        JuegoDeDados juego = new JuegoDeDados();
        juego.jugar();
    }

}
/*Problema 2:
Plantear un programa que permita jugar a los dados. Las reglas de juego
 son: se tiran tres dados si los tres salen con el mismo valor mostrar
 un mensaje que "gano", sino "perdió".
Lo primero que hacemos es identificar las clases:
Podemos identificar la clase Dado y la clase JuegoDeDados.
Luego los atributos y los métodos de cada clase:
Dado
    atributos
        valor
    métodos
        tirar
        imprimir
        retornarValor

JuegoDeDados
    atributos
        3 Dado (3 objetos de la clase Dado)
    métodos
        constructor
        jugar

Creamos un proyecto en Eclipse llamado: Proyecto2 y dentro del proyecto
creamos dos clases llamadas: Dado y JuegoDeDados.*/