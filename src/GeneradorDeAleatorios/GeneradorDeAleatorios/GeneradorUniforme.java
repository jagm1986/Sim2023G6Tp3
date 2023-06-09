package GeneradorDeAleatorios;

import sim.tp3.NumeroRNDTable;

public class GeneradorUniforme extends IGeneradorNumerosAleatorios {

    private final double extremoIzquierdo;
    private final double extremoDerecho;

    public GeneradorUniforme(double extremoIzquierdo, double extremoDerecho) {
        this.extremoIzquierdo = extremoIzquierdo;
        this.extremoDerecho = extremoDerecho;
    }

    @Override
    public NumeroRNDTable generarAleatorio() {
        double rnd = generador.nextDouble();
        double diferenciaExtremos = extremoDerecho - extremoIzquierdo;

        double resultado = extremoIzquierdo + (rnd * diferenciaExtremos);

        double aux = (double) Math.round(resultado * 10000d) / 10000d;
        resultado = aux;

        NumeroRNDTable numeroRNDTable = new NumeroRNDTable();
        numeroRNDTable.setNumero(resultado);
        numeroRNDTable.setRnd(rnd);
        return numeroRNDTable;
    }

    @Override
    public double valuarFuncionDeDensidad(double valorAleatorio) {
        return 0.0; //Retorna 0 porque la frecuencia esperada es igual para todos los intervalos, y se calcula en el manejador directamente
    }
}
