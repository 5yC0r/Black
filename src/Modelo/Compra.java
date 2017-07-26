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
    String proveedor;
    String vendedor;
    String fechaCompra;
    String tipoPago;
    int diasPago;
    float totalPago;
       
    public Compra(){
        this.numeroComprobante = "";        
        this.proveedor = "";
        this.vendedor = "";
        this.fechaCompra = "";
        this.tipoPago = "";
        this.diasPago = 1;
        this.totalPago = 0.1f;
    }
}
