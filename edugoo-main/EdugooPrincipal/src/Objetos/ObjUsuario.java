package Objetos;

public class ObjUsuario {
    
    private int usuarioId = 0;
    private String usuarioNome = "";
    private String usuarioUserName = "";
    private String usuarioEmail = "";
    private String usuarioSenha = "";

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
}