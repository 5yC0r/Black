/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MARIANA
 */
public class Incentivos {

    
    int codIncentivo;
    String tipoIncentivo;
    String nombreIncentivo;
    String cantidadIncentivo;
    String sueldoVenta;
    String estadoIncentivo;
    
    String descripcionIncentivo;
    
    public Incentivos(){
        this.codIncentivo = 0;
        this.tipoIncentivo = "";
        this.nombreIncentivo = "";
        this.cantidadIncentivo = "";
        this.sueldoVenta = "";
        this.estadoIncentivo = "";
        
        this.descripcionIncentivo = "";
        

    }
    
    public String getCantidadIncentivo() {
        return cantidadIncentivo;
    }

    public void setCantidadIncentivo(String cantidadIncentivo) {
        this.cantidadIncentivo = cantidadIncentivo;
    }

    public int getCodIncentivo() {
        return codIncentivo;
    }

    public void setCodIncentivo(int codIncentivo) {
        this.codIncentivo = codIncentivo;
    }

    public String getDescripcionIncentivo() {
        return descripcionIncentivo;
    }

    public void setDescripcionIncentivo(String descripcionIncentivo) {
        this.descripcionIncentivo = descripcionIncentivo;
    }

    public String getEstadoIncentivo() {
        return estadoIncentivo;
    }

    public void setEstadoIncentivo(String estadoIncentivo) {
        this.estadoIncentivo = estadoIncentivo;
    }

    public String getNombreIncentivo() {
        return nombreIncentivo;
    }

    public void setNombreIncentivo(String nombreIncentivo) {
        this.nombreIncentivo = nombreIncentivo;
    }

    public String getSueldoVenta() {
        return sueldoVenta;
    }

    public void setSueldoVenta(String sueldoVenta) {
        this.sueldoVenta = sueldoVenta;
    }

    public String getTipoIncentivo() {
        return tipoIncentivo;
    }

    public void setTipoIncentivo(String tipoIncentivo) {
        this.tipoIncentivo = tipoIncentivo;
    }
}
