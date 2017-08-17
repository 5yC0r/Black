/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Compra;
import Modelo.Conexion;
import Modelo.Empleado;
import com.mysql.jdbc.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MARIANA
 */
public class CompraDAO {
    
    
    public CompraDAO(){
        
    }
    
    public void registrarCompra(
        String numeroComprobante,
        int codProveedor,
        int codEmpleado,
        String fechaCompra,
        String tipoPago,
        int diasPago,
        float totalPago
        ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO compra(numeroComprobante,codProveedor,codEmpleado,fechaCompra,tipoPago,diasPago,totalPago)"
                    + "VALUES(?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, numeroComprobante);
            ps.setInt(2, codProveedor);
            ps.setInt(3, codEmpleado);
            ps.setString(4, fechaCompra);
            ps.setString(5, tipoPago);
            ps.setInt(6, diasPago);
            ps.setFloat(7,totalPago);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar datos de la compra: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }

            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
    
    public int obtenerCodigo(String codigoBoleta) throws SQLException{
        Conexion conexion = new Conexion();
        Compra compra = new Compra();
        int codigo = 0;
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM compra where numeroComprobante ='"+codigoBoleta+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = (ResultSet) ps.executeQuery();
            
            while (rs.next()) {
                compra.setCodCompra(rs.getInt(1));
                //operador.setNombreOperador(rs.getString(2));
             }
             codigo = compra.getCodCompra();             
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
    
    public ArrayList<Compra> listarCompras() throws SQLException{
        ArrayList<Compra> listaCompras = new ArrayList();
        Compra compra;
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT numeroComprobante,codProveedor,fechaCompra,totalPago FROM compra";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            java.sql.ResultSet rs = ps.executeQuery();
            while(rs.next()){
                compra = new Compra();
                compra.setNumeroComprobante(rs.getString(1));
                compra.setCodProveedor(rs.getInt(2));
                compra.setFechaCompra(rs.getString(3));
                compra.setTotalPago(rs.getInt(4));
                listaCompras.add(compra);
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
        return listaCompras;
    }
}
