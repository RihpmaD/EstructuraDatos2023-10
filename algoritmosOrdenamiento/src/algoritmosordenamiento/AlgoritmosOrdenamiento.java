
package algoritmosordenamiento;

import busqueda.Busqueda;
import clases.Persona;
import java.util.Scanner;
import ordenamiento.Ordenamiento;

public class AlgoritmosOrdenamiento {
    
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        Busqueda busqueda=new Busqueda();
        int valor;
        int arreglo[]=new int[10];
        Persona arregloPersona[]=new Persona[5];
        Ordenamiento ordenamiento=new Ordenamiento();
        arregloPersona[0]=new Persona(152, "Juan Perez", 1500);
        arregloPersona[1]=new Persona(845, "María Garcia", 1200);
        arregloPersona[2]=new Persona(12, "Fernando Castillo", 2500);
        arregloPersona[3]=new Persona(345, "Juana Peñaloza", 3500);
        arregloPersona[4]=new Persona(192, "Jeremi Castro", 1000);
        System.out.println("Mostrar Arreglo Original");
        ordenamiento.ingresoAleatorioEntero(arreglo);
        ordenamiento.mostrarEntero(arreglo);
        //MÉTODO DE ORDENAMIENTO
        ordenamiento.shellAscendenteEntero(arreglo);
        System.out.println("Mostrar Arreglo Ordenado");
        ordenamiento.mostrarEntero(arreglo);
        System.out.println("\nBUSCAR ELEMENTO");
        System.out.print("Ingrese valor buscado: ");
        valor=val.nextInt();
        if(busqueda.binarioEntero(arreglo, valor)!=-1)
            System.out.println("La posición es: "+busqueda.binarioEntero(arreglo, valor));
        else
            System.out.println("El valor buscado no se encuentra en el arreglo...");
    }
}
