/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Categoria;
import Modelo.Conexion;
import Modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MARIANA
 */
public class CategoriaDAO {
    
    public CategoriaDAO(){
    }


public void registrarCategoria(
        String nombreNuevaCategoria
        
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO categoria(nombreNuevaCategoria)"
                    + "VALUES(?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombreNuevaCategoria);
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

public int obtenerCodigo(String categoria) throws SQLException{
        Conexion conexion = new Conexion();
        Categoria cat = new Categoria();
        int codigo = 0;
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM categoria where nombreNuevaCategoria ='"+categoria+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                cat.setCodCategoria(rs.getInt(1));
                //operador.setNombreOperador(rs.getString(2));
             }
             codigo = cat.getCodCategoria();
             
             System.out.println(codigo);
             
            
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

    public ArrayList<Categoria> listarCategorias() throws SQLException{
        ArrayList<Categoria> listaCategorias = new ArrayList();
        Categoria categoria;
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT codCategoria, nombreNuevaCategoria FROM categoria";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                categoria = new Categoria();
                categoria.setCodCategoria(rs.getInt(1));
                categoria.setNombreNuevaCategoria(rs.getString(2));
                listaCategorias.add(categoria);
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
        return listaCategorias;
    }

}