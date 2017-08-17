/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Promocion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MARIANA
 */
public class PromocionDAO {
    

    
    public PromocionDAO(){
        
    }
    
    public void registrarPromocion(
        String nombrePromocion,
        String descripcion,
//        String categoria,
        int codProducto,
        int unidades,
        float importe
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO promocion(nombrePromocion,descripcion,codProducto,unidades,importe)"
                    + "VALUES(?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombrePromocion);
            ps.setString(2, descripcion);
//            ps.setString(3, categoria);
            ps.setInt(3, codProducto);
            ps.setInt(4, unidades);
            ps.setFloat(5, importe);
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
    
    public ArrayList<Promocion> listarPromociones() throws SQLException{
        ArrayList<Promocion> listaPromociones = new ArrayList();
        Promocion promocion;
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT nombrePromocion,codProducto,unidades,importe FROM promocion";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                promocion = new Promocion();
                promocion.setNombrePromocion(rs.getString(1));
                promocion.setCodProducto(rs.getInt(2));
                promocion.setUnidades(rs.getInt(3));
                promocion.setImporte(rs.getFloat(4));
                listaPromociones.add(promocion);
            }     
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        return listaPromociones;
    }
}
