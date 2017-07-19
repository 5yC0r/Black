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
public class OperadorDAO {
    
    private final Conexion conexion;
    
    public OperadorDAO(){
        conexion = new Conexion();
    }
    
    public void registrarOperador(
        String nombreOperador
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO operador(nombreOperador)"
                    + "VALUES(?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombreOperador);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar el operador telefónico: "+e.toString());
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
