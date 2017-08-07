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
        String direccion,
        String telefono,  //fijo
        String celular,    //Celular
        String numeroCuenta,
        String diaPedido1,
        String diaPedido2
            
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO proveedor(nombreProveedor,direccion,telefono,celular,numeroCuenta,diaPedido1,diaPedido2)"
                    + "VALUES(?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombreProveedor);
            ps.setString(2,direccion );
            ps.setString(3, telefono);
            ps.setString(4, celular);
            ps.setString(5, numeroCuenta);
            ps.setString(6,diaPedido1);
            ps.setString(7,diaPedido2);
            
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
