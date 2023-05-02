
package estructurasdinámicas;

import java.util.Scanner;
import listas.ListaSimpleEntero;

/**
 *
 * @author C20177
 */
public class EstructurasDinámicas {
    
    public static void main(String[] args) {
        ListaSimpleEntero lista=new ListaSimpleEntero();
        Scanner sc=new Scanner(System.in);
        int valor;
        char opc;
        System.out.println("MANIPULACIÓN DE LISTAS\n");
        do{
            System.out.print("Ingrese valor: ");
            valor=sc.nextInt();
            lista.insertarCola(valor);
            System.out.print("Desea ingresar otro elemento: ");
            opc=sc.next().toUpperCase().charAt(0);
        }while(opc!='N');
        System.out.println("\nLISTA INGRESADA");
        lista.mostrarLista();
    }
    
}
