
package Modelo;

public class Comprobante {
    String tipoComprobante;    //Solo un numero para diferenciar cada tipo
    int serie;
    int coorrelativo;
    int igv;
    String fechaEmision;
    int codigoCliente;
    int codigoVenta;
    float subtotalComprobante;
    float totalComprobante;
    
    public Comprobante(){
        tipoComprobante = "";
        serie = 0;
        coorrelativo = 0;
        igv = 0;
        fechaEmision = "";
        codigoCliente = 0;
        codigoVenta = 0;
        subtotalComprobante = 0.1f;
        totalComprobante = 0.1f;
    }
}
