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
            NodoSimpleEntero nuevo = new NodoSimpleEntero(valor, this.cabeza);
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
        this.tam++;
    }

    public void insertarposicion(int posicion, int valor) {
        int contador = 0;
        if (esVacio() || posicion <= 0 || posicion > this.tam) {
            if (posicion == 0) {
                this.insertarCabeza(valor);
                System.out.println("Se inserto en la cabeza...");
                this.tam++;
            } else {
                System.out.println("No se puede insertar el elemento en la posicion " + posicion);
            }
        } else {
            NodoSimpleEntero nuevo = new NodoSimpleEntero(valor);
            NodoSimpleEntero temp = this.cabeza;
            NodoSimpleEntero actual = this.cabeza;
            NodoSimpleEntero siguiente = this.cabeza;
            while (contador != posicion) {
                actual = temp;
                siguiente = temp.getSiguiente();
                temp = temp.getSiguiente();
                contador++;
            }
            actual.setSiguiente(nuevo);
            nuevo.setSiguiente(siguiente);
            this.tam++;
        }
    }

    public void insertarAntesElemento(int elemento, int valor) {
        if (esVacio()) {
            System.out.println("No existe elementos en la lista...");
        } else {
            if (this.buscarElementoEstado(elemento)) {
                NodoSimpleEntero nuevo = new NodoSimpleEntero(valor);
                NodoSimpleEntero anterior = this.buscarElementoAnterior(elemento);
                NodoSimpleEntero temp = this.buscarElemento(elemento);
                if (temp == this.cabeza) {
                    nuevo.setSiguiente(this.cabeza);
                    this.cabeza = nuevo;
                } else {
                    anterior.setSiguiente(nuevo);
                    nuevo.setSiguiente(temp);
                }
                this.tam++;
            } else {
                System.out.println("Elemento no encontrado en la lista...");
            }
        }
    }

    public void insertarDespuesElemento(int elemento, int valor) {
        if (esVacio()) {
            System.out.println("No existe elementos en la lista...");
        } else {
            if (this.buscarElementoEstado(elemento)) {
                NodoSimpleEntero nuevo = new NodoSimpleEntero(valor);
                NodoSimpleEntero temp = this.buscarElemento(elemento);
                if (temp.getSiguiente() != null) {
                    nuevo.setSiguiente(temp.getSiguiente());
                    temp.setSiguiente(nuevo);
                } else {
                    temp.setSiguiente(nuevo);
                }
                this.tam++;
            } else {
                System.out.println("Elemento no encontrado en la lista...");
            }
        }

    }

    public void eliminarElemento(int valor) {
        if (esVacio()) {
            System.out.println("Lista vacia, no se puede eliminar elemento...");
        } else {
            if (this.buscarElementoEstado(valor)) {
                NodoSimpleEntero elemento = this.buscarElemento(valor);
                NodoSimpleEntero anterior = this.buscarElementoAnterior(valor);
                if (elemento == this.cabeza) {
                    this.cabeza = elemento.getSiguiente();
                } else if (elemento.getSiguiente() == null) {
                    anterior.setSiguiente(null);
                } else {
                    anterior.setSiguiente(elemento.getSiguiente());
                }
                this.tam--;
            } else {
                System.out.println("Elemento no encontrado en la lista...");
            }
        }
    }
    
    public void eliminarPosicion(int posicion){
        if (esVacio()) {
            System.out.println("Lista vacia, no se puede eliminar elemento...");
        } else {
            if (posicion<0 || posicion>this.tam) {
                System.out.println("Posicion no existente en la lista...");
            } else {
                NodoSimpleEntero elemento = this.buscarPosicion(posicion);
                NodoSimpleEntero anterior = this.buscarPosicionAnterior(posicion);
                if (elemento == this.cabeza) {
                    this.cabeza = elemento.getSiguiente();
                } else if (elemento.getSiguiente() == null) {
                    anterior.setSiguiente(null);
                } else {
                    anterior.setSiguiente(elemento.getSiguiente());
                }
                this.tam--;
            }
        }
    }
    
    public NodoSimpleEntero buscarPosicion(int posicion){
        int contador=0;
        NodoSimpleEntero temp = this.cabeza;
        while(contador<posicion){
            temp=temp.getSiguiente();
            contador++;
        }
        return temp;
    }
    
    public NodoSimpleEntero buscarPosicionAnterior(int posicion){
        int contador=0;
        NodoSimpleEntero temp=this.cabeza;
        NodoSimpleEntero anterior=null;
        while(contador<posicion){
            anterior=temp;
            temp=temp.getSiguiente();
            contador++;
        }
        return anterior;
    }

    public NodoSimpleEntero buscarElemento(int valor) {
        NodoSimpleEntero temp = this.cabeza;
        while (temp.getSiguiente() != null) {
            if (temp.getValor() == valor) {
                return temp;
            }
            temp = temp.getSiguiente();
        }
        if (temp.getValor() == valor) {
            return temp;
        } else {
            return null;
        }
    }

    public NodoSimpleEntero buscarElementoAnterior(int valor) {
        NodoSimpleEntero temp = this.cabeza;
        NodoSimpleEntero anterior = null;
        while (temp.getSiguiente() != null) {
            if (temp.getValor() == valor) {
                return anterior;
            }
            anterior = temp;
            temp = temp.getSiguiente();
        }
        if (temp.getValor() == valor) {
            return anterior;
        } else {
            return null;
        }
    }

    public boolean buscarElementoEstado(int valor) {
        NodoSimpleEntero temp = this.cabeza;
        while (temp.getSiguiente() != null) {
            if (temp.getValor() == valor) {
                return true;
            }
            temp = temp.getSiguiente();
        }
        return temp.getValor() == valor;
    }

    public void mostrarLista() {
        if (esVacio()) {
            System.out.println("Lista vacia...");
        } else {
            NodoSimpleEntero temp = this.cabeza;
            while (temp.getSiguiente() != null) {
                System.out.print(temp.getValor() + ", ");
                temp = temp.getSiguiente();
            }
            System.out.print(temp.getValor() + ", ");
            System.out.println("");
        }
    }
}
