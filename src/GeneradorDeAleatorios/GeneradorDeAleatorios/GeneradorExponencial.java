package GeneradorDeAleatorios;

public class GeneradorExponencial extends IGeneradorNumerosAleatorios
{
    private final float lambda;


    public GeneradorExponencial(float lambda) {
        super();
        this.lambda = lambda;
    }
    

    
    @Override
    public double generarAleatorio() 
    {
        double rnd = generador.nextDouble();
        float inversaLambda = ((float) -1)/lambda;
        
        double complementoRND = 1 - rnd;
        double logaritmoNaturalComplemento = Math.log(complementoRND);
  
        double resultado = inversaLambda * logaritmoNaturalComplemento;
        double aux = (double) Math.round(resultado * 10000d) / 10000d;
       resultado = aux;
        
        return resultado;
    }

    @Override
    public double valuarFuncionDeDensidad(double valorAleatorio) 
    {
        //Formula: 1-e^(-λ*x)
        
        double resultado = 1 - Math.exp(-lambda*valorAleatorio);
        return resultado;
    }
    
}
