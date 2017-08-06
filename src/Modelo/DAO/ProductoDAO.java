/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MARIANA
 */
public class ProductoDAO {
    
    Conexion conexion;
    
    public ProductoDAO(){
        conexion = new Conexion();
    }
    
    public void registrarProducto(
        String codigoProducto,
        String nombreProducto,
        String marca,
        String descripcion,
        String categoria,
        String fechaVencimiento,
        int stock,
        int puntoPedido,
        String numeroBoleta,
        String fechaRegistro   
        
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO producto(codigoProducto,nombreProducto,marca,descripcion,categoria,fechaVencimiento,stock,puntoPedido,numeroBoleta,fechaRegistro)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, codigoProducto);
            ps.setString(2,nombreProducto);
            ps.setString(3, marca);
            ps.setString(4, descripcion);
            ps.setString(5, categoria);
            ps.setString(6, fechaVencimiento);
            ps.setInt(7, stock);
            ps.setInt(8, puntoPedido);
            ps.setString(9, numeroBoleta);
            ps.setString(10, fechaRegistro);
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
    
    public ArrayList<Producto> listarProductos() throws SQLException{
        ArrayList<Producto> listaProductos = new ArrayList();
        Producto producto;
         
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT codigoProducto, nombreProducto, marca, stock FROM producto";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                producto = new Producto();
                producto.setCodigoProducto(rs.getString(1));
                producto.setNombreProducto(rs.getString(2));
                producto.setMarca(rs.getString(3));
                producto.setStock(rs.getInt(4));
                listaProductos.add(producto);
            }     
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        return listaProductos;
    }
}
