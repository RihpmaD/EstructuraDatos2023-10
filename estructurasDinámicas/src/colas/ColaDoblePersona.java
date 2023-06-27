
package colas;

import clases.Persona;
import nodos.NodoDoblePersona;

/**
 *
 * @author C20177
 */
public class ColaDoblePersona {
    private NodoDoblePersona cabeza;
    private NodoDoblePersona cola;
    private int tam;
    
    public ColaDoblePersona() {
        this.cabeza = null;
        this.cola = null;
        this.tam=0;
    }

    public boolean esVacio() {
        return (this.cabeza == null && this.cola == null);
    }
    
    public void encolar(Persona persona){
        NodoDoblePersona nuevo = new NodoDoblePersona(persona);
        if (esVacio()) {
            System.out.println("Cola vacia, se acaba de encolar...");
            this.cabeza = nuevo;
            this.cola = nuevo;
        } else {
            nuevo.setAnterior(this.cola);
            this.cola.setSiguiente(nuevo);
            this.cola = nuevo;
        }
        this.tam++;
    }
    
    public void desencolar(){
        if(esVacio()){
            System.out.println("Cola vacía...");
        }else{
            this.cabeza=this.cabeza.getSiguiente();
            this.cabeza.getAnterior().setSiguiente(null);
            this.cabeza.setAnterior(null);
            this.tam--;
        }
    }
    
    public NodoDoblePersona mostrar(){
        if(!esVacio()){
            return this.cabeza;
        }
        return null;
    }
}
