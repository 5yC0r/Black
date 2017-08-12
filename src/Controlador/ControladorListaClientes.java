
package Controlador;

import Modelo.Cliente;
import Modelo.DAO.ClienteDAO;
import Vistas.Paneles.PanelListadoClientes;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.SQLException;

public class ControladorListaClientes implements Printable, ActionListener{
    PanelListadoClientes plc; 
    String numDocCliente = "";
    
    public void darEventoBotones(){
        plc.btnImprimir.addActionListener(this);
    }
    
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

    @Override
    public int print(Graphics grphcs, PageFormat pf, int i) throws PrinterException {
        if (i>0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D) grphcs;
        g2d.translate(pf.getImageableX() + 30, pf.getImageableY() + 30);
        g2d.scale(0.5, 0.5);
        plc.panelDatosListaClientes.printAll(grphcs);
        return PAGE_EXISTS;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == plc.btnImprimir){
            System.out.println("quieres imprimir?");
            PrinterJob pj = PrinterJob.getPrinterJob();
            pj.setPrintable(this);
            boolean top = pj.printDialog();
            if (top) {
                try {
                    pj.print();
                } catch (PrinterException ex) {
                    System.out.println("Error al imprimir:"+ex.toString());
                }
            }
        }
    }
}

