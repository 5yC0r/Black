
package Modelo.DAO;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    Conexion conexion;
    
    public ClienteDAO(){
        conexion = new Conexion();
    }
    
    public void registrarNuevoCliente(
        String nombresApellidos,
        String telefonoContacto,
        String direccion,
        String fechaNacimiento,
        String correo,
        int dni,
        int edad
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO cliente"
                    + "VALUES()"
                    + "(?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombresApellidos);
            ps.setString(2, telefonoContacto);
            ps.setString(3, direccion);
            ps.setString(4, fechaNacimiento);
            ps.setString(5, correo);
            ps.setInt(6, dni);
            ps.setInt(7, edad);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar cliente: "+e.toString());
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
