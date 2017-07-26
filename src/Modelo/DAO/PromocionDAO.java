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
public class PromocionDAO {
    
    private final Conexion conexion;
    
    public PromocionDAO(){
        conexion = new Conexion();
    }
    
    public void registrarPromocion(
        String nombrePromocion,
        String descripcion,
        String categoria,
        String producto,
        int unidades,
        float importe
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO promocion(nombrePromocion,descripcion,categoria,producto,unidades,importe)"
                    + "VALUES(?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombrePromocion);
            ps.setString(2, descripcion);
            ps.setString(3, categoria);
            ps.setString(4, producto);
            ps.setInt(5, unidades);
            ps.setFloat(6, importe);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar la promoción: "+e.toString());
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
