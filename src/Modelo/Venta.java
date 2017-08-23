
package Modelo;

import java.util.ArrayList;

public class Venta {

   
    
    int codVenta; // se generara automaticamente con el increment
    String fechaVenta;
    int codEmpleado;    
    int codCliente;
    float subTotalVenta;
    float descuento;
    float totalNetoVenta;

    
    
    
       
    ArrayList <Producto> listaProductosVendidos;
    
    public Venta(){
        codVenta = 0;
        fechaVenta = "";
        codEmpleado=0;
        codCliente = 0;
        subTotalVenta = 0.1f;
        descuento = 0.1f;
        totalNetoVenta = 0.1f;
        listaProductosVendidos = new ArrayList();
    }
    
    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public float getSubTotalVenta() {
        return subTotalVenta;
    }

    public void setSubTotalVenta(float subTotalVenta) {
        this.subTotalVenta = subTotalVenta;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getTotalNetoVenta() {
        return totalNetoVenta;
    }

    public void setTotalNetoVenta(float totalNetoVenta) {
        this.totalNetoVenta = totalNetoVenta;
    }

    public ArrayList<Producto> getListaProductosVendidos() {
        return listaProductosVendidos;
    }

    public void setListaProductosVendidos(ArrayList<Producto> listaProductosVendidos) {
        this.listaProductosVendidos = listaProductosVendidos;
    }
    
}
