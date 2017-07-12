
package Modelo.DAO;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpleadoDAO {
    
    Conexion conexion;
    
    public EmpleadoDAO(){
        conexion = new Conexion();
    }
    
    public void registrarNuevoEmpleado(
        String nombresApellidos, 
        String telefonoContacto,
        String celular,
        String telefonoReferencia,
        String direccion,
        String fechaNacimiento,
        String correo,
        String numeroCuenta,
        int fechaPago,
        String hobby,
        String sexo,
        //char tipo,
        int dni,
        int edad,
        float sueldo
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO empleado(nombresApellidos,telefonoContacto,celular,telefonoReferencia, direccion,fechaNacimiento,correo,numeroCuenta, fechaPago, hobby, sexo,dni,edad,sueldo)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombresApellidos);
            ps.setString(2, telefonoContacto);
            ps.setString(3, celular);
            ps.setString(4, telefonoReferencia);
            ps.setString(5, direccion);
            ps.setString(6, fechaNacimiento);
            ps.setString(7, correo);
            ps.setString(8, numeroCuenta);
            ps.setInt(9, fechaPago);
            ps.setString(10, hobby);
            ps.setString(11, sexo);
            ps.setInt(12, dni);
            ps.setInt(13, edad);
            ps.setFloat(14, sueldo);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar empleado: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }

            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
}
