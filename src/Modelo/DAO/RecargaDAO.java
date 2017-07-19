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
        String nombreOperador,
        float cantidadRecargada
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO recarga(numeroCelular,nombreOperador,cantidadRecargada)"
                    + "VALUES(?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, numeroCelular);
            ps.setString(2, nombreOperador);
            ps.setFloat(3, cantidadRecargada);
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
