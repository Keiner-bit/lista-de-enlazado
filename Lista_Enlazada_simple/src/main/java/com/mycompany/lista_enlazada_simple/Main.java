package com.mycompany.lista_enlazada_simple;

public class Main {

    public static void main(String[] args) {

        Lista_Enlazada_simple lista = new Lista_Enlazada_simple();

        System.out.println("Lista enlazada simple");

        // Insertar nodos
        lista.Insertar(10);
        lista.Insertar(20);
        lista.Insertar(30);
        lista.Insertar(40);
        lista.Insertar(50);

        lista.mostrar();

        // Tamaño
        System.out.println("Tamaño de la lista: " + lista.tamanio());

        // Buscar
        System.out.println("Buscar en la lista el numero 30: " + lista.buscar(30));
        System.out.println("Buscar en la lista el numero 50: " + lista.buscar(50));

        // Eliminar
        System.out.println("Eliminar en la lista el numero 40");
        lista.eliminar(40);

        lista.mostrar();

       // Anatomía del nodo
System.out.println("Ver la anatomia del nodo");

Nodo n1 = new Nodo(100); 
Nodo n2 = new Nodo(200);
Nodo n3 = new Nodo(300);

// Enlaces entre nodos
n1.ENLACE = n2;
n2.ENLACE = n3;

// Mostrar datos
System.out.println("n1 Datos: " + n1.dato);
System.out.println("n1 Enlace: " + n1.ENLACE.dato);
System.out.println("n1 Enlace Enlace: " + n1.ENLACE.ENLACE.dato);

// Mostrar cadena completa
System.out.println("Cadena del enlace: " + n1.dato + " -> " + n2.dato + " -> " + n3.dato + " -> null");{
        }
    }
}