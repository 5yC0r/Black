
package Modelo;

import java.util.ArrayList;

public class Producto {
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
