package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;
import pe.egcc.model.Clase4;

public class Prueba07 {

  public static void main(String[] args) {
    Clase2 o = new Clase2();
    
    System.out.println("COMPATIBLE CON:");
    System.out.println("Object: " + ((Object.class.isInstance(o))?"SI":"NO"));
    System.out.println("Clase1: " + ((Clase1.class.isInstance(o))?"SI":"NO"));
    System.out.println("Clase2: " + ((Clase2.class.isInstance(o))?"SI":"NO"));
    System.out.println("Clase3: " + ((Clase3.class.isInstance(o))?"SI":"NO"));
    System.out.println("Clase4: " + ((Clase4.class.isInstance(o))?"SI":"NO"));
  }
  
}
