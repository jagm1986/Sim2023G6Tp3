
package sim.tp3;

import java.text.DecimalFormat;


public class Cliente 
{
    private int nroCliente;
    private NumeroRNDTable rndDemanda;
    private int demandaCliente;
    private int precioPorUnidadCliente;
    private int importeVentaCliente;
    
    private double valorInicio;
    private double valorFin;
    private int frecuenciaObservada ;
    private double frecuenciaEsperada;
    
    private boolean ultimo;
        
    public Cliente(double valorInicio, double valorFin, int frecuenciaEsperadaCalculada, boolean esElUltimo) 
    {
        this.valorInicio = valorInicio;
        this.valorFin = valorFin;
        frecuenciaObservada=0;
        frecuenciaEsperada = frecuenciaEsperadaCalculada;
        ultimo = esElUltimo;
    }
    

    Cliente() {}

    public NumeroRNDTable getRndDemanda() {
        return rndDemanda;
    }

    public void setRndDemanda(NumeroRNDTable rndDemanda) {
        this.rndDemanda = rndDemanda;
    }

    public int getDemandaCliente() {
        return demandaCliente;
    }

    public void setDemandaCliente(int demandaCliente) {
        this.demandaCliente = demandaCliente;
    }

    public int getPrecioPorUnidadCliente() {
        return precioPorUnidadCliente;
    }

    public void setPrecioPorUnidadCliente(int precioPorUnidadCliente) {
        this.precioPorUnidadCliente = precioPorUnidadCliente;
    }

    public int getImporteVentaCliente() {
        return importeVentaCliente;
    }

    public void setImporteVentaCliente(int importeVentaCliente) {
        this.importeVentaCliente = importeVentaCliente;
    }

    
    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }
    
    

    public double getValorInicio() {
        return valorInicio;
    }

    public double getValorFin() {
        return valorFin;
    }

    
    public void aumentarFrecuenciaObservada()
    {
      frecuenciaObservada++;
    }
    
    
    
    public boolean contiene(double n)
    {
        boolean resultado = false;
      
        if(ultimo)// si es el ultimo la comparacion con el valor fin es con igual
        {
            if(n >= valorInicio  && n <= valorFin) resultado = true;
        }
        else
        {
            if(n >= valorInicio  && n < valorFin) resultado = true;
        }
      
      return resultado;
    }
    

    
    public String nombreIntervalo() // devuelve el nombre del intervalo para la matriz.
    {
        DecimalFormat df = new DecimalFormat("##.##");
        return df.format(valorInicio) + " : "+df.format(valorFin);
    }
    
    
    
    public int getFrecuenciaObservada() {
        return frecuenciaObservada;
    }
    
    public double getFrecuenciaEsperada() 
    {
        return frecuenciaEsperada;
    } 
    

    public void setFrecuenciaEsperada(double frecuenciaEsperadaCalculada)
    {
        double aux = (double) Math.round(frecuenciaEsperadaCalculada * 10000d) / 10000d;
        frecuenciaEsperada = aux;
    }
    
    @Override
    public String toString() {
        return "Valor de inicio: " + valorInicio + " - Valor de fin: " + valorFin;
//return valorInicio+" - "+ valorFin+"\t"+frecuenciaObservada+"\t"+frecuenciaEsperada;
    }
    
}
