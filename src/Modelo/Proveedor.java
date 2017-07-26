
package Modelo;

import java.util.ArrayList;

public class Proveedor {
    String nombreProveedor;
    String direccion;
    String telefono;    //fijo
    String celular;    //Celular
    String numeroCuenta; 
    
    ArrayList <Integer> diasPedido;     //1: lunes | 2: martes ...
    
    public Proveedor(){
        nombreProveedor = "";
        direccion = "";
        telefono = "";
        celular = "";
        numeroCuenta = "";
        diasPedido = new ArrayList();
    }
    
}
