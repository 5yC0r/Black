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
public class CategoriaDAO {
    
    public CategoriaDAO(){
    }


public void registrarCategoria(
        String nombreNuevaCategoria,
        String nombrePrecio1,
        String nombrePrecio2,
        String nombrePrecio3,
        String nombrePrecio4
        
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO categoria(nombreNuevaCategoria,nombrePrecio1,nombrePrecio2,nombrePrecio3,nombrePrecio4)"
                    + "VALUES(?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombreNuevaCategoria);
            ps.setString(2, nombrePrecio1);
            ps.setString(3, nombrePrecio2);
            ps.setString(4, nombrePrecio3);
            ps.setString(5, nombrePrecio4);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar los datos de Categoría: "+e.toString());
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