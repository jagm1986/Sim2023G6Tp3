
package GeneradorDeAleatorios;

import java.util.Random;
  
public abstract class IGeneradorNumerosAleatorios 
{
    Random generador ;
    public IGeneradorNumerosAleatorios() 
    {
         generador = new Random();
    }
  
    public abstract double generarAleatorio();
    public abstract double valuarFuncionDeDensidad(double valorAleatorio);
    
}
