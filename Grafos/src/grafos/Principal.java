
package grafos;


import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tam=0;
        char opc;
        System.out.println("\t\tGRAFOS - MATRIZ DE ADYACENCIA\n");
        do{
            System.out.print("Ingrese el tamaño del grafo: ");
            tam=sc.nextInt();
            if(tam<=0)
                System.out.println("Valor ingresado incorrecto...");
        }while(tam<=0);
        MatrizAdyacencia matriz=new MatrizAdyacencia(tam);
        do{
            int o, d;
            System.out.println("\nINGRESO DE DATOS\n");
            System.out.println("[A] - Agregar dato");
            System.out.println("[E] - Eliminar dato");
            System.out.println("[M] - Mostrar");
            System.out.println("[S] - Salir");
            System.out.println("---------------------");
            System.out.print("Ingrese una opcion: ");
            opc=sc.next().toUpperCase().charAt(0);
            switch (opc){
                case 'A':
                    do{
                        System.out.println("\nAGREGAR DATO\n");
                        System.out.print("Ingrese el origen: ");
                        o=sc.nextInt();
                        System.out.print("Ingrese el destino: ");
                        d=sc.nextInt();
                        if(o<=0 || d<=0 || o>tam || d>tam)
                            System.out.println("Valores ingresados incorrectos...");
                    }while(o<=0 || d<=0 || o>tam || d>tam);
                    matriz.agregar(o, d);
                    break;
                case 'E':
                    do{
                        System.out.println("\nELIMINAR DATO\n");
                        System.out.print("Ingrese el origen: ");
                        o=sc.nextInt();
                        System.out.print("Ingrese el destino: ");
                        d=sc.nextInt();
                        if(o<=0 || d<=0 || o>tam || d>tam)
                            System.out.println("Valores ingresados incorrectos...");
                    }while(o<=0 || d<=0 || o>tam || d>tam);
                    matriz.remover(o, d);
                    break;
                case 'M':
                    matriz.imprimir();
                    break;
                case 'S':
                        System.out.println("Gracias por usar el sistema...");
                        break;
                default:
                    System.out.println("La opción ingresada es incorrecta...");
            }
        }while(opc!='S');
    }
    
}
