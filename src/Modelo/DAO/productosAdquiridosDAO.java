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
public class productosAdquiridosDAO {
    
    public productosAdquiridosDAO(){
        
    }
    
    public void registrarProductosAdquiridos(
        String codigo,    
        String nombre,
        int cantidad,
        float importe,
        int codCompra
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO productosadquiridos(codigo,nombre,cantidad,importe,codCompra)"
                    + "VALUES(?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, codigo);
            ps.setString(2,nombre );
            ps.setInt(3,cantidad);
            ps.setFloat(4, importe);    
            ps.setInt(5, codCompra);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar los precios de los productos: "+e.toString());
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
