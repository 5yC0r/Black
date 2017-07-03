/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MARIANA
 */
public class Bonos {
    
    String nombreBono;
    float porcentaje;
    float totalBono;
    
    int estado;
    
    String descripcion;
    
    public Bonos(){
        this.nombreBono = "";
        this.porcentaje = 0.1f;
        this.totalBono = 0.1f;
        this.estado = 1;
        this.descripcion = "";

    }
}
