package estructurasdinámicas;

import java.util.Scanner;
import listas.ListaDobleEntero;

/**
 *
 * @author C20177
 */
public class MenuDoble {

    public static void main(String[] args) {
        ListaDobleEntero listaDoble = new ListaDobleEntero();
        Scanner sc = new Scanner(System.in);
        int valor, op, elemento;
        char opc;
        do {
            System.out.println("\nMANIPULACIÓN DE LISTAS DOBLES\n");
            System.out.println("1 - Insertar Cabeza");
            System.out.println("2 - Insertar Cola");
            System.out.println("3 - Insertar Posicion");
            System.out.println("4 - Mostrar Lista Cabeza");
            System.out.println("5 - Mostrar Tamaño Lista");
            System.out.println("6 - ");
            System.out.println("7 - Eliminar posicion");
            System.out.println("8 - Salir");
            System.out.println("----------------------------");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    do {
                        System.out.println("\nINSERTAR ELEMENTO CABEZA");
                        System.out.print("Ingrese el valor a insertar: ");
                        valor = sc.nextInt();
                        listaDoble.insertarCabeza(valor);
                        System.out.print("Desea ingresar otro elemento: ");
                        opc = sc.next().toUpperCase().charAt(0);
                    } while (opc != 'N');
                    break;
                case 2:
                    do {
                        System.out.println("\nINSERTAR ELEMENTO COLA");
                        System.out.print("Ingrese el valor a insertar: ");
                        valor = sc.nextInt();
                        listaDoble.insertarCola(valor);
                        System.out.print("Desea ingresar otro elemento: ");
                        opc = sc.next().toUpperCase().charAt(0);
                    } while (opc != 'N');
                    break;
                case 3:
                    System.out.println("\nINSERTAR ELEMENTO DESPUES POSICION CABEZA");
                    System.out.print("Ingrese posicion a insertar: ");
                    elemento=sc.nextInt();
                    System.out.print("Ingrese el valor a insertar: ");
                    valor = sc.nextInt();
                    listaDoble.insertarCabezaPosicionDespues(elemento, valor);
                    break;
                case 4:
                    System.out.println("\nLISTA DE ELEMENTOS - CABEZA");
                    listaDoble.mostrarListaCabeza();
                    break;
                case 5:
                    System.out.println("\nTAMAÑO DE LISTA");
                    System.out.println("El tamaño de la lista es: "+listaDoble.getTam());
                    break;
                case 6:
                    System.out.print("Ingrese el valor a eliminar: ");
                    valor = sc.nextInt();
                    //lista.eliminarElemento(valor);
                    break;
                case 7:
                    System.out.print("Ingrese posicion a eliminar: ");
                    //posicion = sc.nextInt();
                    //lista.eliminarPosicion(posicion);
                case 8:
                    System.out.println("Gracias por usar el sistema...");
                    break;
                default:
                    System.out.println("Opcion ingresada incorrecta...");
            }
        } while (op != 8);

    }

}
