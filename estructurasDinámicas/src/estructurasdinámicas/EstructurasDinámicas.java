package estructurasdinámicas;

import java.util.Scanner;
import listas.ListaSimpleEntero;

/**
 *
 * @author C20177
 */
public class EstructurasDinámicas {

    public static void main(String[] args) {
        ListaSimpleEntero lista = new ListaSimpleEntero();
        Scanner sc = new Scanner(System.in);
        int valor, op, elemento;
        char opc;
        do {
            System.out.println("\nMANIPULACIÓN DE LISTAS\n");
            System.out.println("1 - Ingresar valores");
            System.out.println("2 - Ingresar en posicion");
            System.out.println("3 - Mostrar lista");
            System.out.println("4 - Insertar antes de un elemento");
            System.out.println("5 - Insertar despues de un elemento");
            System.out.println("6 - Eliminar elemento");
            System.out.println("7 - Eliminar posicion");
            System.out.println("8 - Salir");
            System.out.println("----------------------------");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    do {
                        System.out.print("Ingrese valor: ");
                        valor = sc.nextInt();
                        lista.insertarCola(valor);
                        System.out.print("Desea ingresar otro elemento: ");
                        opc = sc.next().toUpperCase().charAt(0);
                    } while (opc != 'N');
                    break;
                case 2:
                    int posicion;
                    System.out.print("Ingrese valor: ");
                    valor = sc.nextInt();
                    System.out.print("Ingrese posicion: ");
                    posicion = sc.nextInt();
                    lista.insertarposicion(posicion, valor);
                    break;
                case 3:
                    System.out.println("\nLISTA INGRESADA");
                    lista.mostrarLista();
                    break;
                case 4:
                    System.out.print("Ingrese valor del elemento a buscar: ");
                    elemento = sc.nextInt();
                    System.out.print("Ingrese el valor a insertar: ");
                    valor=sc.nextInt();
                    lista.insertarAntesElemento(elemento, valor);
                    break;
                case 5:
                    System.out.print("Ingrese valor del elemento a buscar: ");
                    elemento = sc.nextInt();
                    System.out.print("Ingrese el valor a insertar: ");
                    valor=sc.nextInt();
                    lista.insertarDespuesElemento(elemento, valor);
                    break;
                case 6:
                    System.out.print("Ingrese el valor a eliminar: ");
                    valor=sc.nextInt();
                    lista.eliminarElemento(valor);
                    break;
                case 7:
                    System.out.print("Ingrese posicion a eliminar: ");
                    posicion=sc.nextInt();
                    lista.eliminarPosicion(posicion);
                case 8:
                    System.out.println("Gracias por usar el sistema...");
                    break;
                default:
                    System.out.println("Opcion ingresada incorrecta...");
            }
        } while (op != 8);

    }

}
