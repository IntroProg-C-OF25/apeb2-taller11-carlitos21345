
/** *
 * Problema 02
 * Generar una solución que implemente 3 procedimientos.
 * Que permitan calcular el área de un cuadrado,
 * área de un triángulo y
 * área de un rectángulo.
 * Cada procedimiento/función debe recibir los datos necesarios
 * y generar el valor correspondiente.
 * Se debe invocar a los procedimientos desde un método principal;
 * Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado;
 * 2 se llama al procedimiento obtenerAreaTriangulo;
 * 3 se llama al procedimiento obtenerAreaCuadrado.
 * El área del cuadrado es igual a lado x lado x lado x lado
 * El área del triángulo es igual a (base x altura)/2
 * El área del rectángulo es igual a base x altura
 *@author Carlitos Ismael
 */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int ladocua, basetri, alturatri, baserec, alturarec, literal;
        do {
            System.out.println("BIENVENIDO:");
            System.out.println("1.CALCULAR AREA DEL CUADRADO");
            System.out.println("2.CALCULAR AREA DEL TRIANGULO");
            System.out.println("3.CALCULAR AREA DEL RECTANGULO");
            System.out.println("4.SALIR");
            System.out.println("ESCOJA UNA OPCION:");
            literal = ingreso.nextInt();
            switch (literal) {
                case 1 -> {
                    System.out.print("INGRESE UN LADO DEL CUADRADO: ");
                    ladocua = ingreso.nextInt();
                    AreaCuadrado(ladocua);
                }
                case 2 -> {
                    System.out.print("INGRESE LA BASE Y ALTURA DEL TRIANGULO: ");
                    basetri = ingreso.nextInt();
                    alturatri = ingreso.nextInt();
                    AreaTriangulo(basetri, alturatri);
                }
                case 3 -> {
                    System.out.print("INGRESE LA BASE Y ALTURA DEL RECTANGULO: ");
                    baserec = ingreso.nextInt();
                    alturarec = ingreso.nextInt();
                    AreaRectangulo(baserec, alturarec);
                }
                case 4 ->
                    System.out.println("MUCHAS GRACIAS");

                default ->
                    System.out.println("FUERA DE RANGO");
            }
        } while (literal != 4);
        ingreso.close();
    }

    public static void AreaCuadrado(int ladocua) {
        double areacua;
        areacua = ladocua * ladocua;
        System.out.println("EL AREA DEL CUADRADO ES: " + areacua);

    }

    public static void AreaTriangulo(int basetri, int alturatri) {
        double areatri;
        areatri = (basetri * alturatri) / 2;
        System.out.println("EL AREA DEL TRIANGULO ES: " + areatri);

    }

    public static void AreaRectangulo(int baserec, int alturarec) {
        double arearec;
        arearec = baserec * alturarec;
        System.out.println("EL AREA DEL RECTANGULO ES: " + arearec);

    }
}
/***
 * BIENVENIDO:
 *1.CALCULAR AREA DEL CUADRADO
 *2.CALCULAR AREA DEL TRIANGULO
 *3.CALCULAR AREA DEL RECTANGULO
 *4.SALIR
 *ESCOJA UNA OPCION:
 *1
 *INGRESE UN LADO DEL CUADRADO: 4
 *EL AREA DEL CUADRADO ES: 16.0
 *BIENVENIDO:
 *1.CALCULAR AREA DEL CUADRADO
 *2.CALCULAR AREA DEL TRIANGULO
 *3.CALCULAR AREA DEL RECTANGULO
 *4.SALIR
 *ESCOJA UNA OPCION:
 *2
 *INGRESE LA BASE Y ALTURA DEL TRIANGULO: 7 6
 *EL AREA DEL TRIANGULO ES: 21.0
 *BIENVENIDO:
 *1.CALCULAR AREA DEL CUADRADO
 *2.CALCULAR AREA DEL TRIANGULO
 *3.CALCULAR AREA DEL RECTANGULO
 *4.SALIR
 *ESCOJA UNA OPCION:
 *3
 *INGRESE LA BASE Y ALTURA DEL RECTANGULO: 9 8
 *EL AREA DEL RECTANGULO ES: 72.0
 *BIENVENIDO:
 *1.CALCULAR AREA DEL CUADRADO
 *2.CALCULAR AREA DEL TRIANGULO
 *3.CALCULAR AREA DEL RECTANGULO
 *4.SALIR
 *ESCOJA UNA OPCION:
 *4
 *MUCHAS GRACIAS
 */
