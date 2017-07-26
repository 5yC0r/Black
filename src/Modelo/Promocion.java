/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MARIANA
 */
public class Promocion {
    
    String nombrePromocion;
    String descripcion;
    String categoria;
    String producto;
    int unidades;
    float importe;
   
    public Promocion(){
        this.nombrePromocion = "";
        this.descripcion = "";
        this.categoria = "";
        this.producto = "";
        this.unidades = 1;
        this.importe = 0.1f;

    }
}
