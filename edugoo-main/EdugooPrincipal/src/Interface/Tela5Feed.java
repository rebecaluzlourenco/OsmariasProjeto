
package Interface;

import Objetos.ObjUsuario;

public class Tela5Feed extends javax.swing.JFrame {

    ObjUsuario usuario = new ObjUsuario();
    
    public Tela5Feed() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btnMeuPerfil = new javax.swing.JButton();
        btnBuscarVagas = new javax.swing.JButton();
        btnContato = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMeuPerfil.setText("Meu Perfil");
        btnMeuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeuPerfilActionPerformed(evt);
            }
        });
        getContentPane().add(btnMeuPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        btnBuscarVagas.setText("Buscar Vagas");
        btnBuscarVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVagasActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarVagas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        btnContato.setText("Contato");
        btnContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContatoActionPerformed(evt);
            }
        });
        getContentPane().add(btnContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELAPRINCIPAL.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMeuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeuPerfilActionPerformed
        Tela4CadastroPerfil telaMeuPerfil = new Tela4CadastroPerfil();
        telaMeuPerfil.recebeUsuarioOn(usuario);
        telaMeuPerfil.setVisible(true);
    }//GEN-LAST:event_btnMeuPerfilActionPerformed

    private void btnBuscarVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVagasActionPerformed
        Tela6Vagas telaVagas = new Tela6Vagas();
        telaVagas.setVisible(true);
        telaVagas.recebeUsuarioOn(usuario);
    }//GEN-LAST:event_btnBuscarVagasActionPerformed

    private void btnContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContatoActionPerformed
        Tela9Contato telaContato = new Tela9Contato();
        telaContato.setVisible(true);
        telaContato.recebeUsuarioOn(usuario);
    }//GEN-LAST:event_btnContatoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela5Feed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela5Feed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela5Feed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela5Feed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela5Feed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVagas;
    private javax.swing.JButton btnContato;
    private javax.swing.JButton btnMeuPerfil;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables


    public void recebeUsuarioOn(ObjUsuario usuAtual){
        this.usuario = usuAtual;
    }
}
