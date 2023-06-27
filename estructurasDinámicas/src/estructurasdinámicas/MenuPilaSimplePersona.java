/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdinámicas;

import clases.Persona;
import java.util.Scanner;
import pilas.PilaSimplePersona;

/**
 *
 * @author C20177
 */
public class MenuPilaSimplePersona {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Persona persona;
        PilaSimplePersona pila=new PilaSimplePersona();
        String nombre, dni;
        int edad;
        char opc;
        do{
            System.out.println("\n\t\tSISTEMA DE MANEJO DE PILAS\n");
            System.out.println("[P] - Push");
            System.out.println("[R] - Pop");
            System.out.println("[M] - Mostrar");
            System.out.println("[B] - Buscar");
            System.out.println("[S] - Salir");
            System.out.println("---------------------");
            System.out.print("Ingrese la opcion a elegir: ");
            opc=sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            switch(opc){
                case 'P':
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
                    pila.push(persona);
                    System.out.println("Persona agregada a la pila...");
                    break;
                case 'R':
                    System.out.println("\nATENDER PERSONA");
                    pila.pop();
                    break;
                case 'M':
                    System.out.println("\nMOSTRAR PERSONA");
                    System.out.println(pila.mostrar().getPersona());
                    break;
                case 'B':
                    System.out.println("\nBUSCAR POR NOMBRE DE LA PERSONA");
                    do{
                        System.out.print("Ingrese el DNI: ");
                        dni=sc.nextLine();
                    }while(!dni.matches("[0-9]{8}"));
                    System.out.println("La distancia de profundidad es: "+pila.buscarDni(dni));
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
