
package Modelo;

import java.util.ArrayList;

public class Producto {

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public ArrayList<PrecioProducto> getListaPrecios() {
        return listaPrecios;
    }

    public void setListaPrecios(ArrayList<PrecioProducto> listaPrecios) {
        this.listaPrecios = listaPrecios;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(String numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public int getPuntoPedido() {
        return puntoPedido;
    }

    public void setPuntoPedido(int puntoPedido) {
        this.puntoPedido = puntoPedido;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    String codigoProducto;
    String nombreProducto;
    String marca;
    String descripcion;
    String categoria;
    String fechaVencimiento;
    int stock;
    int puntoPedido;
    String numeroBoleta;
    String fechaRegistro;
    
    ArrayList <PrecioProducto> listaPrecios;
    
    public Producto(){
        codigoProducto = "";
        nombreProducto= "";
        descripcion = "";
        marca = "";
        fechaRegistro = "";
        fechaVencimiento = "";
        
        categoria = "";
        stock = 0;
        puntoPedido= 0;
        numeroBoleta ="";
        
        listaPrecios = new ArrayList();
    }
}
