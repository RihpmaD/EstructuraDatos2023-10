
package nodos;

/**
 *
 * @author C20177
 */
public class NodoDobleEntero {
    private NodoDobleEntero anterior;
    private int valor;
    private NodoDobleEntero siguiente;

    public NodoDobleEntero(int valor) {
        this.anterior=null;
        this.valor = valor;
        this.siguiente=null;
    }

    public NodoDobleEntero(NodoDobleEntero anterior, int valor, NodoDobleEntero siguiente) {
        this.anterior = anterior;
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public NodoDobleEntero getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDobleEntero anterior) {
        this.anterior = anterior;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoDobleEntero getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDobleEntero siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
