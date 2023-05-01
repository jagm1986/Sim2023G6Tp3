
package sim.tp3;

import com.sun.source.tree.BreakTree;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Principal extends javax.swing.JFrame {

   
    private final ManejadorIntervalos manejador;
    
    public Principal() 
    {
        initComponents();
       
        manejador = new ManejadorIntervalos();
        this.setLocationRelativeTo(null);
        tablaNumeros.setAutoCreateRowSorter(true);
    }

   private void limpiarTextBox()
   {
     txtA.setText("");
     txtB.setText("");
     txtLambdaExp.setText("");
     txtMedia.setText("");
     txtDesviacion.setText("");
    
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRdDistribuciones = new javax.swing.ButtonGroup();
        grupoCantidadIntervalos = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        grupoRadioIntervalos = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdUniforme = new javax.swing.JRadioButton();
        rdExponencial = new javax.swing.JRadioButton();
        rdNormal = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        txtLambdaExp = new javax.swing.JTextField();
        lblA = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        lblB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDesviacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMedia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnGraficar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaNumeros = new javax.swing.JTable();
        txtIntervalos = new javax.swing.JTextField();
        lblResultadoPrueba = new javax.swing.JLabel();
        lblIntegrantes = new javax.swing.JLabel();
        rdIntervalo15 = new javax.swing.JRadioButton();
        rdIntervalo20 = new javax.swing.JRadioButton();
        rdIntervalo10 = new javax.swing.JRadioButton();
        rdIntervalo25 = new javax.swing.JRadioButton();
        txtHasta = new javax.swing.JTextField();
        txtDesde = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnFiltro = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel14.setText("Seleccione la cantidad de intervalos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione una distribución ");

        grupoRdDistribuciones.add(rdUniforme);
        rdUniforme.setSelected(true);
        rdUniforme.setText("Uniforme");
        rdUniforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdUniformeActionPerformed(evt);
            }
        });

        grupoRdDistribuciones.add(rdExponencial);
        rdExponencial.setText("Exponencial");
        rdExponencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdExponencialActionPerformed(evt);
            }
        });

        grupoRdDistribuciones.add(rdNormal);
        rdNormal.setText("Normal");
        rdNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNormalActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setText("Uniforme");

        txtLambdaExp.setEnabled(false);

        lblA.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblA.setText("A");

        lblB.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblB.setText("B");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel5.setText("Exponencial");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel6.setText("λ");

        jLabel9.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel9.setText("Normal");

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel10.setText("σ");

        txtDesviacion.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel11.setText("μ");

        txtN.setText("5000");

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel12.setText("Ingrese la cantidad de intervalos:");

        txtMedia.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel13.setText("N");

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Intervalo", "Frecuencia observada", "Frecuencia esperada"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(tablaNumeros);

        txtIntervalos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntervalosActionPerformed(evt);
            }
        });

        lblResultadoPrueba.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        lblIntegrantes.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblIntegrantes.setText("Integrantes: Pirra Juan Pablo, Gudin Andres, Lopez Eduardo, Mafud Hassan, Ghirardotti Andres");

        grupoRadioIntervalos.add(rdIntervalo15);
        rdIntervalo15.setText("15");
        rdIntervalo15.setActionCommand("intervalo15");
        rdIntervalo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdIntervalo15ActionPerformed(evt);
            }
        });

        grupoRadioIntervalos.add(rdIntervalo20);
        rdIntervalo20.setText("20");
        rdIntervalo20.setActionCommand("intervalo20");
        rdIntervalo20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdIntervalo20ActionPerformed(evt);
            }
        });

        grupoRadioIntervalos.add(rdIntervalo10);
        rdIntervalo10.setText("10");
        rdIntervalo10.setActionCommand("intervalo10");
        rdIntervalo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdIntervalo10ActionPerformed(evt);
            }
        });

        grupoRadioIntervalos.add(rdIntervalo25);
        rdIntervalo25.setText("25");
        rdIntervalo25.setActionCommand("intervalo25");
        rdIntervalo25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdIntervalo25ActionPerformed(evt);
            }
        });

        txtHasta.setEnabled(false);
        txtHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHastaActionPerformed(evt);
            }
        });

        txtDesde.setEnabled(false);
        txtDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesdeActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel15.setText("Desde");

        jLabel16.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel16.setText("Hasta");

        btnFiltro.setText("Filtro desde-hasta");
        btnFiltro.setEnabled(false);
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultadoPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(lblIntegrantes))
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1)
                                .addGroup(panelLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblA, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(24, 24, 24)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtLambdaExp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(rdUniforme)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(rdExponencial)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdNormal))
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDesviacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelLayout.createSequentialGroup()
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(panelLayout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(panelLayout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(9, 9, 9))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(txtIntervalos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(rdIntervalo10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rdIntervalo15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rdIntervalo20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rdIntervalo25))))
                                    .addGap(84, 84, 84)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdUniforme)
                            .addComponent(rdExponencial)
                            .addComponent(rdNormal))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblA)
                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblB)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(txtLambdaExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(txtDesviacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdIntervalo15)
                            .addComponent(rdIntervalo20)
                            .addComponent(rdIntervalo25)
                            .addComponent(rdIntervalo10)
                            .addComponent(txtIntervalos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGenerar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel15)
                                            .addComponent(txtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41))
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(btnFiltro))))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(139, 139, 139)
                .addComponent(lblResultadoPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rdIntervalo15.getAccessibleContext().setAccessibleName("10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdUniformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdUniformeActionPerformed
           if( rdUniforme.isSelected() )
           {
             txtA.setEnabled(true);txtB.setEnabled(true);
             txtLambdaExp.setEnabled(false);
             txtMedia.setEnabled(false);txtDesviacion.setEnabled(false);
             limpiarTextBox();
           }
    }//GEN-LAST:event_rdUniformeActionPerformed

    private void rdExponencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdExponencialActionPerformed
          if( rdExponencial.isSelected() )
           {
             txtLambdaExp.setEnabled(true);
             txtA.setEnabled(false);txtB.setEnabled(false);
             txtMedia.setEnabled(false);txtDesviacion.setEnabled(false);
             limpiarTextBox();
           }
    }//GEN-LAST:event_rdExponencialActionPerformed

    private void rdNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNormalActionPerformed
           if( rdNormal.isSelected() )
           {
             txtMedia.setEnabled(true);txtDesviacion.setEnabled(true);
             txtLambdaExp.setEnabled(false);
             txtA.setEnabled(false);txtB.setEnabled(false);
             limpiarTextBox();
           }
    }//GEN-LAST:event_rdNormalActionPerformed

    //Generar Numeros aleatorios y calcular frecuencias
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
       
        boolean fallo = false;
        
        if (!rdUniforme.isSelected() && !rdExponencial.isSelected() && !rdNormal.isSelected() ){
            
        JOptionPane.showMessageDialog(new JFrame(), "Para generar seleccione una distribución",
                "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);             

        }
        
        manejador.resetear();
        
        boolean discreta = true;
      
        if(Integer.parseInt(txtN.getText()) < 1000001 & Integer.parseInt(txtN.getText()) > 0)
        {
                    manejador.setN(Integer.parseInt(txtN.getText()));
                    fallo = false;
        }
        else
        {
            JOptionPane.showMessageDialog(new JFrame(), "N no deberia ser mayor a 1000000 o menor a 0", "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
            txtN.requestFocus();
            fallo = true;
        }
        
        
        if( rdUniforme.isSelected() && fallo == false)
        {
            float extremoInferior=0,extremoSuperior=0;
            try {
                extremoInferior = Float.parseFloat(txtA.getText());
                extremoSuperior = Float.parseFloat(txtB.getText());
                
                if(extremoInferior > extremoSuperior && fallo == false)
                {
                    JOptionPane.showMessageDialog(new JFrame(), "A no puede ser mayor a B", "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
                    fallo = true;
                }
                else
                {
                     manejador.generarDistribucionUniforme(extremoInferior, extremoSuperior);
                     fallo = false;
                } 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(new JFrame(), "El extremo superior o inferior es incorrecto", "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
                fallo = true;
            }
           

           ///
           
        }
        if(rdExponencial.isSelected() && fallo == false)
        {
             
          float lambdaExponencial = Float.parseFloat(txtLambdaExp.getText());
             if(lambdaExponencial <= 0 )
           {
               JOptionPane.showMessageDialog(new JFrame(), "Lambda no puede ser menor o igual a 0", "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
               fallo = true;
           }
          manejador.generarDistribucionExponencial(lambdaExponencial);
        }
        
        if(rdNormal.isSelected() && fallo == false)
        {
            float mediaNormal = Float.parseFloat(txtMedia.getText());
            float desviacionNormal = Float.parseFloat(txtDesviacion.getText());
            if(desviacionNormal < 0)
           {
               JOptionPane.showMessageDialog(new JFrame(), "La desviacion normal debe ser mayor a 0", "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
               fallo = true;
           }
           else
           {
                manejador.generarDistribucionNormal(mediaNormal, desviacionNormal);
                fallo = false;
           } 
            
        }
        
        if(fallo == false)

        {
        int cantidadIntervalos=0;

           try {
        if (!txtIntervalos.getText().equals("")) {
          cantidadIntervalos = Integer.parseInt(txtIntervalos.getText());
        } else if (rdIntervalo10.isSelected()) {
          cantidadIntervalos = Integer.parseInt(rdIntervalo10.getText());
        } else if (rdIntervalo15.isSelected()) {
          cantidadIntervalos = Integer.parseInt(rdIntervalo15.getText());
        } else if (rdIntervalo20.isSelected()) {
          cantidadIntervalos = Integer.parseInt(rdIntervalo20.getText());
        } else if (rdIntervalo25.isSelected()) {
          cantidadIntervalos = Integer.parseInt(rdIntervalo25.getText());
        }
      } catch (Exception e) {
        {
          JOptionPane.showMessageDialog(new JFrame(), "La cantidad de intervalos debe ser un numero entero", "Parámetros incorrectos"
                  , JOptionPane.WARNING_MESSAGE);
          fallo = true;
        }
      } 
        
        System.out.println("Cantidad de intervalos a generar: " + cantidadIntervalos);
        
        manejador.crearIntervalos(cantidadIntervalos); // se crean los intervalos en el manejador
        
        manejador.contarFrecuenciaObservadaPorIntervalo(); // Cuenta la frecuencia esperada por cada intervalo
        
        manejador.calcularFrecuenciaEsperadaParaIntervalos(); //Calcula frecuencia esperada para intervalos
        
              
        //Carga de grilla
        //agregar el desde hasta
        tabla.setModel(new TablaIntervalos(manejador.getIntervalos()));
        tablaNumeros.setModel(new TablaNumeros(manejador.getNumerosGenerados2()));
        //habilitamos los elemetos para el filtro
        this.txtDesde.setEnabled(true);
        this.txtHasta.setEnabled(true);
        this.btnFiltro.setEnabled(true);
        
        }
       
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        
        ArrayList<Intervalo> numerosAletorios = manejador.getIntervalos();
        
        if(numerosAletorios != null && numerosAletorios.size() > 0)
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
             for (Intervalo num : numerosAletorios) 
             {
                dataset.addValue(num.getFrecuenciaObservada(),num.nombreIntervalo(),"");
             }
                 
     
            /*      
            // crear grafico barras 3d
            JFreeChart graficoBarras = ChartFactory.createBarChart3D(
                     "Frecuencia de números aleatorios generados por intervalo",        //Título de la gráfica
                     "Intervalos",           //leyenda Eje horizontal
                     "Frecuencia observada",      //leyenda Eje vertical
                     dataset,                   //datos
                     PlotOrientation.VERTICAL,  //orientación
                     true,                      //incluir leyendas
                     true,                      //mostrar tooltips
                     true);                   

            graficoBarras.setBackgroundPaint(Color.lightGray);

            CategoryPlot plot =(CategoryPlot) graficoBarras.getPlot();
            plot.setBackgroundPaint(Color.white); //fondo del grafico
            plot.setDomainGridlinesVisible(true);//lineas de rangos, visibles
            plot.setRangeGridlinePaint(Color.BLACK);//color de las lineas de rangos
            

            // crear la ventana del grafico
            ChartFrame frame = new ChartFrame("Gráfico de barras",graficoBarras);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
             */
            
              // crear grafico
            JFreeChart graficoBarras = ChartFactory.createBarChart(
                    "Frecuencia de números aleatorios generados por intervalo",        //Título de la gráfica
                     "Intervalos",           //leyenda Eje horizontal
                     "Frecuencia observada",      //leyenda Eje vertical
                     dataset,                   //datos
                     PlotOrientation.VERTICAL,  //orientación
                     true,                      //incluir leyendas
                     true,                      //mostrar tooltips
                     true);                   

            graficoBarras.setBackgroundPaint(Color.lightGray);

            CategoryPlot plot =(CategoryPlot) graficoBarras.getPlot();
            plot.setBackgroundPaint(Color.white); //fondo del grafico
            plot.setDomainGridlinesVisible(true);//lineas de rangos, visibles
            plot.setRangeGridlinePaint(Color.BLACK);//color de las lineas de rangos
            

            // crear la ventana del grafico
            ChartFrame frame = new ChartFrame("Histograma",graficoBarras);
            frame.pack();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        }
        else
            JOptionPane.showMessageDialog(this,"Debe cargar numeros antes de graficar","Error",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void txtIntervalosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntervalosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntervalosActionPerformed

    private void rdIntervalo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdIntervalo15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdIntervalo15ActionPerformed

    private void rdIntervalo20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdIntervalo20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdIntervalo20ActionPerformed

    private void rdIntervalo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdIntervalo10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdIntervalo10ActionPerformed

    private void rdIntervalo25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdIntervalo25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdIntervalo25ActionPerformed

    private void txtHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHastaActionPerformed

    private void txtDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesdeActionPerformed

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed
        // TODO add your handling code here:
        String errores="";
        int desde=0,hasta=0;
        try {
            desde=Integer.parseInt(this.txtDesde.getText());
            if (desde<=0) {
                errores="- El filtro Desde debe ser mayor de cero";
            }
        } catch (Exception e) {
                errores="- Filtro Desde no ingresado o ingresado con formato incorrecto (debe ser número entero)";
        }
        try {
            hasta=Integer.parseInt(this.txtHasta.getText());
            if (hasta<=0) {
                errores=errores+"\n- El filtro Hasta debe ser mayor de cero";
            }
        } catch (Exception e) {
                errores=errores+"\n- Filtro Hasta no ingresado o ingresado con formato incorrecto (debe ser número entero)";
        }
        
        if (desde>=hasta && errores!="") {
            errores="El Desde debe ser menor que le Hasta.";
        }
        
        if (!errores.equals("")) {
            JOptionPane.showMessageDialog(new JFrame(), errores, "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);  
        }else{
            tablaNumeros.setModel(new TablaNumeros(manejador.getNumerosGeneradosDesdeHasta2(desde, hasta)));
        }
        
    }//GEN-LAST:event_btnFiltroActionPerformed

    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltro;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGraficar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup grupoCantidadIntervalos;
    private javax.swing.ButtonGroup grupoRadioIntervalos;
    private javax.swing.ButtonGroup grupoRdDistribuciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblIntegrantes;
    private javax.swing.JLabel lblResultadoPrueba;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButton rdExponencial;
    private javax.swing.JRadioButton rdIntervalo10;
    private javax.swing.JRadioButton rdIntervalo15;
    private javax.swing.JRadioButton rdIntervalo20;
    private javax.swing.JRadioButton rdIntervalo25;
    private javax.swing.JRadioButton rdNormal;
    private javax.swing.JRadioButton rdUniforme;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tablaNumeros;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtDesviacion;
    private javax.swing.JTextField txtHasta;
    private javax.swing.JTextField txtIntervalos;
    private javax.swing.JTextField txtLambdaExp;
    private javax.swing.JTextField txtMedia;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}
