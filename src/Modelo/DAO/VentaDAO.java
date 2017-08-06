/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        
        //int codigoVenta,
        String fechaVenta,
        int responsableVenta,    
        int codigoCliente,
        //String nombreCliente,
        float subTotalVenta,
        float descuento,
        float totalNetoVenta
            
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO venta(fechaVenta,responsableVenta,codigoCliente,subtotalVenta,descuento,totalNetoVenta)"
                    + "VALUES(?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            //ps.setInt(1, codigoVenta);
            ps.setString(1, fechaVenta);
            ps.setInt(2, responsableVenta);
            ps.setInt(3, codigoCliente);
            ps.setFloat(4, subTotalVenta);
            ps.setFloat(5, descuento);
            ps.setFloat(6, totalNetoVenta);
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
    
    public ArrayList<Venta> listarVentas() throws SQLException{
        ArrayList<Venta> listaVentas = new ArrayList();
        Venta venta;
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT codigoVenta,codigoCliente,totalNetoVenta,fechaVenta FROM venta";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                venta = new Venta();
                venta.setCodigoVenta(rs.getInt(1));
                venta.setCodigoCliente(rs.getInt(2));
                venta.setTotalNetoVenta(rs.getFloat(3));
                venta.setFechaVenta(rs.getString(4));
                listaVentas.add(venta);
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
        return listaVentas;
    }
    
}
