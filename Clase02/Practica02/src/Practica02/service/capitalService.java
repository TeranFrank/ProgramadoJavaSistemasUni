
package Practica02.service;

import Practica02.model.capitalModel;

public class capitalService {
    
    public void procesar (capitalModel model){
        //Variables
        double  importeAcumulado, interes, interesComp;    
        //proceso
        
        interes=1+(model.getTasaInteres()/100);
        interesComp = Math.pow(interes,model.getPeriodos());
        
        importeAcumulado = interesComp * model.getCapital();
        
        model.setImporteAcumulado(importeAcumulado);

    }

}
