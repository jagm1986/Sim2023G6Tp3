

package sim.tp3;


import java.util.ArrayList;
import java.util.Collections;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;


public class TablaNumeros extends DefaultTableModel
{
    private String[]  mColumnas ={"Orden", "Aleatorio"};
    private ArrayList<NumeroRNDTable> numeros;
    
     
    
    public TablaNumeros(ArrayList<NumeroRNDTable> nums) {
       cargarDatos(nums);
    }
    
 
     private void cargarDatos(ArrayList<NumeroRNDTable> filasTabla)
    {
           Object[][] matrizTabla = new Object[filasTabla.size()+1][3]; // Crea la tabla de tamaño cantidadIntervalos+1X4
            int i = 0;
            for(NumeroRNDTable nroActual : filasTabla) //Recorre los intervalos
            {
                
                matrizTabla[i][0]=nroActual.getOrden();// "Lim inferior" - "Lim superior"
                matrizTabla[i][1]=nroActual.getNumero();// Frecuencia observada del intervalo
                i++;
            } 
            matrizTabla[i][0]="Total Numeros: " + filasTabla.size() ; // En la ultima fila agrega el total
            String[] NombresDeColumnas =  new String [] 
            {  "Orden", "Nro Aleatorio"};
            
            this.setDataVector(matrizTabla, NombresDeColumnas);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){return false; }
   
}
