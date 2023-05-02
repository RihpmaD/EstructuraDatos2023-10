
package nodos;

/**
 *
 * @author C20177
 */
public class NodoSimpleEntero {
    private int valor;
    private NodoSimpleEntero siguiente;

    public NodoSimpleEntero(int valor) {
        this.valor = valor;
        this.siguiente=null;
    }

    public NodoSimpleEntero(int valor, NodoSimpleEntero siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoSimpleEntero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimpleEntero siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
