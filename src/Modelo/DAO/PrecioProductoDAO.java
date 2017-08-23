/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Empleado;
import Modelo.PrecioProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    
    
    public ArrayList<PrecioProducto> listarPrecios(int codigo) throws SQLException{
        ArrayList<PrecioProducto> listaPrecios = new ArrayList();
        PrecioProducto precioproducto;
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT nombre,valorVenta FROM precios WHERE codProducto='"+codigo+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                precioproducto = new PrecioProducto();
                precioproducto.setNombre(rs.getString(1));
                precioproducto.setValorVenta(rs.getFloat(2));
                listaPrecios.add(precioproducto);
            }     
        } catch (SQLException e) {
            System.out.println("Error al listar precios: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        return listaPrecios;
    }
    
    public PrecioProducto obtenerPrecios(String nombre, int codigo) throws SQLException{
        Conexion conexion = new Conexion();
        PrecioProducto precio = new PrecioProducto();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM precios where codProducto='"+codigo+"' && nombre='"+nombre+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                precio.setCodPrecio(rs.getInt(1));
                precio.setNombre(rs.getString(2));
                precio.setValorVenta(rs.getFloat(3));
                precio.setCodProducto(rs.getInt(4));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener datos de cliente: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        return precio;
    }
    
}
