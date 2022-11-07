
package Interface;

public class Tela4CadastroPerfil extends javax.swing.JFrame {

      public Tela4CadastroPerfil() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        btnFoto = new javax.swing.JButton();
        nomePerfil = new javax.swing.JTextField();
        dataNasc = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtInt1 = new javax.swing.JTextField();
        txtInt2 = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();
        btnSalvarPerfil = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSobreMim = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFoto.setBackground(new java.awt.Color(161, 211, 199));
        btnFoto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnFoto.setText("Carregar Foto");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, -1));
        getContentPane().add(nomePerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 160, -1));
        getContentPane().add(dataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 140, -1));

        jLabel2.setText("Data de Nascimento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel3.setText("Sobre mim");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel4.setText("Interesses");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));
        getContentPane().add(txtInt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 140, -1));
        getContentPane().add(txtInt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 140, -1));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGUINHO.png"))); // NOI18N
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 40));

        btnSalvarPerfil.setBackground(new java.awt.Color(161, 66, 105));
        btnSalvarPerfil.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnSalvarPerfil.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarPerfil.setText("Salvar");
        btnSalvarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, -1, -1));

        jLabel5.setText("Status no Mercado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        txtSobreMim.setColumns(20);
        txtSobreMim.setRows(5);
        jScrollPane1.setViewportView(txtSobreMim);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 300, 70));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A disposição", "Trabalhando", "Estagiando", "Se profissionalizando", "Desempregada", "Buscando conhecimento" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 300, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELACADASTROPERFIL.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Tela4Menu_1 tela = new Tela4Menu_1();
        tela.setVisible(true);
        dispose();
    
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnSalvarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPerfilActionPerformed
      CadastraPerfil(novoPerfil);
    }//GEN-LAST:event_btnSalvarPerfilActionPerformed
    
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
            java.util.logging.Logger.getLogger(Tela4CadastroPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela4CadastroPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela4CadastroPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela4CadastroPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela4CadastroPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSalvarPerfil;
    private com.toedter.calendar.JDateChooser dataNasc;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomePerfil;
    private javax.swing.JTextField txtInt1;
    private javax.swing.JTextField txtInt2;
    private javax.swing.JTextArea txtSobreMim;
    // End of variables declaration//GEN-END:variables
}
