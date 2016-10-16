/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.MyMath.prueba;

import pe.egcc.MyMath.service.MyMathService;

/**
 *
 * @author Alumno
 */
public class MyMathPrueba {
    
    public static void main(String[] args) {
        
        MyMathService f = new MyMathService();
        
        boolean n;
        
        n=f.CalcularPrimos(4);
        
        System.out.println(f.CalcularPrimos(2));
    }
    
}
