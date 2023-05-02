package sim.tp3;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class TablaIntervalos extends DefaultTableModel {

    private double promedioSobrantesTotal;
    private double promedioUtilidadTotal;
    
    public TablaIntervalos(ArrayList<Dia> filasTabla) {
        cargarDatos(filasTabla);
    }

    public double getPromedioSobrantesTotal() {
        return promedioSobrantesTotal;
    }

    public void setPromedioSobrantesTotal(double promedioSobrantesTotal) {
        this.promedioSobrantesTotal = promedioSobrantesTotal;
    }

    public double getPromedioUtilidadTotal() {
        return promedioUtilidadTotal;
    }

    public void setPromedioUtilidadTotal(double promedioUtilidadTotal) {
        this.promedioUtilidadTotal = promedioUtilidadTotal;
    }

    
    private void cargarDatos(ArrayList<Dia> filasTabla) {
        Object[][] matrizTabla = new Object[calcularCantidadFilas(filasTabla) + 2][22]; // Crea la tabla de tamaño cantidadIntervalos+1X4
        int i = 0;

        //Acumuladores totales
        long acumuladorCantidadVendidaPorDia = 0, acumuladorSobrantePorDia = 0, acumuladorUtilidadPorDia = 0;

        for (Dia dia : filasTabla) //Recorre los intervalos
        {
            //Acumuladores por dia
            long acumuladorClientesCantidadVendida = 0, acumuladorSobrante = 0;

            matrizTabla[i][0] = dia.getNroDia() + 1;//Nro dia
            matrizTabla[i][1] = dia.getRndCantidadClientes().getRnd();// random clientes
            matrizTabla[i][2] = dia.getRndCantidadClientes().getNumero();// random clientes
            matrizTabla[i][3] = dia.getCantidadClientes();// cantidad de clientes con distribucion uniforme
            int produccion = 200;
            long ganancia = 0;
            acumuladorSobrante = produccion;

            for (Cliente cliente : dia.getClientes()) {
                i++;
                int j = cliente.getNroCliente();
                int demandaXcliente = cliente.getDemandaCliente() <= 200 ? cliente.getDemandaCliente() : 200;
                matrizTabla[i][4] = j;
                matrizTabla[i][5] = cliente.getRndDemanda().getNumero();
                matrizTabla[i][6] = demandaXcliente;
                matrizTabla[i][7] = cliente.getPrecioPorUnidadCliente();
                matrizTabla[i][8] = cliente.getPrecioPorUnidadCliente() * demandaXcliente;

                matrizTabla[i][9] = demandaXcliente;
                acumuladorClientesCantidadVendida += demandaXcliente;
                matrizTabla[i][10] = acumuladorClientesCantidadVendida;
                acumuladorSobrante = acumuladorSobrante - demandaXcliente;
                matrizTabla[i][11] = acumuladorSobrante;
                matrizTabla[i][13] = cliente.getPrecioPorUnidadCliente() * demandaXcliente;
                ganancia = ganancia + (cliente.getPrecioPorUnidadCliente() * demandaXcliente);
                matrizTabla[i][14] = ganancia;

            }
            dia.setCantidadVendida(acumuladorClientesCantidadVendida);
            acumuladorCantidadVendidaPorDia += acumuladorClientesCantidadVendida;
            dia.setCantidadVendidaAC(acumuladorCantidadVendidaPorDia);

            i++;
            acumuladorSobrantePorDia += acumuladorSobrante;
            dia.setSobrante(acumuladorSobrante);
            dia.setSobranteAC(acumuladorSobrantePorDia);
            matrizTabla[i][12] = acumuladorSobrante;

            acumuladorUtilidadPorDia += ganancia;
            dia.setUtilidad(ganancia);
            dia.setUtilidadAC(acumuladorUtilidadPorDia);
            matrizTabla[i][15] = acumuladorUtilidadPorDia;
            i++;
        }
        double promedioSobrante = filasTabla.get(filasTabla.size() - 1).getSobranteAC() / filasTabla.size();
        this.promedioSobrantesTotal = promedioSobrante;
        matrizTabla[i][0] = "Pastelitos sobrantes promedio por dia: " + promedioSobrante; // En la ultima fila agrega el total
        
        i++;
        double promedioUtilidad = filasTabla.get(filasTabla.size() - 1).getUtilidadAC()/ filasTabla.size();
        this.promedioUtilidadTotal = promedioUtilidad;
        matrizTabla[i][0] = "Utilidad promedio por dia: " + promedioUtilidad; // En la ultima fila agrega el total

        String[] NombresDeColumnas = new String[]{"Dia", "Rnd", "Variable Uniforme", "Clientes",
            "Nro Cliente", "Rnd Cliente", "Demanda Cliente", "Precio Cliente", "Importe Venta Cliente",
            "Pastelitos Vendidos", "Pastelitos Vendidos AC", "Sobrante", "Sobrante AC", "Utilidad", "Utilidad AC", ""

        };

        this.setDataVector(matrizTabla, NombresDeColumnas);
    }

    private Integer calcularCantidadFilas(ArrayList<Dia> filasTabla) {
        Integer cantidadFilas = filasTabla.size();
        for (Dia dia : filasTabla) {
            cantidadFilas = cantidadFilas + (dia.getCantidadClientes().intValue() + 1);
        }
        return cantidadFilas;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
}
