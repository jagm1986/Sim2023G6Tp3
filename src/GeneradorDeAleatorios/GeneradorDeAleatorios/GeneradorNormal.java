package GeneradorDeAleatorios;

import org.apache.commons.math3.distribution.NormalDistribution;

public class GeneradorNormal extends IGeneradorNumerosAleatorios
{
    private final float media;
    private final float desviacion;
    private double[] boxMuller;
    private int indice;

    public GeneradorNormal(float media, float desviacion) {
        super();
        this.media = media;
        this.desviacion = desviacion;

    }

    
    @Override
    public double generarAleatorio() 
    {
       double rnd;
       
       if(boxMuller == null) // hacemos esta pregunta porque el metodo boxmuller devuelve 2 valores random que estan en un array
                            // esto nos permite poder entregar primero el primero y despues el segundo
       {
         boxMuller = this.generarAleatorioNormalBoxMuller();
         indice=0;
         rnd = boxMuller[indice];
         indice++;
       }
       else
       {
          if(indice <= 1)
          {
            rnd = boxMuller[indice];
            indice++;
          }
          else
          {
             indice=0;
             boxMuller = this.generarAleatorioNormalBoxMuller();
             rnd = boxMuller[indice];
             indice++;
          }
       
       }
       
       double aux = (double) Math.round(rnd * 10000d) / 10000d;
       rnd = aux;
        
        return rnd;
    }
  
    
    
    public double[] generarAleatorioNormalBoxMuller()
    {
        double[] resultado = new double[2];
        
        
        double rnd1 = generador.nextDouble();
        double rnd2 = generador.nextDouble();
        
        double lnRND1 = Math.log(rnd1);
        
        double factorIzquierdo = ((-2) * lnRND1);
        double raizFactor = Math.sqrt(factorIzquierdo);
        
        double factorDerecho = 2 * (Math.PI) * rnd2;
        
        double cosenoFactor = Math.cos(factorDerecho);
        double senoFactor = Math.sin(factorDerecho);
        
        double z1 = raizFactor * cosenoFactor;
        double z2 = raizFactor * senoFactor;
        
        double n1 = ((z1 * desviacion) + media);
        double n2 = ((z2 * desviacion) + media);
        
        resultado[0] = n1;
        resultado[1] = n2;
        
        return resultado;
    }

    @Override
    public double valuarFuncionDeDensidad(double valorAleatorio) 
    {
      
        NormalDistribution nd = new NormalDistribution(media, desviacion); // Usamos directamente una libreria que devuelve la probabilidad acumulada P(X<=x)
        double resultado = nd.cumulativeProbability(valorAleatorio);
        return resultado;

    }
    
}
