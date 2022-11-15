package Objetos;

import Conexoes.MySQL;
import javax.swing.JOptionPane;

public class ObjUsuario {
    
    private int usuarioId = 0;
    private String usuarioNome = "";
    private String usuarioUserName = "";
    private String usuarioEmail = "";
    private String usuarioSenha = "";
    private int usuarioPerfilExist = 0;

    //GET AND SETTER
    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getUsuarioNome() {
        return usuarioNome;
    }

    public void setUsuarioNome(String usuarioNome) {
        this.usuarioNome = usuarioNome;
    }

    public String getUsuarioUserName() {
        return usuarioUserName;
    }

    public void setUsuarioUserName(String usuarioUserName) {
        this.usuarioUserName = usuarioUserName;
    }

    public String getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public String getUsuarioSenha() {
        return usuarioSenha;
    }

    public void setUsuarioSenha(String usuarioSenha) {
        this.usuarioSenha = usuarioSenha;
    }

    public int getUsuarioPerfilExist() {
        return usuarioPerfilExist;
    }

    public void setUsuarioPerfilExist(int usuarioPerfilExist) {
        this.usuarioPerfilExist = usuarioPerfilExist;
    }
    
    
    public ObjUsuario BuscarUsuario(String username, String senha) {
        
        MySQL conectar = new MySQL();
        ObjUsuario buscaUser = new ObjUsuario();
        conectar.conectaBanco();

        try {
            conectar.executarSQL(
                    "SELECT "
                    + "usuario_id,"
                    + "usuario_nome,"
                    + "usuario_username,"
                    + "usuario_email,"
                    + "usuario_senha,"
                    + "usuario_perfilexist"
                    + " FROM"
                    + " usuarios"
                    + " WHERE"
                    + " usuario_username = '" + username + "' and usuario_senha = '" +senha+ "'"
                    + ";"
            );

            while (conectar.getResultSet().next()) {

                buscaUser.setUsuarioId(Integer.parseInt(conectar.getResultSet().getString(1)));
                buscaUser.setUsuarioNome(conectar.getResultSet().getString(2));
                buscaUser.setUsuarioUserName(conectar.getResultSet().getString(3));
                buscaUser.setUsuarioEmail(conectar.getResultSet().getString(4));
                buscaUser.setUsuarioSenha(conectar.getResultSet().getString(5));
                buscaUser.setUsuarioPerfilExist(Integer.parseInt(conectar.getResultSet().getString(6)));
                
            }
            
            if (buscaUser.getUsuarioUserName().equals("")) {
                buscaUser = null;
            }

        } catch (Exception e) {
            System.out.println("Erro ao consultar usuario " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar Usuario");
            
            buscaUser = null;
        } finally {
            conectar.fechaBanco();
        }
        return buscaUser;
    }
    
}