
package GeneradorDeAleatorios;

import java.util.Random;
import sim.tp3.NumeroRNDTable;
  
public abstract class IGeneradorNumerosAleatorios 
{
    Random generador ;
    public IGeneradorNumerosAleatorios() 
    {
         generador = new Random();
    }
  
    public abstract NumeroRNDTable generarAleatorio();
    public abstract double valuarFuncionDeDensidad(double valorAleatorio);
    
}
