package semana04.arreglosmultidimensionales;

import java.util.Scanner;

/**
 *
 * @author C20177
 */
public class Semana04ArreglosMultidimensionales {

    public static void main(String[] args) {
        //2 - Temporadas (0 Enero-Julio, 1 Agosto-Diciembre)
        //3 - Partidos a equipos (0 Universitario, 1 Alianza Lima, 2 Cristal)
        //2 - Goles (Columna 1 - Anotados, Columna 2 - Recibidos)
        int datos[][][] = new int[2][3][2];
        String equipos[]=new String[3];
        String temporadas[]=new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSISTEMA DE RESULTADOS DE LOS PARTIDOS\n");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[0].length; j++) {
                //for (int k = 0; k < datos[0][0].length; k++) {
                    switch (i) {
                        case 0:
                            System.out.println("\t\tTEMPORADA ENERO-JULIO");
                            temporadas[i]="Enero-Julio";
                            break;
                        case 1:
                            System.out.println("\t\tTEMPORADA AGOSTO-DICIEMBRE");
                            temporadas[i]="Agosto-Diciembre";
                            break;
                    }
                    switch (j) {
                        case 0:
                            System.out.println("\tPARTIDO CON UNIVERSITARIO");
                            equipos[j]="Universitario";
                            break;
                        case 1:
                            System.out.println("\tPARTIDO CON ALIANZA LIMA");
                            equipos[j]="Alianza Lima";
                            break;
                        case 2:
                            System.out.println("\tPARTIDO CON CRISTAL");
                            equipos[j]="Cristal";
                            break;
                    }
                    
                    System.out.println("\nREGISTRO DE ANOTACIONES\n");
                    System.out.print("Goles anotados: ");
                    datos[i][j][0]=sc.nextInt();
                    System.out.print("Goles recibidos: ");
                    datos[i][j][1]=sc.nextInt();
                //}
            }
        }
        
        for (int i = 0; i < datos.length; i++) {
            System.out.println("\nTemporada "+(i+1));
            for (int j = 0; j < datos[0].length; j++) {
                System.out.println("\nPartidos "+(j+1));
                for (int k = 0; k < datos[0][0].length; k++) {
                    System.out.println("\nGoles "+(k+1));
                    System.out.println(datos[i][j][k]);
                }
            }
        }
    }

}
