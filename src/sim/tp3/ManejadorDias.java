package sim.tp3;

import GeneradorDeAleatorios.GeneradorUniforme;
import GeneradorDeAleatorios.IGeneradorNumerosAleatorios;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ManejadorDias {

    private ArrayList<Dia> dias;

    private int N;

    private ArrayList<NumeroRNDTable> numerosGenerados;

    IGeneradorNumerosAleatorios gna; // gna es una abstraccion de un generador que sirve como interfaz para los diferentes tipos

    private TablaDemanda tablaDemanda;

    public ManejadorDias() {
        N = 0;
        dias = new ArrayList<>();
        numerosGenerados = new ArrayList<>();
        tablaDemanda = new TablaDemanda();
    }

    public TablaDemanda getTablaDemanda() {
        return tablaDemanda;
    }

    public void setTablaDemanda(TablaDemanda tablaDemanda) {
        this.tablaDemanda = tablaDemanda;
    }

    public ArrayList<NumeroRNDTable> getNumerosGenerados() {
        return numerosGenerados;
    }

    public void setNumerosGenerados(ArrayList<NumeroRNDTable> numerosGenerados) {
        this.numerosGenerados = numerosGenerados;
    }

    public ArrayList<Dia> getIntervalos() {
        return dias;
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public void generarDistribucionUniforme(double a, double b) {

        gna = new GeneradorUniforme(a, b);
        // generar numeros 
        for (int i = 0; i < N; i++) {
            NumeroRNDTable rnd = gna.generarAleatorio();
            numerosGenerados.add(rnd);
        }

    }

    public void crearDias(int cantidadDias) // luego de generarse la lista de numeros creo los dias. 
    //la cantidad de dias entra por parametro.
    {
        Dia dia; // creo un dia auxiliar.

        for (int i = 0; i < cantidadDias; i++) {

            int extremoInferior = 10, extremoSuperior = 30;
            TablaDemanda tablaDemandaV2 = new TablaDemanda();
            List<Demanda> listaDemandasV2 = new ArrayList<>();
            Double probabilidadACV2 = 0d;
            double probabilidad = 0.0476d;
            double probabilidadAC = 0;

            for (int j = 10; j < 31; j++) {
                probabilidadAC += probabilidad;
                Demanda demanda = null;
                demanda = new Demanda(j, j, probabilidad, probabilidadAC);
                listaDemandasV2.add(demanda);

                if (j == 30) {
                    break;
                }
            }

            tablaDemandaV2.setDemandaPastelitos(listaDemandasV2);

            Random rndV2 = new Random();

            // voy creando los dias 
            dia = new Dia();
            dia.setNroDia(i);
            NumeroRNDTable numeroRNDTable = new NumeroRNDTable();
            numeroRNDTable.setRnd(rndV2.nextDouble());
            dia.setRndCantidadClientes(numeroRNDTable);
            Integer cantidadClientes = calcularDemanda(rndV2.nextDouble(), tablaDemandaV2).getDemanda();
            dia.setCantidadClientes(cantidadClientes.longValue());

            List<Cliente> clientes = new ArrayList<>();
            for (int j = 0; j < cantidadClientes; j++) {
                Cliente cliente = new Cliente();
                cliente.setNroCliente(j + 1);
                NumeroRNDTable numeroRNDTableCliente = new NumeroRNDTable();
                Random rnd = new Random();
                numeroRNDTableCliente.setNumero(rnd.nextDouble());
                cliente.setRndDemanda(numeroRNDTableCliente);
                cliente.setDemandaCliente(calcularDemanda(numeroRNDTableCliente.getNumero(), null).getDemanda());
                cliente.setPrecioPorUnidadCliente(calcularDemanda(numeroRNDTableCliente.getNumero(), null).getPrecio());

                clientes.add(cliente);

            }
            dia.setClientes(clientes);

            dias.add(dia); //intervalos es un array con dias.

        }

    }

    public Demanda calcularDemanda(double numeroAleatorio, TablaDemanda tablaDemandaV2) {
        if (tablaDemandaV2 == null) {
            tablaDemanda.getDemandaPastelitos().sort(Comparator.comparing(Demanda::getDemanda));
            acumularDemanda(tablaDemanda.getDemandaPastelitos());
            for (int i = 0; i < tablaDemanda.getDemandaPastelitos().size(); i++) {

                Demanda demanda = tablaDemanda.getDemandaPastelitos().get(i);
                Demanda anterior = null;
                if (i != 0) {
                    anterior = tablaDemanda.getDemandaPastelitos().get(i - 1);
                    if (numeroAleatorio < demanda.getProbabilidadAC() && (numeroAleatorio > anterior.getProbabilidadAC())) {
                        return demanda;
                    }
                }

                if (numeroAleatorio < demanda.getProbabilidadAC()) {
                    return demanda;
                }

            }
        } else {
            for (int i = 0; i < tablaDemandaV2.getDemandaPastelitos().size(); i++) {

                Demanda demanda = tablaDemandaV2.getDemandaPastelitos().get(i);
                Demanda anterior = null;
                if (i != 0) {
                    anterior = tablaDemandaV2.getDemandaPastelitos().get(i - 1);
                    if (numeroAleatorio < demanda.getProbabilidadAC() && (numeroAleatorio > anterior.getProbabilidadAC())) {
                        return demanda;
                    }
                }

                if (numeroAleatorio < demanda.getProbabilidadAC()) {
                    return demanda;
                }

            }
        }

        return new Demanda();

    }

    public void acumularDemanda(List<Demanda> listaDemanda) {
        double probAC = 0d;
        for (Demanda demanda : listaDemanda) {
            if (demanda.getDemanda() == 1) {
                probAC = demanda.getProbabilidad();
                demanda.setProbabilidadAC(demanda.getProbabilidad());
            } else {
                probAC += demanda.getProbabilidad();
                demanda.setProbabilidadAC(probAC);
            }

        }

    }

    public void mostrarIntervalos() {
        for (Dia intervalo : dias) {
            System.out.println(intervalo);
        }
    }

    public void resetear() {
        N = 0;
        dias = new ArrayList<>();
        numerosGenerados = new ArrayList<>();
        tablaDemanda = new TablaDemanda();

    }

}
