/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana04.arregloejemplo;

import java.util.Scanner;

/**
 *
 * @author billy
 */
public class Semana04ArregloEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[] = new int[5];
        int z[] = x;
        for (int i = 0; i < x.length; i++) {
            x[i] = LeerDato(i + 1);
        }
        System.out.println("Arreglo X --> Estructura For\n");
        for (int i = 0; i < 5; i++) {
            System.out.print(x[i] + ", ");
        }
        System.out.println("\n\nArreglo X --> Estructura For-Each\n");
        for(int val:x){
            System.out.print(val + ", ");
        }
        for (int i = 0; i < 5; i++) {
            x[i] += 5;
        }
        System.out.println("\n\nArreglo Z --> Estructura For\n");
        for (int i = 0; i < 5; i++) {
            System.out.print(z[i] + ", ");
        }
        System.out.println("\n\nArreglo Z --> Estructura For-Each\n");
        for(int val:z){
            System.out.print(val + ", ");
        }
        System.out.println("");

    }

    public static int LeerDato(int valor) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un valor " + valor + ": ");
        a = sc.nextInt();
        return a;
    }

}
