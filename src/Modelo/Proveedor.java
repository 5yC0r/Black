
package Modelo;

import java.util.ArrayList;

public class Proveedor {
    String nombreProveedor;
    String direccionProveedor;
    String numTelfProveedor;    //fijo
    String numCelfProveedor;    //Celular
    String numCuentaProveedor; 
    
    ArrayList <Integer> diasPedido;     //1: lunes | 2: martes ...
    
    public Proveedor(){
        nombreProveedor = "";
        direccionProveedor = "";
        numTelfProveedor = "";
        numCelfProveedor = "";
        numCuentaProveedor = "";
        diasPedido = new ArrayList();
    }
    
}
