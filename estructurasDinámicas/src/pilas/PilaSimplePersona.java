package pilas;

import clases.Persona;
import nodos.NodoSimplePersona;

/**
 *
 * @author C20177
 */
public class PilaSimplePersona {

    private NodoSimplePersona cabeza;
    private int tam;

    public PilaSimplePersona() {
        this.cabeza = null;
        this.tam = 0;
    }

    public boolean esVacio() {
        return (this.cabeza == null);
    }

    public void push(Persona persona) {
        if (esVacio()) {
            NodoSimplePersona nuevaPersona = new NodoSimplePersona(persona);
            this.cabeza = nuevaPersona;
        } else {
            NodoSimplePersona nuevaPersona = new NodoSimplePersona(persona, this.cabeza);
            this.cabeza = nuevaPersona;
        }
        tam++;
    }

    public void pop() {
        if (esVacio()) {
            System.out.println("La pila esta vacia");
        } else {
            Persona p = this.cabeza.getPersona();
            this.cabeza = cabeza.getSiguiente();
            System.out.println("Persona atendida y retirada: " + p);
            this.mostrar();
        }
        this.tam--;
    }

    public NodoSimplePersona mostrar() {
        if (!esVacio()) {
            return this.cabeza;
        } else {
            return null;
        }
    }

    

    public int buscarDni(String dni) {
        int distancia=0;
        NodoSimplePersona temp = this.cabeza;
        while (temp.getSiguiente() != null) {
            if (temp.getPersona().getDni().equals(dni)) {
                return distancia;
            }
            distancia++;
            temp = temp.getSiguiente();
        }
        if (temp.getPersona().getDni().equals(dni)) {
            return distancia;
        } else {
            return 0;
        }
    }
    
}
