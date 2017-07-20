/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.ProductoDAO;
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
            
            String codigoProducto = prp.jtfCodigoProducto.getText();
            String nombreProducto = prp.jtfNombreProducto.getText();
            String marca = prp.jtfMarcaProducto.getText();
            String descripcion = prp.jtfDescripcionProducto.getText();
            String categoria = prp.jcbCategoriaProducto.getSelectedItem().toString();
            String fechaVencimiento = df.format(prp.jtfFechaVencimiento.getDate());
            int stock = Integer.parseInt(prp.jtfStock.getText());
            int puntoPedido = Integer.parseInt(prp.jtfPuntoPedido.getText());
            String numeroBoleta = prp.jtfNumeroBoletaProducto.getText();
            String fechaRegistro = df.format(prp.jdcFechaRegistroProducto.getDate());

        
        try {
            productoDao.registrarProducto(codigoProducto,nombreProducto,marca,descripcion,categoria,fechaVencimiento,stock,puntoPedido,numeroBoleta,fechaRegistro);
        } catch (SQLException ex) {
           
             Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
