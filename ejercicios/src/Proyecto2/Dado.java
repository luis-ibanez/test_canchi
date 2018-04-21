package Proyecto2;

public class Dado {
    private int valor;

    public void tirar() {
        valor=1+(int)(Math.random()*6);
    }

    public void imprimir() {
        System.out.println("El valor del dado es de: " + valor);
    }

    public int retornarValor() {
        return valor;
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