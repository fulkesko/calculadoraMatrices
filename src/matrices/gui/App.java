package matrices.gui;

import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Calculadora");
        dejarOcultas();
        agregar_datos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sumatoria = new javax.swing.JFrame();
        pnlSumatoria = new javax.swing.JPanel();
        txtB11 = new javax.swing.JTextField();
        txtB12 = new javax.swing.JTextField();
        txtB13 = new javax.swing.JTextField();
        txtB21 = new javax.swing.JTextField();
        txtB22 = new javax.swing.JTextField();
        txtB23 = new javax.swing.JTextField();
        txtB31 = new javax.swing.JTextField();
        txtB32 = new javax.swing.JTextField();
        txtB33 = new javax.swing.JTextField();
        cbMatrizSum1 = new javax.swing.JComboBox<>();
        cbMatrizSum2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtC11 = new javax.swing.JTextField();
        txtC12 = new javax.swing.JTextField();
        txtC13 = new javax.swing.JTextField();
        txtC23 = new javax.swing.JTextField();
        txtC22 = new javax.swing.JTextField();
        txtC21 = new javax.swing.JTextField();
        txtC31 = new javax.swing.JTextField();
        txtC32 = new javax.swing.JTextField();
        txtC33 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        txtA33 = new javax.swing.JTextField();
        txtA13 = new javax.swing.JTextField();
        txtA23 = new javax.swing.JTextField();
        txtA31 = new javax.swing.JTextField();
        txtA22 = new javax.swing.JTextField();
        txtA12 = new javax.swing.JTextField();
        txtA32 = new javax.swing.JTextField();
        txtA11 = new javax.swing.JTextField();
        txtA21 = new javax.swing.JTextField();
        Multi = new javax.swing.JFrame();
        pnlMultiplicacion = new javax.swing.JPanel();
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

        txtB11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB11.setText("0");

        txtB12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB12.setText("0");

        txtB13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB13.setText("0");

        txtB21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB21.setText("0");

        txtB22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB22.setText("0");

        txtB23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB23.setText("0");

        txtB31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB31.setText("0");

        txtB32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB32.setText("0");

        txtB33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB33.setText("0");

        cbMatrizSum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMatrizSum1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Matriz 2:");

        jLabel3.setText("Matriz 1: ");

        txtC11.setEditable(false);
        txtC11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtC12.setEditable(false);
        txtC12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtC13.setEditable(false);
        txtC13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtC23.setEditable(false);
        txtC23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtC22.setEditable(false);
        txtC22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtC21.setEditable(false);
        txtC21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtC31.setEditable(false);
        txtC31.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtC32.setEditable(false);
        txtC32.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtC33.setEditable(false);
        txtC33.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Matriz Resultante: ");

        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        txtA33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA33.setText("9");

        txtA13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA13.setText("0");

        txtA23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA23.setText("0");

        txtA31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA31.setText("0");

        txtA22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA22.setText("0");

        txtA12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA12.setText("0");

        txtA32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA32.setText("0");

        txtA11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA11.setText("0");

        txtA21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA21.setText("0");

        jLayeredPane2.setLayer(txtA33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtA13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtA23, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtA31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtA22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtA12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtA32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtA11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtA21, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(txtA31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtA32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtA33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addComponent(txtA11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtA12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtA13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane2Layout.createSequentialGroup()
                            .addComponent(txtA21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtA22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtA23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlSumatoriaLayout = new javax.swing.GroupLayout(pnlSumatoria);
        pnlSumatoria.setLayout(pnlSumatoriaLayout);
        pnlSumatoriaLayout.setHorizontalGroup(
            pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                        .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3)
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSumatoriaLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMatrizSum1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                .addComponent(txtB31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtB32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtB33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                .addComponent(txtB21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtB22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtB23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                .addComponent(txtB11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbMatrizSum2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                        .addComponent(txtB12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtB13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                .addComponent(txtC11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                .addComponent(txtC31, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC32, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                .addComponent(txtC21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtC23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlSumatoriaLayout.setVerticalGroup(
            pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                        .addComponent(btnSumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRestar)
                        .addGap(39, 39, 39))
                    .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                        .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                .addComponent(cbMatrizSum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtB11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtB12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtB13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtB21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtB22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtB23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtB31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtB32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtB33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                .addComponent(cbMatrizSum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtC33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout SumatoriaLayout = new javax.swing.GroupLayout(Sumatoria.getContentPane());
        Sumatoria.getContentPane().setLayout(SumatoriaLayout);
        SumatoriaLayout.setHorizontalGroup(
            SumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SumatoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSumatoria, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SumatoriaLayout.setVerticalGroup(
            SumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSumatoria, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Multi.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                MultiWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout pnlMultiplicacionLayout = new javax.swing.GroupLayout(pnlMultiplicacion);
        pnlMultiplicacion.setLayout(pnlMultiplicacionLayout);
        pnlMultiplicacionLayout.setHorizontalGroup(
            pnlMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlMultiplicacionLayout.setVerticalGroup(
            pnlMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MultiLayout = new javax.swing.GroupLayout(Multi.getContentPane());
        Multi.getContentPane().setLayout(MultiLayout);
        MultiLayout.setHorizontalGroup(
            MultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MultiLayout.setVerticalGroup(
            MultiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setName("menuPrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 300));

        menuPrincipal.setMaximumSize(new java.awt.Dimension(500, 500));
        menuPrincipal.setPreferredSize(new java.awt.Dimension(435, 400));

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

        btnDeterminante.setText("Determinante");

        javax.swing.GroupLayout menuPrincipalLayout = new javax.swing.GroupLayout(menuPrincipal);
        menuPrincipal.setLayout(menuPrincipalLayout);
        menuPrincipalLayout.setHorizontalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeterminante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMultiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSumatorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(menuPrincipalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        menuPrincipalLayout.setVerticalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSumatorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMultiplicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeterminante)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumatoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumatoriasActionPerformed
        //Sumatoria.setBounds(0, 0, 450, 450);
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

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
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
    }//GEN-LAST:event_btnSumarActionPerformed

    private void cbMatrizSum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMatrizSum1ActionPerformed
        // lblMuestra.setText(cbPrueba.getSelectedItem().toString());
        String opc = cbMatrizSum1.getSelectedItem().toString();
        dejarvisible(opc);
        
    }//GEN-LAST:event_cbMatrizSum1ActionPerformed

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
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnSumatorias;
    private javax.swing.JComboBox<String> cbMatrizSum1;
    private javax.swing.JComboBox<String> cbMatrizSum2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane2;
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
        System.out.println("mmm");

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

    public void dejarvisible(String opc) {
       switch (opc) {
          case ("1*1"):
          txtA11.setVisible(true);
          pnlSumatoria.updateUI();
          case ("1*2"):
          txtA11.setVisible(true);
          txtA12.setVisible(true);
          
          /*if(opc == "1*1"){
              txtA11.setVisible(true);
              System.out.println("aqui pasa");
              pnlSumatoria.updateUI();
              */
          }
                
        }
/*    public void dejarVistas() {
        txtA11.setVisible(true);
        txtA12.setVisible(false);
        txtA13.setVisible(true);
        txtA21.setVisible(false);
        txtA22.setVisible(true);
        txtA23.setVisible(false);
        txtA31.setVisible(true);
        txtA32.setVisible(false);
        txtA33.setVisible(true);
     }
 */
    }

