package matrices.gui;

import javafx.scene.control.ButtonType;
import javax.swing.JOptionPane;

public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Calculadora");
        dejarOcultas();
        agregar_datos();
        pnlSumatoria.updateUI();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Sumatoria = new javax.swing.JFrame();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnlSumatoria = new javax.swing.JPanel();
        cbMatrizSum2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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

        jLabel2.setText("Matriz 2:");

        jLabel3.setText("Matriz 1: ");

        jLabel4.setText("Matriz Resultante: ");

        jLayeredPane2.setLayout(new java.awt.GridBagLayout());

        txtA11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA11.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jLayeredPane2.add(txtA11, gridBagConstraints);

        txtA12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA12.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        jLayeredPane2.add(txtA12, gridBagConstraints);

        txtA13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA13.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 10);
        jLayeredPane2.add(txtA13, gridBagConstraints);

        txtA21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA21.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jLayeredPane2.add(txtA21, gridBagConstraints);

        txtA22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA22.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jLayeredPane2.add(txtA22, gridBagConstraints);

        txtA23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA23.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 10);
        jLayeredPane2.add(txtA23, gridBagConstraints);

        txtA31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA31.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 11, 0);
        jLayeredPane2.add(txtA31, gridBagConstraints);

        txtA32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA32.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 11, 0);
        jLayeredPane2.add(txtA32, gridBagConstraints);

        txtA33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtA33.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 11, 10);
        jLayeredPane2.add(txtA33, gridBagConstraints);

        jLayeredPane3.setLayout(new java.awt.GridBagLayout());

        txtB11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB11.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jLayeredPane3.add(txtB11, gridBagConstraints);

        txtB12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB12.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        jLayeredPane3.add(txtB12, gridBagConstraints);

        txtB13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB13.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 10);
        jLayeredPane3.add(txtB13, gridBagConstraints);

        txtB21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB21.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jLayeredPane3.add(txtB21, gridBagConstraints);

        txtB22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB22.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jLayeredPane3.add(txtB22, gridBagConstraints);

        txtB23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB23.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 10);
        jLayeredPane3.add(txtB23, gridBagConstraints);

        txtB31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB31.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 11, 0);
        jLayeredPane3.add(txtB31, gridBagConstraints);

        txtB32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB32.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 11, 0);
        jLayeredPane3.add(txtB32, gridBagConstraints);

        txtB33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtB33.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 11, 10);
        jLayeredPane3.add(txtB33, gridBagConstraints);

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

        jLayeredPane5.setLayout(new java.awt.GridBagLayout());

        txtC11.setEditable(false);
        txtC11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jLayeredPane5.add(txtC11, gridBagConstraints);

        txtC12.setEditable(false);
        txtC12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        jLayeredPane5.add(txtC12, gridBagConstraints);

        txtC13.setEditable(false);
        txtC13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 10);
        jLayeredPane5.add(txtC13, gridBagConstraints);

        txtC21.setEditable(false);
        txtC21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        jLayeredPane5.add(txtC21, gridBagConstraints);

        txtC22.setEditable(false);
        txtC22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jLayeredPane5.add(txtC22, gridBagConstraints);

        txtC23.setEditable(false);
        txtC23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 10);
        jLayeredPane5.add(txtC23, gridBagConstraints);

        txtC31.setEditable(false);
        txtC31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 11, 0);
        jLayeredPane5.add(txtC31, gridBagConstraints);

        txtC32.setEditable(false);
        txtC32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 11, 0);
        jLayeredPane5.add(txtC32, gridBagConstraints);

        txtC33.setEditable(false);
        txtC33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 11, 10);
        jLayeredPane5.add(txtC33, gridBagConstraints);

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
                .addContainerGap()
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                        .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                                .addComponent(cbMatrizSum1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSumatoriaLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbMatrizSum2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSumatoriaLayout.setVerticalGroup(
            pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbMatrizSum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbMatrizSum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlSumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSumatoriaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)))
                .addGap(49, 49, 49))
        );

        jLayeredPane1.setLayer(pnlSumatoria, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(pnlSumatoria, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlSumatoria, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout SumatoriaLayout = new javax.swing.GroupLayout(Sumatoria.getContentPane());
        Sumatoria.getContentPane().setLayout(SumatoriaLayout);
        SumatoriaLayout.setHorizontalGroup(
            SumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SumatoriaLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        SumatoriaLayout.setVerticalGroup(
            SumatoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SumatoriaLayout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(61, Short.MAX_VALUE))
        );
        menuPrincipalLayout.setVerticalGroup(
            menuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
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
        
        if (m1 == m2){
                
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
        }else{//JOptionPane.showConfirmDialog(this, "volver a menu principal", "mensaje", JOptionPane.YES_NO_OPTION
            JOptionPane.showMessageDialog(this,"solo las matrices de mismo orden se pueden sumar o restar","alerta", JOptionPane.YES_OPTION);
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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
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

    public void dejarvisibleM1(String opc) {

        if ("1*1".equals(opc)) {
            txtA11.setVisible(true);
            txtA12.setVisible(false);
            txtA13.setVisible(false);
            txtA21.setVisible(false);
            txtA22.setVisible(false);
            txtA23.setVisible(false);
            txtA31.setVisible(false);
            txtA32.setVisible(false);
            txtA33.setVisible(false);

            pnlSumatoria.updateUI();
        }
        if (opc == "1*2") {
            txtA11.setVisible(true);
            txtA12.setVisible(true);
            txtA13.setVisible(false);
            txtA21.setVisible(false);
            txtA22.setVisible(false);
            txtA23.setVisible(false);
            txtA31.setVisible(false);
            txtA32.setVisible(false);
            txtA33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "1*3") {
            txtA11.setVisible(true);
            txtA12.setVisible(true);
            txtA13.setVisible(true);
            txtA21.setVisible(false);
            txtA22.setVisible(false);
            txtA23.setVisible(false);
            txtA31.setVisible(false);
            txtA32.setVisible(false);
            txtA33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "2*1") {
            txtA11.setVisible(true);
            txtA12.setVisible(false);
            txtA13.setVisible(false);
            txtA21.setVisible(true);
            txtA22.setVisible(false);
            txtA23.setVisible(false);
            txtA31.setVisible(false);
            txtA32.setVisible(false);
            txtA33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "2*2") {
            txtA11.setVisible(true);
            txtA12.setVisible(true);
            txtA13.setVisible(false);
            txtA21.setVisible(true);
            txtA22.setVisible(true);
            txtA23.setVisible(false);
            txtA31.setVisible(false);
            txtA32.setVisible(false);
            txtA33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "2*3") {
            txtA11.setVisible(true);
            txtA12.setVisible(true);
            txtA13.setVisible(true);
            txtA21.setVisible(true);
            txtA22.setVisible(true);
            txtA23.setVisible(true);
            txtA31.setVisible(false);
            txtA32.setVisible(false);
            txtA33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "3*1") {
            txtA11.setVisible(true);
            txtA12.setVisible(true);
            txtA13.setVisible(true);
            txtA21.setVisible(false);
            txtA22.setVisible(false);
            txtA23.setVisible(false);
            txtA31.setVisible(false);
            txtA32.setVisible(false);
            txtA33.setVisible(false);
            pnlSumatoria.updateUI();

        }if (opc == "3*2") {
            txtA11.setVisible(true);
            txtA12.setVisible(true);
            txtA13.setVisible(true);
            txtA21.setVisible(true);
            txtA22.setVisible(true);
            txtA23.setVisible(true);
            txtA31.setVisible(false);
            txtA32.setVisible(false);
            txtA33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "3*3") {
            txtA11.setVisible(true);
            txtA12.setVisible(true);
            txtA13.setVisible(true);
            txtA21.setVisible(true);
            txtA22.setVisible(true);
            txtA23.setVisible(true);
            txtA31.setVisible(true);
            txtA32.setVisible(true);
            txtA33.setVisible(true);
            pnlSumatoria.updateUI();
        }
    }
    public void dejarvisibleM2(String opc) {

        if ("1*1".equals(opc)) {
            txtB11.setVisible(true);
            txtB12.setVisible(false);
            txtB13.setVisible(false);
            txtB21.setVisible(false);
            txtB22.setVisible(false);
            txtB23.setVisible(false);
            txtB31.setVisible(false);
            txtB32.setVisible(false);
            txtB33.setVisible(false);

            pnlSumatoria.updateUI();
        }
        if (opc == "1*2") {
            txtB11.setVisible(true);
            txtB12.setVisible(true);
            txtB13.setVisible(false);
            txtB21.setVisible(false);
            txtB22.setVisible(false);
            txtB23.setVisible(false);
            txtB31.setVisible(false);
            txtB32.setVisible(false);
            txtB33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "1*3") {
            txtB11.setVisible(true);
            txtB12.setVisible(true);
            txtB13.setVisible(true);
            txtB21.setVisible(false);
            txtB22.setVisible(false);
            txtB23.setVisible(false);
            txtB31.setVisible(false);
            txtB32.setVisible(false);
            txtB33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "2*1") {
            txtB11.setVisible(true);
            txtB12.setVisible(false);
            txtB13.setVisible(false);
            txtB21.setVisible(true);
            txtB22.setVisible(false);
            txtB23.setVisible(false);
            txtB31.setVisible(false);
            txtB32.setVisible(false);
            txtB33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "2*2") {
            txtB11.setVisible(true);
            txtB12.setVisible(true);
            txtB13.setVisible(false);
            txtB21.setVisible(true);
            txtB22.setVisible(true);
            txtB23.setVisible(false);
            txtB31.setVisible(false);
            txtB32.setVisible(false);
            txtB33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "2*3") {
            txtB11.setVisible(true);
            txtB12.setVisible(true);
            txtB13.setVisible(true);
            txtB21.setVisible(true);
            txtB22.setVisible(true);
            txtB23.setVisible(true);
            txtB31.setVisible(false);
            txtB32.setVisible(false);
            txtB33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "3*1") {
            txtB11.setVisible(true);
            txtB12.setVisible(true);
            txtB13.setVisible(true);
            txtB21.setVisible(false);
            txtB22.setVisible(false);
            txtB23.setVisible(false);
            txtB31.setVisible(false);
            txtB32.setVisible(false);
            txtB33.setVisible(false);
            pnlSumatoria.updateUI();

        }if (opc == "3*2") {
            txtB11.setVisible(true);
            txtB12.setVisible(true);
            txtB13.setVisible(true);
            txtB21.setVisible(true);
            txtB22.setVisible(true);
            txtB23.setVisible(true);
            txtB31.setVisible(false);
            txtB32.setVisible(false);
            txtB33.setVisible(false);
            pnlSumatoria.updateUI();
        }
        if (opc == "3*3") {
            txtB11.setVisible(true);
            txtB12.setVisible(true);
            txtB13.setVisible(true);
            txtB21.setVisible(true);
            txtB22.setVisible(true);
            txtB23.setVisible(true);
            txtB31.setVisible(true);
            txtB32.setVisible(true);
            txtB33.setVisible(true);
            pnlSumatoria.updateUI();
        }
    }

    private void visible_respuesta(String opc) {
            if ("1*1".equals(opc)) {
            txtC11.setVisible(true);
            txtC12.setVisible(false);
            txtC13.setVisible(false);
            txtC21.setVisible(false);
            txtC22.setVisible(false);
            txtC23.setVisible(false);
            txtC31.setVisible(false);
            txtC32.setVisible(false);
            txtC33.setVisible(false);

            pnlSumatoria.updateUI();
        }
        if (opc == "1*2") {
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
        }
        if (opc == "1*3") {
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
        }
        if (opc == "2*1") {
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
        }
        if (opc == "2*2") {
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
        }
        if (opc == "2*3") {
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
        }
        if (opc == "3*1") {
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

        }if (opc == "3*2") {
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
        }
        if (opc == "3*3") {
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
        }
    }
}
