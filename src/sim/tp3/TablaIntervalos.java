
package sim.tp3;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TablaIntervalos extends DefaultTableModel
{
    public TablaIntervalos(ArrayList<Intervalo> filasTabla)
    {
      cargarDatos(filasTabla);
    }
    private void cargarDatos(ArrayList<Intervalo> filasTabla)
    {
           Object[][] matrizTabla = new Object[filasTabla.size()+1][4]; // Crea la tabla de tamaño cantidadIntervalos+1X4
            int i = 0; float acumuladorFrecuenciaObservada =0,acumuladorFrecuenciaEsperada=0; 
            for(Intervalo intervaloActual : filasTabla) //Recorre los intervalos
            {
                
                matrizTabla[i][0]=intervaloActual.nombreIntervalo();// "Lim inferior" - "Lim superior"
                matrizTabla[i][1]=intervaloActual.getFrecuenciaObservada();// Frecuencia observada del intervalo
                matrizTabla[i][2]=intervaloActual.getFrecuenciaEsperada();// Frecuencia esperada del intervalo
                acumuladorFrecuenciaObservada += intervaloActual.getFrecuenciaObservada();  //Acumulador para frecuencias observadas (Que se muestra en el total)
                acumuladorFrecuenciaEsperada += intervaloActual.getFrecuenciaEsperada(); //Acumulador para frecuencia esperada(Que se muestra en el total)
                i++;
            } 
            matrizTabla[i][0]="Total"; // En la ultima fila agrega el total
            matrizTabla[i][1]=acumuladorFrecuenciaObservada; //Acumulador para frecuencias observadas
            matrizTabla[i][2]=acumuladorFrecuenciaEsperada; //Acumulador para frecuencia esperada
            String[] NombresDeColumnas =  new String [] 
            {  "Intervalo", "Frecuencia observada", "Frecuencia esperada"};
            
            this.setDataVector(matrizTabla, NombresDeColumnas);
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){return false; }
}
