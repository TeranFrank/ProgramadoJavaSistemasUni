package pe.egcc.proyectaventa.model;

import java.math.BigDecimal;
import java.math.BigInteger;

public class VentaModel {

  // Datos
  private BigDecimal precio;
  private BigInteger cant;
  // Resultado
  private BigDecimal importe;
  private BigDecimal impuesto;
  private BigDecimal total;

  public VentaModel() {
  }

  public BigDecimal getPrecio() {
    return precio;
  }

  public void setPrecio(BigDecimal precio) {
    this.precio = precio;
  }

  public BigInteger getCant() {
    return cant;
  }

  public void setCant(BigInteger cant) {
    this.cant = cant;
  }

  public BigDecimal getImporte() {
    return importe;
  }

  public void setImporte(BigDecimal importe) {
    this.importe = importe;
  }

  public BigDecimal getImpuesto() {
    return impuesto;
  }

  public void setImpuesto(BigDecimal impuesto) {
    this.impuesto = impuesto;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

}
