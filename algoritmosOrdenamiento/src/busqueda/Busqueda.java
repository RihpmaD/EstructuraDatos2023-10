
package busqueda;

public class Busqueda {
    public int binarioEntero(int arreglo[], int elemento){
        int mitad, inferior=0;
        int superior=arreglo.length-1;
        int contador=0;
        do{
            contador++;
            mitad=(inferior+superior)>>>1;
            if(elemento>arreglo[mitad])
                inferior=mitad+1;
            else
                superior=mitad-1;
        }while(arreglo[mitad]!=elemento && inferior<=superior);
        if(arreglo[mitad]==elemento)
            return mitad;
        else
            return -1;
    }
}
