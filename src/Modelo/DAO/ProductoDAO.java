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
    
    
    
    public ProductoDAO(){
        
    }
    
    public void registrarProducto(
        
        int codigoProducto,
        String nombreProducto,
        String marca,
        String descripcion,
        int codCategoria,
        String fechaVencimiento,
        int stock,
        int puntoPedido,
        String fechaRegistro,
        int codProveedor,
        int codEmpleado
        
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO producto(codigoProducto,nombreProducto,marca,descripcion,codCategoria,fechaVencimiento,stock,puntoPedido,fechaRegistro,codProveedor,codEmpleado)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setInt(1, codigoProducto);
            ps.setString(2,nombreProducto);
            ps.setString(3, marca);
            ps.setString(4, descripcion);
            ps.setInt(5, codCategoria);
            ps.setString(6, fechaVencimiento);
            ps.setInt(7, stock);
            ps.setInt(8, puntoPedido);
            ps.setString(9, fechaRegistro);
            ps.setInt(10,codProveedor);
            ps.setInt(11,codEmpleado);
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
                producto.setCodigoProducto(rs.getInt(1));
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
    
    public int obtenerCodigo(int codigoProducto) throws SQLException{
        Conexion conexion = new Conexion();
        Producto producto = new Producto();
        int codigo = 0;
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM producto where codigoProducto ='"+codigoProducto+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                producto.setCodProducto(rs.getInt(1));
                //operador.setNombreOperador(rs.getString(2));
             }
             codigo = producto.getCodProducto();             
             System.out.println(codigo);             
            
        } catch (SQLException e) {
            System.out.println("Error al obtener el codigo del operador: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        //System.out.println(operador.getCodigoOperador());
        //System.out.println(cliente.getFechaRegistroCliente());
       return codigo;
    }
    
    
    public int obtenerCodigoNombre(String nomProducto) throws SQLException{
        Conexion conexion = new Conexion();
        Producto producto = new Producto();
        int codigo = 0;
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM producto where nombreProducto ='"+nomProducto+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                producto.setCodProducto(rs.getInt(1));
                producto.setNombreProducto(rs.getString(3));
                //operador.setNombreOperador(rs.getString(2));
             }
             codigo = producto.getCodProducto();             
             System.out.println(codigo);             
            
        } catch (SQLException e) {
            System.out.println("Error al obtener el codigo del operador: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        //System.out.println(operador.getCodigoOperador());
        //System.out.println(cliente.getFechaRegistroCliente());
       return codigo;
    }
    
    public String obtenerNombre(int codProducto) throws SQLException{
        Conexion conexion = new Conexion();
        Producto producto = new Producto();
        String nombre = "";
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT nombreProducto FROM producto where codProducto = '"+codProducto+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                producto.setNombreProducto(rs.getString(1));
             }
             nombre = producto.getNombreProducto();
             
            System.out.println(nombre);
             
            
        } catch (SQLException e) {
            System.out.println("Error al obtener el codigo del operador: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        //System.out.println(operador.getCodigoOperador());
        //System.out.println(cliente.getFechaRegistroCliente());
       return nombre;
    }
}
