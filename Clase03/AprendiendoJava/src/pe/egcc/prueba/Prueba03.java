package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase3;

public class Prueba03 {

  public static void main(String[] args) {
    Clase3 bean = new Clase3();
    System.out.println("4 + 2 = " + bean.sumar(4, 2));
    
    Clase1 bean1 = new Clase1();
    System.out.println("4 + 2 = " + bean1.sumar(4, 2));
  }
  
}
