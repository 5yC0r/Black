/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author MARIANA
 */
public class Compra {
    
    String numeroComprobante;
    String comprador;
    int  proveedor;// seleccionar combobox
    String vendedor;
    String fechaCompra;
    int tipoPago;
    int diasPago;
    float importePagar;
   
    public Compra(){
        this.numeroComprobante = "";
        this.comprador = "";
        this.proveedor = 1;
        this.vendedor = "";
        this.fechaCompra = "";
        this.tipoPago = 1;
        this.diasPago = 1;
        this.importePagar = 0.1f;
    }
}
