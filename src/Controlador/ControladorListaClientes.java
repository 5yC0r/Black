
package Controlador;

import Modelo.Cliente;
import Modelo.DAO.ClienteDAO;
import Vistas.Paneles.PanelListadoClientes;
import java.sql.SQLException;

public class ControladorListaClientes {
    PanelListadoClientes plc; 
    String numDocCliente = "";
    
    public Cliente retornarDatosCliente() throws SQLException{
        Cliente cliente;
        ClienteDAO clienteDao = new ClienteDAO();
        cliente = clienteDao.obtenerCliente(numDocCliente);
        return cliente;
    }
    
    public void setPlc(PanelListadoClientes plc) {
        this.plc = plc;
    }

    public void setNumDniCliente(String numDocCliente) {
        this.numDocCliente = numDocCliente;
    }
}

