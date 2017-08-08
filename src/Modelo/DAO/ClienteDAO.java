
package Modelo.DAO;

import Modelo.Cliente;
import Modelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    
    public ClienteDAO(){
        
    }
    
    public void registrarNuevoCliente(
        String tipoCliente,
        String tipoDoc,
        String numDoc,
        String razonSocial,
        String nombresApellidos,
        String fechaNacimiento,
        String sexoCliente,
        String telefonoCliente,
        String celularCliente,
        String correoCliente,
        String direccion,

        int codEmpleado,
        String fechaRegistroCliente
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO cliente(tipoCliente,tipoDoc,numDoc,razonSocial,nombresApellidos,fechaNacimiento,sexoCliente,telefonoCliente,celularCliente,correoCliente,direccion,codEmpleado,fechaRegistroCliente)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, tipoCliente);
            ps.setString(2, tipoDoc);
            ps.setString(3, numDoc);
            ps.setString(4, razonSocial);
            ps.setString(5, nombresApellidos);
            ps.setString(6, fechaNacimiento);
            ps.setString(7, sexoCliente);
            ps.setString(8, telefonoCliente);
            ps.setString(9, celularCliente);
            ps.setString(10, correoCliente);
            ps.setString(11, direccion);
            
            ps.setInt(12, codEmpleado);
            ps.setString(13, fechaRegistroCliente);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar cliente: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }

            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
    
    public Cliente obtenerCliente(String numDocCliente) throws SQLException{
        Conexion conexion = new Conexion();
        Cliente cliente = new Cliente();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM cliente where numDoc='"+numDocCliente+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cliente.setTipoCliente(rs.getString(2));
                cliente.setTipoDoc(rs.getString(3));
                cliente.setNumDoc(rs.getString(4));
                cliente.setRazonSocial(rs.getString(5));
                cliente.setNombresApellidos(rs.getString(6));
                cliente.setFechaNacimiento(rs.getString(7));
                cliente.setSexoCliente(rs.getString(8));
                cliente.setTelefonoCliente(rs.getString(9));
                cliente.setCelularCliente(rs.getString(10));
                cliente.setCorreoCliente(rs.getString(11));
                cliente.setDireccion(rs.getString(12));
                cliente.setCodEmpleado(rs.getInt(13));
                cliente.setFechaRegistroCliente(rs.getString(14));
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
        System.out.println(cliente.getNombresApellidos());
        System.out.println(cliente.getFechaRegistroCliente());
        return cliente;
    }
    
    public void actualizarCliente(
        //int codCliente,
        String tipoCliente,
        String tipoDoc,
        String numDoc,
        String razonSocial,
        String nombresApellidos,
        String fechaNacimiento,
        String sexoCliente,
        String telefonoCliente,
        String celularCliente,
        String correoCliente,
        String direccion,

        int codEmpleado,
        String fechaRegistroCliente,
        String numDocAntiguo
    ) throws SQLException{

        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "UPDATE cliente SET tipoCliente = ?, tipoDoc = ?, numDoc = ? ,razonSocial = ?,nombresApellidos = ?,fechaNacimiento = ?,sexoCliente = ?,telefonoCliente = ?,celularCliente = ?,correoCliente = ?,direccion = ?,codEmpleado = ?,fechaRegistroCliente = ?"
                    + "WHERE numDoc = ? ";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, tipoCliente);
            ps.setString(2, tipoDoc);
            ps.setString(3, numDoc);
            ps.setString(4, razonSocial);
            ps.setString(5, nombresApellidos);
            ps.setString(6, fechaNacimiento);
            ps.setString(7, sexoCliente);
            ps.setString(8, telefonoCliente);
            ps.setString(9, celularCliente);
            ps.setString(10, correoCliente);
            ps.setString(11, direccion);
            
            ps.setInt(12, codEmpleado);
            ps.setString(13, fechaRegistroCliente);
            ps.setString(14, numDocAntiguo);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al actualizar cliente: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }

            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
    
    public void eliminarCliente(int codCliente) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "UPDATE cliente SET estadoCliente = '0'"
                    + "WHERE codCliente = ? ";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setInt(1, codCliente);
            ps.execute();            
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
    }
    
    public ArrayList<Cliente> listarClientes() throws SQLException{
        ArrayList<Cliente> listaClientes = new ArrayList();
        Cliente cliente;
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT tipoDoc, numDoc, nombresApellidos, fechaRegistroCliente FROM cliente";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cliente = new Cliente();
                cliente.setTipoDoc(rs.getString(1));
                cliente.setNumDoc(rs.getString(2));
                cliente.setNombresApellidos(rs.getString(3));
                cliente.setFechaRegistroCliente(rs.getString(4));
                listaClientes.add(cliente);
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
        return listaClientes;
    }
}

