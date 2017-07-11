
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
        String telefonoReferencia,
        String direccion,
        String fechaNacimiento,
        String correo,
        String numeroCuenta,
        String fechaPago,
        String hobby,
        char sexo,
        //char tipo,
        int dni,
        int edad,
        float sueldo
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO empleado"
                    + "VALUES"
                    + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombresApellidos);
            ps.setString(2, telefonoContacto);
            ps.setString(3, telefonoReferencia);
            ps.setString(4, direccion);
            ps.setString(5, fechaNacimiento);
            ps.setString(6, correo);
            ps.setString(7, numeroCuenta);
            ps.setString(8, fechaPago);
            ps.setString(9, hobby);
            ps.setString(10, String.valueOf(sexo));
            //ps.setString(11, String.valueOf(tipo));
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
