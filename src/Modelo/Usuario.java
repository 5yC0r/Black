
package Modelo;

public class Usuario {
    //atributos
    String usuario;
    String password;
    String tipoUsuario;
    String fechaRegistro;

    public Usuario() {
        this.usuario = "";
        this.password = "";
        this.tipoUsuario = "";
        this.fechaRegistro = "" ;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String contraseña) {
        this.password = contraseña;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
    public int validarUsuario(String usuario, String contraseña){
       if("admin".equals(usuario) && "123456".equals(contraseña)){
            return 1;
        }else{
            return 0;
        }
    }
}
