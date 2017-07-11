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
public class PrecioProductoDAO {
    
    Conexion conexion;
    
    public PrecioProductoDAO(){
        conexion = new Conexion();
    }
    
    public void registrarPreciosProductos(
        String unidad,
    
    float costo,
    float venta
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO precioProducto"
                    + "VALUES"
                    + "(?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, unidad);
            ps.setFloat(2,costo );
            ps.setFloat(3, venta);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar los precios de los productos: "+e.toString());
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
