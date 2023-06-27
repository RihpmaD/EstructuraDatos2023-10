/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesbinarios;

/**
 *
 * @author billy
 */
public class NodoArbolEntero {
    private int dato;
    private NodoArbolEntero izquierda, derecha;

    public NodoArbolEntero(int dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }


    public int getDato() {
        return dato;
    }

    public NodoArbolEntero getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbolEntero izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbolEntero getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbolEntero derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}
