
import java.util.Scanner;

/**
 * Problema 01
 * Generar los procedimientos y/o funciones que impriman los valor
 * pares, impares y el promedio de un arreglo bidimensional. El (los)
 * procedimiento(s) o método(s) deben ser invocados desde el método principal\
 * (quien es el único responsable de gestionar las entradas/salidas); además el
 * método debe recibir como parámetro un arreglo bidimensional.
 * @author Carlitos Ismael
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int limfilas = 0, limcolum = 0;
        System.out.println("DAME LIMITE DE FILAS Y LIMITE DE COLUMNAS DE MATRIZ");
        limfilas = ingreso.nextInt();
        limcolum = ingreso.nextInt();
        int matriz[][] = new int[limfilas][limcolum];
        generarMatriz(matriz);
        System.out.println("MATRIZ GENERADA");
        presentarMatriz(matriz);
        presentarParImparMatriz(matriz);
        presentarPromedioMatriz(matriz);
    }

    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void presentarParImparMatriz(int matriz[][]) {
        System.out.println("ELEMENTOS PARES DE LA MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 == 0) ? matriz[i][j] + (" ") : "");
                //if((matriz[i][j] %2)== 0); forma mas facil
                //System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("");
        System.out.println("ELEMENTOS IMPARES DE LA MATRIZ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 != 0) ? matriz[i][j] : "");
                //if((matriz[i][j] %2)!= 0); forma mas facil
            
            }
            System.out.println("");
        }
    }
     public static void presentarPromedioMatriz(int matriz[][]) {
         int sumaMatriz = 0, promedioMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               sumaMatriz += matriz[i][j];
            }
        }
        
        promedioMatriz = sumaMatriz / (matriz.length * matriz[0].length);
         System.out.println("PROMEDIO MATRIZ: " + promedioMatriz);
    }
     
}
/***
 * DAME LIMITE DE FILAS Y LIMITE DE COLUMNAS DE MATRIZ
 *4 4
 *MATRIZ GENERADA
 *4 0 9 4 
 *0 2 2 7 
 *5 9 3 7 
 *8 9 7 2 
 *ELEMENTOS PARES DE LA MATRIZ
 *4 0 4 0 2 2 8 2 
 *ELEMENTOS IMPARES DE LA MATRIZ
 *9
 *7
 *5937
 *97
 *PROMEDIO MATRIZ: 4
*/