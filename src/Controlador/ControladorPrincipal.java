
package Controlador;

import Vistas.Paneles.PanelDatosEmpresa;
import Vistas.Paneles.PanelListadoClientes;
import Vistas.Paneles.PanelRegistroCliente;
import Vistas.Paneles.PanelRegistroTrabajador;
import Vistas.Paneles.PanelListadoTrabajadores;
import Vistas.Paneles.PanelUsuariosSistema;
import Vistas.Paneles.PanelRegistroVentas;
// import Vistas.Paneles.PanelRegistroVentas;
import Vistas.Principal;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal implements ActionListener{
    
    Principal principal;
    
    public void darEventoBotones(){
        principal.btnAgregarCliente.addActionListener(this);
        principal.btnVenta.addActionListener(this);
        principal.miAgregarCliente.addActionListener(this);
        principal.miRegistrarTrabajador.addActionListener(this);
        principal.miUsuariosSistema.addActionListener(this);
        principal.miVenta.addActionListener(this);
        principal.miListadoClientes.addActionListener(this);
        principal.miDatosEmpresa.addActionListener(this);
        principal.miListadoTrabajadores.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == principal.btnAgregarCliente || ae.getSource() == principal.miAgregarCliente){
            PanelRegistroCliente prc = new PanelRegistroCliente();
            prc.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
            principal.panelPrincipal.removeAll();
            principal.panelPrincipal.add(prc, BorderLayout.CENTER);
            prc.setLocation(5,5);
            principal.panelPrincipal.revalidate();
            principal.panelPrincipal.repaint();
        }else{
            if(ae.getSource() == principal.miRegistrarTrabajador){
                PanelRegistroTrabajador prt = new PanelRegistroTrabajador();
                prt.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                principal.panelPrincipal.removeAll();
                principal.panelPrincipal.add(prt, BorderLayout.CENTER);
                prt.setLocation(5,5);
                principal.panelPrincipal.revalidate();
                principal.panelPrincipal.repaint();
            }else{
                if(ae.getSource() == principal.miUsuariosSistema){
                    PanelUsuariosSistema pus = new PanelUsuariosSistema();
                    pus.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                    principal.panelPrincipal.removeAll();
                    principal.panelPrincipal.add(pus, BorderLayout.CENTER);
                    pus.setLocation(5,5);
                    principal.panelPrincipal.revalidate();
                    principal.panelPrincipal.repaint();
                }else{
                    if(ae.getSource() == principal.btnVenta || ae.getSource() == principal.miVenta){
                        PanelRegistroVentas pv = new PanelRegistroVentas();
                        pv.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                        principal.panelPrincipal.removeAll();
                        principal.panelPrincipal.add(pv, BorderLayout.CENTER);
                        pv.setLocation(5,5);
                        principal.panelPrincipal.revalidate();
                        principal.panelPrincipal.repaint();
                    }else{
                        if(ae.getSource() == principal.miListadoClientes){
                            PanelListadoClientes plc = new PanelListadoClientes();
                            plc.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                            principal.panelPrincipal.removeAll();
                            principal.panelPrincipal.add(plc, BorderLayout.CENTER);
                            plc.setLocation(5,5);
                            principal.panelPrincipal.revalidate();
                            principal.panelPrincipal.repaint();
                        }else{
                            if(ae.getSource() == principal.miDatosEmpresa){
                                PanelDatosEmpresa pde = new PanelDatosEmpresa();
                                pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pde.setLocation(5,5);
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                                    if(ae.getSource() == principal.miListadoTrabajadores){
                                    PanelListadoTrabajadores plt = new PanelListadoTrabajadores();
                                    plt.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                    principal.panelPrincipal.removeAll();
                                    principal.panelPrincipal.add(plt, BorderLayout.CENTER);
                                    plt.setLocation(5,5);
                                    principal.panelPrincipal.revalidate();
                                    principal.panelPrincipal.repaint();
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

}
