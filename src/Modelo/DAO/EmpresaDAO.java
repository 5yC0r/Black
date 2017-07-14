/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.FileInputStream;

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
        String celular,
        String correoElectronico,
        String paginaWeb,     //Direccion url de pagina web
        //String imagenLogo,    //Ruta del archivo de foto 
        FileInputStream foto,
       int longFoto,
        String descripcion
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO empresa(nombre,razonSocial,representanteLegal,ruc,direccion,telefono,celular,correoElectronico,paginaWeb,foto,descripcion)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setString(2, razonSocial);
            ps.setString(3, representanteLegal);
            ps.setString(4, ruc);
            ps.setString(5, direccion);
            ps.setString(6, telefono);
            ps.setString(7, celular);
            ps.setString(8, correoElectronico);
            ps.setString(9, paginaWeb);
            ps.setBlob(10, foto, longFoto);
            ps.setString(11, descripcion);
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
