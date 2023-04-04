package ordenamiento;

public class Ordenamiento {

    public void ingreso(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 50);
        }
    }

    public void mostrar(int arreglo[]) {
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

    public void seleccion(int arreglo[]) {
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
    
    public void insercion(int arreglo[]){
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
}
