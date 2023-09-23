package usuarios;

public class jfForms extends javax.swing.JFrame {

    private jfInicio login;
    private Becas beca;

    public jfForms(String user, jfInicio inicio) {
        initComponents();

        this.login = inicio;
        tfName.setText(user);
        beca = new Becas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cbMecatronica = new javax.swing.JCheckBox();
        btnRegistro = new javax.swing.JButton();
        cbSoftware = new javax.swing.JCheckBox();
        btnRegresar = new javax.swing.JButton();
        cbIndustrial = new javax.swing.JCheckBox();
        btnConsulta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbMensaje = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaComentarios = new javax.swing.JTextArea();
        rbInstitucional = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rbEstatal = new javax.swing.JRadioButton();
        tfName = new javax.swing.JTextField();
        rbFederal = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Usuario:");

        cbMecatronica.setText("Mecatronica");

        btnRegistro.setText("Registrar");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        cbSoftware.setText("Software");

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        cbIndustrial.setText("Industrial");

        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de beca");

        jLabel4.setText("Carrera");

        lbMensaje.setText("Escribe tus comentarios");

        txaComentarios.setColumns(20);
        txaComentarios.setRows(5);
        jScrollPane1.setViewportView(txaComentarios);

        rbInstitucional.setText("Institucional");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Formulario Becas");

        rbEstatal.setText("Estatal");

        rbFederal.setText("Federal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegistro)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(btnRegresar)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbInstitucional)
                                    .addComponent(rbEstatal))
                                .addGap(208, 208, 208)
                                .addComponent(cbMecatronica)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(128, 128, 128))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbMensaje)
                                .addGap(141, 141, 141))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rbFederal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbIndustrial)
                            .addComponent(cbSoftware))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFederal)
                    .addComponent(cbIndustrial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEstatal)
                    .addComponent(cbSoftware))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInstitucional)
                    .addComponent(cbMecatronica))
                .addGap(12, 12, 12)
                .addComponent(lbMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistro)
                    .addComponent(btnRegresar)
                    .addComponent(btnConsulta))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        if (rbFederal.isSelected()) {
            beca.setTipo(1);
        } else if (rbEstatal.isSelected()) {
            beca.setTipo(2);
        } else if (rbInstitucional.isSelected()) {
            beca.setTipo(3);
        } else {
            lbMensaje.setText("Ninguna beca selecionada.\n");
        }
        if (cbIndustrial.isSelected()) {
            beca.setCarrera1("Industrial");
        }
        if (cbSoftware.isSelected()) {
            beca.setCarrera2("Desarrollo de Software");
        }
        if (cbMecatronica.isSelected()) {
            beca.setCarrera2("Mecatronica");
        }
        if (!cbIndustrial.isSelected() && !cbSoftware.isSelected()
                && !cbMecatronica.isSelected()) {
            lbMensaje.setText(lbMensaje.getText()
                    + "Ninguna carrera selecionada.\n");
        }
        beca.setComentarios(txaComentarios.getText());
        lbMensaje.setText("Beca registrada.");
        limpiarCampos();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // TODO add your handling code here:
        //if (cbIndustrial.isSelected() || cbSoftware.isSelected() || cbMecatronica.isSelected() && rbFederal.isSelected() || rbEstatal.isSelected() || rbInstitucional.isSelected()) {
            jfConsultas consultar = new jfConsultas(beca, this);
            consultar.setVisible(true);
            this.setVisible(false);
        //}
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void limpiarCampos() {
        rbEstatal.setSelected(false);
        rbFederal.setSelected(false);
        rbInstitucional.setSelected(false);

        cbIndustrial.setSelected(false);
        cbSoftware.setSelected(false);
        cbMecatronica.setSelected(false);

        txaComentarios.setText("");
        tfName.requestFocus();
    }

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
            java.util.logging.Logger.getLogger(jfForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfForms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new jfForms().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox cbIndustrial;
    private javax.swing.JCheckBox cbMecatronica;
    private javax.swing.JCheckBox cbSoftware;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JRadioButton rbEstatal;
    private javax.swing.JRadioButton rbFederal;
    private javax.swing.JRadioButton rbInstitucional;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextArea txaComentarios;
    // End of variables declaration//GEN-END:variables
}
