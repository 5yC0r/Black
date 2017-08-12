
package Modelo;

public class PrecioProducto {
    
    int codPrecio;
    String nombre;
    
    float valorCosto;
    float valorVenta;
    int codProducto;
    
    public PrecioProducto(){
        this.codPrecio = 0;
       this.nombre = "";
        
        this.valorCosto = 0.1f;
        this.valorVenta = 0.1f;
        this.codProducto = 0;
    }
}
