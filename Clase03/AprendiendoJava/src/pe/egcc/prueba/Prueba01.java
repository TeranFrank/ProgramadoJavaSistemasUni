package pe.egcc.prueba;

import pe.egcc.model.Factura;

public class Prueba01 {

  public static void main(String[] args) {
    // Facturas
    Factura fact1 = new Factura();
    Factura fact2 = new Factura();
    // Mostramdo datos de facturas
    System.out.println("Importe Fact. 1: " + fact1.getImporte());   
    System.out.println("Importe Fact. 2: " + fact2.getImporte());
    // Mostrando IGV
    System.out.println("IGV: " + Factura.getIgv());
  }

}
