package pe.egcc.model;

public class CuentaAhorro extends CuentaAbstract{

  @Override
  public double calculaInteres(double saldo) {
    return saldo * 0.02;
  }
  
}
