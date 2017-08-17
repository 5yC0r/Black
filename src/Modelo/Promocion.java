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

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public String getNombrePromocion() {
        return nombrePromocion;
    }

    public void setNombrePromocion(String nombrePromocion) {
        this.nombrePromocion = nombrePromocion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    String nombrePromocion;
    String descripcion;
    int categoria;
    int codProducto;
    int unidades;
    float importe;
   
    public Promocion(){
        this.nombrePromocion = "";
        this.descripcion = "";
        this.categoria = 1;
        this.codProducto = 1;
        this.unidades = 1;
        this.importe = 0.1f;

    }
}
