package com.mycompany.lista_enlazada_simple;

public class Lista_Enlazada_simple {

    private Nodo cabeza;

    public Lista_Enlazada_simple(){
        cabeza = null; // lista vacía
    }

    // Insertar dato
    public void Insertar(int dato){ 
        Nodo nuevo = new Nodo(dato);

        if (cabeza == null){
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;

            while (actual.ENLACE != null){ 
                actual = actual.ENLACE;
            }

            actual.ENLACE = nuevo;
        }
    }

    // Eliminar nodo
    public void eliminar(int dato){

        if (cabeza == null) return;

        if (cabeza.dato == dato){
            cabeza = cabeza.ENLACE;
            return;
        }

        Nodo anterior = cabeza;

        while (anterior.ENLACE != null && anterior.ENLACE.dato != dato){
            anterior = anterior.ENLACE;
        }

        if (anterior.ENLACE != null){
            anterior.ENLACE = anterior.ENLACE.ENLACE;
        }
    }

    // Buscar
    public boolean buscar(int dato){

        Nodo actual = cabeza;

        while (actual != null){

            if (actual.dato == dato){
                return true;
            }

            actual = actual.ENLACE;
        }

        return false;
    }

    // Mostrar lista
    public void mostrar(){

        if (cabeza == null){
            System.out.println("Lista esta vacia");
            return;
        }

        Nodo actual = cabeza;

        System.out.print("Cabeza -> ");

        while (actual != null){
            System.out.print(actual.dato + " -> ");
            actual = actual.ENLACE;
        }

        System.out.println("null");
    }

    // Tamaño de la lista
    public int tamanio(){

        int contador = 0;

        Nodo actual = cabeza;

        while (actual != null){
            contador++;
            actual = actual.ENLACE;
        }

        return contador;
    }
}