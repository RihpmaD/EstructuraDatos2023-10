
package nodos;

import clases.Persona;

/**
 *
 * @author C20177
 */
public class NodoDoblePersona {
    private NodoDoblePersona anterior;
    private Persona persona;
    private NodoDoblePersona siguiente;

    public NodoDoblePersona(Persona persona) {
        this.anterior=null;
        this.persona = persona;
        this.siguiente=null;
    }

    public NodoDoblePersona(NodoDoblePersona anterior, Persona persona, NodoDoblePersona siguiente) {
        this.anterior = anterior;
        this.persona = persona;
        this.siguiente = siguiente;
    }

    public NodoDoblePersona getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoblePersona anterior) {
        this.anterior = anterior;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public NodoDoblePersona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoblePersona siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
