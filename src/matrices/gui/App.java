package matrices.gui;

import javafx.scene.control.ButtonType;
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Calculadora");
        Sumatoria.setTitle("Sumatorias");
        Multi.setTitle("Multiplicacion");
        Determinante.setTitle("Determinante");
        dejarOcultas();
        dejarOcultasM();
        agregar_datos();
        pnlSumatoria.updateUI();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Sumatoria = new javax.swing.JFrame();
        pnlSumatoria = new javax.swing.JPanel();
        cbMatrizSum2 = new javax.swing.JComboBox<>();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        txtA11 = new javax.swing.JTextField();
        txtA12 = new javax.swing.JTextField();
        txtA13 = new javax.swing.JTextField();
        txtA21 = new javax.swing.JTextField();
        txtA22 = new javax.swing.JTextField();
        txtA23 = new javax.swing.JTextField();
        txtA31 = new javax.swing.JTextField();
        txtA32 = new javax.swing.JTextField();
        txtA33 = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        txtB11 = new javax.swing.JTextField();
        txtB12 = new javax.swing.JTextField();
        txtB13 = new javax.swing.JTextField();
        txtB21 = new javax.swing.JTextField();
        txtB22 = new javax.swing.JTextField();
        txtB23 = new javax.swing.JTextField();
        txtB31 = new javax.swing.JTextField();
        txtB32 = new javax.swing.JTextField();
        txtB33 = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        txtC11 = new javax.swing.JTextField();
        txtC12 = new javax.swing.JTextField();
        txtC13 = new javax.swing.JTextField();
        txtC21 = new javax.swing.JTextField();
        txtC22 = new javax.swing.JTextField();
        txtC23 = new javax.swing.JTextField();
        txtC31 = new javax.swing.JTextField();
        txtC32 = new javax.swing.JTextField();
        txtC33 = new javax.swing.JTextField();
        cbMatrizSum1 = new javax.swing.JComboBox<>();
        Multi = new javax.swing.JFrame();
        pnlMultiplicacion = new javax.swing.JPanel();
        cbMatrizM1 = new javax.swing.JComboBox<>();
        cbMatrizM2 = new javax.swing.JComboBox<>();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        txtMatrizAM11 = new javax.swing.JTextField();
        txtMatrizAM21 = new javax.swing.JTextField();
        txtMatrizAM31 = new javax.swing.JTextField();
        txtMatrizAM13 = new javax.swing.JTextField();
        txtMatrizAM12 = new javax.swing.JTextField();
        txtMatrizAM23 = new javax.swing.JTextField();
        txtMatrizAM22 = new javax.swing.JTextField();
        txtMatrizAM32 = new javax.swing.JTextField();
        txtMatrizAM33 = new javax.swing.JTextField();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        txtMatrizBM11 = new javax.swing.JTextField();
        txtMatrizBM21 = new javax.swing.JTextField();
        txtMatrizBM31 = new javax.swing.JTextField();
        txtMatrizBM13 = new javax.swing.JTextField();
        txtMatrizBM12 = new javax.swing.JTextField();
        txtMatrizBM23 = new javax.swing.JTextField();
        txtMatrizBM22 = new javax.swing.JTextField();
        txtMatrizBM32 = new javax.swing.JTextField();
        txtMatrizBM33 = new javax.swing.JTextField();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        txtMatrizCM11 = new javax.swing.JTextField();
        txtMatrizCM21 = new javax.swing.JTextField();
        txtMatrizCM31 = new javax.swing.JTextField();
        txtMatrizCM13 = new javax.swing.JTextField();
        txtMatrizCM12 = new javax.swing.JTextField();
        txtMatrizCM23 = new javax.swing.JTextField();
        txtMatrizCM22 = new javax.swing.JTextField();
        txtMatrizCM32 = new javax.swing.JTextField();
        txtMatrizCM33 = new javax.swing.JTextField();
        btnMulti = new javax.swing.JButton();
        Determinante = new javax.swing.JFrame();
        pnlDeterminante = new javax.swing.JPanel();
        menuPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSumatorias = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnDeterminante = new javax.swing.JButton();

        Sumatoria.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Sumatoria.setTitle("Sumatoria");
        Sumatoria.setMaximumSize(new java.awt.Dimension(500, 500));
        Sumatoria.setMinimumSize(new java.awt.Dimension(100, 100));
        Sumatoria.setPreferredSize(new java.awt.Dimension(500, 500));
        Sumatoria.setSize(new java.awt.Dimension(400, 400));
        Sumatoria.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                SumatoriaWindowClosing(evt);
            }
        });

        pnlSumatoria.setPreferredSize(new java.awt.Dimension(435, 400));

        cbMatrizSum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMatrizSum2ActionPerformed(evt);
            }
        });

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz 1"));
        jLayeredPane2.setAlignmentX(150.0F);
        jLayeredPane2.setAlignmentY(150.0F);
        jLayeredPane2.setMinimumSize(new java.awt.Dimension(150, 150));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtA11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA11.setText("0");
        jLayeredPane2.add(txtA11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 41, 30));

        txtA12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA12.setText("0");
        jLayeredPane2.add(txtA12, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 27, 41, 30));

        txtA13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA13.setText("0");
        jLayeredPane2.add(txtA13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 27, 41, 30));

        txtA21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA21.setText("0");
        jLayeredPane2.add(txtA21, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, 41, 30));

        txtA22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA22.setText("0");
        jLayeredPane2.add(txtA22, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 63, 41, 30));

        txtA23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA23.setText("0");
        jLayeredPane2.add(txtA23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 63, 41, 30));

        txtA31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA31.setText("0");
        jLayeredPane2.add(txtA31, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 99, 41, 30));

        txtA32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA32.setText("0");
        jLayeredPane2.add(txtA32, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 99, 41, 30));

        txtA33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA33.setText("0");
        jLayeredPane2.add(txtA33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 99, 41, 30));

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz 2"));
        jLayeredPane3.setMinimumSize(new java.awt.Dimension(150, 150));
        jLayeredPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtB11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB11.setText("0");
        jLayeredPane3.add(txtB11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 41, 30));

        txtB12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB12.setText("0");
        jLayeredPane3.add(txtB12, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 27, 41, 30));

        txtB13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB13.setText("0");
        jLayeredPane3.add(txtB13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 27, 41, 30));

        txtB21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB21.setText("0");
        jLayeredPane3.add(txtB21, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, 41, 30));

        txtB22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB22.setText("0");
        jLayeredPane3.add(txtB22, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 63, 41, 30));

        txtB23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB23.setText("0");
        jLayeredPane3.add(txtB23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 63, 41, 30));

        txtB31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB31.setText("0");
        jLayeredPane3.add(txtB31, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 99, 41, 30));

        txtB32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB32.setText("0");
        jLayeredPane3.add(txtB32, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 99, 41, 30));

        txtB33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB33.setText("0");
        jLayeredPane3.add(txtB33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 99, 41, 30));

        jLayeredPane4.setLayout(new java.awt.GridBagLayout());

        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        jLayeredPane4.add(btnSumar, gridBagConstraints);

        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 11, 10);
        jLayeredPane4.add(btnRestar, gridBagConstraints);

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz resultante"));
        jLayeredPane5.setMinimumSize(new java.awt.Dimension(150, 150));
        jLayeredPane5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtC11.setEditable(false);
        txtC11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane5.add(txtC11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 35, 30));

        txtC12.setEditable(false);
        txtC12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane5.add(txtC12, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 27, 35, 30));

        txtC13.setEditable(false);
        txtC13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane5.add(txtC13, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 27, 35, 30));

        txtC21.setEditable(false);
        txtC21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane5.add(txtC21, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 63, 35, 30));

        txtC22.setEditable(false);
        txtC22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane5.add(txtC22, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 63, 35, 30));

        txtC23.setEditable(false);
        txtC23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane5.add(txtC23, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 63, 35, 30));

        txtC31.setEditable(false);
        txtC31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane5.add(txtC31, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 99, 35, 30));

        txtC32.setEditable(false);
        txtC32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane5.add(txtC32, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 99, 35, 30));

        txtC33.setEditable(false);
        txtC33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLayeredPane5.add(txtC33, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 99, 35, 30));

        cbMatrizSum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMatrizSum1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSumatoriaLayout = new javax.swing.GroupLayout(pnlSumatoria);
        pnlSumatoria.setLayout(pnlSumatoriaLayout);
        pnlSumatoriaLayout.setHorizontalGroup(
            pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                .addComponent(cbMatrizSum1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMatrizSum2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        pnlSumatoriaLayout.setVerticalGroup(
            pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMatrizSum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMatrizSum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout SumatoriaLayout = new javax.swing.GroupLayout(Sumatoria.getContentPane());
        Sumatoria.getContentPane().setLayout(SumatoriaLayout);
        SumatoriaLayout.setHorizontalGroup(
            SumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSumatoria, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        SumatoriaLayout.setVerticalGroup(
            SumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SumatoriaLayout.createSequentialGroup()
                .addComponent(pnlSumatoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        Multi.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                MultiWindowClosing(evt);
            }
        });

        cbMatrizM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMatrizM1ActionPerformed(evt);
            }
        });

        cbMatrizM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMatrizM2ActionPerformed(evt);
            }
        });

        jLayeredPane6.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz 1"));
        jLayeredPane6.setPreferredSize(new java.awt.Dimension(151, 129));

        txtMatrizAM11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizAM11.setText("0");

        txtMatrizAM21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizAM21.setText("0");

        txtMatrizAM31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizAM31.setText("0");

        txtMatrizAM13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizAM13.setText("0");

        txtMatrizAM12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizAM12.setText("0");

        txtMatrizAM23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizAM23.setText("0");

        txtMatrizAM22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizAM22.setText("0");

        txtMatrizAM32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizAM32.setText("0");

        txtMatrizAM33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizAM33.setText("0");

        jLayeredPane6.setLayer(txtMatrizAM11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(txtMatrizAM21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(txtMatrizAM31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(txtMatrizAM13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(txtMatrizAM12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(txtMatrizAM23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(txtMatrizAM22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(txtMatrizAM32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane6.setLayer(txtMatrizAM33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane6Layout = new javax.swing.GroupLayout(jLayeredPane6);
        jLayeredPane6.setLayout(jLayeredPane6Layout);
        jLayeredPane6Layout.setHorizontalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(txtMatrizAM31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizAM32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizAM33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(txtMatrizAM21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizAM22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizAM23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane6Layout.createSequentialGroup()
                        .addComponent(txtMatrizAM11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizAM12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizAM13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane6Layout.setVerticalGroup(
            jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatrizAM11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizAM12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizAM13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatrizAM21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizAM22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizAM23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatrizAM31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizAM32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizAM33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane7.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz 2"));
        jLayeredPane7.setPreferredSize(new java.awt.Dimension(151, 129));

        txtMatrizBM11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizBM11.setText("0");

        txtMatrizBM21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizBM21.setText("0");

        txtMatrizBM31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizBM31.setText("0");

        txtMatrizBM13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizBM13.setText("0");

        txtMatrizBM12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizBM12.setText("0");

        txtMatrizBM23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizBM23.setText("0");

        txtMatrizBM22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizBM22.setText("0");

        txtMatrizBM32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizBM32.setText("0");

        txtMatrizBM33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizBM33.setText("0");

        jLayeredPane7.setLayer(txtMatrizBM11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(txtMatrizBM21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(txtMatrizBM31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(txtMatrizBM13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(txtMatrizBM12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(txtMatrizBM23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(txtMatrizBM22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(txtMatrizBM32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane7.setLayer(txtMatrizBM33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane7Layout = new javax.swing.GroupLayout(jLayeredPane7);
        jLayeredPane7.setLayout(jLayeredPane7Layout);
        jLayeredPane7Layout.setHorizontalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                        .addComponent(txtMatrizBM31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizBM32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizBM33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                        .addComponent(txtMatrizBM21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizBM22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizBM23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane7Layout.createSequentialGroup()
                        .addComponent(txtMatrizBM11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizBM12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizBM13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jLayeredPane7Layout.setVerticalGroup(
            jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatrizBM11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizBM12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizBM13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatrizBM21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizBM22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizBM23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatrizBM31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizBM32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizBM33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matriz 3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jLayeredPane8.setPreferredSize(new java.awt.Dimension(151, 129));

        txtMatrizCM11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizCM11.setText("0");

        txtMatrizCM21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizCM21.setText("0");

        txtMatrizCM31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizCM31.setText("0");

        txtMatrizCM13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizCM13.setText("0");

        txtMatrizCM12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizCM12.setText("0");

        txtMatrizCM23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizCM23.setText("0");

        txtMatrizCM22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizCM22.setText("0");

        txtMatrizCM32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizCM32.setText("0");

        txtMatrizCM33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMatrizCM33.setText("0");

        jLayeredPane8.setLayer(txtMatrizCM11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(txtMatrizCM21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(txtMatrizCM31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(txtMatrizCM13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(txtMatrizCM12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(txtMatrizCM23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(txtMatrizCM22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(txtMatrizCM32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane8.setLayer(txtMatrizCM33, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane8Layout = new javax.swing.GroupLayout(jLayeredPane8);
        jLayeredPane8.setLayout(jLayeredPane8Layout);
        jLayeredPane8Layout.setHorizontalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane8Layout.createSequentialGroup()
                        .addComponent(txtMatrizCM31, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizCM32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizCM33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane8Layout.createSequentialGroup()
                        .addComponent(txtMatrizCM21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizCM22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizCM23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane8Layout.createSequentialGroup()
                        .addComponent(txtMatrizCM11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizCM12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatrizCM13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jLayeredPane8Layout.setVerticalGroup(
            jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatrizCM11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizCM12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizCM13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatrizCM21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizCM22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizCM23, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatrizCM31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizCM32, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMatrizCM33, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnMulti.setText("*");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMultiplicacionLayout = new javax.swing.GroupLayout(pnlMultiplicacion);
        pnlMultiplicacion.setLayout(pnlMultiplicacionLayout);
        pnlMultiplicacionLayout.setHorizontalGroup(
            pnlMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMultiplicacionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbMatrizM1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMatrizM2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMultiplicacionLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnMulti)
                .addGap(60, 60, 60))
        );
        pnlMultiplicacionLayout.setVerticalGroup(
            pnlMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMultiplicacionLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMatrizM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMatrizM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLayeredPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGroup(pnlMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMultiplicacionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMultiplicacionLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnMulti)))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout MultiLayout = new javax.swing.GroupLayout(Multi.getContentPane());
        Multi.getContentPane().setLayout(MultiLayout);
        MultiLayout.setHorizontalGroup(
            MultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MultiLayout.setVerticalGroup(
            MultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MultiLayout.createSequentialGroup()
                .addComponent(pnlMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Determinante.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                DeterminanteWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout pnlDeterminanteLayout = new javax.swing.GroupLayout(pnlDeterminante);
        pnlDeterminante.setLayout(pnlDeterminanteLayout);
        pnlDeterminanteLayout.setHorizontalGroup(
            pnlDeterminanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlDeterminanteLayout.setVerticalGroup(
            pnlDeterminanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DeterminanteLayout = new javax.swing.GroupLayout(Determinante.getContentPane());
        Determinante.getContentPane().setLayout(DeterminanteLayout);
        DeterminanteLayout.setHorizontalGroup(
            DeterminanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDeterminante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DeterminanteLayout.setVerticalGroup(
            DeterminanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDeterminante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setName("menuPrincipal"); // NOI18N

        menuPrincipal.setMaximumSize(new java.awt.Dimension(500, 500));
        menuPrincipal.setPreferredSize(new java.awt.Dimension(150, 250));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu Principal");

        btnSumatorias.setText("Sumatorias");
        btnSumatorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumatoriasActionPerformed(evt);
            }
        });

        btnMultiplicacion.setText("Multiplicacion");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        btnDeterminante.setText("Determinante");

        javax.swing.GroupLayout menuPrincipalLayout = new javax.swing.GroupLayout(menuPrincipal);
        menuPrincipal.setLayout(menuPrincipalLayout);
        menuPrincipalLayout.setHorizontalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuPrincipalLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeterminante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSumatorias, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuPrincipalLayout.setVerticalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSumatorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMultiplicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeterminante)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(menuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumatoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatoriasActionPerformed
        Sumatoria.setBounds(0, 0, 450, 450);
        Sumatoria.setLocationRelativeTo(null);
        Sumatoria.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSumatoriasActionPerformed

    private void SumatoriaWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_SumatoriaWindowClosing
        salir();
    }//GEN-LAST:event_SumatoriaWindowClosing

    private void MultiWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_MultiWindowClosing
        salir();
    }//GEN-LAST:event_MultiWindowClosing

    private void DeterminanteWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_DeterminanteWindowClosing
        salir();
    }//GEN-LAST:event_DeterminanteWindowClosing

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        int[][] a = new int[3][3];
        a[0][0] = Integer.parseInt(txtA11.getText());
        a[0][1] = Integer.parseInt(txtA12.getText());
        a[0][2] = Integer.parseInt(txtA13.getText());
        a[1][0] = Integer.parseInt(txtA21.getText());
        a[1][1] = Integer.parseInt(txtA22.getText());
        a[1][2] = Integer.parseInt(txtA23.getText());
        a[2][0] = Integer.parseInt(txtA31.getText());
        a[2][1] = Integer.parseInt(txtA32.getText());
        a[2][2] = Integer.parseInt(txtA33.getText());

        int[][] b = new int[3][3];
        b[0][0] = Integer.parseInt(txtB11.getText());
        b[0][1] = Integer.parseInt(txtB12.getText());
        b[0][2] = Integer.parseInt(txtB13.getText());
        b[1][0] = Integer.parseInt(txtB21.getText());
        b[1][1] = Integer.parseInt(txtB22.getText());
        b[1][2] = Integer.parseInt(txtB23.getText());
        b[2][0] = Integer.parseInt(txtB31.getText());
        b[2][1] = Integer.parseInt(txtB32.getText());
        b[2][2] = Integer.parseInt(txtB33.getText());

        int[][] c = new int[3][3];

        c[0][0] = a[0][0] - b[0][0];
        c[0][1] = a[0][1] - b[0][1];
        c[0][2] = a[0][2] - b[0][2];
        c[1][0] = a[1][0] - b[1][0];
        c[1][1] = a[1][1] - b[1][1];
        c[1][2] = a[1][2] - b[1][2];
        c[2][0] = a[2][0] - b[2][0];
        c[2][1] = a[2][1] - b[2][1];
        c[2][2] = a[2][2] - b[2][2];

        //seteo de texto
        txtC11.setText(String.valueOf(c[0][0]));
        txtC12.setText(String.valueOf(c[0][1]));
        txtC13.setText(String.valueOf(c[0][2]));
        txtC21.setText(String.valueOf(c[1][0]));
        txtC22.setText(String.valueOf(c[1][1]));
        txtC23.setText(String.valueOf(c[1][2]));
        txtC31.setText(String.valueOf(c[2][0]));
        txtC32.setText(String.valueOf(c[2][1]));
        txtC33.setText(String.valueOf(c[2][2]));
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        String m1 = cbMatrizSum1.getSelectedItem().toString();
        String m2 = cbMatrizSum2.getSelectedItem().toString();

        if (m1 == m2) {

            int[][] a = new int[3][3];
            a[0][0] = Integer.parseInt(txtA11.getText());
            a[0][1] = Integer.parseInt(txtA12.getText());
            a[0][2] = Integer.parseInt(txtA13.getText());
            a[1][0] = Integer.parseInt(txtA21.getText());
            a[1][1] = Integer.parseInt(txtA22.getText());
            a[1][2] = Integer.parseInt(txtA23.getText());
            a[2][0] = Integer.parseInt(txtA31.getText());
            a[2][1] = Integer.parseInt(txtA32.getText());
            a[2][2] = Integer.parseInt(txtA33.getText());

            int[][] b = new int[3][3];
            b[0][0] = Integer.parseInt(txtB11.getText());
            b[0][1] = Integer.parseInt(txtB12.getText());
            b[0][2] = Integer.parseInt(txtB13.getText());
            b[1][0] = Integer.parseInt(txtB21.getText());
            b[1][1] = Integer.parseInt(txtB22.getText());
            b[1][2] = Integer.parseInt(txtB23.getText());
            b[2][0] = Integer.parseInt(txtB31.getText());
            b[2][1] = Integer.parseInt(txtB32.getText());
            b[2][2] = Integer.parseInt(txtB33.getText());

            int[][] c = new int[3][3];

            c[0][0] = a[0][0] + b[0][0];
            c[0][1] = a[0][1] + b[0][1];
            c[0][2] = a[0][2] + b[0][2];
            c[1][0] = a[1][0] + b[1][0];
            c[1][1] = a[1][1] + b[1][1];
            c[1][2] = a[1][2] + b[1][2];
            c[2][0] = a[2][0] + b[2][0];
            c[2][1] = a[2][1] + b[2][1];
            c[2][2] = a[2][2] + b[2][2];

            //seteo de texto
            txtC11.setText(String.valueOf(c[0][0]));
            txtC12.setText(String.valueOf(c[0][1]));
            txtC13.setText(String.valueOf(c[0][2]));
            txtC21.setText(String.valueOf(c[1][0]));
            txtC22.setText(String.valueOf(c[1][1]));
            txtC23.setText(String.valueOf(c[1][2]));
            txtC31.setText(String.valueOf(c[2][0]));
            txtC32.setText(String.valueOf(c[2][1]));
            txtC33.setText(String.valueOf(c[2][2]));
        } else {//JOptionPane.showConfirmDialog(this, "volver a menu principal", "mensaje", JOptionPane.YES_NO_OPTION
            JOptionPane.showMessageDialog(this, "solo las matrices de mismo orden se pueden sumar o restar", "alerta", JOptionPane.YES_OPTION);
        }
        //hacer visible la respuesta
        String opc = cbMatrizSum1.getSelectedItem().toString();
        visible_respuesta(opc);


    }//GEN-LAST:event_btnSumarActionPerformed

    private void cbMatrizSum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMatrizSum2ActionPerformed
        String opc = cbMatrizSum2.getSelectedItem().toString();
        dejarvisibleM2(opc);
    }//GEN-LAST:event_cbMatrizSum2ActionPerformed

    private void cbMatrizSum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMatrizSum1ActionPerformed
        // lblMuestra.setText(cbPrueba.getSelectedItem().toString());
        String opc = cbMatrizSum1.getSelectedItem().toString();
        dejarvisibleM1(opc);
    }//GEN-LAST:event_cbMatrizSum1ActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        Multi.setBounds(0, 0, 450, 450);
        Multi.setLocationRelativeTo(null);
        Multi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void cbMatrizM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMatrizM1ActionPerformed
        String opc = cbMatrizM1.getSelectedItem().toString();
        dejarvisibleM1(opc);
    }//GEN-LAST:event_cbMatrizM1ActionPerformed

    private void cbMatrizM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMatrizM2ActionPerformed
        String opc = cbMatrizM2.getSelectedItem().toString();
        dejarvisibleM2(opc);
    }//GEN-LAST:event_cbMatrizM2ActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        boolean confi = confirmarMulti();
        if (confi = true) {
            System.out.println("si fuunciona");
        }

    }//GEN-LAST:event_btnMultiActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Determinante;
    private javax.swing.JFrame Multi;
    private javax.swing.JFrame Sumatoria;
    private javax.swing.JButton btnDeterminante;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnSumatorias;
    private javax.swing.JComboBox<String> cbMatrizM1;
    private javax.swing.JComboBox<String> cbMatrizM2;
    private javax.swing.JComboBox<String> cbMatrizSum1;
    private javax.swing.JComboBox<String> cbMatrizSum2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JPanel menuPrincipal;
    private javax.swing.JPanel pnlDeterminante;
    private javax.swing.JPanel pnlMultiplicacion;
    private javax.swing.JPanel pnlSumatoria;
    private javax.swing.JTextField txtA11;
    private javax.swing.JTextField txtA12;
    private javax.swing.JTextField txtA13;
    private javax.swing.JTextField txtA21;
    private javax.swing.JTextField txtA22;
    private javax.swing.JTextField txtA23;
    private javax.swing.JTextField txtA31;
    private javax.swing.JTextField txtA32;
    private javax.swing.JTextField txtA33;
    private javax.swing.JTextField txtB11;
    private javax.swing.JTextField txtB12;
    private javax.swing.JTextField txtB13;
    private javax.swing.JTextField txtB21;
    private javax.swing.JTextField txtB22;
    private javax.swing.JTextField txtB23;
    private javax.swing.JTextField txtB31;
    private javax.swing.JTextField txtB32;
    private javax.swing.JTextField txtB33;
    private javax.swing.JTextField txtC11;
    private javax.swing.JTextField txtC12;
    private javax.swing.JTextField txtC13;
    private javax.swing.JTextField txtC21;
    private javax.swing.JTextField txtC22;
    private javax.swing.JTextField txtC23;
    private javax.swing.JTextField txtC31;
    private javax.swing.JTextField txtC32;
    private javax.swing.JTextField txtC33;
    private javax.swing.JTextField txtMatrizAM11;
    private javax.swing.JTextField txtMatrizAM12;
    private javax.swing.JTextField txtMatrizAM13;
    private javax.swing.JTextField txtMatrizAM21;
    private javax.swing.JTextField txtMatrizAM22;
    private javax.swing.JTextField txtMatrizAM23;
    private javax.swing.JTextField txtMatrizAM31;
    private javax.swing.JTextField txtMatrizAM32;
    private javax.swing.JTextField txtMatrizAM33;
    private javax.swing.JTextField txtMatrizBM11;
    private javax.swing.JTextField txtMatrizBM12;
    private javax.swing.JTextField txtMatrizBM13;
    private javax.swing.JTextField txtMatrizBM21;
    private javax.swing.JTextField txtMatrizBM22;
    private javax.swing.JTextField txtMatrizBM23;
    private javax.swing.JTextField txtMatrizBM31;
    private javax.swing.JTextField txtMatrizBM32;
    private javax.swing.JTextField txtMatrizBM33;
    private javax.swing.JTextField txtMatrizCM11;
    private javax.swing.JTextField txtMatrizCM12;
    private javax.swing.JTextField txtMatrizCM13;
    private javax.swing.JTextField txtMatrizCM21;
    private javax.swing.JTextField txtMatrizCM22;
    private javax.swing.JTextField txtMatrizCM23;
    private javax.swing.JTextField txtMatrizCM31;
    private javax.swing.JTextField txtMatrizCM32;
    private javax.swing.JTextField txtMatrizCM33;
    // End of variables declaration//GEN-END:variables
public void salir() {
        if (JOptionPane.showConfirmDialog(this, "volver a menu principal", "mensaje", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            volverMenuPrincipal();

        }
    }

    public void volverMenuPrincipal() {
        App m = new App();
        this.setVisible(false);
        m.setLocationRelativeTo(null);

        m.setVisible(true);

    }

    public void agregar_datos() {

        cbMatrizSum1.addItem("");
        cbMatrizSum1.addItem("1*1");
        cbMatrizSum1.addItem("1*2");
        cbMatrizSum1.addItem("1*3");
        cbMatrizSum1.addItem("2*1");
        cbMatrizSum1.addItem("2*2");
        cbMatrizSum1.addItem("2*3");
        cbMatrizSum1.addItem("3*1");
        cbMatrizSum1.addItem("3*2");
        cbMatrizSum1.addItem("3*3");

        cbMatrizSum2.addItem("");
        cbMatrizSum2.addItem("1*1");
        cbMatrizSum2.addItem("1*2");
        cbMatrizSum2.addItem("1*3");
        cbMatrizSum2.addItem("2*1");
        cbMatrizSum2.addItem("2*2");
        cbMatrizSum2.addItem("2*3");
        cbMatrizSum2.addItem("3*1");
        cbMatrizSum2.addItem("3*2");
        cbMatrizSum2.addItem("3*3");

        cbMatrizM1.addItem("");
        cbMatrizM1.addItem("1*1");
        cbMatrizM1.addItem("1*2");
        cbMatrizM1.addItem("1*3");
        cbMatrizM1.addItem("2*1");
        cbMatrizM1.addItem("2*2");
        cbMatrizM1.addItem("2*3");
        cbMatrizM1.addItem("3*1");
        cbMatrizM1.addItem("3*2");
        cbMatrizM1.addItem("3*3");

        cbMatrizM2.addItem("");
        cbMatrizM2.addItem("1*1");
        cbMatrizM2.addItem("1*2");
        cbMatrizM2.addItem("1*3");
        cbMatrizM2.addItem("2*1");
        cbMatrizM2.addItem("2*2");
        cbMatrizM2.addItem("2*3");
        cbMatrizM2.addItem("3*1");
        cbMatrizM2.addItem("3*2");
        cbMatrizM2.addItem("3*3");
    }

    public void dejarOcultas() {
        txtA11.setVisible(false);
        txtA12.setVisible(false);
        txtA13.setVisible(false);
        txtA21.setVisible(false);
        txtA22.setVisible(false);
        txtA23.setVisible(false);
        txtA31.setVisible(false);
        txtA32.setVisible(false);
        txtA33.setVisible(false);

        txtB11.setVisible(false);
        txtB12.setVisible(false);
        txtB13.setVisible(false);
        txtB21.setVisible(false);
        txtB22.setVisible(false);
        txtB23.setVisible(false);
        txtB31.setVisible(false);
        txtB32.setVisible(false);
        txtB33.setVisible(false);

        txtC11.setVisible(false);
        txtC12.setVisible(false);
        txtC13.setVisible(false);
        txtC21.setVisible(false);
        txtC22.setVisible(false);
        txtC23.setVisible(false);
        txtC31.setVisible(false);
        txtC32.setVisible(false);
        txtC33.setVisible(false);

    }

    public void dejarOcultasM() {
        txtMatrizAM11.setVisible(false);
        txtMatrizAM12.setVisible(false);
        txtMatrizAM13.setVisible(false);
        txtMatrizAM21.setVisible(false);
        txtMatrizAM22.setVisible(false);
        txtMatrizAM23.setVisible(false);
        txtMatrizAM31.setVisible(false);
        txtMatrizAM32.setVisible(false);
        txtMatrizAM33.setVisible(false);

        txtMatrizBM11.setVisible(false);
        txtMatrizBM12.setVisible(false);
        txtMatrizBM13.setVisible(false);
        txtMatrizBM21.setVisible(false);
        txtMatrizBM22.setVisible(false);
        txtMatrizBM23.setVisible(false);
        txtMatrizBM31.setVisible(false);
        txtMatrizBM32.setVisible(false);
        txtMatrizBM33.setVisible(false);

        txtMatrizCM11.setVisible(false);
        txtMatrizCM12.setVisible(false);
        txtMatrizCM13.setVisible(false);
        txtMatrizCM21.setVisible(false);
        txtMatrizCM22.setVisible(false);
        txtMatrizCM23.setVisible(false);
        txtMatrizCM31.setVisible(false);
        txtMatrizCM32.setVisible(false);
        txtMatrizCM33.setVisible(false);
    }

    public void dejarvisibleM1(String opc) {

        switch (opc) {
            case ("1*1"):
                txtA11.setVisible(true);
                txtMatrizAM11.setVisible(true);
                txtA12.setVisible(false);
                txtMatrizAM12.setVisible(false);
                txtA13.setVisible(false);
                txtMatrizAM13.setVisible(false);
                txtA21.setVisible(false);
                txtMatrizAM21.setVisible(false);
                txtA22.setVisible(false);
                txtMatrizAM22.setVisible(false);
                txtA23.setVisible(false);
                txtMatrizAM23.setVisible(false);
                txtA31.setVisible(false);
                txtMatrizAM31.setVisible(false);
                txtA32.setVisible(false);
                txtMatrizAM32.setVisible(false);
                txtA33.setVisible(false);
                txtMatrizAM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            case ("1*2"):
                txtA11.setVisible(true);
                txtMatrizAM11.setVisible(true);
                txtA12.setVisible(true);
                txtMatrizAM12.setVisible(true);
                txtA13.setVisible(false);
                txtMatrizAM13.setVisible(false);
                txtA21.setVisible(false);
                txtMatrizAM21.setVisible(false);
                txtA22.setVisible(false);
                txtMatrizAM22.setVisible(false);
                txtA23.setVisible(false);
                txtMatrizAM23.setVisible(false);
                txtA31.setVisible(false);
                txtMatrizAM31.setVisible(false);
                txtA32.setVisible(false);
                txtMatrizAM32.setVisible(false);
                txtA33.setVisible(false);
                txtMatrizAM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            case ("1*3"): {
                txtA11.setVisible(true);
                txtMatrizAM11.setVisible(true);
                txtA12.setVisible(true);
                txtMatrizAM12.setVisible(true);
                txtA13.setVisible(true);
                txtMatrizAM13.setVisible(true);
                txtA21.setVisible(false);
                txtMatrizAM21.setVisible(false);
                txtA22.setVisible(false);
                txtMatrizAM22.setVisible(false);
                txtA23.setVisible(false);
                txtMatrizAM23.setVisible(false);
                txtA31.setVisible(false);
                txtMatrizAM31.setVisible(false);
                txtA32.setVisible(false);
                txtMatrizAM32.setVisible(false);
                txtA33.setVisible(false);
                txtMatrizAM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("2*1"): {
                txtA11.setVisible(true);
                txtMatrizAM11.setVisible(true);
                txtA12.setVisible(false);
                txtMatrizAM12.setVisible(false);
                txtA13.setVisible(false);
                txtMatrizAM13.setVisible(false);
                txtA21.setVisible(true);
                txtMatrizAM21.setVisible(true);
                txtA22.setVisible(false);
                txtMatrizAM22.setVisible(false);
                txtA23.setVisible(false);
                txtMatrizAM23.setVisible(false);
                txtA31.setVisible(false);
                txtMatrizAM31.setVisible(false);
                txtA32.setVisible(false);
                txtMatrizAM32.setVisible(false);
                txtA33.setVisible(false);
                txtMatrizAM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("2*2"): {
                txtA11.setVisible(true);
                txtMatrizAM11.setVisible(true);
                txtA12.setVisible(true);
                txtMatrizAM12.setVisible(true);
                txtA13.setVisible(false);
                txtMatrizAM13.setVisible(false);
                txtA21.setVisible(true);
                txtMatrizAM21.setVisible(true);
                txtA22.setVisible(true);
                txtMatrizAM22.setVisible(true);
                txtA23.setVisible(false);
                txtMatrizAM23.setVisible(false);
                txtA31.setVisible(false);
                txtMatrizAM31.setVisible(false);
                txtA32.setVisible(false);
                txtMatrizAM32.setVisible(false);
                txtA33.setVisible(false);
                txtMatrizAM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("2*3"): {

                txtA11.setVisible(true);
                txtMatrizAM11.setVisible(true);
                txtA12.setVisible(true);
                txtMatrizAM12.setVisible(true);
                txtA13.setVisible(true);
                txtMatrizAM13.setVisible(true);
                txtA21.setVisible(true);
                txtMatrizAM21.setVisible(true);
                txtA22.setVisible(true);
                txtMatrizAM22.setVisible(true);
                txtA23.setVisible(true);
                txtMatrizAM23.setVisible(true);
                txtA31.setVisible(false);
                txtMatrizAM31.setVisible(false);
                txtA32.setVisible(false);
                txtMatrizAM32.setVisible(false);
                txtA33.setVisible(false);
                txtMatrizAM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("3*1"): {
                txtA11.setVisible(true);
                txtMatrizAM11.setVisible(true);
                txtA12.setVisible(false);
                txtMatrizAM12.setVisible(false);
                txtA13.setVisible(false);
                txtMatrizAM13.setVisible(false);
                txtA21.setVisible(true);
                txtMatrizAM21.setVisible(true);
                txtA22.setVisible(false);
                txtMatrizAM22.setVisible(false);
                txtA23.setVisible(false);
                txtMatrizAM23.setVisible(false);
                txtA31.setVisible(true);
                txtMatrizAM31.setVisible(true);
                txtA32.setVisible(false);
                txtMatrizAM32.setVisible(false);
                txtA33.setVisible(false);
                txtMatrizAM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("3*2"): {
                txtA11.setVisible(true);
                txtMatrizAM11.setVisible(true);
                txtA12.setVisible(true);
                txtMatrizAM12.setVisible(true);
                txtA13.setVisible(false);
                txtMatrizAM13.setVisible(false);
                txtA21.setVisible(true);
                txtMatrizAM21.setVisible(true);
                txtA22.setVisible(true);
                txtMatrizAM22.setVisible(true);
                txtA23.setVisible(false);
                txtMatrizAM23.setVisible(false);
                txtA31.setVisible(true);
                txtMatrizAM31.setVisible(true);
                txtA32.setVisible(true);
                txtMatrizAM32.setVisible(true);
                txtA33.setVisible(false);
                txtMatrizAM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("3*3"): {
                txtA11.setVisible(true);
                txtMatrizAM11.setVisible(true);
                txtA12.setVisible(true);
                txtMatrizAM12.setVisible(true);
                txtA13.setVisible(true);
                txtMatrizAM13.setVisible(true);
                txtA21.setVisible(true);
                txtMatrizAM21.setVisible(true);
                txtA22.setVisible(true);
                txtMatrizAM22.setVisible(true);
                txtA23.setVisible(true);
                txtMatrizAM23.setVisible(true);
                txtA31.setVisible(true);
                txtMatrizAM31.setVisible(true);
                txtA32.setVisible(true);
                txtMatrizAM32.setVisible(true);
                txtA33.setVisible(true);
                txtMatrizAM33.setVisible(true);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
        }

    }

    public void dejarvisibleM2(String opc) {

        switch (opc) {
            case ("1*1"):
                txtB11.setVisible(true);
                txtMatrizBM11.setVisible(true);
                txtB12.setVisible(false);
                txtMatrizBM12.setVisible(false);
                txtB13.setVisible(false);
                txtMatrizBM13.setVisible(false);
                txtB21.setVisible(false);
                txtMatrizBM21.setVisible(false);
                txtB22.setVisible(false);
                txtMatrizBM22.setVisible(false);
                txtB23.setVisible(false);
                txtMatrizBM23.setVisible(false);
                txtB31.setVisible(false);
                txtMatrizBM31.setVisible(false);
                txtB32.setVisible(false);
                txtMatrizBM32.setVisible(false);
                txtB33.setVisible(false);
                txtMatrizBM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            case ("1*2"):
                txtB11.setVisible(true);
                txtMatrizBM11.setVisible(true);
                txtB12.setVisible(true);
                txtMatrizBM12.setVisible(true);
                txtB13.setVisible(false);
                txtMatrizBM13.setVisible(false);
                txtB21.setVisible(false);
                txtMatrizBM21.setVisible(false);
                txtB22.setVisible(false);
                txtMatrizBM22.setVisible(false);
                txtB23.setVisible(false);
                txtMatrizBM23.setVisible(false);
                txtB31.setVisible(false);
                txtMatrizBM31.setVisible(false);
                txtB32.setVisible(false);
                txtMatrizBM32.setVisible(false);
                txtB33.setVisible(false);
                txtMatrizBM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            case ("1*3"): {
                txtB11.setVisible(true);
                txtMatrizBM11.setVisible(true);
                txtB12.setVisible(true);
                txtMatrizBM12.setVisible(true);
                txtB13.setVisible(true);
                txtMatrizBM13.setVisible(true);
                txtB21.setVisible(false);
                txtMatrizBM21.setVisible(false);
                txtB22.setVisible(false);
                txtMatrizBM22.setVisible(false);
                txtB23.setVisible(false);
                txtMatrizBM23.setVisible(false);
                txtB31.setVisible(false);
                txtMatrizBM31.setVisible(false);
                txtB32.setVisible(false);
                txtMatrizBM32.setVisible(false);
                txtB33.setVisible(false);
                txtMatrizBM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("2*1"): {
                txtB11.setVisible(true);
                txtMatrizBM11.setVisible(true);
                txtB12.setVisible(false);
                txtMatrizBM12.setVisible(false);
                txtB13.setVisible(false);
                txtMatrizBM13.setVisible(false);
                txtB21.setVisible(true);
                txtMatrizBM21.setVisible(true);
                txtB22.setVisible(false);
                txtMatrizBM22.setVisible(false);
                txtB23.setVisible(false);
                txtMatrizBM23.setVisible(false);
                txtB31.setVisible(false);
                txtMatrizBM31.setVisible(false);
                txtB32.setVisible(false);
                txtMatrizBM32.setVisible(false);
                txtB33.setVisible(false);
                txtMatrizBM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("2*2"): {
                txtB11.setVisible(true);
                txtMatrizBM11.setVisible(true);
                txtB12.setVisible(true);
                txtMatrizBM12.setVisible(true);
                txtB13.setVisible(false);
                txtMatrizBM13.setVisible(false);
                txtB21.setVisible(true);
                txtMatrizBM21.setVisible(true);
                txtB22.setVisible(true);
                txtMatrizBM22.setVisible(true);
                txtB23.setVisible(false);
                txtMatrizBM23.setVisible(false);
                txtB31.setVisible(false);
                txtMatrizBM31.setVisible(false);
                txtB32.setVisible(false);
                txtMatrizBM32.setVisible(false);
                txtB33.setVisible(false);
                txtMatrizBM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("2*3"): {

                txtB11.setVisible(true);
                txtMatrizBM11.setVisible(true);
                txtB12.setVisible(true);
                txtMatrizBM12.setVisible(true);
                txtB13.setVisible(true);
                txtMatrizBM13.setVisible(true);
                txtB21.setVisible(true);
                txtMatrizBM21.setVisible(true);
                txtB22.setVisible(true);
                txtMatrizBM22.setVisible(true);
                txtB23.setVisible(true);
                txtMatrizBM23.setVisible(true);
                txtB31.setVisible(false);
                txtMatrizBM31.setVisible(false);
                txtB32.setVisible(false);
                txtMatrizBM32.setVisible(false);
                txtB33.setVisible(false);
                txtMatrizBM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("3*1"): {
                txtB11.setVisible(true);
                txtMatrizBM11.setVisible(true);
                txtB12.setVisible(false);
                txtMatrizBM12.setVisible(false);
                txtB13.setVisible(false);
                txtMatrizBM13.setVisible(false);
                txtB21.setVisible(true);
                txtMatrizBM21.setVisible(true);
                txtB22.setVisible(false);
                txtMatrizBM22.setVisible(false);
                txtB23.setVisible(false);
                txtMatrizBM23.setVisible(false);
                txtB31.setVisible(true);
                txtMatrizBM31.setVisible(true);
                txtB32.setVisible(false);
                txtMatrizBM32.setVisible(false);
                txtB33.setVisible(false);
                txtMatrizBM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("3*2"): {
                txtB11.setVisible(true);
                txtMatrizBM11.setVisible(true);
                txtB12.setVisible(true);
                txtMatrizBM12.setVisible(true);
                txtB13.setVisible(false);
                txtMatrizBM13.setVisible(false);
                txtB21.setVisible(true);
                txtMatrizBM21.setVisible(true);
                txtB22.setVisible(true);
                txtMatrizBM22.setVisible(true);
                txtB23.setVisible(false);
                txtMatrizBM23.setVisible(false);
                txtB31.setVisible(true);
                txtMatrizBM31.setVisible(true);
                txtB32.setVisible(true);
                txtMatrizBM32.setVisible(true);
                txtB33.setVisible(false);
                txtMatrizBM33.setVisible(false);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
            case ("3*3"): {
                txtB11.setVisible(true);
                txtMatrizBM11.setVisible(true);
                txtB12.setVisible(true);
                txtMatrizBM12.setVisible(true);
                txtB13.setVisible(true);
                txtMatrizBM13.setVisible(true);
                txtB21.setVisible(true);
                txtMatrizBM21.setVisible(true);
                txtB22.setVisible(true);
                txtMatrizBM22.setVisible(true);
                txtB23.setVisible(true);
                txtMatrizBM23.setVisible(true);
                txtB31.setVisible(true);
                txtMatrizBM31.setVisible(true);
                txtB32.setVisible(true);
                txtMatrizBM32.setVisible(true);
                txtB33.setVisible(true);
                txtMatrizBM33.setVisible(true);
                pnlSumatoria.updateUI();
                pnlMultiplicacion.updateUI();
                break;
            }
        }
    }

    private void visible_respuesta(String opc) {
        switch (opc) {
            case ("1*1"):
                txtC11.setVisible(true);
                txtC12.setVisible(false);
                txtC13.setVisible(false);
                txtC21.setVisible(false);
                txtC22.setVisible(false);
                txtC23.setVisible(false);
                txtC31.setVisible(false);
                txtC32.setVisible(false);
                txtC33.setVisible(false);
                break;
            case ("1*2"):
                txtC11.setVisible(true);
                txtC12.setVisible(true);
                txtC13.setVisible(false);
                txtC21.setVisible(false);
                txtC22.setVisible(false);
                txtC23.setVisible(false);
                txtC31.setVisible(false);
                txtC32.setVisible(false);
                txtC33.setVisible(false);
                pnlSumatoria.updateUI();
                break;
            case ("1*3"): {
                txtC11.setVisible(true);
                txtC12.setVisible(true);
                txtC13.setVisible(true);
                txtC21.setVisible(false);
                txtC22.setVisible(false);
                txtC23.setVisible(false);
                txtC31.setVisible(false);
                txtC32.setVisible(false);
                txtC33.setVisible(false);
                pnlSumatoria.updateUI();
                break;
            }
            case ("2*1"): {
                txtC11.setVisible(true);
                txtC12.setVisible(false);
                txtC13.setVisible(false);
                txtC21.setVisible(true);
                txtC22.setVisible(false);
                txtC23.setVisible(false);
                txtC31.setVisible(false);
                txtC32.setVisible(false);
                txtC33.setVisible(false);
                pnlSumatoria.updateUI();
                break;
            }
            case ("2*2"): {
                txtC11.setVisible(true);
                txtC12.setVisible(true);
                txtC13.setVisible(false);
                txtC21.setVisible(true);
                txtC22.setVisible(true);
                txtC23.setVisible(false);
                txtC31.setVisible(false);
                txtC32.setVisible(false);
                txtC33.setVisible(false);
                pnlSumatoria.updateUI();
                break;
            }
            case ("2*3"): {

                txtC11.setVisible(true);
                txtC12.setVisible(true);
                txtC13.setVisible(true);
                txtC21.setVisible(true);
                txtC22.setVisible(true);
                txtC23.setVisible(true);
                txtC31.setVisible(false);
                txtC32.setVisible(false);
                txtC33.setVisible(false);
                pnlSumatoria.updateUI();
                break;
            }
            case ("3*1"): {
                txtC11.setVisible(true);
                txtC12.setVisible(true);
                txtC13.setVisible(true);
                txtC21.setVisible(false);
                txtC22.setVisible(false);
                txtC23.setVisible(false);
                txtC31.setVisible(false);
                txtC32.setVisible(false);
                txtC33.setVisible(false);
                pnlSumatoria.updateUI();
                break;
            }
            case ("3*2"): {
                txtC11.setVisible(true);
                txtC12.setVisible(true);
                txtC13.setVisible(true);
                txtC21.setVisible(true);
                txtC22.setVisible(true);
                txtC23.setVisible(true);
                txtC31.setVisible(false);
                txtC32.setVisible(false);
                txtC33.setVisible(false);
                pnlSumatoria.updateUI();
                break;
            }
            case ("3*3"): {
                txtC11.setVisible(true);
                txtC12.setVisible(true);
                txtC13.setVisible(true);
                txtC21.setVisible(true);
                txtC22.setVisible(true);
                txtC23.setVisible(true);
                txtC31.setVisible(true);
                txtC32.setVisible(true);
                txtC33.setVisible(true);
                pnlSumatoria.updateUI();
                break;
            }
        }
    }

    private boolean confirmarMulti() {
        //cbMatrizSum1.getSelectedItem().toString();
        //    String m2 = cbMatrizSum2.getSelectedItem().toString();
        String mm1 = cbMatrizM1.getSelectedItem().toString();
        String mm2 = cbMatrizM2.getSelectedItem().toString();

        //(sCadena.charAt(5))
        if (mm1.charAt(2) == mm2.charAt(0)) {
            System.out.println("paso");
            return true;

        } else {
            System.out.println("no paso");
            return false;
        }
    }
}
