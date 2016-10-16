package pe.egcc.prueba;

import pe.egcc.model.CuentaAbstract;
import pe.egcc.model.CuentaAhorro;
import pe.egcc.model.CuentaCorriente;

public class Prueba05 {

  public static void main(String[] args) {
    CuentaAbstract cuenta = new CuentaCorriente();
    System.out.println("Interes: " + cuenta.calculaInteres(10000.0));
  }
  
}
