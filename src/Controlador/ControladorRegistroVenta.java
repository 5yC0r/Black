
package Controlador;

import Modelo.Cliente;
import Modelo.DAO.ClienteDAO;
import Vistas.Paneles.PanelRegistroVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorRegistroVenta  implements ActionListener{
    
    PanelRegistroVentas prv;
    String numDocCliente = "";

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == prv.btnBuscarCliente){
            setNumDocCliente(prv.jtfCodigoCliente.getText());
            Cliente cliente = null; 
            try {
                 cliente = retornarDatosCliente();
            } catch (SQLException ex) {
                Logger.getLogger(ControladorRegistroVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            prv.jtfNombreCliente.setText(cliente.getNombresApellidos());
        }
    }
    public Cliente retornarDatosCliente() throws SQLException{
        Cliente cliente;
        ClienteDAO clienteDao = new ClienteDAO();
        cliente = clienteDao.obtenerCliente(numDocCliente);
        return cliente;
    }

    public void setNumDocCliente(String numDocCliente) {
        this.numDocCliente = numDocCliente;
    }

    public void darEventoBoton(){
        prv.btnBuscarCliente.addActionListener(this);
    }
    public void setPrv(PanelRegistroVentas prv) {
        this.prv = prv;
    }
}
