package Interface;

import Conexoes.MySQL;
import javax.swing.JOptionPane;
import Objetos.ObjUsuario;

public class Tela3CadastroUsuario extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();
    ObjUsuario novoUsuario = new ObjUsuario();

    public Tela3CadastroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar_Cliente = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        checkTermos = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalvar_Cliente.setBackground(new java.awt.Color(164, 66, 105));
        btnSalvar_Cliente.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnSalvar_Cliente.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar_Cliente.setText("Cadastrar");
        btnSalvar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar_ClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 120, 30));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/voltar.png"))); // NOI18N
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 50, 40));

        txtNome.setBackground(new java.awt.Color(22, 53, 88));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(null);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 210, 40));

        txtUsuario.setBackground(new java.awt.Color(22, 53, 88));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 210, 40));

        txtSenha.setBackground(new java.awt.Color(22, 53, 88));
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 210, 40));

        txtEmail.setBackground(new java.awt.Color(22, 53, 88));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 210, 40));

        checkTermos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        checkTermos.setText("Concordo com o Termos de Uso.");
        checkTermos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTermosActionPerformed(evt);
            }
        });
        getContentPane().add(checkTermos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel6.setText("Nome");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel5.setText("Usuário");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel3.setText("Senha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELANOVO2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar_ClienteActionPerformed
       CadastraUsuario(novoUsuario);
    }//GEN-LAST:event_btnSalvar_ClienteActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Tela2Login tela = new Tela2Login();
        tela.setVisible(true);
        dispose();       
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void checkTermosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTermosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTermosActionPerformed

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
            java.util.logging.Logger.getLogger(Tela3CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela3CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela3CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela3CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela3CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar_Cliente;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox checkTermos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void CadastraUsuario(ObjUsuario novoUsuario) {

        if (txtNome.getText().equals("") || txtUsuario.getText().equals("")
                || txtSenha.getText().equals("") || txtEmail.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Todos os Campos sao Obrigatorios!!");
        } else {
            this.conectar.conectaBanco();

            novoUsuario.setUsuarioNome(txtNome.getText());
            novoUsuario.setUsuarioUserName(txtUsuario.getText());
            novoUsuario.setUsuarioSenha(txtSenha.getText());
            novoUsuario.setUsuarioCpf(txtEmail.getText());

            try {

                this.conectar.insertSQL("INSERT INTO usuarios ("
                        + "usuario_nome,"
                        + "usuario_username,"
                        + "usuario_senha,"
                        + "usuario_cpf"
                        + ") VALUES ("
                        + "'" + novoUsuario.getUsuarioNome() + "',"
                        + "'" + novoUsuario.getUsuarioUserName() + "',"
                        + "'" + novoUsuario.getUsuarioSenha() + "',"
                        + "'" + novoUsuario.getUsuarioCpf() + "'"
                        + ");");

            } catch (Exception e) {

                System.out.println("Erro ao cadastrar usuário " + e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário");

            } finally {
                this.conectar.fechaBanco();
                JOptionPane.showMessageDialog(null, "Obrigado por realizar seu cadastro!");
                Tela2Login tela = new Tela2Login();
                tela.setVisible(true);
                dispose();
            }
        }
    }
}
