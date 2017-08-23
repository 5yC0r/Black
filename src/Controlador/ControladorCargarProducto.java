/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Conexion;
import Modelo.DAO.ClienteDAO;
import Modelo.DAO.PrecioProductoDAO;
import Modelo.DAO.ProductoDAO;
import Modelo.PrecioProducto;
import Modelo.Producto;
import Vistas.Paneles.PanelRegistroVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARIANA
 */
public class ControladorCargarProducto implements ActionListener{
    PanelRegistroVentas prv;

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    String codigoProducto = "";

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    int codigo =0;
    String nombre = "";
    float subTotal =0;
    float Total = 0;
    PrecioProductoDAO precioDao = new PrecioProductoDAO();

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == prv.btnCargarProducto){
            setCodigoProducto(prv.jtfCodigoProducto.getText());
            Producto producto = null;            
            //String codigoProducto = prv.jtfCodigoProducto.getText();            
            try {
                 producto = retornarDatosProducto();        
                 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorRegistroVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            codigo = producto.getCodProducto();
            System.out.println(codigo);
            
           
        }
        /*if(ae.getSource() == prv.btnAgregarProducto){
            PrecioProducto precio = null;
            prv.jtfCodigoProducto.getText();
            nombre = prv.jcbUnidadPrecio.getSelectedItem().toString();
            setCodigoProducto(prv.jtfCodigoProducto.getText());
            Producto producto = null;
            
            try {
                 producto = retornarDatosProducto();
                 precio = retornarPreciosProducto();
                 
            } catch (SQLException ex) {
                Logger.getLogger(ControladorRegistroVenta.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            DefaultTableModel model = (DefaultTableModel) prv.tableProductos.getModel();
            model.addRow(new Object[]{producto.getCodigoProducto(),producto.getDescripcion(),prv.spinCantidad.getValue(),precio.getValorVenta(),Integer.parseInt(prv.spinCantidad.getValue().toString())*precio.getValorVenta()});
            subTotal = Integer.parseInt(prv.spinCantidad.getValue().toString())*precio.getValorVenta()+ subTotal;
            prv.jtfSubtotalVenta.setText(String.valueOf(subTotal));
            prv.jtfDescuento.setText("0");
            Total = subTotal + Float.parseFloat(prv.jtfDescuento.getText());
            prv.jtfTotalVenta.setText(String.valueOf(Total));          
        }*/
    }
    
    
    /*public void cargarPrecios(int codigo){
    
        prv.jcbUnidadPrecio.removeAllItems();
            
           Conexion conexion = new Conexion();
            java.sql.Connection accesoBD = null;
            Statement ps = null;
            
        try{
            //conexion = new Conexion();
            
            accesoBD = conexion.getConnection();
            ps = (Statement) accesoBD.createStatement();
            //Statement sent = conexion.createStatement(); 
           ResultSet rs = ps.executeQuery("SELECT * FROM precios  WHERE codProducto='"+codigo+"'");
            
               
            while(rs.next()){
            prv.jcbUnidadPrecio.addItem(rs.getString("nombre"));
            }  
        }catch(Exception ex){
        Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarSpinner(int stock){
        
        SpinnerNumberModel spin = new SpinnerNumberModel(); 
        spin.setMaximum(stock);
        spin.setMinimum(0);
        prv.spinCantidad.setModel(spin);
    }*/
    
    public Producto retornarProductoPrecios() throws SQLException{
        Producto producto;
        ProductoDAO productoDao = new ProductoDAO();
        producto = productoDao.obtenerProducto(codigoProducto);
        return producto;
    }
    public Producto retornarDatosProducto() throws SQLException{
        Producto producto;
        ProductoDAO productoDao = new ProductoDAO();
        producto = productoDao.obtenerProducto(codigoProducto);
        return producto;
    }
    
    public PrecioProducto retornarPreciosProducto() throws SQLException{
        PrecioProducto precio;
        PrecioProductoDAO precDao = new PrecioProductoDAO();
        precio = precDao.obtenerPrecios(nombre,codigo);
        return precio;
    }


    public void darEventoBoton(){
        prv.btnCargarProducto.addActionListener(this);
        prv.btnAgregarProducto.addActionListener(this);
    }
    
    public void setPrv(PanelRegistroVentas prv) {
        this.prv = prv;
    }
}
