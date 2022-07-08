
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
            System.out.println("Ingrese numero de cedula: ");
            t.setCedula(sc.nextInt());
            System.out.println("Ingrese nota del reto 1: ");
            t.setReto_1(sc.nextDouble());
            System.out.println("Ingrese nota del reto 2: ");
            t.setReto_2(sc.nextDouble());
            System.out.println("Ingrese nota del reto 3: ");
            t.setReto_3(sc.nextDouble());
            System.out.println("Ingrese nota del reto 4: ");
            t.setReto_4(sc.nextDouble());
            System.out.println("Ingrese nota del reto 5: ");
            t.setReto_5(sc.nextDouble());
            System.out.println("Ingrese nota de ingles: ");
            t.setIngles(sc.nextDouble());
            System.out.println("Ingrese nota de habilidades presonales: ");
            t.setHabilidades_p(sc.nextDouble());
            //System.out.println(t.notaFinal());
            System.out.println(t.est_1());
            resultados1[tri]=t.est_1();
            resultados2[tri]=t.est_2();
            resultados3[tri]=t.est_3();
            System.out.println(t.est_2());
            System.out.print(t.est_3());
            suma+=t.notaFinal();
        }
        notas.calcularPromedio(suma);
        notas.calcularMayorEstadistica(resultados1);
        notas.calcularMayorEstadistica(resultados2);
        notas.calcularMayorEstadistica(resultados3);
    }
    
}

