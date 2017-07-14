
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
        String tipoCliente,
        String tipoDoc,
        String numDoc,
        String razonSocial,
        String nombresApellidos,
        String fechaNacimiento,
        String sexoCliente,
        String telefonoCliente,
        String celularCliente,
        String correoCliente,
        String direccion,

        String vendedor,
        String fechaRegistroCliente
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO cliente(tipoCliente,tipoDoc,numDoc,razonSocial,nombresApellidos,fechaNacimiento,sexoCliente,telefonoCliente,celularCliente,correoCliente,direccion,vendedor,fechaRegistroCliente)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, tipoCliente);
            ps.setString(2, tipoDoc);
            ps.setString(3, numDoc);
            ps.setString(4, razonSocial);
            ps.setString(5, nombresApellidos);
            ps.setString(6, fechaNacimiento);
            ps.setString(7, sexoCliente);
            ps.setString(8, telefonoCliente);
            ps.setString(9, celularCliente);
            ps.setString(10, correoCliente);
            ps.setString(11, direccion);
            
            ps.setString(12, vendedor);
            ps.setString(13, fechaRegistroCliente);
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
