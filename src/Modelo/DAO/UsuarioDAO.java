
package Modelo.DAO;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Empleado;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {
    
    public UsuarioDAO(){
    }
    
    public int validarUsuario(String usuario, String contraseña) throws SQLException{
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        Usuario usu = new Usuario();
        
        try {
            String consulta = "SELECT * FROM usuario where usuario='"+usuario+"' && password ='"+contraseña+"'" ;
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usu.setUsuario(rs.getString(2));
                usu.setPassword(rs.getString(3));
                usu.setFechaRegistro(rs.getString(4));
                usu.setTipoUsuario(rs.getString(5));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener datos de usuario: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        System.out.println(usu.getUsuario());
        System.out.println(usu.getPassword());
        
        
       if(usu.getUsuario().equals(usuario) && usu.getPassword().equals(contraseña)){
                       
           return 1;
           //System.out.println("1");
        }else{
            return 0;
           //System.out.println("0");
        }
    }
    
    public void registrarNuevoUsuario(
        String usuario,
        String password,
        String fechaRegistro,
        String tipoUsuario
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO usuario (usuario,password,fechaRegistro,tipoUsuario)"
                    + "VALUES (?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setString(2, password);
            ps.setString(3, fechaRegistro);
            ps.setString(4, tipoUsuario );
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }

            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
    
    public Usuario obtenerDatosUsuario(int codUsuario) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        Usuario usuario = new Usuario();
        try {
            String consulta = "SELECT * FROM usuario where codUsuario='"+codUsuario+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usuario.setUsuario(rs.getString(2));
                usuario.setPassword(rs.getString(3));
                usuario.setFechaRegistro(rs.getString(4));
                usuario.setTipoUsuario(rs.getString(5));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener datos de usuario: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        System.out.println(usuario.getUsuario());
        System.out.println(usuario.getPassword());
        return usuario;
    }
    
    public void actualizarUsuario(int codUsuario,String usuario, String password, String tipoUsuario) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "UPDATE usuario SET usuario = ?, password = ?, tipoUsuario = ?"
                    + "WHERE codUsuario = ? ";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setString(2, password);
            ps.setString(3, tipoUsuario);
            ps.setInt(4, codUsuario);        
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }   
    
    public void eliminarUsuario(int codUsuario) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "UPDATE usuario SET estadoUsuario = '0'"
                    + "WHERE codUsuario = ? ";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setInt(1, codUsuario);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
    
    public int obtenerCodigo(String usuario, String contraseña) throws SQLException{
        Conexion conexion = new Conexion();
        Usuario usu = new Usuario();
        int codigo = 0;
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM usuario where usuario='"+usuario+"' && password ='"+contraseña+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                usu.setCodUsuario(rs.getInt(1));
                //operador.setNombreOperador(rs.getString(2));
             }
             codigo =usu.getCodUsuario();
             
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
    
    public String obtenerNombre(int codUsuario) throws SQLException{
        Conexion conexion = new Conexion();
        Empleado empleado = new Empleado();
        String nombre = "";
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM empleado where codUsuario ='"+codUsuario+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                empleado.setNombresApellidos(rs.getString(2));
                //operador.setNombreOperador(rs.getString(2));
             }
             nombre = empleado.getNombresApellidos();
             
             //System.out.println(nombre);
             
            
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
    
    public ArrayList<Usuario> listarUsuarios() throws SQLException{
        ArrayList<Usuario> listaUsuarios = new ArrayList();
        Usuario usuario;
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT usuario, tipoUsuario, fechaRegistro FROM usuario";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                usuario = new Usuario();
                usuario.setUsuario(rs.getString(1));
                usuario.setTipoUsuario(rs.getString(2));
                usuario.setFechaRegistro(rs.getString(3));
                listaUsuarios.add(usuario);
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
        return listaUsuarios;
    }
}
