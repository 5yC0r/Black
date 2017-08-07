
package Controlador;

import Modelo.DAO.*;
import Vistas.Paneles.*;
import Vistas.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorPrincipal implements ActionListener{
    
    Principal principal;
    int banderaGuardar = 0;
    int v = 0;// las ventanas tienen un numero cada una
    int msj;
    JInternalFrame internalFrameActual;
    
    ControladorEmpresa ce;
    
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
            banderaGuardar = 1;
            v=1;
            setPanelActual(prc);
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
                v=2;
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
                    /*UsuarioDAO usuarioDao = new UsuarioDAO();
                            DefaultTableModel modeloTabla = new DefaultTableModel();
                            modeloTabla.addColumn("Usuario");
                            modeloTabla.addColumn("Tipo de Usuario");
                            modeloTabla.addColumn("Fecha de Registro");
                            pus.tableUsuarios.setModel(modeloTabla);
                            Object [] columna = new Object[3];
                            
                            int numRegistros = 0;
                            try {
                                numRegistros = usuarioDao.listarUsuarios().size();
                            } catch (SQLException ex) {
                                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            for (int i = 0; i < numRegistros; i++) {
                                try {
                                    columna[0] = usuarioDao.listarUsuarios().get(i).getUsuario();
                                    columna[1] = usuarioDao.listarUsuarios().get(i).getTipoUsuario();
                                    columna[2] = usuarioDao.listarUsuarios().get(i).getFechaRegistro();
                                    
                                    modeloTabla.addRow(columna);
                                } catch (SQLException ex) {
                                    Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }*/
                    pus.show();
                    pus.setLocation(5,5);
                    principal.panelPrincipal.revalidate();
                    principal.panelPrincipal.repaint();
                }else{
                    if(ae.getSource() == principal.btnVenta || ae.getSource() == principal.miVenta){
                        PanelRegistroVentas prv = new PanelRegistroVentas();
                        banderaGuardar = 1;
                        v = 12;
                        setPanelActual(prv);
                        //pv.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                        principal.panelPrincipal.removeAll();
                        //principal.panelPrincipal.add(pv, BorderLayout.CENTER);
                        this.principal.panelPrincipal.add(prv);
                        prv.show();
                        prv.setLocation(5,5);
                        principal.panelPrincipal.revalidate();
                        principal.panelPrincipal.repaint();
                        }else{
                        if(ae.getSource() == principal.miListadoClientes){
                            PanelListadoClientes plc = new PanelListadoClientes();
                            //plc.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                            principal.panelPrincipal.removeAll();
                            //principal.panelPrincipal.add(plc, BorderLayout.CENTER);
                            this.principal.panelPrincipal.add(plc);
                            ClienteDAO clienteDao = new ClienteDAO();
                            DefaultTableModel modeloTabla = new DefaultTableModel();
                            modeloTabla.addColumn("Tipo de documento");
                            modeloTabla.addColumn("Número de documento");
                            modeloTabla.addColumn("Nombres y apellidos");
                            modeloTabla.addColumn("Fecha registro cliente");
                            plc.tableClientes.setModel(modeloTabla);
                            Object [] columna = new Object[4];
                            
                            int numRegistros = 0;
                            try {
                                numRegistros = clienteDao.listarClientes().size();
                            } catch (SQLException ex) {
                                Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            for (int i = 0; i < numRegistros; i++) {
                                try {
                                    columna[0] = clienteDao.listarClientes().get(i).getTipoDoc();
                                    columna[1] = clienteDao.listarClientes().get(i).getNumDoc();
                                    columna[2] = clienteDao.listarClientes().get(i).getNombresApellidos();
                                    columna[3] = clienteDao.listarClientes().get(i).getFechaRegistroCliente();
                                    
                                    modeloTabla.addRow(columna);
                                } catch (SQLException ex) {
                                    Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            
                            plc.show();
                            plc.setLocation(5,5);
                            principal.panelPrincipal.revalidate();
                            principal.panelPrincipal.repaint();
                        }else{
                            if(ae.getSource() == principal.miDatosEmpresa){
                                PanelDatosEmpresa pde = new PanelDatosEmpresa();
                                ce = new ControladorEmpresa();
                                ce.setPanelDatosEmpresa(pde);
                                ce.darEventoABotones();
                                banderaGuardar = 1;
                                v=4;
                                setPanelActual(pde);
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
                                EmpleadoDAO empleadoDao = new EmpleadoDAO();
                                DefaultTableModel modeloTabla = new DefaultTableModel();
                                modeloTabla.addColumn("Nombres y Apellidos");
                                modeloTabla.addColumn("DNI");
                                modeloTabla.addColumn("Fecha de Nacimiento");
                                modeloTabla.addColumn("Día de Pago");
                                plt.tableTrabajadores.setModel(modeloTabla);
                                Object [] columna = new Object[4];
                            
                                int numRegistros = 0;
                                try {
                                    numRegistros = empleadoDao.listarTrabajadores().size();
                                } catch (SQLException ex) {
                                    Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                for (int i = 0; i < numRegistros; i++) {
                                    try {
                                        columna[0] = empleadoDao.listarTrabajadores().get(i).getNombresApellidos();
                                        columna[1] = empleadoDao.listarTrabajadores().get(i).getDni();
                                        columna[2] = empleadoDao.listarTrabajadores().get(i).getFechaNacimiento();
                                        columna[3] = empleadoDao.listarTrabajadores().get(i).getFechaPago();

                                        modeloTabla.addRow(columna);
                                    } catch (SQLException ex) {
                                        Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
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
                                VentaDAO ventaDao = new VentaDAO();
                                DefaultTableModel modeloTabla = new DefaultTableModel();
                                modeloTabla.addColumn("Num. de Venta");
                                modeloTabla.addColumn("Cliente");
                                modeloTabla.addColumn("Importe");
                                modeloTabla.addColumn("Fecha");
                                plv.tableVentas.setModel(modeloTabla);
                                Object [] columna = new Object[4];
                            
                                int numRegistros = 0;
                                try {
                                    numRegistros = ventaDao.listarVentas().size();
                                } catch (SQLException ex) {
                                    Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                for (int i = 0; i < numRegistros; i++) {
                                    try {
                                        columna[0] = ventaDao.listarVentas().get(i).getCodigoVenta();
                                        columna[1] = ventaDao.listarVentas().get(i).getCodigoCliente();
                                        columna[2] = ventaDao.listarVentas().get(i).getTotalNetoVenta();
                                        columna[3] = ventaDao.listarVentas().get(i).getFechaVenta();

                                        modeloTabla.addRow(columna);
                                    } catch (SQLException ex) {
                                        Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                 plv.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                            }else{
                            if(ae.getSource() == principal.miBonosyComisiones){
                                PanelBonosyComisiones pbc = new PanelBonosyComisiones();
                                banderaGuardar = 1;
                                v=3;
                                setPanelActual(pbc);
                                //pde.setSize(principal.panelPrincipal.getWidth()-10, principal.panelPrincipal.getHeight()-10);
                                principal.panelPrincipal.removeAll();
                                //principal.panelPrincipal.add(pde, BorderLayout.CENTER);
                                pbc.setLocation(5,5);
                                this.principal.panelPrincipal.add(pbc);
                                 pbc.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                            }else{
                            if(ae.getSource() == principal.miNuevaRecarga || ae.getSource() == principal.btnNuevaRecarga){
                                PanelRecarga pnr = new PanelRecarga();
                                banderaGuardar=1;
                                v=6;
                                setPanelActual(pnr);
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
                                banderaGuardar = 1;
                                v=5;
                                setPanelActual(pao);
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
                                banderaGuardar = 1;
                                v = 9;
                                setPanelActual(pp);
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
                                banderaGuardar = 1;
                                v = 10;
                                setPanelActual(prp);
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
                                ProductoDAO productoDao = new ProductoDAO();
                                DefaultTableModel modeloTabla = new DefaultTableModel();
                                modeloTabla.addColumn("Código");
                                modeloTabla.addColumn("Nombre");
                                modeloTabla.addColumn("Marca");
                                modeloTabla.addColumn("Stock");
                                pma.tableProductos.setModel(modeloTabla);
                                Object [] columna = new Object[4];
                            
                                int numRegistros = 0;
                                try {
                                    numRegistros = productoDao.listarProductos().size();
                                } catch (SQLException ex) {
                                    Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                for (int i = 0; i < numRegistros; i++) {
                                    try {
                                        columna[0] = productoDao.listarProductos().get(i).getCodigoProducto();
                                        columna[1] = productoDao.listarProductos().get(i).getNombreProducto();
                                        columna[2] = productoDao.listarProductos().get(i).getMarca();
                                        columna[3] = productoDao.listarProductos().get(i).getStock();

                                        modeloTabla.addRow(columna);
                                    } catch (SQLException ex) {
                                        Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
                                pma.show();
                                principal.panelPrincipal.revalidate();
                                principal.panelPrincipal.repaint();
                                }else{
                            if(ae.getSource() == principal.miNuevaCategoria){
                                PanelNuevaCategoria pnc = new PanelNuevaCategoria();
                                banderaGuardar = 1;
                                v=7;
                                setPanelActual(pnc);
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
                                banderaGuardar = 1;
                                v =8;
                                setPanelActual(prp);
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
                                VentaDAO ventaDao = new VentaDAO();
                                DefaultTableModel modeloTabla = new DefaultTableModel();
                                modeloTabla.addColumn("Num. de Venta");
                                modeloTabla.addColumn("Cliente");
                                modeloTabla.addColumn("Importe");
                                modeloTabla.addColumn("Fecha");
                                prv.tableVentas.setModel(modeloTabla);
                                Object [] columna = new Object[4];
                            
                                int numRegistros = 0;
                                try {
                                    numRegistros = ventaDao.listarVentas().size();
                                } catch (SQLException ex) {
                                    Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                for (int i = 0; i < numRegistros; i++) {
                                    try {
                                        columna[0] = ventaDao.listarVentas().get(i).getCodigoVenta();
                                        columna[1] = ventaDao.listarVentas().get(i).getCodigoCliente();
                                        columna[2] = ventaDao.listarVentas().get(i).getTotalNetoVenta();
                                        columna[3] = ventaDao.listarVentas().get(i).getFechaVenta();

                                        modeloTabla.addRow(columna);
                                    } catch (SQLException ex) {
                                        Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                }
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
                                banderaGuardar = 1;
                                v =11;
                                setPanelActual(pnc);
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
                                banderaGuardar = 1;
                                v = 13;
                                setPanelActual(pec);
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
                                        if(v == 1){
                                            PanelRegistroCliente prc = (PanelRegistroCliente) internalFrameActual;
                                            ControladorCliente cc = new ControladorCliente();
                                            cc.setPanelRegistroCliente(prc);
                                            cc.insertarDatos();
                                            msj=JOptionPane.showConfirmDialog(null,"Registro exitoso!, ¿Agregar uno nuevo?","Rgistro Exitoso",JOptionPane.YES_NO_OPTION);
                                            if(msj==0){
                                                prc.jtfCelularCliente.setText("");
                                                prc.jtfCorreoCliente.setText("");
                                            } else{                                       
                                                prc.dispose();
                                            }
                                        }else{
                                            if(v == 2){
                                            PanelRegistroTrabajador prt = (PanelRegistroTrabajador) internalFrameActual;
                                            ControladorTrabajador ct = new ControladorTrabajador();
                                                if("".equals(prt.jtfApellidosNombres.getText())){
                                                   JOptionPane.showMessageDialog(null, "Complete los datos por favor !", "Advertencia", JOptionPane.WARNING_MESSAGE);
                                                }
                                                else{
                                                    
                                                    ct.setPanelRegistroTrabajador(prt);
                                                    ct.insertarDatos();
                                                    msj=JOptionPane.showConfirmDialog(null,"Registro exitoso!, ¿Agregar uno nuevo?","Rgistro Exitoso",JOptionPane.YES_NO_OPTION);
                                                    if(msj==0){
                                                        prt.jtfApellidosNombres.setText("");
                                                        prt.jtfCelularTrab.setText("");
                                                        prt.jtfClaveUsuario.setText("");
                                                        prt.jtfCorreoTrab.setText("");
                                                        prt.jtfDireccionTrab.setText("");
                                                        prt.jtfDniTrab.setText("");
                                                        prt.jtfDniTrab.setText("");
                                                        prt.jtfEdadTrab.setText("");
                                                        prt.jtfFechaPago.setText("");
                                                        prt.jtfHobbyTrab.setText("");
                                                        prt.jtfNumCuentaTrab.setText("");
                                                        prt.jtfSueldoTrab.setText("");
                                                        prt.jtfTelRefTrab.setText("");
                                                        prt.jtfTelefonoTrab.setText("");
                                                        prt.jtfUsuario.setText("");
                                                    } else{                                       
                                                        prt.dispose();
                                                    }
                                                }
                                            
                                            }
                                            else{
                                                if(v == 3){
                                            PanelBonosyComisiones pbc = (PanelBonosyComisiones) internalFrameActual;
                                            ControladorIncentivos ci = new ControladorIncentivos();
                                            ci.setPanelBonosyComisiones(pbc);
                                            ci.insertarDatos();
                                            }
                                            else{
                                                    if(v == 4){
                                            //PanelDatosEmpresa pde = (PanelDatosEmpresa) internalFrameActual;
                                            //ControladorEmpresa ce = new ControladorEmpresa();
                                            //ce.setPanelDatosEmpresa(pde);
                                            ce.insertarDatos();
                                            }
                                            else{
                                                 if(v == 5){
                                            AgregarOperador pao = (AgregarOperador) internalFrameActual;
                                            ControladorOperador co = new ControladorOperador();
                                            co.setAgregarOperador(pao);
                                            co.insertarDatos();
                                            msj=JOptionPane.showConfirmDialog(null,"Registro exitoso!, ¿Agregar uno nuevo?","Rgistro Exitoso",JOptionPane.YES_NO_OPTION);
                                            if(msj==0){
                                                pao.jtfNombreOperador.setText("");
                                                
                                            } else{                                       
                                                pao.dispose();
                                            }
                                            }
                                            else{
                                                if(v == 6){
                                                PanelRecarga pnr = (PanelRecarga) internalFrameActual;
                                                ControladorRecarga cr = new ControladorRecarga();
                                                cr.setPanelRecarga(pnr);
                                                cr.insertarDatos();
                                                msj=JOptionPane.showConfirmDialog(null,"Registro exitoso!, ¿Agregar uno nuevo?","Rgistro Exitoso",JOptionPane.YES_NO_OPTION);
                                                    if(msj==0){
                                                       pnr.jtfCantidadRecargada.setText("");
                                                       pnr.jtfNumeroCelular.setText("");
                                                    } else{                                       
                                                        pnr.dispose();
                                                    }
                                                    
                                                
                                                }
                                                else{
                                                    if(v == 7){
                                                    PanelNuevaCategoria pnc= (PanelNuevaCategoria) internalFrameActual;
                                                    ControladorCategoria cc = new ControladorCategoria();
                                                    cc.setPanelNuevaCategoria(pnc);
                                                    cc.insertarDatos();
                                                    msj=JOptionPane.showConfirmDialog(null,"Registro exitoso!, ¿Agregar uno nuevo?","Rgistro Exitoso",JOptionPane.YES_NO_OPTION);
                                                    if(msj==0){
                                                       pnc.jtfNombreNuevaCategoria.setText("");
                                                    } else{                                       
                                                        pnc.dispose();
                                                    }
                                                    }
                                                    else{
                                                        if(v == 8){
                                                        PanelRegistroProveedor prp= (PanelRegistroProveedor) internalFrameActual;
                                                        ControladorProveedor cp = new ControladorProveedor();
                                                        cp.setPanelRegistroProveedor(prp);
                                                        cp.insertarDatos();
                                                        }
                                                        else{
                                                            if(v == 9){
                                                            PanelPromociones pp= (PanelPromociones) internalFrameActual;
                                                            ControladorPromocion cp = new ControladorPromocion();
                                                            cp.setPanelPromociones(pp);
                                                            cp.insertarDatos();
                                                            }
                                                            else{
                                                                if(v == 10){
                                                                PanelRegistroProducto prp= (PanelRegistroProducto) internalFrameActual;
                                                                ControladorProducto cp = new ControladorProducto();
                                                                cp.setPanelRegistroProducto(prp);
                                                                cp.insertarDatos();
                                                                }
                                                                else{
                                                                    if(v == 11){
                                                                    PanelNuevaCompra pnc= (PanelNuevaCompra) internalFrameActual;
                                                                    ControladorCompra cc = new ControladorCompra();
                                                                    cc.setPanelNuevaCompra(pnc);
                                                                    cc.insertarDatos();
                                                                    }
                                                                    else{
                                                            if(v == 12){
                                                PanelRegistroVentas prv= (PanelRegistroVentas) internalFrameActual;
                                                ControladorVenta cv = new ControladorVenta();
                                                cv.setPanelRegistroVentas(prv);
                                                cv.insertarDatos();
                                                }
                                                else{
                                                                if(v == 13){
                                                PanelEmisionComprobante pec = (PanelEmisionComprobante) internalFrameActual;
                                                ControladorComprobante cc = new ControladorComprobante();
                                                cc.setPanelEmisionComprobante(pec);
                                                cc.insertarDatos();
                                                }
                                                else{

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
