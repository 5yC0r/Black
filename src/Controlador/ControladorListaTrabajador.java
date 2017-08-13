
package Controlador;

import Modelo.DAO.EmpleadoDAO;
import Modelo.Empleado;
import java.sql.SQLException;

public class ControladorListaTrabajador {
    String numDocCliente = "";
    public void setNumDniCliente(String numDocCliente) {
        this.numDocCliente = numDocCliente;
    } 
    public Empleado retornarDatosTrabajador() throws SQLException{
        Empleado empleado;
        EmpleadoDAO empleadoDao = new EmpleadoDAO();
        empleado = empleadoDao.obtenerDatosEmpleado(numDocCliente);
        return empleado;
    }
}
