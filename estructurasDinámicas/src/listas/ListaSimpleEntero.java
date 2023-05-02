package listas;

import nodos.NodoSimpleEntero;

/**
 *
 * @author C20177
 */
public class ListaSimpleEntero {

    private NodoSimpleEntero cabeza;
    private int tam;

    public ListaSimpleEntero() {
        this.cabeza = null;
    }

    public ListaSimpleEntero(NodoSimpleEntero cabeza) {
        this.cabeza = cabeza;
    }

    public boolean esVacio() {
        return this.cabeza == null;
    }

    public void insertarCabeza(int valor) {
        if (esVacio()) {
            NodoSimpleEntero nuevo = new NodoSimpleEntero(valor);
            this.cabeza = nuevo;
        } else {
            NodoSimpleEntero nuevo = new NodoSimpleEntero(valor, cabeza);
            this.cabeza = nuevo;
        }
        this.tam++;
    }

    public void insertarCola(int valor) {
        if (esVacio()) {
            NodoSimpleEntero nuevo = new NodoSimpleEntero(valor);
            this.cabeza = nuevo;
        } else {
            NodoSimpleEntero nuevo = new NodoSimpleEntero(valor);
            NodoSimpleEntero temp = this.cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevo);
        }
    }

    public void mostrarLista() {
        NodoSimpleEntero temp = this.cabeza;
        while (temp.getSiguiente() != null) {
            System.out.print(temp.getValor() + ", ");
            temp = temp.getSiguiente();
        }
        System.out.print(temp.getValor() + ", ");
        System.out.println("");
    }
}
