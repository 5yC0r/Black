/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Empleado;
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
    
    
    
    public VentaDAO(){
        
    }
    
    public void registrarVenta(
        
        //int codigoVenta,
        String fechaVenta,
        int codEmpleado,    
        int codCliente,
        float subTotalVenta,
        float descuento,
        float totalNetoVenta
            
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO venta(fechaVenta,codEmpleado,codCliente,subtotalVenta,descuento,totalNetoVenta)"
                    + "VALUES(?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, fechaVenta);
            ps.setInt(2, codEmpleado);
            ps.setInt(3, codCliente);
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
            String consulta = "SELECT codVenta,codCliente,totalNetoVenta,fechaVenta FROM venta";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                venta = new Venta();
                venta.setCodVenta(rs.getInt(1));
                venta.setCodCliente(rs.getInt(2));
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
    
    
    public int obtenerUltimo() throws SQLException{
        Conexion conexion = new Conexion();
        Venta venta = new Venta();
        int codigo = 0;
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT MAX(codVenta) AS id FROM venta";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                venta.setCodVenta(rs.getInt(1));
                
                //operador.setNombreOperador(rs.getString(2));
             }
             codigo = venta.getCodVenta();
             
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
    
}