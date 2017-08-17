/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Operador;
import Modelo.Recarga;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MARIANA
 */
public class RecargaDAO {
    
    
    
    public RecargaDAO(){
        
    }
    
    public void registrarRecarga(
        String numeroCelular,
        int codOperador,
        float cantidadRecargada
    ) throws SQLException{
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO recarga(numeroCelular,codOperador,cantidadRecargada)"
                    + "VALUES(?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, numeroCelular);
            ps.setInt(2, codOperador);
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
    
    public int obtenerCodigo(String nombreOperador) throws SQLException{
        Conexion conexion = new Conexion();
        Operador operador = new Operador();
        int codigo = 0;
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM operador where nombreOperador ='"+nombreOperador+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                operador.setCodOperador(rs.getInt(1));
                operador.setNombreOperador(rs.getString(2));
             }
             codigo = operador.getCodOperador();
             
            // System.out.println(codigo);
            
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
       return codigo;
    }
    
    public ArrayList<Recarga> listarRecargas() throws SQLException{
        ArrayList<Recarga> listaRecargas = new ArrayList();
        Recarga recarga;
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT numeroCelular,cantidadRecargada,codOperador FROM recarga";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                recarga = new Recarga();
                recarga.setNumeroCelular(rs.getString(1));
                recarga.setCantidadRecargada(rs.getFloat(2));
                recarga.setCodOperador(rs.getInt(3));
                listaRecargas.add(recarga);
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
        return listaRecargas;
    }
    
    
    
}