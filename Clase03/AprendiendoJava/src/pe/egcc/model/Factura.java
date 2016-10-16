package pe.egcc.model;

import java.util.Random;

public class Factura {

  private double importe;
  private static double igv;
  
  static {
    igv = 0.18;
  }

  public Factura() {
    Random rnd = new Random();
    importe = rnd.nextDouble() * 1000;
  }

  public double getImporte() {
    return importe;
  }

  public static double getIgv() {
    return igv;
  }
  
  

}
