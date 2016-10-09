package pe.egcc.proyectaventa.prueba;

import java.math.BigDecimal;
import java.math.BigInteger;
import pe.egcc.proyectaventa.model.VentaModel;
import pe.egcc.proyectaventa.service.VentaService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    VentaModel model = new VentaModel();
    model.setPrecio(BigDecimal.valueOf(356.78));
    model.setCant(BigInteger.valueOf(9));
    // Proceso
    VentaService service = new VentaService();
    service.procesar(model);
    // Reporte
    System.out.println("Precio: " + model.getPrecio());
    System.out.println("Cantidad: " + model.getCant());
    System.out.println("Importe: " + model.getImporte());
    System.out.println("Impuesto: " + model.getImpuesto());
    System.out.println("Total: " + model.getTotal());
    
  }
  
}
