
package Modelo;

public class PrecioProducto {

    public int getCodPrecio() {
        return codPrecio;
    }

    public void setCodPrecio(int codPrecio) {
        this.codPrecio = codPrecio;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(float valorVenta) {
        this.valorVenta = valorVenta;
    }
    
    int codPrecio;
    String nombre;
    float valorVenta;
    int codProducto;
    
    public PrecioProducto(){
        this.codPrecio = 0;
       this.nombre = "";
        this.valorVenta = 0.1f;
        this.codProducto = 0;
    }
}
