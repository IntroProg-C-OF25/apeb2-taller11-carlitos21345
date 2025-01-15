/***
 * Problema 04
 * Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor 
 * del predio de un bien inmueble. Cada procedimiento debe tener 2 parámetros
 * (tipo cadena para nombre del cliente, cédula del cliente).
 * En el procedimiento de planilla de luz se debe pedir los siguiente datos
 * valor del kilowatio y el número de kilowatios del mes.
 * Y se genera en pantalla el siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10
 * En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor
 * del inmueble. Y se genera el siguiente reporte:
 * Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.
 * En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz;
 * 2 se llama al procedimiento calcularPredio. Los datos que se necesita 
 * en cada procedimiento se los debe ingresar por teclado.
 *@author Carlitos Ismael
*/
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        String cliente, cedula, inmueble;
        int literal;
        double valorkilovat, kilovatconsu, valorinmu;
        do {
            System.out.println("Bienvenido escoja una opcion:");
            System.out.println("1.Calculo de planilla de luz");
            System.out.println("2.Calculo del predio de un inmueble");
            System.out.println("3.Salir");
            System.out.println("-----------------------------------");
            literal = ingreso.nextInt();

            switch (literal) {
                case 1 -> {
                    System.out.println("PORFAVOR INGRESAR EL NOMBRE DEL CLIENTE:");
                    cliente = ingreso.next();
                    System.out.println("PORFAVOR INGRESE SU NUMERO DE IDENTIFICACION:");
                    cedula = ingreso.next();
                    System.out.println("INGRESE EL COSTO DEL KILOVATIO:");
                    valorkilovat = ingreso.nextDouble();
                    System.out.println("INGRESE EL CONSUMO DE LUZ POR KILOVATIO:");
                    kilovatconsu = ingreso.nextDouble();
                    CalculoLuz(cliente, cedula, valorkilovat, kilovatconsu);
                }
                case 2 -> {
                    System.out.println("PORFAVOR INGRESAR EL NOMBRE DEL CLIENTE:");
                    cliente = ingreso.next();
                    System.out.println("PORFAVOR INGRESAR NUMERO DE IDENTIFICACION:");
                    cedula = ingreso.next();
                    System.out.println("INGRESE EL INMUEBLE QUE POSEE:");
                    inmueble = ingreso.next();
                    System.out.println("INGRESAR EL COSTO DEL INMUEBLE:");
                    valorinmu = ingreso.nextDouble();
                    CalculoPredio(cliente, cedula, inmueble, valorinmu);
                }
                case 3 -> System.out.println("MUCHAS GRACIAS POR UTILIZAR EL SERVICIO");
                default -> System.out.println("FUERA DE RANGO");
            }

        } while (literal != 3);
    }

    public static void CalculoLuz(String cliente, String cedula, double valorkilovat, double kilovatconsu) {
        double total;
        total = valorkilovat * kilovatconsu;
        System.out.println(" El cliente " + "|" + cliente + "|" + " con cedula " + "|" + cedula + "|" + " debe acercarse a cancelar un valor de "
                + "|" + total + "|" + " dolares americanos");

    }

    public static void CalculoPredio(String cliente, String cedula, String inmueble, double valorinmu) {
        double inmutotal;
        inmutotal = valorinmu * 0.02;
        System.out.println(" El cliente " + "|" + cliente + "|" + " con cedula " + "|" + cedula + "|" + " posee el inmueble " + "|" + inmueble + "|" + " valorado en "
                + "|" + valorinmu + "|" + " y por el debera cancelar la suma de " + "|" + inmutotal + "|" +  " dolares americanos. ");
    }
}

/***
 * run:
 *Bienvenido escoja una opcion:
 *1.Calculo de planilla de luz
 *2.Calculo del predio de un inmueble
 *3.Salir
 *-----------------------------------
 *1
 *PORFAVOR INGRESAR EL NOMBRE DEL CLIENTE:
 *Carlos
 *PORFAVOR INGRESE SU NUMERO DE IDENTIFICACION:
 *1105385825
 *INGRESE EL COSTO DEL KILOVATIO:
 *25
 *INGRESE EL CONSUMO DE LUZ POR KILOVATIO:
 *30
 * El cliente |Carlos| con cedula |1105385825| debe acercarse a cancelar un valor de |750.0| dolares americanos
