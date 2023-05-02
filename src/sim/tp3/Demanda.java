package sim.tp3;

public class Demanda {

    private int demanda;
    private int precio;
    private double probabilidad;
    private double probabilidadAC;

    public double getProbabilidadAC() {
        return probabilidadAC;
    }

    public void setProbabilidadAC(double probabilidadAC) {
        this.probabilidadAC = probabilidadAC;
    }

    public Demanda(int demanda, int precio, double probabilidad, double probabilidadAC) {
        this.demanda = demanda;
        this.precio = precio;
        this.probabilidad = probabilidad;
        this.probabilidadAC = probabilidadAC;
    }

    public Demanda() {
    }

    public int getDemanda() {
        return demanda;
    }

    public void setDemanda(int demanda) {
        this.demanda = demanda;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(double probabilidad) {
        this.probabilidad = probabilidad;
    }

}
