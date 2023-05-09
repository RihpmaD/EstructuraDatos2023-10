package listas;

import nodos.NodoDobleEntero;

/**
 *
 * @author C20177
 */
public class ListaDobleEntero {

    private NodoDobleEntero cabeza;
    private NodoDobleEntero cola;
    private int tam;

    public ListaDobleEntero() {
        this.cabeza = null;
        this.cola = null;
    }

    public boolean esVacio() {
        return (this.cabeza == null && this.cola == null);
    }

    public void insertarCabeza(int valor) {
        NodoDobleEntero nuevo = new NodoDobleEntero(valor);
        if (esVacio()) {
            System.out.println("Lista vacia, se acaba de insertar...");
            this.cabeza = nuevo;
            this.cola = nuevo;
        } else {
            nuevo.setSiguiente(this.cabeza);
            this.cabeza.setAnterior(nuevo);
            this.cabeza = nuevo;
        }
        this.tam++;
    }

    public void insertarCola(int valor) {
        NodoDobleEntero nuevo = new NodoDobleEntero(valor);
        if (esVacio()) {
            System.out.println("Lista vacia, se acaba de insertar...");
            this.cabeza = nuevo;
            this.cola = nuevo;
        } else {
            nuevo.setAnterior(this.cola);
            this.cola.setSiguiente(nuevo);
            this.cola = nuevo;
        }
        this.tam++;
    }

    public void insertarCabezaPosicionDespues(int posicion, int valor) {
        NodoDobleEntero nuevo = new NodoDobleEntero(valor);
        if (esVacio()) {
            if (posicion < 0 || posicion > this.tam) {
                System.out.println("No se encuentra dicho elemento...");
            } else {
                System.out.println("Se inserto en la cabeza...");
                this.cabeza = nuevo;
                this.cola = nuevo;
                this.tam++;
            }
        } else {
            NodoDobleEntero temp = this.buscarCabezaPosicion(posicion);
            if (temp != this.cola) {
                nuevo.setSiguiente(temp.getSiguiente());
                nuevo.setAnterior(temp);
                temp.getSiguiente().setAnterior(nuevo);
                temp.setSiguiente(nuevo);
                this.tam++;
            }else{
                this.insertarCola(valor);
            }
        }
    }

    public NodoDobleEntero buscarCabezaPosicion(int posicion) {
        NodoDobleEntero temp = this.cabeza;
        int contador = 0;
        while (contador < this.tam) {
            if (contador == posicion) {
                return temp;
            }
            temp = temp.getSiguiente();
            contador++;
        }
        return null;
    }

    public void mostrarListaCabeza() {
        if (esVacio()) {
            System.out.println("Lista vacia...");
        } else {
            NodoDobleEntero temp = this.cabeza;
            while (temp.getSiguiente() != null) {
                System.out.print(temp.getValor() + ", ");
                temp = temp.getSiguiente();
            }
            System.out.print(temp.getValor() + ". ");
            System.out.println("");
        }
    }

    public int getTam() {
        return tam;
    }
}
