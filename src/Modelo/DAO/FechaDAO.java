/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MARIANA
 */
public class FechaDAO {
    
    
     public void registrarFechasProducto(
        String fecha,
        int codProducto
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO fechavencimiento(fechaVencimiento,codProducto)"
                    + "VALUES(?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, fecha);
            ps.setInt(2, codProducto);            
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar las fechas de los productos: "+e.toString());
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
