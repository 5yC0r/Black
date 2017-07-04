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
public class ProductoDAO {
    
    Conexion conexion;
    
    public ProductoDAO(){
        conexion = new Conexion();
    }
    
    public void registrarPreciosProductos(
        String codigoProducto,
        String nombreProducto,
        String descripcionProducto,
        String marcaProducto,
        String fechaRegistroPdto,
        String fechaVencimientoPdto,

        int categoria,
        int stockProducto,
        int puntoPedidoPdto,
        String numeroBoleta
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO producto"
                    + "VALUES"
                    + "(?,?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, codigoProducto);
            ps.setString(2,nombreProducto);
            ps.setString(3, descripcionProducto);
            ps.setString(4, marcaProducto);
            ps.setString(5, fechaRegistroPdto);
            ps.setString(6, fechaVencimientoPdto);
            ps.setInt(7, categoria);
            ps.setInt(8, stockProducto);
            ps.setInt(9, puntoPedidoPdto);
            ps.setString(10, numeroBoleta);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar los datos del producto: "+e.toString());
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
