
package Modelo;

public class Comprobante {
    int tipoComprobante;    //Solo un numero para diferenciar cada tipo
    int estadoComprobante;
    int tipoMoneda;
    int igv;
    
    String numeroComprobante;
    String fechaEmision;
    
    public Comprobante(){
        tipoComprobante = 0;
        estadoComprobante = 0;
        tipoMoneda = 0;
        igv = 0;
        
        numeroComprobante = "";
        fechaEmision = "";
    }
}
