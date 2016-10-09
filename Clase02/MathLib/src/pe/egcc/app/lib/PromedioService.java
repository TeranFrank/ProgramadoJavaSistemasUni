/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.app.lib;

/**
 *
 * @author Alumno
 */
public class PromedioService {
   
   public double CalcularPromedio(int cantidaNumeros){
       
       double promedio=0, totalNotas=0;
       
       double [] notas = new double[cantidaNumeros];
       
       for (int i = 0; i < notas.length; i++) {
           totalNotas += notas[i];
       }
       promedio=totalNotas/notas.length;
       
       return promedio;
   }
    
}
