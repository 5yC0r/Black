/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Empresa;
import Vistas.Login;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        int ruc,
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
            ps.setInt(4, ruc);
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
    
    public void obtenerDatos(Login login) throws SQLException{
        Conexion conexion = new Conexion();
        Empresa empresa = new Empresa();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        String ip = "";
        
        InetAddress direccion;
        try {
            direccion = InetAddress.getLocalHost();
            ip = direccion.getHostName();
            System.out.println("HostName: "+ direccion.getHostName());
        } catch (UnknownHostException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
                
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
            login.NombreEquipo.setText(ip);
            
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
    
    public Empresa obtenerDatosBB(int cod) throws SQLException{
        Conexion conexion = new Conexion();
        Empresa empresa = new Empresa();
        Connection accesoBD = null;
        PreparedStatement ps = null;
                
        try {
            String consulta = "SELECT * FROM empresa where codEmpresa='"+cod+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                empresa.setNombre(rs.getString(2));
                empresa.setRazonSocial(rs.getString(3));
                empresa.setRepresentanteLegal(rs.getString(4));
                empresa.setRuc(rs.getInt(5));
                empresa.setDireccion(rs.getString(6));
                empresa.setLocalidad(rs.getString(7));
                empresa.setTelefono(rs.getString(8));
                empresa.setCelular(rs.getString(9));
                empresa.setCorreoElectronico(rs.getString(10));
                empresa.setPaginaWeb(rs.getString(11));
                empresa.setFoto(rs.getString(12));
                empresa.setDescripcion(rs.getString(13));
            }
                        
            
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
        return empresa;
     }
    
    public void actualizarEmpresa(
        //int codCliente,
        String nombre,
        String razonSocial,
        String representanteLegal,
        int ruc,
        String direccion,
        String telefono,
        String celular,
        String correoElectronico,
        String paginaWeb,     //Direccion url de pagina web
        //String foto,    //Ruta del archivo de foto 
        String descripcion,
        int codigoBB
    ) throws SQLException{

        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "UPDATE empresa SET nombre = ?, razonSocial = ?, representanteLegal = ? ,ruc = ?,direccion = ?,telefono = ?,celular = ?,correoElectronico = ?,paginaWeb = ?,descripcion = ?"
                    + "WHERE codEmpresa = ? ";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombre);
            ps.setString(2, razonSocial);
            ps.setString(3, representanteLegal);
            ps.setInt(4, ruc);
            ps.setString(5, direccion);
            ps.setString(6, telefono);
            ps.setString(7, celular);
            ps.setString(8, correoElectronico);
            ps.setString(9, paginaWeb);
            ps.setString(10, descripcion);
            ps.setInt(11, codigoBB);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al actualizar empresa: "+e.toString());
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