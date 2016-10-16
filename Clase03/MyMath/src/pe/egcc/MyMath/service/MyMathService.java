package pe.egcc.MyMath.service;

public class MyMathService {
    
    public long CalcularFactorial(int numeroEntero){
        
        long numFactorial=1;
        for (int i = 1; i <= numeroEntero; i++) {
            numFactorial=numFactorial*i;
        }
        return numFactorial;
    }
    
    public boolean CalcularPrimos(int numeroEntero){
        int iContador=0;
        double iResiduo;
        boolean esPrimo = false;
        for (int i = 1; i <= numeroEntero; i++) {
            iResiduo=numeroEntero%i;
            if(iResiduo==0){
                iContador+=1;
            }
        }
        if( iContador <= 2 ){
            esPrimo = true;
        }

        return esPrimo;
    }
    
    public int CalcularMCD (int numeroEntero1, int numeroEntero2){
        
        int mcd=0;
        
        int a = Math.max(numeroEntero1, numeroEntero2);
        int b = Math.min(numeroEntero1, numeroEntero2);
        do {
            mcd = b;
            b = a%b;
            a = mcd;
        } while(b!=0);
        
        return mcd;
    }
    
    public int CalcularMCM (int numeroEntero1, int numeroEntero2){
        
        int mcm ;
        int a = Math.max(numeroEntero1, numeroEntero2);
        int b = Math.min(numeroEntero1, numeroEntero2);
        mcm = (a/CalcularMCD(a, b))*b;
        return mcm;
    }
    
    public long CalcularFibonacci(int numeroEntero){
       if (numeroEntero>1){
       return CalcularFibonacci(numeroEntero-1) + CalcularFibonacci(numeroEntero-2);  //función recursiva
                }
        else if (numeroEntero==1) {  // caso base
            return 1;
                        }
        else if (numeroEntero==0){  // caso base
            return 0;
                        }
        else{ //error
            return -1; 
        }
    }
    
    public String mostraSerie(int numeroEntero){
        String mostrar="";
        for (int i = 0; i < numeroEntero; i++) {
        mostrar=mostrar + CalcularFibonacci(i)+ " ";
        }
        return mostrar;
    }
}
