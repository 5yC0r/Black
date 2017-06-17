
package Modelo.DAO;

import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    Conexion conexion;
    
    public UsuarioDAO(){
        conexion = new Conexion();
    }
    
    public void registrarNuevoUsuario(
        String usuario,
        String password
    ) throws SQLException{
        
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO usuario"
                    + "VALUES()"
                    + "(?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setString(2, password);
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
}
