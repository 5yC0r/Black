
package Modelo;

public class Empleado {
   //Atributos
    String nombresApellidos;
    String telefonoContacto;
    String celular;
    String telefonoReferencia;
    String direccion;
    String fechaNacimiento;
    String correo;
    String numeroCuenta;
    String fechaPago;
    String hobby;
    
    char sexo;
    //char tipo;  //persona natural o juridica/* esto es para cliente*/
    
    int dni;
    int edad;
    
    float sueldo;
    
    
    
    public Empleado(){
        this.nombresApellidos = "";
        this.telefonoContacto = "";
        this.celular = "";
        this.telefonoReferencia = "";
        this.direccion = "";
        this.fechaNacimiento = "";
        this.correo = "";
        this.numeroCuenta = "";
        this.fechaPago = "";
        this.hobby = "";
        
        this.sexo = ' ';
        //this.tipo = ' ';
        
        this.dni = 1231;
        this.edad = 1;
        
        this.sueldo = 0.0f;
    }
}
