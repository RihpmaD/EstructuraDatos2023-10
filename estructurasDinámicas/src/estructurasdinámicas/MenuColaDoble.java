
package estructurasdinámicas;

import clases.Persona;
import colas.ColaDoblePersona;
import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class MenuColaDoble {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Persona persona;
        ColaDoblePersona cola=new ColaDoblePersona();
        String nombre, dni;
        int edad;
        char opc;
        do{
            System.out.println("\n\t\tSISTEMA DE MANEJO DE COLAS\n");
            System.out.println("[E] - Encolar persona");
            System.out.println("[D] - Desencolar");
            System.out.println("[M] - Mostrar");
            System.out.println("[S] - Salir");
            System.out.println("---------------------");
            System.out.print("Ingrese la opcion a elegir: ");
            opc=sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            switch(opc){
                case 'E':
                    System.out.println("\nREGISTRO DE LA PERSONA");
                    do{
                        System.out.print("Ingrese el DNI: ");
                        dni=sc.nextLine();
                    }while(!dni.matches("[0-9]{8}"));
                    do{
                        System.out.print("Ingrese los datos: ");
                        nombre=sc.nextLine();
                    }while(!nombre.matches("[a-z A-Z]*"));
                    do{
                        System.out.print("Ingrese la edad: ");
                        edad=sc.nextInt();
                    }while(edad<0 || edad>90);
                    persona=new Persona(dni, nombre, edad);
                    cola.encolar(persona);
                    System.out.println("Persona agregada a la cola...");
                    break;
                case 'D':
                    System.out.println("\nATENDER PERSONA");
                    System.out.println(cola.mostrar().getPersona());
                    cola.desencolar();
                    System.out.println("Persona ya atendido y retirada...");
                    break;
                case 'M':
                    System.out.println("\nMOSTRAR PERSONA");
                    System.out.println(cola.mostrar().getPersona());
                    break;
                case 'S':
                    System.out.println("Gracias por utilizar el sistema...");
                    break;
                default:
                    System.out.println("Opcion ingresada incorrecta...");
            }
        }while(opc!='S');
    }
}
