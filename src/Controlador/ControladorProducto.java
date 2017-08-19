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
            //String nombreProducto = prp.jtfNombreProducto.getText();
            String marca = prp.jtfMarcaProducto.getText();
            String descripcion = prp.jtfDescripcionProducto.getText();
            String categoria = prp.jcbCategoriaProducto.getSelectedItem().toString();
           // String fechaVencimiento = df.format(prp.jtfFechaVencimiento.getDate());
            int stock = Integer.parseInt(prp.jtfStock.getText());
            int puntoPedido = Integer.parseInt(prp.jtfPuntoPedido.getText());
            //String numeroBoleta = "";// ya no se ingresa por c/producto pertenece a diferentes boletas
            String fechaRegistro = prp.fechaRegistro.getText();
            String nomProveedor = prp.cbxProveedor.getSelectedItem().toString();
            String nomTrabajador = prp.jtfResponsable.getText();
           
                     
        try {
            codProveedor = proveedorDao.obtenerCodigo(nomProveedor);
            codCategoria = categoriaDao.obtenerCodigo(categoria);
            codEmpleado = empleadoDao.obtenerCodigo(nomTrabajador);
            
            productoDao.registrarProducto(codigoProducto,marca,descripcion,codCategoria,stock,puntoPedido,fechaRegistro,codProveedor,codEmpleado);
        } catch (SQLException ex) {
           
             Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
