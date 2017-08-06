/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MARIANA
 */
public class Recarga {
    
    public float getCantidadRecargada() {
        return cantidadRecargada;
    }

    public void setCantidadRecargada(float cantidadRecargada) {
        this.cantidadRecargada = cantidadRecargada;
    }

    public int getCodOperador() {
        return codOperador;
    }

    public void setCodOperador(int codOperador) {
        this.codOperador = codOperador;
    }

    public int getCodRecarga() {
        return codRecarga;
    }

    public void setCodRecarga(int codRecarga) {
        this.codRecarga = codRecarga;
    }

    

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
    
    int codRecarga;
    int codOperador;
    String numeroCelular;
    
    float cantidadRecargada;
   
    public Recarga(){
        this.codRecarga =0;
        this.codOperador =0;
        this.numeroCelular = "";
        
        this.cantidadRecargada = 0.1f;
    }
}
