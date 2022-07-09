
package notas;
import java.util.Scanner;
/**
 *
 * @author Drew
 */
public class Notas_OOP {
 public static int numEst;
    
    public static void main(String[] args) {
        double suma = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("*****PROMEDIO Y ESTADISTICAS DE NOTAS ESTUDIANTE*****");
        System.out.println("Numero de estudiantes: ");
        numEst=sc.nextInt();  
        double [] resultados1 = new double[numEst];
        double [] resultados2 = new double[numEst];
        double [] resultados3 = new double[numEst];
        Sistema_control_notas notas = new Sistema_control_notas(numEst);
        for( int tri=0; tri<numEst;tri ++){
            Tripulante t = new Tripulante();
            System.out.print("Ingrese numero de cedula: ");
            t.setCedula(sc.nextInt());
            System.out.print("Ingrese nota del reto 1: ");
            t.setReto_1(sc.nextDouble());
            System.out.print("Ingrese nota del reto 2: ");
            t.setReto_2(sc.nextDouble());
            System.out.print("Ingrese nota del reto 3: ");
            t.setReto_3(sc.nextDouble());
            System.out.print("Ingrese nota del reto 4: ");
            t.setReto_4(sc.nextDouble());
            System.out.print("Ingrese nota del reto 5: ");
            t.setReto_5(sc.nextDouble());
            System.out.print("Ingrese nota de ingles: ");
            t.setIngles(sc.nextDouble());
            System.out.print("Ingrese nota de habilidades presonales: ");
            t.setHabilidades_p(sc.nextDouble());
            //System.out.println(t.notaFinal());
            resultados1[tri]=t.est_1();
            resultados2[tri]=t.est_2();
            resultados3[tri]=t.est_3();
            suma+=t.notaFinal();
            System.out.println("El acumulado es de: "+ suma);
        }
        System.out.println ("------------------------------------------------");
        System.out.println ("\nEl promedio es de: "+ notas.calcularPromedio(suma));
        System.out.println("El valor mayor en estadistica_1 es: " + resultados1[notas.calcularMayorEstadistica(resultados1)] + " perteneciente al estudiante "+(notas.calcularMayorEstadistica(resultados1)+1) );
        System.out.println("El valor mayor en estadistica_2 es: " + resultados2[notas.calcularMayorEstadistica(resultados2)] + " perteneciente al estudiante "+(notas.calcularMayorEstadistica(resultados1)+1) );
        System.out.println("El valor mayor en estadistica_3 es: " + resultados3[notas.calcularMayorEstadistica(resultados3)] + " perteneciente al estudiante "+(notas.calcularMayorEstadistica(resultados1)+1) );
    }
    
}

