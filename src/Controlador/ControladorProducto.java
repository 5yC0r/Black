/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.*;
import Vistas.Paneles.PanelRegistroProducto;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JTabbedPane;
import sun.misc.FloatingDecimal;

/**
 *
 * @author MARIANA
 */
public class ControladorProducto {
    
    PanelRegistroProducto prp;
    
    DateFormat df = DateFormat.getDateInstance();
        
    public void setPanelRegistroProducto(JInternalFrame jif) {
        this.prp = (PanelRegistroProducto) jif;
    }
    
    public void insertarDatos(){
        
        ProductoDAO productoDao = new ProductoDAO();
        CategoriaDAO categoriaDao = new CategoriaDAO();
        ProveedorDAO proveedorDao = new ProveedorDAO();
        EmpleadoDAO empleadoDao = new EmpleadoDAO();
        PrecioProductoDAO precioDao = new PrecioProductoDAO();
            
            int codCategoria=1;
            int codProveedor=1;
            int codEmpleado=1;
            //int codProducto =1;
            int i;
            
            String codigoProducto = prp.jtfCodigoProducto.getText();
            String nombreProducto = prp.jtfNombreProducto.getText();
            String marca = prp.jtfMarcaProducto.getText();
            String descripcion = prp.jtfDescripcionProducto.getText();
            String categoria = prp.jcbCategoriaProducto.getSelectedItem().toString();
            String fechaVencimiento = df.format(prp.jtfFechaVencimiento.getDate());
            int stock = Integer.parseInt(prp.jtfStock.getText());
            int puntoPedido = Integer.parseInt(prp.jtfPuntoPedido.getText());
            //String numeroBoleta = "";// ya no se ingresa por c/producto pertenece a diferentes boletas
            String fechaRegistro = df.format(prp.jdcFechaRegistroProducto.getDate());
            String nomProveedor = prp.cbxProveedor.getSelectedItem().toString();
            String nomTrabajador = prp.jtfResponsable.getText();
            
            /*for(i =0 ; prp.tablePrecios.getRowCount()>0 ; i++){
               System.out.println(prp.tablePrecios.getValueAt(i,0));
            try {
                precioDao.registrarPreciosProducto(prp.tablePrecios.getValueAt(i,0).toString(), Float.parseFloat(prp.tablePrecios.getValueAt(i,1).toString()),Float.parseFloat(prp.tablePrecios.getValueAt(i,2).toString()),1);
            } catch (SQLException ex) {
                Logger.getLogger(ControladorProducto.class.getName()).log(Level.SEVERE, null, ex);
            }
            } */ // prp.tablePrecios.getValueAt(i,0),prp.tablePrecios.getValueAt(i,1),prp.tablePrecios.getValueAt(i,2);
            
            
        try {
            codProveedor = proveedorDao.obtenerCodigo(nomProveedor);
            codCategoria = categoriaDao.obtenerCodigo(categoria);
            codEmpleado = empleadoDao.obtenerCodigo(nomTrabajador);
            
            productoDao.registrarProducto(codigoProducto,nombreProducto,marca,descripcion,codCategoria,fechaVencimiento,stock,puntoPedido,fechaRegistro,codProveedor,codEmpleado);
        } catch (SQLException ex) {
           
             Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
