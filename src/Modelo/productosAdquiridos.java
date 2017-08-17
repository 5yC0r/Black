/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MARIANA
 */
public class productosAdquiridos {

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodCompra() {
        return codCompra;
    }

    public void setCodCompra(int codCompra) {
        this.codCompra = codCompra;
    }

    public int getCodProdAdqui() {
        return codProdAdqui;
    }

    public void setCodProdAdqui(int codProdAdqui) {
        this.codProdAdqui = codProdAdqui;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    int codProdAdqui;
    String codigo;
    String nombre;
    int cantidad;    
    float importe;
    int codCompra;
       
    public productosAdquiridos(){
        this.codProdAdqui = 0;
        this.codigo = "";
        this.nombre = "";
        this.cantidad = 0;    
        this.importe = 0.1f;
        this.codCompra = 1;
    }
}
