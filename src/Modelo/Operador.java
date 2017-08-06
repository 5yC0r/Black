/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MARIANA
 */
public class Operador {
    
    public int getCodOperador() {
        return codOperador;
    }

    public void setCodOperador(int codigoOperador) {
        this.codOperador = codigoOperador;
    }

    public String getNombreOperador() {
        return nombreOperador;
    }

    public void setNombreOperador(String nombreOperador) {
        this.nombreOperador = nombreOperador;
    }
    
    int codOperador;    
    String nombreOperador;
    
    public Operador(){
        this.codOperador = 0;
        this.nombreOperador = "";

    }
}
