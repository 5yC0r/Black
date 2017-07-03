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
public class VentaDAO {
    
    Conexion conexion;
    
    public VentaDAO(){
        conexion = new Conexion();
    }
    
    public void registrarVenta(
        
        int numeroVenta,
        String fechaVenta,
        String resposableVenta
            
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO venta"
                    + "VALUES()"
                    + "(?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setInt(1, numeroVenta);
            ps.setString(2, fechaVenta);
            ps.setString(3, resposableVenta);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar los datos del proveedor: "+e.toString());
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
