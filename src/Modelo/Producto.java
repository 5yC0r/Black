
package Modelo;

import java.util.ArrayList;

public class Producto {

    
    int codProducto;
    String codigoProducto;
    
    String descripcion; 
    String marca;
    int stock;
    int puntoPedido;
    String fechaRegistro;
    int codCategoria;
    int codProveedor;
    int codEmpleado;

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPuntoPedido() {
        return puntoPedido;
    }

    public void setPuntoPedido(int puntoPedido) {
        this.puntoPedido = puntoPedido;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public ArrayList<PrecioProducto> getListaPrecios() {
        return listaPrecios;
    }

    public void setListaPrecios(ArrayList<PrecioProducto> listaPrecios) {
        this.listaPrecios = listaPrecios;
    }
    
    
    ArrayList <PrecioProducto> listaPrecios;
    
    public Producto(){
        codProducto=0;
        codigoProducto = "";
        descripcion = ""; 
        marca = "";
        stock = 0;
        puntoPedido= 0;
        fechaRegistro = "";
        codCategoria = 0;
        codProveedor=0;
        codEmpleado=0;        
        
        listaPrecios = new ArrayList();
    }
}
