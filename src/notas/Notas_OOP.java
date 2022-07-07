
package notas;
import java.util.Scanner;
/**
 *
 * @author Drew
 */
public class Notas_OOP {
 public static int numEst;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****PROMEDIO Y ESTADISTICAS DE NOTAS ESTUDIANTE*****");
        System.out.println("Numero de estudiantes: ");
        numEst=sc.nextInt();        
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
            System.out.println(t.notaFinal());
            System.out.println(t.est_1());
            System.out.println(t.est_2());
            System.out.print(t.est_3());
                
        }
    }
    
}

