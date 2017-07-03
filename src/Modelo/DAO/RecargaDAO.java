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
public class RecargaDAO {
    
    private final Conexion conexion;
    
    public RecargaDAO(){
        conexion = new Conexion();
    }
    
    public void registrarRecarga(
        String numeroCelular,
        int operador,
        float importe
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO recarga"
                    + "VALUES()"
                    + "(?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, numeroCelular);
            ps.setInt(2, operador);
            ps.setFloat(3, importe);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar la recarga: "+e.toString());
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
