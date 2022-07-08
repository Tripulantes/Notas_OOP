/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import javax.print.attribute.standard.Sides;

/**
 *
 * @author Drew
 */
public class Sistema_control_notas {
    private int numEst;
    //metodos calcular promedio, calcular estadistica 1 2 3 get
    public Sistema_control_notas(int numEst){
        this.numEst=numEst;
    }
    public double calcularPromedio(double acumulado){
        double promedioTotal=acumulado/numEst;
        return promedioTotal;
    }
    public int calcularMayorEstadistica(double[] estadisticas){
        int indiceDelMayor = 0;
		// Recorrer arreglo y ver si no es así
		// (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
		for (int x = 1; x < estadisticas.length; x++) {
			if (estadisticas[x] > estadisticas[indiceDelMayor]) {
				indiceDelMayor = x;
			}
		}
		// Ahora podemos obtener el mayor usando la posición
		double mayor = estadisticas[indiceDelMayor];
		System.out.println("El mayor en estadistica_1 es: " + mayor );
        return 1;
    }
}
