
package Modelo;

import java.util.ArrayList;

public class Venta {
    
    //int codigoVenta; // se generara automaticamente con el increment
    String fechaVenta;
    int responsableVenta;    
    int codigoCliente;
    //String nombreCliente;
    float subTotalVenta;
    float descuento;
    float totalNetoVenta;
    
    
       
    ArrayList <Producto> listaProductosVendidos;
    
    public Venta(){
        //codigoVenta = 0;
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
