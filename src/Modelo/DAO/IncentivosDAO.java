/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Incentivos;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MARIANA
 */
public class IncentivosDAO {
    
    public IncentivosDAO(){
    }
    
    public void registrarIncentivo(
        String tipoIncentivo,
        String nombreIncentivo,
        String cantidadIncentivo,
        String sueldoVenta,
        String estadoIncentivo,

        String descripcionIncentivo
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO incentivo(tipoIncentivo,nombreIncentivo,cantidadIncentivo,sueldoVenta,estadoIncentivo,descripcionIncentivo)"
                    + "VALUES(?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, tipoIncentivo);
            ps.setString(2, nombreIncentivo);
            ps.setString(3, cantidadIncentivo);
            ps.setString(4, sueldoVenta);
            ps.setString(5, estadoIncentivo);
            ps.setString(6, descripcionIncentivo);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar datos del incentivo: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }

            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
    
    public ArrayList<Incentivos> listarIncentivos() throws SQLException{
        ArrayList<Incentivos> listaIncentivos = new ArrayList();
        Incentivos incentivo;
         
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM incentivo";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                incentivo = new Incentivos();
                incentivo.setTipoIncentivo(rs.getString(2));
                incentivo.setNombreIncentivo(rs.getString(3));
                incentivo.setCantidadIncentivo(rs.getString(4));
                incentivo.setEstadoIncentivo(rs.getString(6));
                listaIncentivos.add(incentivo);
            }     
        } catch (SQLException e) {
            System.out.println("Error al listar producto: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        return listaIncentivos;
    }
}
