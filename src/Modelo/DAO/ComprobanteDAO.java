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
public class ComprobanteDAO {
    
    Conexion conexion;
    
    public ComprobanteDAO(){
        conexion = new Conexion();
    }
    
    public void registrarDatosComprobante(
            String tipoComprobante,    //Solo un numero para diferenciar cada tipo
            int serie,
            int coorrelativo,
            int igv,
            String fechaEmision,
            int codigoCliente,
            int codigoVenta,
            float subtotalComprobante,
            float totalComprobante
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO comprobante(tipoComprobante,serie,coorrelativo,igv,fechaEmision,codigoCliente,codigoVenta,subtotalComprobante,totalComprobante)"
                    + "VALUES(?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, tipoComprobante);
            ps.setInt(2,serie);
            ps.setInt(3, coorrelativo);
            ps.setInt(4, igv);
            ps.setString(5, fechaEmision);
            ps.setInt(6, codigoCliente);
            ps.setInt(7, codigoVenta);
            ps.setFloat(8, subtotalComprobante);
            ps.setFloat(9, totalComprobante);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar datos del comprobante: "+e.toString());
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
