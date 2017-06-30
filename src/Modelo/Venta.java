
package Modelo;

import java.util.ArrayList;

public class Venta {
    int numeroVenta;
    
    String fechaVenta;
    String resposableVenta;
    
    ArrayList <Producto> listaProductos;
    
    public Venta(){
        numeroVenta = 0;
        fechaVenta = "";
        resposableVenta= "";
        listaProductos = new ArrayList();
    }
}
