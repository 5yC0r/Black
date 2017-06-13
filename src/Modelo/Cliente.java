
package Modelo;

public class Cliente {
    //Atributos
    String nombresApellidos;
    String telefonoContacto;
    String direccion;
    String fechaNacimiento;
    String correo;
    
    int dni;
    int edad;
    
    public Cliente(){
        this.nombresApellidos = "";
        this.telefonoContacto = "";
        this.direccion = "";
        this.fechaNacimiento = "";
        this.correo = "";
        
        this.dni = 1;
        this.edad = 1;
    }
}
