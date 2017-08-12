
package Modelo;

//import java.util.ArrayList;

public class Proveedor {

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public String getDiaPedido1() {
        return diaPedido1;
    }

    public void setDiaPedido1(String diaPedido1) {
        this.diaPedido1 = diaPedido1;
    }

    public String getDiaPedido2() {
        return diaPedido2;
    }

    public void setDiaPedido2(String diaPedido2) {
        this.diaPedido2 = diaPedido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    int codProveedor;
    String nombreProveedor;
    String direccion;
    String telefono;    //fijo
    String celular;    //Celular
    String numeroCuenta; 
    String diaPedido1;
    String diaPedido2;
    
//    ArrayList <Integer> diasPedido;     //1: lunes | 2: martes ...
    
    public Proveedor(){
        codProveedor = 1;
        nombreProveedor = "";
        direccion = "";
        telefono = "";
        celular = "";
        numeroCuenta = "";
//        diasPedido = new ArrayList();
        diaPedido1 ="";
        diaPedido2 ="";
    }
    
}
