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
public class ProveedorDAO {
    
    Conexion conexion;
    
    public ProveedorDAO(){
        conexion = new Conexion();
    }
    
    public void registrarProveedor(
        String nombreProveedor,
        String direccionProveedor,
        String numTelfProveedor,  //fijo
        String numCelfProveedor,    //Celular
        String numCuentaProveedor
            
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO proveedor"
                    + "VALUES"
                    + "(?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombreProveedor);
            ps.setString(2,direccionProveedor );
            ps.setString(3, numTelfProveedor);
            ps.setString(4, numCelfProveedor);
            ps.setString(5, numCuentaProveedor);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar los datos del proveedor: "+e.toString());
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
