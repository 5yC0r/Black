
package Modelo;

import java.io.FileInputStream;

public class Empresa {
    String nombre;
    String razonSocial;
    String representanteLegal;
    String ruc;
    String direccion;
    String telefono;
    String celular;
    String correoElectronico;   //Correo electronico
    String paginaWeb;     //Direccion url de pagina web
    
    FileInputStream foto;    //Ruta del archivo de foto 
    String descripcion; 
    
    public Empresa(){
        nombre = "";
        razonSocial = "";
        representanteLegal = "";
        ruc = "";
        direccion = "";
        telefono = "";
        celular = "";
        correoElectronico = "";
        paginaWeb = "";
        
        foto = null;        
        descripcion = "";
    }
}
