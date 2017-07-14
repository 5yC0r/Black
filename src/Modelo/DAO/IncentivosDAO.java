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
public class IncentivosDAO {
    private final Conexion conexion;
    
    public IncentivosDAO(){
        conexion = new Conexion();
    }
    
    public void registrarIncentivo(
        String tipoIncentivo,
        String nombreIncentivo,
        String cantidadIncentivo,
        String sueldoVenta,
        String estadoIncentivo,

        String descripcionIncentivo,
        String fechaIncentivo
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO incentivo(tipoIncentivo,nombreIncentivo,cantidadIncentivo,sueldoVenta,estadoIncentivo,descripcionIncentivo,fechaIncentivo)"
                    + "VALUES(?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, tipoIncentivo);
            ps.setString(2, nombreIncentivo);
            ps.setString(3, cantidadIncentivo);
            ps.setString(4, sueldoVenta);
            ps.setString(5, estadoIncentivo);
            ps.setString(6, descripcionIncentivo);
            ps.setString(7, fechaIncentivo);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar datos del incentivo: "+e.toString());
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
