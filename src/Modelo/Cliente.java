
package Modelo;

public class Cliente {
    //Atributos
    String tipoCliente;
    String tipoDoc;
    String numDoc;
    String razonSocial;
    String nombresApellidos;
    String fechaNacimiento;
    String sexoCliente;
    String telefonoCliente;
    String celularCliente;
    String correoCliente;
    String direccion;

    
    
    int codEmpleado;
    String fechaRegistroCliente;
    
    public Cliente(){
        this.tipoCliente = "";
        this.tipoDoc = "";
        this.numDoc = "";
        this.razonSocial = "";
        this.nombresApellidos = "";
        this.fechaNacimiento = "";
        this.sexoCliente = "";
        this.telefonoCliente = "";
        this.celularCliente = "";
        this.correoCliente = "";
        this.direccion = "";
        
        this.codEmpleado = 0;
        this.fechaRegistroCliente = "";
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexoCliente() {
        return sexoCliente;
    }

    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getFechaRegistroCliente() {
        return fechaRegistroCliente;
    }

    public void setFechaRegistroCliente(String fechaRegistroCliente) {
        this.fechaRegistroCliente = fechaRegistroCliente;
    }
    
    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    
}
