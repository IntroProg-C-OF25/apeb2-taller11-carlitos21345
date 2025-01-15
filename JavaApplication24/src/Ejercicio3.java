/***
 * Problema 03
 * Generar una función que tenga 4 parámetros de tipo decimal
 * y devuelva el promedio cualitativo de los parámetros.
 * Si el promedio es: De 0 a 5 el promedio cualitativo es Regular 
 * De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio es Muy Buen
 * o De 9.1 a 10 el promedio es Sobresaliente.
 * A la función se la debe llamar desde un método principal. 
 * Los parámetros necesarios para llamar a la función, 
 * deben ser ingresados solicitados al usuario.
 *@author Carlitos Ismael
 */
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        double notapa1, notapa2, notapa3, notapa4, calculopromedio;
        String promcuality;
        System.out.print("INGRESE EL PROMEDIO DE ACD: ");
        notapa1 = ingreso.nextDouble();
        System.out.print("INGRESE EL PROMEDIO DE APE: ");
        notapa2 = ingreso.nextDouble();
        System.out.print("INGRESE EL PROMEDIO DE AA: ");
        notapa3 = ingreso.nextDouble();
        System.out.print("INGRESE EL PROMEDIO DE REC: ");
        notapa4 = ingreso.nextDouble();

        calculopromedio = CalculoPromedio(notapa1, notapa2, notapa3, notapa4);
        promcuality = ObtenerElPromedioCualitativo(calculopromedio);
        System.out.print("El promedio es: " + calculopromedio);
        System.out.println("");
        System.out.print("El promedio cualitativo es: " + promcuality);
        System.out.println("");
    }

    public static double CalculoPromedio(double pa1, double pa2, double pa3, double pa4) {
        return (pa1 + pa2 + pa3 + pa4) / 4;

    }

    public static String ObtenerElPromedioCualitativo(double prom) {

        if (prom > 9 && prom <= 10) {
            return "Sobresaliente";
        } else if (prom > 8 && prom <= 9) {
            return "Muy Bueno";
        } else if (prom > 5.1 && prom <= 8) {
            return "Bueno";
        } else if (prom > 0 && prom <= 5) {
            return "Regular";
        } else {
            return "Fuera de rango";
        }
    }
}
/***
 *INGRESE EL PROMEDIO DE ACD: 9
 *INGRESE EL PROMEDIO DE APE: 8,75
 *INGRESE EL PROMEDIO DE AA: 7
 *INGRESE EL PROMEDIO DE REC: 8
 *El promedio es: 8.1875
 *El promedio cualitativo es: Muy Bueno
 */