
package Modelo;

import java.util.ArrayList;

public class Venta {

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public ArrayList<Producto> getListaProductosVendidos() {
        return listaProductosVendidos;
    }

    public void setListaProductosVendidos(ArrayList<Producto> listaProductosVendidos) {
        this.listaProductosVendidos = listaProductosVendidos;
    }

    public int getResponsableVenta() {
        return responsableVenta;
    }

    public void setResponsableVenta(int responsableVenta) {
        this.responsableVenta = responsableVenta;
    }

    public float getSubTotalVenta() {
        return subTotalVenta;
    }

    public void setSubTotalVenta(float subTotalVenta) {
        this.subTotalVenta = subTotalVenta;
    }

    public float getTotalNetoVenta() {
        return totalNetoVenta;
    }

    public void setTotalNetoVenta(float totalNetoVenta) {
        this.totalNetoVenta = totalNetoVenta;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }
    
    int codigoVenta; // se generara automaticamente con el increment
    String fechaVenta;
    int responsableVenta;    
    int codigoCliente;
    //String nombreCliente;
    float subTotalVenta;
    float descuento;
    float totalNetoVenta;
    
    
       
    ArrayList <Producto> listaProductosVendidos;
    
    public Venta(){
        codigoVenta = 0;
        fechaVenta = "";
        responsableVenta = 0;
        codigoCliente = 0;
       // nombreCliente = "";
        subTotalVenta = 0.1f;
        descuento = 0.1f;
        totalNetoVenta = 0.1f;
        listaProductosVendidos = new ArrayList();
    }
}
