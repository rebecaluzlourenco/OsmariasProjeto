
package Interface;

import Objetos.ObjUsuario;


public class Tela6Vagas extends javax.swing.JFrame {

    ObjUsuario usuario = new ObjUsuario();
    
    public Tela6Vagas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFeed = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtSelectAreaAtua = new javax.swing.JLabel();
        txtEntreContato = new javax.swing.JLabel();
        txtEntreContatop2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtVagasDisp = new javax.swing.JTextArea();
        cbAreaAtua = new javax.swing.JComboBox<>();
        btnInsVaga = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LOGUINHO.png"))); // NOI18N
        btnFeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedActionPerformed(evt);
            }
        });
        getContentPane().add(btnFeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 50, 40));

        btnBuscar.setBackground(new java.awt.Color(161, 211, 199));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 130, 40));

        txtSelectAreaAtua.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtSelectAreaAtua.setText("Selecione a área de atuação");
        getContentPane().add(txtSelectAreaAtua, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        txtEntreContato.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtEntreContato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEntreContato.setText("Entre em contato para garantir ");
        getContentPane().add(txtEntreContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 240, 30));

        txtEntreContatop2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        txtEntreContatop2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEntreContatop2.setText("sua participação no processo seletivo");
        getContentPane().add(txtEntreContatop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 280, -1));

        txtVagasDisp.setColumns(20);
        txtVagasDisp.setRows(5);
        jScrollPane1.setViewportView(txtVagasDisp);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 280, 200));

        cbAreaAtua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administração, negócios e serviços", "Artes e Design", "Ciências Biológicas e da Terra", "Análise e Desenvolvimento de Sistemas", "Ciências Sociais e Humanas", "Comunicação e Informação", "Engenharia e Produção", "Saúde e Bem-estar" }));
        getContentPane().add(cbAreaAtua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 280, -1));

        btnInsVaga.setBackground(new java.awt.Color(22, 53, 88));
        btnInsVaga.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnInsVaga.setForeground(new java.awt.Color(255, 255, 255));
        btnInsVaga.setText("Inserir Nova");
        btnInsVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsVagaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsVaga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELANOVO.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedActionPerformed
        dispose();
    }//GEN-LAST:event_btnFeedActionPerformed

    private void btnInsVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsVagaActionPerformed
        Tela7InserirVaga tela = new Tela7InserirVaga();
        tela.setVisible(true);
        tela.recebeUsuarioOn(usuario);
        dispose();
    }//GEN-LAST:event_btnInsVagaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela6Vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela6Vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela6Vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela6Vagas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela6Vagas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFeed;
    private javax.swing.JButton btnInsVaga;
    private javax.swing.JComboBox<String> cbAreaAtua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtEntreContato;
    private javax.swing.JLabel txtEntreContatop2;
    private javax.swing.JLabel txtSelectAreaAtua;
    private javax.swing.JTextArea txtVagasDisp;
    // End of variables declaration//GEN-END:variables

    public void recebeUsuarioOn(ObjUsuario usuAtual) {
        this.usuario = usuAtual;
    }
}
