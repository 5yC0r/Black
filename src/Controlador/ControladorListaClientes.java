
package Controlador;

import Vistas.Paneles.PanelListadoClientes;

public class ControladorListaClientes {
    PanelListadoClientes plc; 
    
    public void mostrarFilaSeleccionada(){
        System.out.println(plc.tableClientes.getSelectedRow());
    }
    
    public void setPlc(PanelListadoClientes plc) {
        this.plc = plc;
    }
}

