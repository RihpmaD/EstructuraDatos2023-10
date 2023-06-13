
package tablahash;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, numeros[];
        System.out.println("\t\tTABLAS HASH\n");
        do{
            System.out.print("Ingrese el tamaño de elementos: ");
            n=sc.nextInt();
            if(n<=0)
                System.out.println("El valor ingresado es incorrecto...");
        }while(n<=0);
        numeros=new int[n];
        for(int i=0;i<n;i++)
            numeros[i]=(int)(Math.random()*50+1);
        System.out.println("\n\tMOSTRAR VALORES\n");
        for(int i=0;i<n;i++)
            if(i==n-1)
                System.out.print(numeros[i]+"\n");
            else
                System.out.print(numeros[i]+" | ");
        ArrayList tablaHashing[]=new ArrayList[esPrimo(n)];
        System.out.println("\n\tLlaves asignadas a los valores\n");
        for(int i=0;i<numeros.length;i++){
            System.out.println("El numero "+numeros[i]+" tiene la llave: "
                    +crearLlave(numeros[i], esPrimo(n)));
            if(tablaHashing[crearLlave(numeros[i], esPrimo(n))]==null){
                tablaHashing[crearLlave(numeros[i], esPrimo(n))]=new ArrayList();
                tablaHashing[crearLlave(numeros[i], esPrimo(n))].add(numeros[i]);
            }else
                tablaHashing[crearLlave(numeros[i], esPrimo(n))].add(numeros[i]);
        }
        System.out.println("\n\t\tMOSTRAR TABLA HASH\n");
        for(int i=0;i<tablaHashing.length;i++){
            System.out.println("\tLlave "+i);
            if(tablaHashing[i]==null)
                System.out.println("Lista vacia, sin elementos...");
            else{
                for(int j=0;j<tablaHashing[i].size();j++){
                    if(j==tablaHashing[i].size()-1)
                        System.out.print(tablaHashing[i].get(j)+"\n");
                    else
                        System.out.print(tablaHashing[i].get(j)+" | ");
                }
            }
        }
    }
    
    public static int crearLlave(int valor, int tam){
        return Math.abs(valor % tam);
    }
    
    public static int esPrimo(int n){
        
        while(true){
            int c=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    c++;
            }
            if(c==2)
                break;
            else
                n++;
        }
        return n;
    }
}
