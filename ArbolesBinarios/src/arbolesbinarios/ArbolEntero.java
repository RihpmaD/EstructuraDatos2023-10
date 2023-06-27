/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesbinarios;

/**
 *
 * @author billy
 */
public class ArbolEntero {
    private NodoArbolEntero raiz;

    public ArbolEntero() {

    }

    public boolean existe(int busqueda) {
        return existe(this.raiz, busqueda);
    }

    private boolean existe(NodoArbolEntero n, int busqueda) {
        if (n == null) {
            return false;
        }
        if (n.getDato() == busqueda) {
            return true;
        } else if (busqueda < n.getDato()) {
            return existe(n.getIzquierda(), busqueda);
        } else {
            return existe(n.getDerecha(), busqueda);
        }

    }

    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new NodoArbolEntero(dato);
        } else {
            this.insertar(this.raiz, dato);
        }
    }

    private void insertar(NodoArbolEntero padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new NodoArbolEntero(dato));
            } else {
                this.insertar(padre.getDerecha(), dato);
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new NodoArbolEntero(dato));
            } else {
                this.insertar(padre.getIzquierda(), dato);
            }
        }
    }
}
