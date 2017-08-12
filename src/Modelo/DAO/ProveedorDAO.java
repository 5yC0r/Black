/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.Categoria;
import Modelo.Conexion;
import Modelo.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MARIANA
 */
public class ProveedorDAO {
    
   
    
    public ProveedorDAO(){
        
    }
    
    public void registrarProveedor(
        String nombreProveedor,
        String direccion,
        String telefono,  //fijo
        String celular,    //Celular
        String numeroCuenta,
        String diaPedido1,
        String diaPedido2
            
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO proveedor(nombreProveedor,direccion,telefono,celular,numeroCuenta,diaPedido1,diaPedido2)"
                    + "VALUES(?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombreProveedor);
            ps.setString(2,direccion );
            ps.setString(3, telefono);
            ps.setString(4, celular);
            ps.setString(5, numeroCuenta);
            ps.setString(6,diaPedido1);
            ps.setString(7,diaPedido2);
            
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar los datos del proveedor: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }

            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
    public int obtenerCodigo(String nomProveedor) throws SQLException{
        Conexion conexion = new Conexion();
        Proveedor proveedor = new Proveedor();
        int codigo = 0;
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM proveedor where nombreProveedor ='"+nomProveedor+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                proveedor.setCodProveedor(rs.getInt(1));
                //operador.setNombreOperador(rs.getString(2));
             }
             codigo = proveedor.getCodProveedor();
             
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
}
