/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Operador;
import Modelo.Recarga;
import com.mysql.jdbc.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MARIANA
 */
public class OperadorDAO {
    
   
    
    public OperadorDAO(){
        
    }
    
    public void registrarOperador(
        String nombreOperador
    ) throws SQLException{
        Conexion conexion = new Conexion();
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
    
    public String obtenerNombre(int codOperador) throws SQLException{
        Conexion conexion = new Conexion();
        Operador operador = new Operador();
        String nombre = "";
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM operador where codOperador = '"+codOperador+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            java.sql.ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                operador.setNombreOperador(rs.getString(2));
             }
             nombre = operador.getNombreOperador();
             
            System.out.println(nombre);
             
            
        } catch (SQLException e) {
            System.out.println("Error al obtener el codigo del operador: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        //System.out.println(operador.getCodigoOperador());
        //System.out.println(cliente.getFechaRegistroCliente());
       return nombre;
    }
    
    public ArrayList<Operador> listarOperadores() throws SQLException{
        ArrayList<Operador> listaOperadores = new ArrayList();
        Operador operador;
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT codOperador,nombreOperador FROM operador";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            java.sql.ResultSet rs = ps.executeQuery();
            while(rs.next()){
                operador = new Operador();
                operador.setCodOperador(rs.getInt(1));
                operador.setNombreOperador(rs.getString(2));
                listaOperadores.add(operador);
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
        return listaOperadores;
    }
}
