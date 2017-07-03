
package Modelo;

import java.util.ArrayList;

public class Producto {
    String codigoProducto;
    String nombreProducto;
    String descripcionProducto;
    String marcaProducto;
    String fechaRegistroPdto;
    String fechaVencimientoPdto;
    
    int categoria;
    int stockProducto;
    int puntoPedidoPdto;
    String numeroBoleta;
    
    ArrayList <PrecioProducto> listaPrecios;
    
    public Producto(){
        codigoProducto = "";
        nombreProducto= "";
        descripcionProducto = "";
        marcaProducto = "";
        fechaRegistroPdto= "";
        fechaVencimientoPdto = "";
        
        categoria = 0;
        stockProducto = 0;
        puntoPedidoPdto= 0;
        numeroBoleta ="";
        
        listaPrecios = new ArrayList();
    }
}
