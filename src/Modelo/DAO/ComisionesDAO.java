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
public class ComisionesDAO {
    
    private final Conexion conexion;
    
    public ComisionesDAO(){
        conexion = new Conexion();
    }
    
    public void registrarComision(
        String nombreComision,
        float porcentaje,
        float totalComision,
        int estado,
        String descripcion
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO comision"
                    + "VALUES()"
                    + "(?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombreComision);
            ps.setFloat(2, porcentaje);
            ps.setFloat(3, totalComision);
            ps.setInt(4, estado);
            ps.setString(5, descripcion);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar comisión: "+e.toString());
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
