
package Controlador;

import Modelo.DAO.UsuarioDAO;
import Vistas.Paneles.*;
import Vistas.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

public class ControladorPrincipal implements ActionListener{
    
    Principal principal;
    int banderaGuardar = 0;
    JInternalFrame internalFrameActual;
    
    public void darEventoBotones(){
        principal.btnAgregarCliente.addActionListener(this);
        principal.btnRegistroProducto.addActionListener(this);
        principal.btnVenta.addActionListener(this);
        principal.btnReporte.addActionListener(this);
        principal.btnMiCompra.addActionListener(this);
        principal.btnCumpleaños.addActionListener(this);//falta usarla
        principal.btnNuevaRecarga.addActionListener(this);
        principal.btnGuardar.addActionListener(this);
        
        principal.miAgregarCliente.addActionListener(this);
        principal.miRegistrarTrabajador.addActionListener(this);
        principal.miUsuariosSistema.addActionListener(this);
        principal.miVenta.addActionListener(this);
        principal.miListadoClientes.addActionListener(this);
        principal.miDatosEmpresa.addActionListener(this);
        principal.miListadoTrabajadores.addActionListener(this);
        principal.miListadoVentas.addActionListener(this);
        principal.miBonosyComisiones.addActionListener(this);
        principal.miNuevaRecarga.addActionListener(this);
        principal.miOperadorTel.addActionListener(this);
        principal.misPromociones.addActionListener(this);
        principal.miRegistroProducto.addActionListener(this);
        principal.miListadoProducto.addActionListener(this);
        principal.miNuevaCategoria.addActionListener(this);
        principal.miModificarCategoria.addActionListener(this);
        principal.miRegistroProveedor.addActionListener(this);
        principal.miListadoProveedores.addActionListener(this);
        principal.miReporteVentas.addActionListener(this);
        principal.miReporteCompras.addActionListener(this);
        principal.miNuevaCompra.addActionListener(this);
        principal.miListadoCompras.addActionListener(this);
        principal.miEmisionComprobante.addActionListener(this);                                     
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(JInternalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        
        if(ae.getSource() == principal.btnAgregarCliente || ae.getSource() == principal.miAgregarCliente){
            PanelRegistroCliente prc = new PanelRegistroCliente();
            //prc.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
            principal.panelPrincipal.removeAll();
            //principal.panelPrincipal.add(prc, BorderLayout.CENTER);
            this.principal.panelPrincipal.add(prc);
            prc.show();
            prc.setLocation(5,5);
            principal.panelPrincipal.revalidate();
            principal.panelPrincipal.repaint();
        }else{
            if(ae.getSource() == principal.miRegistrarTrabajador){
                PanelRegistroTrabajador prt = new PanelRegistroTrabajador();
                banderaGuardar = 1;
                setPanelActual(prt);
                //prt.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                principal.panelPrincipal.removeAll();
                //principal.panelPrincipal.add(prt, BorderLayout.CENTER);
                this.principal.panelPrincipal.add(prt);
                prt.show();
                prt.setLocation(5,5);
                principal.panelPrincipal.revalidate();
                principal.panelPrincipal.repaint();
            }else{
                if(ae.getSource() == principal.miUsuariosSistema){
                    PanelUsuariosSistema pus = new PanelUsuariosSistema();
                    //pus.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                    principal.panelPrincipal.removeAll();
                    //principal.panelPrincipal.add(pus, BorderLayout.CENTER);
                    this.principal.panelPrincipal.add(pus);
            pus.show();
                    pus.setLocation(5,5);
                    principal.panelPrincipal.revalidate();
                    principal.panelPrincipal.repaint();
                }else{
                    if(ae.getSource() == principal.btnVenta || ae.getSource() == principal.miVenta){
                        PanelRegistroVentas pv = new PanelRegistroVentas();
                        //pv.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                        principal.panelPrincipal.removeAll();
                        //principal.panelPrincipal.add(pv, BorderLayout.CENTER);
                        this.principal.panelPrincipal.add(pv);
                        pv.show();
                        pv.setLocation(5,5);
                        principal.panelPrincipal.revalidate();
                        principal.panelPrincipal.repaint();
                        }else{
                        if(ae.getSource() == principal.miListadoClientes){
                            PanelListadoClientes plc = new PanelListadoClientes();
                            //plc.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                            principal.panelPrincipal.removeAll();
                            //principal.panelPrincipal.add(plc, BorderLayout.CENTER);
                            this.principal.panelPrincipal.add(plc);
                             plc.show();
                            plc.setLocation(5,5);
                            principal.panelPrincipal.revalidate();
                            principal.panelPrincipal.repaint();
                        }else{
                            if(ae.getSource() == principal.miDatosEmpresa){
                                PanelDatosEmpresa pde = new PanelDatosEmpresa();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pde.setLocation(5,5);
                                this.principal.panelPrincipal.add(pde);
                                 pde.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                            }else{
                                if(ae.getSource() == principal.miListadoTrabajadores){
                                PanelListadoTrabajadores plt = new PanelListadoTrabajadores();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                plt.setLocation(5,5);
                                this.principal.panelPrincipal.add(plt);
                                 plt.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miListadoVentas){
                                PanelListadoVentas plv = new PanelListadoVentas();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                plv.setLocation(5,5);
                                this.principal.panelPrincipal.add(plv);
                                 plv.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                            }else{
                            if(ae.getSource() == principal.miBonosyComisiones){
                                PanelBonosyComisiones pbc = new PanelBonosyComisiones();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                //principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pbc.setLocation(5,5);
                                this.principal.panelPrincipal.add(pbc);
                                 pbc.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                            }else{
                            if(ae.getSource() == principal.miNuevaRecarga || ae.getSource() == principal.btnNuevaRecarga){
                                PanelRecarga pnr = new PanelRecarga();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pnr.setLocation(5,5);
                                this.principal.panelPrincipal.add(pnr);
                                 pnr.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                            }else{
                            if(ae.getSource() == principal.miOperadorTel){
                                AgregarOperador pao = new AgregarOperador();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pao.setLocation(5,5);
                                this.principal.panelPrincipal.add(pao);
                                 pao.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                            }else{
                            if(ae.getSource() == principal.misPromociones){
                                PanelPromociones pp = new PanelPromociones();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pp.setLocation(5,5);
                                this.principal.panelPrincipal.add(pp);
                                 pp.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miRegistroProducto || ae.getSource() == principal.btnRegistroProducto ){
                                PanelRegistroProducto prp = new PanelRegistroProducto();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                prp.setLocation(5,5);
                                this.principal.panelPrincipal.add(prp);
                                prp.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miListadoProducto){
                                PanelMantenimientoAlmacen pma = new PanelMantenimientoAlmacen();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pma.setLocation(5,5);
                                this.principal.panelPrincipal.add(pma);
                                pma.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miNuevaCategoria){
                                PanelNuevaCategoria pnc = new PanelNuevaCategoria();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pnc.setLocation(5,5);
                                this.principal.panelPrincipal.add(pnc);
                                pnc.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miModificarCategoria){
                                PanelModificarCategoria pmc = new PanelModificarCategoria();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pmc.setLocation(5,5);
                                this.principal.panelPrincipal.add(pmc);
                                pmc.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miRegistroProveedor){
                                PanelRegistroProveedor prp = new PanelRegistroProveedor();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                prp.setLocation(5,5);
                                this.principal.panelPrincipal.add(prp);
                                prp.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miListadoProveedores){
                                PanelListadoProveedores plp = new PanelListadoProveedores();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                plp.setLocation(5,5);
                                this.principal.panelPrincipal.add(plp);
                                plp.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miReporteVentas || ae.getSource() == principal.btnReporte){
                                PanelReporteVentas prv = new PanelReporteVentas();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                prv.setLocation(5,5);
                                this.principal.panelPrincipal.add(prv);
                                prv.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miReporteCompras){
                                PanelReporteCompras prc = new PanelReporteCompras();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                prc.setLocation(5,5);
                                this.principal.panelPrincipal.add(prc);
                                prc.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miNuevaCompra || ae.getSource() == principal.btnMiCompra){
                                PanelNuevaCompra pnc = new PanelNuevaCompra();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pnc.setLocation(5,5);
                                this.principal.panelPrincipal.add(pnc);
                                pnc.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miListadoCompras){
                                PanelListadoCompras plc = new PanelListadoCompras();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                plc.setLocation(5,5);
                                this.principal.panelPrincipal.add(plc);
                                plc.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miEmisionComprobante){
                                PanelEmisionComprobante pec = new PanelEmisionComprobante();
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pec.setLocation(5,5);
                                this.principal.panelPrincipal.add(pec);
                                pec.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }
                            else{
                                if(ae.getSource() == principal.btnGuardar){
                                    if(banderaGuardar == 1){
                                        PanelRegistroTrabajador prt = (PanelRegistroTrabajador) internalFrameActual;
                                        String usuario = prt.jtfUsuario.getText();
                                        String clave = prt.jtfClaveUsuario.getText();

                                        UsuarioDAO usuarioDao = new UsuarioDAO();
                                        try {
                                            usuarioDao.registrarNuevoUsuario(usuario, clave);
                                        } catch (SQLException ex) {
                                            Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                            }
                        }
                    }
                }
            }
        }
    }

    public Principal getPrincipal() {
        return principal;
    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }
    
    public void setPanelActual (JInternalFrame jif){
        this.internalFrameActual = jif;
    }
}
