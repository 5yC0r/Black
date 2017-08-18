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
    
    
    
    public PrecioProductoDAO(){
        
    }
    
    public void registrarPreciosProducto(
        String nombre,
        float valorVenta,
        int codProducto
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO precios(nombre,valorVenta,codProducto)"
                    + "VALUES(?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setFloat(2,valorVenta);
            ps.setInt(3, codProducto);            
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
