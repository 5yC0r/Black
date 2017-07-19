/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.EmpresaDAO;
import Vistas.Paneles.PanelDatosEmpresa;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

/**
 *
 * @author MARIANA
 */
public class ControladorEmpresa {
    
    PanelDatosEmpresa pde;
    DateFormat df = DateFormat.getDateInstance();
    String rutaImagen ="";
    
    public void setPanelDatosEmpresa(JInternalFrame jif) {
        this.pde = (PanelDatosEmpresa) jif;
    }
    
    public void insertarDatos(){
        
        EmpresaDAO empresaDao = new EmpresaDAO();
            
            String nombre = pde.jtfNombreEmpresa.getText();
            String razonSocial = pde.jtfRazonSocial.getText();
            String representanteLegal = pde.jtfRepresentanteLegal.getText();
            String ruc = pde.jtfRuc.getText();
            String direccion = pde.jtfDireccion.getText();
            String telefono = pde.jtfTelefono.getText();
            String celular = pde.jtfCelular.getText();
            String correoElectronico = pde.jtfCorreoElectronico.getText();
            String paginaWeb = pde.jtfPaginaWeb.getText();     //Direccion url de pagina web
            String foto = rutaImagen;   //Ruta del archivo de foto
            String descripcion = pde.jtaDescripcion.getText();

        
        try {
            empresaDao.registrarDatosEmpresa(nombre,razonSocial,representanteLegal,ruc,direccion,telefono,celular,correoElectronico,paginaWeb,foto,descripcion);
        } catch (SQLException ex) {
           
             Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
