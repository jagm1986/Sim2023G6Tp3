package sim.tp3;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class TablaIntervalos extends DefaultTableModel {

    public TablaIntervalos(ArrayList<Dia> filasTabla) {
        cargarDatos(filasTabla);
    }

    private void cargarDatos(ArrayList<Dia> filasTabla) {
        Object[][] matrizTabla = new Object[calcularCantidadFilas(filasTabla)][20]; // Crea la tabla de tamaño cantidadIntervalos+1X4
        int i = 0;
        float acumuladorCantidadVendida = 0, acumuladorSobrante = 0, acumuladorUtilidad = 0;
        for (Dia dia : filasTabla) //Recorre los intervalos
        {
            matrizTabla[i][0] = dia.getNroDia() + 1;//Nro dia
            matrizTabla[i][1] = dia.getRndCantidadClientes().getRnd();// random clientes
            matrizTabla[i][2] = dia.getRndCantidadClientes().getNumero();// random clientes
            matrizTabla[i][3] = dia.getCantidadClientes();// cantidad de clientes con distribucion uniforme
            int produccion = 200;
            double ganancia = 0;
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
                acumuladorCantidadVendida += demandaXcliente;
                matrizTabla[i][10] = acumuladorCantidadVendida;
                produccion = produccion - demandaXcliente;
                matrizTabla[i][11] = produccion;
                matrizTabla[i][12] = cliente.getPrecioPorUnidadCliente() * demandaXcliente;
                ganancia = ganancia + (cliente.getPrecioPorUnidadCliente() * demandaXcliente);
                matrizTabla[i][13] = ganancia;

            }
            i++;
        }
        // matrizTabla[i][0]="Total"; // En la ultima fila agrega el total
     
        String[] NombresDeColumnas = new String[]{"Dia", "Rnd", "Variable Uniforme", "Clientes",
            "Nro Cliente", "Rnd Cliente", "Demanda Cliente", "Precio Cliente", "Importe Venta Cliente",
            "Cantidad Vendida", "AC Cantidad Vendida", "Sobrante", "Utilidad", "AC utilidad"

        };

        this.setDataVector(matrizTabla, NombresDeColumnas);
    }

    private Integer calcularCantidadFilas(ArrayList<Dia> filasTabla){
        Integer cantidadFilas = filasTabla.size();
        for(Dia dia: filasTabla){
            cantidadFilas = cantidadFilas + dia.getCantidadClientes().intValue();
        }
        return cantidadFilas;
    }
            
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
}
