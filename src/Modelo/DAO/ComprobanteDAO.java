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
            int tipoComprobante,    //Solo un numero para diferenciar cada tipo
            int estadoComprobante,
            int tipoMoneda,
            int igv,

            String numeroComprobante,
            String fechaEmision
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO comprobante"
                    + "VALUES"
                    + "(?,?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setInt(1, tipoComprobante);
            ps.setInt(2, estadoComprobante);
            ps.setInt(3, tipoMoneda);
            ps.setInt(4, igv);
            ps.setString(5, numeroComprobante);
            ps.setString(6, fechaEmision);
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
