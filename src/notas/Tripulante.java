/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author Drew
 */
public class Tripulante {
    private int cedula;
    private double reto_1,reto_2,reto_3,reto_4,reto_5, ingles, habilidades_p , nota_final, estadistica_1,estadistica_2,estadistica_3;
 
/*
* constructor
*/   
public Tripulante(){
    
} 
  public int getCedula(){
      return cedula;
  }

    public double getReto_1() {
        return reto_1;
    }

    public double getReto_2() {
        return reto_2;
    }

    public double getReto_3() {
        return reto_3;
    }

    public double getReto_4() {
        return reto_4;
    }

    public double getReto_5() {
        return reto_5;
    }

    public double getIngles() {
        return ingles;
    }

    public double getHabilidades_p() {
        return habilidades_p;
    }

    public double getNota_final() {
        return nota_final;
    }

    public double getEstadistica_1() {
        return estadistica_1;
    }

    public double getEstadistica_2() {
        return estadistica_2;
    }

    public double getEstadistica_3() {
        return estadistica_3;
    }
    public void setCedula(int cedula){
        
    }
    public void setReto_1(double reto_1) {
        this.reto_1 = reto_1;
    }

    public void setReto_2(double reto_2) {
        this.reto_2 = reto_2;
    }

    public void setReto_3(double reto_3) {
        this.reto_3 = reto_3;
    }

    public void setReto_4(double reto_4) {
        this.reto_4 = reto_4;
    }

    public void setReto_5(double reto_5) {
        this.reto_5 = reto_5;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public void setHabilidades_p(double habilidades_p) {
        this.habilidades_p = habilidades_p;
    }
  public double notaFinal(){
      this.nota_final= ((reto_1*0.1)+(reto_2*0.1)+(reto_3*0.2)+(reto_4*0.2)+(reto_5*0.2)+(ingles*0.1)+(habilidades_p*0.1));
      return nota_final;
  }
  public double est_1(){
      this.estadistica_1= ((reto_1+reto_2+ 10)/3)/4;
         return estadistica_1;
 
  }
  public double est_2(){
      this.estadistica_2 = ((reto_3+reto_4)*0.3)/5;
        return estadistica_2;

  }
  public double est_3(){
      this.estadistica_3 = reto_3*4 - reto_5*0.4;
	return estadistica_3;
  }
  
}
