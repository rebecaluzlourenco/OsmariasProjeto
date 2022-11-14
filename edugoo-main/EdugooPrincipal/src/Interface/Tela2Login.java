package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;
import Conexoes.MySQL;
import Objetos.ObjUsuario;
import java.awt.Font;
import java.sql.Connection;

public class Tela2Login extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL();
    ObjUsuario objUsuario = new ObjUsuario();
    
    String CpfAtivo = "";

    private Connection conn;
 
    public Tela2Login() {
        initComponents();
        jLabel1.setFocusable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoUsuario = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        campoSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoUsuario.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        campoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        campoUsuario.setText("Usuário");
        getContentPane().add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 200, -1));

        btnNovo.setBackground(new java.awt.Color(22, 53, 88));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Cadastrar");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 120, -1));

        btnLogin.setBackground(new java.awt.Color(161, 211, 199));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(22, 53, 88));
        btnLogin.setText("ENTRAR");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 120, -1));

        campoSenha.setForeground(new java.awt.Color(204, 204, 204));
        campoSenha.setText("jPasswordField1");
        getContentPane().add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/TELALOGIN2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
       
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        Tela3CadastroUsuario tela = new Tela3CadastroUsuario();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       Logar(BuscarUsuario(objUsuario));
    }//GEN-LAST:event_btnLoginActionPerformed

    private void campoUsuarioFocusLost(java.awt.event.FocusEvent evt) {                                       
        if (campoUsuario.getText().equals("")) {
            campoUsuario.setText("Usuário");
            campoUsuario.setForeground(new Color(204, 204, 204));
        }
    }                                      

    private void campoUsuarioFocusGained(java.awt.event.FocusEvent evt) {                                         
        if (campoUsuario.getText().equals("Usuário")) {
            campoUsuario.setText("");
            campoUsuario.setForeground(new Color(0, 0, 0));
        }
    }                                        

    private void campoSenhaFocusLost(java.awt.event.FocusEvent evt) {                                     
        if (campoSenha.getText().equals("")) {
            campoSenha.setText("**********");
            campoSenha.setForeground(new Color(204, 204, 204));
        }
    }                                    

    private void campoSenhaFocusGained(java.awt.event.FocusEvent evt) {                                       
        if (campoSenha.getText().equals("**********")) {
            campoSenha.setText("");
            campoSenha.setForeground(new Color(0, 0, 0));
        }
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
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnNovo;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private ObjUsuario BuscarUsuario(ObjUsuario objUsuario) {

        this.conectar.conectaBanco();
        
        String username = campoUsuario.getText();
        String senha = campoSenha.getText();

        try {
            this.conectar.executarSQL(
                    "SELECT "
                    + "usuario_id,"
                    + "usuario_nome,"
                    + "usuario_username,"
                    + "usuario_senha,"
                    + "usuario_cpf,"
                    + "usuario_tipo"
                    + " FROM"
                    + " usuarios"
                    + " WHERE"
                    + " usuario_username = '" + username + "' and usuario_senha = '" +senha+ "'"
                    + ";"
            );

            while (this.conectar.getResultSet().next()) {

                objUsuario.setUsuarioId(Integer.parseInt(this.conectar.getResultSet().getString(1)));
                objUsuario.setUsuarioNome(this.conectar.getResultSet().getString(2));
                objUsuario.setUsuarioUserName(this.conectar.getResultSet().getString(3));
                objUsuario.setUsuarioSenha(this.conectar.getResultSet().getString(4));
                objUsuario.setUsuarioCpf(this.conectar.getResultSet().getString(5));
                objUsuario.setUsuarioTipo(this.conectar.getResultSet().getString(6));

            }
            
            if (objUsuario.getUsuarioUserName().equals("")) {
//                JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorretos!");
                objUsuario = null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar usuario " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar Usuario");
            
            objUsuario = null;
        } finally {
            this.conectar.fechaBanco();
        }
        return objUsuario;
    }
    
    private void Logar(ObjUsuario objUsuario){
        
        String tipo;
        
        if (objUsuario == null) {
            JOptionPane.showMessageDialog(null, "Usuario ou Senha Incorretos!");    
        } else {
            tipo = objUsuario.getUsuarioTipo();
            
            switch(tipo){
                case "Usuário":
                    Tela5Feed telafeed = new Tela5Feed();
                    telafeed.setVisible(true);
                    System.out.println("Seja bem vindo!");
                    dispose();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Algo deu errado: Switch, tela Login, Função Logar(ObjUsuario)");
                    break;
            }
        }
    }
}
