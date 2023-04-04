
package algoritmosordenamiento;

import ordenamiento.Ordenamiento;

public class AlgoritmosOrdenamiento {
    
    public static void main(String[] args) {
        int arreglo[];
        arreglo=new int[(int)(Math.random()*20)];
        Ordenamiento ordenamiento=new Ordenamiento();
        ordenamiento.ingreso(arreglo);
        System.out.println("Mostrar Arreglo Original");
        ordenamiento.mostrar(arreglo);
        //ordenamiento.burbuja(arreglo);
        //ordenamiento.seleccion(arreglo);
        ordenamiento.insercion(arreglo);
        System.out.println("Mostrar Arreglo Ordenado");
        ordenamiento.mostrar(arreglo);
    }
}
