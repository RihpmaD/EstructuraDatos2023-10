package ordenamiento;

import clases.Persona;

public class Ordenamiento {

    public void ingresoAleatorioEntero(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 50);
        }
    }
    
    public void mostrarPersona(Persona arreglo[]){
        System.out.print("\n");
        for (Persona arreglo1 : arreglo) {
            System.out.println(arreglo1);
        }
        System.out.print("\n");
    }

    public void mostrarEntero(int arreglo[]) {
        System.out.print(" | ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " | ");
        }
        System.out.print("\n");
    }

    public void burbuja(int arreglo[]) {
        for (int i = 1; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    public void seleccionAscendenteEntero(int arreglo[]) {
        int i = 0, min, j;
        while (i < arreglo.length - 1) {
            min = i;
            j = i + 1;
            while (j < arreglo.length) {
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                }
                j++;
            }
            int aux = arreglo[min];
            arreglo[min] = arreglo[i];
            arreglo[i] = aux;
            i++;
        }
    }
    
    public void seleccionDescendenteEntero(int arreglo[]){
        int i = 0, max, j;
        while (i < arreglo.length - 1) {
            max = i;
            j = i + 1;
            while (j < arreglo.length) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;
                }
                j++;
            }
            int aux = arreglo[max];
            arreglo[max] = arreglo[i];
            arreglo[i] = aux;
            i++;
        }
    }
    
    public void insercionAscendenteEntero(int arreglo[]){
        int indice, j;
        for(int i=1; i<arreglo.length;i++){
            indice=arreglo[i];
            j=i-1;
            while(j>=0 && arreglo[j]>indice){
                arreglo[j+1]=arreglo[j];
                j--;
            }
            arreglo[j+1]=indice;
        }
    }
    
    public void insercionDescendenteEntero(int arreglo[]){
        int indice, j;
        for(int i=1; i<arreglo.length;i++){
            indice=arreglo[i];
            j=i-1;
            while(j>=0 && arreglo[j]<indice){
                arreglo[j+1]=arreglo[j];
                j--;
            }
            arreglo[j+1]=indice;
        }
    }
    
    public void seleccionPersona(Persona arreglo[], int ordenamiento){//1-ASC, 2-DES
        
    }
    
    public void insercionPersona(Persona arreglo[], int ordenamiento){//1-ASC, 2-DES
        
    }
}
