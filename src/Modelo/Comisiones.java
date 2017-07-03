/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MARIANA
 */
public class Comisiones {
  
    String nombreComision;
    float porcentaje;
    float totalComision;
    
    int estado;
    
    String descripcion;
    
    public Comisiones(){
        this.nombreComision = "";
        this.porcentaje = 0.1f;
        this.totalComision = 0.1f;
        this.estado = 1;
        this.descripcion = "";

    }
}
