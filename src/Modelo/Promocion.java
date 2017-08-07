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
    int codProducto;
    int unidades;
    float importe;
   
    public Promocion(){
        this.nombrePromocion = "";
        this.descripcion = "";
        this.categoria = "";
        this.codProducto = 1;
        this.unidades = 1;
        this.importe = 0.1f;

    }
}
