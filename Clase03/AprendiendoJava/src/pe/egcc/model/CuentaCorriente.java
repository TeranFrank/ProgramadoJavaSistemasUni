package pe.egcc.model;

public class CuentaCorriente extends CuentaAbstract{

  @Override
  public double calculaInteres(double saldo) {
    return saldo * 0.008;
  }
  
}
