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
public class CompraDAO {
    private final Conexion conexion;
    
    public CompraDAO(){
        conexion = new Conexion();
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
}
