
package Modelo.DAO;

import Modelo.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
    public UsuarioDAO(){
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
}
