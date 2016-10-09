
package Practica02.model;

public class capitalModel {
    
    //Datos
    private double capital;
    private int periodos;
    private double tasaInteres;
    
    //Resultado
    private double importeAcumulado;
    
    public capitalModel(){
    }

    /**
     * @return the capital
     */
    public double getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(double capital) {
        this.capital = capital;
    }

    /**
     * @return the periodos
     */
    public int getPeriodos() {
        return periodos;
    }

    /**
     * @param periodos the periodos to set
     */
    public void setPeriodos(int periodos) {
        this.periodos = periodos;
    }

    /**
     * @return the tasaInteres
     */
    public double getTasaInteres() {
        return tasaInteres;
    }

    /**
     * @param tasaInteres the tasaInteres to set
     */
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    /**
     * @return the importeAcumulado
     */
    public double getImporteAcumulado() {
        return importeAcumulado;
    }

    /**
     * @param importeAcumulado the importeAcumulado to set
     */
    public void setImporteAcumulado(double importeAcumulado) {
        this.importeAcumulado = importeAcumulado;
    }
    
}
