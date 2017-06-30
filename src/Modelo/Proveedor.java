
package Modelo;

import java.util.ArrayList;

public class Proveedor {
    String nombreProveedor;
    String direccionProveedor;
    String numTelfProveedor;    //fijo o celular
    String numCuentaProveedor; 
    
    ArrayList <Integer> diasPedido;     //1: lunes | 2: martes ...
    
    public Proveedor(){
        nombreProveedor = "";
        direccionProveedor = "";
        numTelfProveedor = "";
        numCuentaProveedor = "";
        diasPedido = new ArrayList();
    }
    
}
