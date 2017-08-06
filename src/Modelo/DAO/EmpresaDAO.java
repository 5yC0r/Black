/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Empresa;
import Vistas.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author MARIANA
 */
public class EmpresaDAO {
    
    
    Login login = new Login();
    
    public EmpresaDAO(){
        
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
        String foto,    //Ruta del archivo de foto 
        String descripcion
    ) throws SQLException{
        Conexion conexion = new Conexion();
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
            ps.setString(10, foto);
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
    
    public void obtenerDatos() throws SQLException{
        Conexion conexion = new Conexion();
        Empresa empresa = new Empresa();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM empresa where codEmpresa='1'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                empresa.setRazonSocial(rs.getString(3));
                empresa.setLocalidad(rs.getString(7));
            }
            
            login.NombreEmpresa.setText(empresa.getRazonSocial());
            login.LocalidadEmpresa.setText(empresa.getLocalidad());
            
        } catch (SQLException e) {
            System.out.println("Error al obtener datos de cliente: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        
       
        System.out.println(empresa.getRazonSocial());
        System.out.println(empresa.getLocalidad());
        
     }
}