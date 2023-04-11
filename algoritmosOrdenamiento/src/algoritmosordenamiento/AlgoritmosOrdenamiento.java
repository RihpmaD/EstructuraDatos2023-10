
package algoritmosordenamiento;

import clases.Persona;
import ordenamiento.Ordenamiento;

public class AlgoritmosOrdenamiento {
    
    public static void main(String[] args) {
        Persona arregloPersona[]=new Persona[5];
        Ordenamiento ordenamiento=new Ordenamiento();
        arregloPersona[0]=new Persona(152, "Juan Perez", 1500);
        arregloPersona[1]=new Persona(845, "María Garcia", 1200);
        arregloPersona[2]=new Persona(12, "Fernando Castillo", 2500);
        arregloPersona[3]=new Persona(345, "Juana Peñaloza", 3500);
        arregloPersona[4]=new Persona(192, "Jeremi Castro", 1000);
        System.out.println("Mostrar Arreglo Original");
        ordenamiento.mostrarPersona(arregloPersona);
        //MÉTODO DE ORDENAMIENTO
        ordenamiento.insercionPersona(arregloPersona, 2);
        System.out.println("Mostrar Arreglo Ordenado");
        ordenamiento.mostrarPersona(arregloPersona);
    }
}
