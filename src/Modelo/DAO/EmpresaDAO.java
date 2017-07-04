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
public class EmpresaDAO {
    
    Conexion conexion;
    
    public EmpresaDAO(){
        conexion = new Conexion();
    }
    
    public void registrarDatosEmpresa(
        String nombre,
        String razonSocial,
        String representanteLegal,
        String ruc,
        String direccion,
        String telefono,
        String email,   //Correo electronico
        String web,     //Direccion url de pagina web

        String logo,    //Ruta del archivo de foto 

        String descripcion
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO empresa"
                    + "VALUES"
                    + "(?,?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setString(2, razonSocial);
            ps.setString(3, representanteLegal);
            ps.setString(4, ruc);
            ps.setString(5, direccion);
            ps.setString(6, telefono);
            ps.setString(7, email);
            ps.setString(8, web);
            ps.setString(9, logo);
            ps.setString(10, descripcion);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar datos de la empresa: "+e.toString());
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
