package main;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.xml.bind.DatatypeConverter;

public class MenuPrincipal extends javax.swing.JFrame {

    JTextField matrizSuma1[][], matrizSuma2[][], matrizMulti1[][], matrizMulti2[][];

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null); // centra el formulario
        setTitle("Calculadora");
        matriz1();

    }

    public void matriz1() {

        //scrMatriz1Suma.setLayout(null);
        int fila, columna;

        chMatrizC1.addItem("");
        chMatrizF1.addItem("");
        for (int i = 0; i < 6; i++) {

            chMatrizC1.addItem("" + (i + 1));
            chMatrizF1.addItem("" + (i + 1));

        }
        chMatrizC1.setBounds(70, 255, 35, 20);
        chMatrizF1.setBounds(145, 255, 35, 20);

        //seguir aca con la accion prro
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formSuma = new javax.swing.JFrame();
        pnlAdicion = new javax.swing.JPanel();
        scrMatriz1Suma = new javax.swing.JScrollPane();
        jLabel3 = new javax.swing.JLabel();
        scrMatriz2Suma = new javax.swing.JScrollPane();
        jLabel7 = new javax.swing.JLabel();
        scrMatriz3Suma = new javax.swing.JScrollPane();
        btnSumar = new javax.swing.JButton();
        btnResta = new javax.swing.JButton();
        chMatrizF1 = new java.awt.Choice();
        chMatrizC1 = new java.awt.Choice();
        chMatrizF2 = new java.awt.Choice();
        chMatrizC2 = new java.awt.Choice();
        formMultiplicacion = new javax.swing.JFrame();
        pnlMultiplica = new javax.swing.JPanel();
        scrMatriz1Multi = new javax.swing.JScrollPane();
        scrMatriz2multi = new javax.swing.JScrollPane();
        jButton2 = new javax.swing.JButton();
        cbMatriz1multi = new javax.swing.JComboBox<>();
        cbMatriz2Multi = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        scrMatriz3Multi = new javax.swing.JScrollPane();
        jLabel10 = new javax.swing.JLabel();
        formDeterminante = new javax.swing.JFrame();
        pnlDeterminante = new javax.swing.JPanel();
        pnlMenuPrincipal = new javax.swing.JPanel();
        btnSuma = new javax.swing.JButton();
        btnMultiplica = new javax.swing.JButton();
        btnDetermina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        formSuma.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formSumaWindowClosing(evt);
            }
        });

        pnlAdicion.setBorder(javax.swing.BorderFactory.createTitledBorder("Suma o Resta"));

        jLabel3.setText("Matriz 1");

        jLabel7.setText("Matriz 2");

        btnSumar.setText("+");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnResta.setText("-");

        javax.swing.GroupLayout pnlAdicionLayout = new javax.swing.GroupLayout(pnlAdicion);
        pnlAdicion.setLayout(pnlAdicionLayout);
        pnlAdicionLayout.setHorizontalGroup(
            pnlAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionLayout.createSequentialGroup()
                .addGroup(pnlAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAdicionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAdicionLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(23, 23, 23)
                                .addComponent(chMatrizF1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chMatrizC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(scrMatriz1Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrMatriz2Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAdicionLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(chMatrizF2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chMatrizC2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlAdicionLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(scrMatriz3Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlAdicionLayout.setVerticalGroup(
            pnlAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdicionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdicionLayout.createSequentialGroup()
                        .addGroup(pnlAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chMatrizF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(chMatrizC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrMatriz1Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAdicionLayout.createSequentialGroup()
                        .addGroup(pnlAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(chMatrizF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chMatrizC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlAdicionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAdicionLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btnSumar)
                                .addGap(35, 35, 35)
                                .addComponent(btnResta))
                            .addGroup(pnlAdicionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrMatriz2Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24)
                .addComponent(scrMatriz3Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout formSumaLayout = new javax.swing.GroupLayout(formSuma.getContentPane());
        formSuma.getContentPane().setLayout(formSumaLayout);
        formSumaLayout.setHorizontalGroup(
            formSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        formSumaLayout.setVerticalGroup(
            formSumaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formSumaLayout.createSequentialGroup()
                .addComponent(pnlAdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        formMultiplicacion.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formMultiplicacionWindowClosing(evt);
            }
        });

        pnlMultiplica.setBorder(javax.swing.BorderFactory.createTitledBorder("Multiplicación"));

        jButton2.setText("X");

        cbMatriz1multi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbMatriz2Multi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Matriz 1");

        jLabel9.setText("Matriz 2");

        jLabel10.setText("Resultado");

        javax.swing.GroupLayout pnlMultiplicaLayout = new javax.swing.GroupLayout(pnlMultiplica);
        pnlMultiplica.setLayout(pnlMultiplicaLayout);
        pnlMultiplicaLayout.setHorizontalGroup(
            pnlMultiplicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMultiplicaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlMultiplicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMultiplicaLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbMatriz1multi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(scrMatriz1Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(9, 9, 9)
                .addGroup(pnlMultiplicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrMatriz2multi, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMultiplicaLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMatriz2Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMultiplicaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addComponent(scrMatriz3Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMultiplicaLayout.setVerticalGroup(
            pnlMultiplicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMultiplicaLayout.createSequentialGroup()
                .addGroup(pnlMultiplicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMultiplicaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlMultiplicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMultiplicaLayout.createSequentialGroup()
                                .addGroup(pnlMultiplicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbMatriz2Multi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrMatriz2multi, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMultiplicaLayout.createSequentialGroup()
                                .addGroup(pnlMultiplicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbMatriz1multi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrMatriz1Multi, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlMultiplicaLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton2)))
                .addGroup(pnlMultiplicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMultiplicaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrMatriz3Multi)
                        .addContainerGap())
                    .addGroup(pnlMultiplicaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)
                        .addContainerGap(156, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout formMultiplicacionLayout = new javax.swing.GroupLayout(formMultiplicacion.getContentPane());
        formMultiplicacion.getContentPane().setLayout(formMultiplicacionLayout);
        formMultiplicacionLayout.setHorizontalGroup(
            formMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
            .addGroup(formMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formMultiplicacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlMultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        formMultiplicacionLayout.setVerticalGroup(
            formMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
            .addGroup(formMultiplicacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formMultiplicacionLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlMultiplica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        formDeterminante.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formDeterminanteWindowClosing(evt);
            }
        });

        pnlDeterminante.setBorder(javax.swing.BorderFactory.createTitledBorder("Determinante"));

        javax.swing.GroupLayout pnlDeterminanteLayout = new javax.swing.GroupLayout(pnlDeterminante);
        pnlDeterminante.setLayout(pnlDeterminanteLayout);
        pnlDeterminanteLayout.setHorizontalGroup(
            pnlDeterminanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        pnlDeterminanteLayout.setVerticalGroup(
            pnlDeterminanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout formDeterminanteLayout = new javax.swing.GroupLayout(formDeterminante.getContentPane());
        formDeterminante.getContentPane().setLayout(formDeterminanteLayout);
        formDeterminanteLayout.setHorizontalGroup(
            formDeterminanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(formDeterminanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formDeterminanteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlDeterminante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        formDeterminanteLayout.setVerticalGroup(
            formDeterminanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(formDeterminanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(formDeterminanteLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlDeterminante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenuPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú principal"));

        btnSuma.setText("Suma o Resta");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });

        btnMultiplica.setText("Multiplicación");
        btnMultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicaActionPerformed(evt);
            }
        });

        btnDetermina.setText("Determinante");
        btnDetermina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeterminaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculadora de matrices");

        jLabel2.setText("Sumar o Restar matrices de igual orden");

        jLabel4.setText("Multiplicación de matrices ");

        jLabel5.setText("Cálculo de la determinante");

        javax.swing.GroupLayout pnlMenuPrincipalLayout = new javax.swing.GroupLayout(pnlMenuPrincipal);
        pnlMenuPrincipal.setLayout(pnlMenuPrincipalLayout);
        pnlMenuPrincipalLayout.setHorizontalGroup(
            pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMultiplica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDetermina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlMenuPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMenuPrincipalLayout.setVerticalGroup(
            pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addGroup(pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSuma)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplica)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetermina)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        formSuma.setBounds(0, 0, 650, 530);
        formSuma.setLocationRelativeTo(null);
        formSuma.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnDeterminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeterminaActionPerformed
        formDeterminante.setBounds(0, 0, 650, 530);
        formDeterminante.setLocationRelativeTo(null);
        formDeterminante.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnDeterminaActionPerformed

    private void formDeterminanteWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formDeterminanteWindowClosing
        salir();
    }//GEN-LAST:event_formDeterminanteWindowClosing

    private void formSumaWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formSumaWindowClosing
        salir();
    }//GEN-LAST:event_formSumaWindowClosing

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicaActionPerformed
        formMultiplicacion.setBounds(0, 0, 650, 530);
        formMultiplicacion.setLocationRelativeTo(null);
        formMultiplicacion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMultiplicaActionPerformed

    private void formMultiplicacionWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formMultiplicacionWindowClosing
        salir();
    }//GEN-LAST:event_formMultiplicacionWindowClosing

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetermina;
    private javax.swing.JButton btnMultiplica;
    private javax.swing.JButton btnResta;
    private javax.swing.JButton btnSuma;
    private javax.swing.JButton btnSumar;
    private javax.swing.JComboBox<String> cbMatriz1multi;
    private javax.swing.JComboBox<String> cbMatriz2Multi;
    private java.awt.Choice chMatrizC1;
    private java.awt.Choice chMatrizC2;
    private java.awt.Choice chMatrizF1;
    private java.awt.Choice chMatrizF2;
    private javax.swing.JFrame formDeterminante;
    private javax.swing.JFrame formMultiplicacion;
    private javax.swing.JFrame formSuma;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnlAdicion;
    private javax.swing.JPanel pnlDeterminante;
    private javax.swing.JPanel pnlMenuPrincipal;
    private javax.swing.JPanel pnlMultiplica;
    private javax.swing.JScrollPane scrMatriz1Multi;
    private javax.swing.JScrollPane scrMatriz1Suma;
    private javax.swing.JScrollPane scrMatriz2Suma;
    private javax.swing.JScrollPane scrMatriz2multi;
    private javax.swing.JScrollPane scrMatriz3Multi;
    private javax.swing.JScrollPane scrMatriz3Suma;
    // End of variables declaration//GEN-END:variables

    public void salir() {
        if (JOptionPane.showConfirmDialog(this, "volver a menu principal", "mensaje", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            volverMenuPrincipal();
        }
    }

    public void volverMenuPrincipal() {
        MenuPrincipal mp = new MenuPrincipal();

        mp.setLocationRelativeTo(null);
        mp.setVisible(true);
        this.setVisible(false);

    }

    private void generarMatriz1(int fila, int columna) {
        int x = 50, y = 5;

        matrizSuma1 = new JTextField[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrizSuma1[i][j] = new JTextField("");
                matrizSuma1[i][j].setBounds(x, y, 50, 30);
                matrizSuma1[i][j].setHorizontalAlignment(JTextField.RIGHT);

                x += 45;
            }
            x = 50;
            y += 35;
        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                scrMatriz1Suma.add(matrizSuma1[i][j]);
                matrizSuma1[i][j].setVisible(false);
            }

        }
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrizSuma1[i][j].setVisible(true);
            }
        }
        formSuma.pack();

    }

    public class EjecutarChoice implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            int fila, columna;

            if (e.getSource() == chMatrizF1) {
                //validacion de espacios vacios
                if (chMatrizC1.getSelectedIndex() != 0 && chMatrizF1.getSelectedIndex() != 0) {
                    fila = Integer.parseInt(chMatrizC1.getSelectedItem());
                    columna = Integer.parseInt(chMatrizF1.getSelectedItem());
                    if (matrizSuma1 != null) {
                        for (int i = 0; i < matrizSuma1.length; i++) {
                            for (int j = 0; j < matrizSuma1[0].length; j++) {
                                matrizSuma1[i][j].setVisible(false);
                            }
                        }
                        matrizSuma1 = null;
                        generarMatriz1(fila, columna);
                    } else {
                        generarMatriz1(fila, columna);

                    }//else if(e.getSource() == ){
                       //     }
                }
            }

        }
    }
}
