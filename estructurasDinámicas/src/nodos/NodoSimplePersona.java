
package nodos;

import clases.Persona;

/**
 *
 * @author C20177
 */
public class NodoSimplePersona {
    private Persona persona;
    private NodoSimplePersona siguiente;

    public NodoSimplePersona(Persona persona) {
        this.persona = persona;
        this.siguiente=null;
    }

    public NodoSimplePersona(Persona persona, NodoSimplePersona siguiente) {
        this.persona = persona;
        this.siguiente = siguiente;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public NodoSimplePersona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimplePersona siguiente) {
        this.siguiente = siguiente;
    }
    
}
