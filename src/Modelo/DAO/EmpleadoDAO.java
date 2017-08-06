
package Modelo.DAO;

import Modelo.Cliente;
import Modelo.Conexion;
import Modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpleadoDAO {
    
    public EmpleadoDAO(){
    }
    
    public void registrarNuevoEmpleado(
        String nombresApellidos, 
        String telefonoContacto,
        String celular,
        String telefonoReferencia,
        String direccion,
        String fechaNacimiento,
        String correo,
        String numeroCuenta,
        int fechaPago,
        String hobby,
        String sexo,
        int dni,
        float sueldo,
        int codUsuario
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "INSERT INTO empleado(nombresApellidos,telefonoContacto,celular,telefonoReferencia, direccion,fechaNacimiento,correo,numeroCuenta, fechaPago, hobby, sexo,dni,sueldo,codUsuario)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombresApellidos);
            ps.setString(2, telefonoContacto);
            ps.setString(3, celular);
            ps.setString(4, telefonoReferencia);
            ps.setString(5, direccion);
            ps.setString(6, fechaNacimiento);
            ps.setString(7, correo);
            ps.setString(8, numeroCuenta);
            ps.setInt(9, fechaPago);
            ps.setString(10, hobby);
            ps.setString(11, sexo);
            ps.setInt(12, dni);
            ps.setFloat(13, sueldo);
            ps.setFloat(14, codUsuario);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al registrar empleado: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
    
    public Empleado obtenerDatosEmpleado(int codEmpleado) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        Empleado empleado = new Empleado();
        try {
            String consulta = "SELECT * FROM empleado where codEmpleado='"+codEmpleado+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                empleado.setNombresApellidos(rs.getString(2));
                empleado.setTelefonoContacto(rs.getString(3));
                empleado.setCelular(rs.getString(4));
                empleado.setTelefonoReferencia(rs.getString(5));
                empleado.setDireccion(rs.getString(6));
                empleado.setFechaNacimiento(rs.getString(7));
                empleado.setCorreo(rs.getString(8));
                empleado.setNumeroCuenta(rs.getString(9));
                empleado.setFechaPago(rs.getInt(10));
                empleado.setHobby(rs.getString(11));
                empleado.setSexo(rs.getString(12));
                empleado.setDni(rs.getInt(13));
                empleado.setSueldo(rs.getFloat(14));
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener datos de empleado: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
        //System.out.println(empleado.getNombresApellidos());
        //System.out.println(empleado.getFechaNacimiento());
        return empleado;
    }
    
    public void actualizarEmpleado(
        int codEmpleado,
        String nombresApellidos, 
        String telefonoContacto,
        String celular,
        String telefonoReferencia,
        String direccion,
        String fechaNacimiento,
        String correo,
        String numeroCuenta,
        int fechaPago,
        String hobby,
        String sexo,

        int dni,
        float sueldo    
    ) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "UPDATE empleado SET nombresApellidos = ?, telefonoContacto = ?,celular = ? ,telefonoReferencia = ?, direccion = ?,fechaNacimiento = ?,correo = ?,numeroCuenta = ?, fechaPago = ?, hobby = ?, sexo = ?,dni = ?,sueldo = ?"
                    + "WHERE codEmpleado = ? ";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setString(1, nombresApellidos);
            ps.setString(2, telefonoContacto);
            ps.setString(3, celular);
            ps.setString(4, telefonoReferencia);
            ps.setString(5, direccion);
            ps.setString(6, fechaNacimiento);
            ps.setString(7, correo);
            ps.setString(8, numeroCuenta);
            ps.setInt(9, fechaPago);
            ps.setString(10, hobby);
            ps.setString(11, sexo);
            ps.setInt(12, dni);
            ps.setFloat(13, sueldo);
            ps.setInt(14, codEmpleado);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al actualizar empleado: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
    
    
    public void eliminarEmpleado(int codEmpleado) throws SQLException{
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "UPDATE empleado SET estadoEmpleado = '0'"
                    + "WHERE codEmpleado = ? ";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ps.setInt(1, codEmpleado);
            ps.execute();            
        } catch (SQLException e) {
            System.out.println("Error al eliminar empleado: "+e.toString());
        }finally{
            if (ps != null) {
                ps.close();
            }
            if (accesoBD != null) {
                accesoBD.close();
            }
        }
    }
    
        
    public ArrayList<Empleado> listarTrabajadores() throws SQLException{
        ArrayList<Empleado> listaTrabajadores = new ArrayList();
        Empleado empleado;
        
        Conexion conexion = new Conexion();
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT nombresApellidos,dni,fechaNacimiento,fechaPago FROM empleado";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);        
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                empleado = new Empleado();
                empleado.setNombresApellidos(rs.getString(1));
                empleado.setDni(rs.getInt(2));
                empleado.setFechaNacimiento(rs.getString(3));
                empleado.setFechaPago(rs.getInt(4));
                listaTrabajadores.add(empleado);
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
        return listaTrabajadores;
    }
    
    public int obtenerCodigo(String vendedor) throws SQLException{
        Conexion conexion = new Conexion();
        Empleado empleado = new Empleado();
        int codigo = 0;
        Connection accesoBD = null;
        PreparedStatement ps = null;
        try {
            String consulta = "SELECT * FROM empleado where nombresApellidos ='"+vendedor+"'";
            accesoBD = conexion.getConnection();
            ps = accesoBD.prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                empleado.setCodEmpleado(rs.getInt(1));
                //operador.setNombreOperador(rs.getString(2));
             }
             codigo = empleado.getCodEmpleado();
             
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
    
    /*public String obtenerNombre(int codUsuario) throws SQLException{
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
             
             System.out.println(nombre);
             
            
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
    }*/
}
