/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica02.prueba;

import Practica02.model.capitalModel;
import Practica02.service.capitalService;

/**
 *
 * @author Alumno
 */
public class capitalPrueba {
    public static void main(String[] args) {
        capitalModel model = new capitalModel();
        model.setPeriodos(5);
        model.setTasaInteres(0.25);
        model.setCapital(356.25);
        
        capitalService service = new capitalService();
        
        service.procesar(model);
        
        System.out.println("Capital: " + model.getCapital());
        System.out.println("Periodos: " + model.getPeriodos());
        System.out.println("Interes: " + model.getTasaInteres());
        System.out.println("Importe Acumulado: " + model.getImporteAcumulado());
    }
    
}
