package sim.tp3;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private final ManejadorDias manejador;

    public Principal() {
        initComponents();

        manejador = new ManejadorDias();
        this.setLocationRelativeTo(null);
    }

    private void limpiarTextBox() {
        prob1.setText("");
        precio1.setText("");
        prob2.setText("");
        precio2.setText("");
        prob5.setText("");
        precio5.setText("");
        prob6.setText("");
        precio6.setText("");
        prob7.setText("");
        precio7.setText("");
        prob8.setText("");
        precio8.setText("");
        prob10.setText("");
        precio10.setText("");

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
        jLabel2 = new javax.swing.JLabel();
        precio1 = new javax.swing.JTextField();
        lblB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        prob1 = new javax.swing.JTextField();
        txtN = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lblResultadoPrueba = new javax.swing.JLabel();
        lblIntegrantes = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        prob2 = new javax.swing.JTextField();
        precio2 = new javax.swing.JTextField();
        precio5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        prob5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        prob6 = new javax.swing.JTextField();
        precio6 = new javax.swing.JTextField();
        precio7 = new javax.swing.JTextField();
        prob7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        prob8 = new javax.swing.JTextField();
        precio8 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        prob10 = new javax.swing.JTextField();
        precio10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        sobranteTotal = new javax.swing.JTextField();
        utilidadTotal = new javax.swing.JTextField();

        jLabel14.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel14.setText("Seleccione la cantidad de intervalos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setText("Venta Callejera de Pastelitos");

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setText("Demanda");

        precio1.setText("100");
        precio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio1ActionPerformed(evt);
            }
        });

        lblB.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblB.setText("Precio de venta x unidad");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel5.setText("Probabilidad");

        prob1.setText("0.1");
        prob1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prob1ActionPerformed(evt);
            }
        });

        txtN.setText("2");

        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel13.setText("Dias");

        btnGenerar.setText("Simular");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Dia", "Rnd", "Clientes", "Rnd CLi 1", "Demanda Cliente 1", "Precio Cli 1", "Importe Venta Cli 1", "Rnd Cli 2", "Demanda Cliente 2", "Precio Cli 2", "Importe Venta Cli 2"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        lblResultadoPrueba.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N

        lblIntegrantes.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        lblIntegrantes.setText("Integrantes: Pirra Juan Pablo, Gudin Andres, Lopez Eduardo, Mafud Hassan, Ghirardotti Andres");

        jLabel16.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel16.setText("1");

        jLabel17.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel17.setText("2");

        prob2.setText("0.2");

        precio2.setText("100");

        precio5.setText("100");
        precio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio5ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel18.setText("5");

        prob5.setText("0.4");

        jLabel19.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel19.setText("6");

        prob6.setText("0.1");

        precio6.setText("100");

        precio7.setText("80");

        prob7.setText("0.1");

        jLabel20.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel20.setText("7");

        jLabel21.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel21.setText("8");

        prob8.setText("0.05");

        precio8.setText("80");

        jLabel22.setFont(new java.awt.Font("Cambria Math", 0, 12)); // NOI18N
        jLabel22.setText("10");

        prob10.setText("0.05");

        precio10.setText("80");

        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel15.setText("Utilidad promedio por día: ");

        jLabel23.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel23.setText("Número promedio de pastelitos que le sobran por día: ");

        sobranteTotal.setEditable(false);
        sobranteTotal.setBackground(new java.awt.Color(204, 255, 204));

        utilidadTotal.setEditable(false);
        utilidadTotal.setBackground(new java.awt.Color(204, 255, 204));
        utilidadTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilidadTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultadoPrueba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel19)
                                                    .addComponent(jLabel20)
                                                    .addComponent(jLabel21)
                                                    .addComponent(jLabel22))
                                                .addGap(53, 53, 53)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(prob8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(prob7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(prob10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel18))
                                                .addGap(53, 53, 53)
                                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(prob5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(prob2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(prob6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(90, 90, 90)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(precio2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(precio5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(precio6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(precio7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(precio8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(precio10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(sobranteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(utilidadTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(182, 182, 182))
                                    .addComponent(jScrollPane1))
                                .addGap(31, 31, 31)))
                        .addContainerGap())
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(prob1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(lblIntegrantes)
                        .addGap(25, 25, 25))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(prob2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prob5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prob6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(prob7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(prob8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(prob10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(precio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precio10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(utilidadTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(sobranteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(lblResultadoPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Generar Numeros aleatorios y calcular frecuencias
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        manejador.resetear();
        boolean fallo = false;

        if (prob1.getText().equals("") || precio1.getText().equals("")
                || prob2.getText().equals("") || precio5.getText().equals("")
                || prob5.getText().equals("") || precio2.getText().equals("")
                || prob6.getText().equals("") || precio6.getText().equals("")
                || prob7.getText().equals("") || precio7.getText().equals("")
                || prob8.getText().equals("") || precio8.getText().equals("")
                || prob10.getText().equals("") || precio10.getText().equals("")) {

            JOptionPane.showMessageDialog(new JFrame(), "Para simular complete todos los campos de probabilidades y precios",
                    "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
            fallo = true;

        }

        if (prob1.getText().contains(",")
                || prob2.getText().contains(",")
                || prob5.getText().contains(",")
                || prob6.getText().contains(",")
                || prob7.getText().contains(",")
                || prob8.getText().contains(",")
                || prob10.getText().contains(",")) {

            JOptionPane.showMessageDialog(new JFrame(), "Los valores de probabilidades no pueden contener comas ,",
                    "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
            fallo = true;

        }

        if (Double.parseDouble(prob1.getText()) + Double.parseDouble(prob2.getText())
                + Double.parseDouble(prob5.getText())
                + Double.parseDouble(prob6.getText())
                + Double.parseDouble(prob7.getText())
                + Double.parseDouble(prob8.getText())
                + Double.parseDouble(prob10.getText()) > 1) {

            JOptionPane.showMessageDialog(new JFrame(), "La suma de las probabilidades no puede ser mayor a uno",
                    "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
            fallo = true;

        }

        if (fallo == false) {
            TablaDemanda tablaDemanda = new TablaDemanda();
            List<Demanda> listaDemandas = new ArrayList<>();
            Double probabilidadAC = 0d;

            Demanda demanda1 = new Demanda(1, Integer.parseInt(precio1.getText()), Double.parseDouble(prob1.getText()), Double.parseDouble(prob1.getText() + 0));
            Demanda demanda2 = new Demanda(2, Integer.parseInt(precio2.getText()), Double.parseDouble(prob2.getText()), Double.parseDouble(prob2.getText()) + Double.parseDouble(prob1.getText()));
            Demanda demanda5 = new Demanda(5, Integer.parseInt(precio5.getText()), Double.parseDouble(prob5.getText()), Double.parseDouble(prob5.getText()) + Double.parseDouble(prob2.getText()));
            Demanda demanda6 = new Demanda(6, Integer.parseInt(precio6.getText()), Double.parseDouble(prob6.getText()), Double.parseDouble(prob6.getText()) + Double.parseDouble(prob5.getText()));
            Demanda demanda7 = new Demanda(7, Integer.parseInt(precio7.getText()), Double.parseDouble(prob7.getText()), Double.parseDouble(prob7.getText()) + Double.parseDouble(prob6.getText()));
            Demanda demanda8 = new Demanda(8, Integer.parseInt(precio8.getText()), Double.parseDouble(prob8.getText()), Double.parseDouble(prob8.getText()) + Double.parseDouble(prob7.getText()));
            Demanda demanda10 = new Demanda(10, Integer.parseInt(precio10.getText()), Double.parseDouble(prob10.getText()), Double.parseDouble(prob10.getText()) + Double.parseDouble(prob8.getText()));

            listaDemandas.add(demanda1);
            listaDemandas.add(demanda2);
            listaDemandas.add(demanda5);
            listaDemandas.add(demanda6);
            listaDemandas.add(demanda7);
            listaDemandas.add(demanda8);
            listaDemandas.add(demanda10);

            tablaDemanda.setDemandaPastelitos(listaDemandas);

            manejador.setTablaDemanda(tablaDemanda);

            boolean discreta = true;

            if (Integer.parseInt(txtN.getText()) < 100001 & Integer.parseInt(txtN.getText()) > 0) {
                manejador.setN(Integer.parseInt(txtN.getText()));
                fallo = false;
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "_La cantidad de dias no deberia ser mayor a 100000 o menor a 0", "Parámetros incorrectos", JOptionPane.WARNING_MESSAGE);
                txtN.requestFocus();
                fallo = true;
            }

            if (fallo == false) {
                float extremoInferior = 10, extremoSuperior = 30;
                try {

                    manejador.generarDistribucionUniforme(extremoInferior, extremoSuperior);
                    fallo = false;

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(new JFrame(), "Error al generar distribuciñon uniforme", "Error inesperado"
                            + "", JOptionPane.WARNING_MESSAGE);
                    fallo = true;
                }

            }

            if (fallo == false) {
                int cantidadDias = Integer.parseInt(txtN.getText());

                System.out.println("Cantidad de dias a simular: " + cantidadDias);

                manejador.crearDias(cantidadDias); // se crean los dias en el manejador

                //Carga de grilla
                TablaIntervalos filas = new TablaIntervalos(manejador.getIntervalos());
                tabla.setModel(filas);

                utilidadTotal.setText(String.valueOf(filas.getPromedioUtilidadTotal()));
                sobranteTotal.setText(String.valueOf(filas.getPromedioSobrantesTotal()));

            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void precio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio5ActionPerformed

    private void precio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precio1ActionPerformed

    private void prob1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prob1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prob1ActionPerformed

    private void utilidadTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilidadTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utilidadTotalActionPerformed

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
    private javax.swing.JButton btnGenerar;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup grupoCantidadIntervalos;
    private javax.swing.ButtonGroup grupoRadioIntervalos;
    private javax.swing.ButtonGroup grupoRdDistribuciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblIntegrantes;
    private javax.swing.JLabel lblResultadoPrueba;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField precio1;
    private javax.swing.JTextField precio10;
    private javax.swing.JTextField precio2;
    private javax.swing.JTextField precio5;
    private javax.swing.JTextField precio6;
    private javax.swing.JTextField precio7;
    private javax.swing.JTextField precio8;
    private javax.swing.JTextField prob1;
    private javax.swing.JTextField prob10;
    private javax.swing.JTextField prob2;
    private javax.swing.JTextField prob5;
    private javax.swing.JTextField prob6;
    private javax.swing.JTextField prob7;
    private javax.swing.JTextField prob8;
    private javax.swing.JTextField sobranteTotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField utilidadTotal;
    // End of variables declaration//GEN-END:variables
}
