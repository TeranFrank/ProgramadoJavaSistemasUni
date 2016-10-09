package pe.egcc.proyectaventa.service;

import java.math.BigDecimal;
import pe.egcc.proyectaventa.model.VentaModel;

public class VentaService {

  private final double IGV = 0.18;

  public void procesar(VentaModel model) {
    // Variables
    BigDecimal importe, impuesto, total;
    // Proceso
    total = model.getPrecio()
            .multiply(BigDecimal.valueOf(model.getCant().intValue()));
    BigDecimal divisor = BigDecimal.valueOf(1.0 + IGV);
    importe = total.divide(divisor,2,BigDecimal.ROUND_HALF_UP);
    impuesto = total.subtract(importe);
    // Reporte
    model.setImporte(importe);
    model.setImpuesto(impuesto);
    model.setTotal(total);
  }

}
