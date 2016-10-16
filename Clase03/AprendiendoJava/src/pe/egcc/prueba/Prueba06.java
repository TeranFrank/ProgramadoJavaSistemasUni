package pe.egcc.prueba;

import pe.egcc.model.Clase1;
import pe.egcc.model.Clase2;
import pe.egcc.model.Clase3;
import pe.egcc.model.Clase4;

public class Prueba06 {

  public static void main(String[] args) {
    Clase2 o = new Clase2();
    
    System.out.println("COMPATIBLE CON:");
    System.out.println("Object: " + ((o instanceof Object)?"SI":"NO"));
    System.out.println("Clase1: " + ((o instanceof Clase1)?"SI":"NO"));
    System.out.println("Clase2: " + ((o instanceof Clase2)?"SI":"NO"));
    System.out.println("Clase3: " + ((o instanceof Clase3)?"SI":"NO"));
    System.out.println("Clase4: " + ((o instanceof Clase4)?"SI":"NO"));
  }
  
}
