/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles;

import Controlador.ControladorPrincipal;
import Modelo.Conexion;
import com.sun.org.apache.xerces.internal.impl.xs.opti.DefaultDocument;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARIANA
 */
public class PanelRegistroProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form PanelRegistroProducto1
     */
    Conexion conexion;
    DefaultTableModel model;
    int filas = 0;
    
    public PanelRegistroProducto() {
        initComponents();
        
         Calendar c2 = new GregorianCalendar();
        jdcFechaRegistroProducto.setCalendar(c2);
        jdcFechaRegistroProducto.setEnabled(false);
        
        
        
        this.jcbCategoriaProducto.removeAllItems();
        this.cbxProveedor.removeAllItems();
            
            conexion = new Conexion();
            java.sql.Connection accesoBD = null;
            Statement ps = null;
            
        try{
            //conexion = new Conexion();
            
            accesoBD = conexion.getConnection();
            ps = (Statement) accesoBD.createStatement();
            //Statement sent = conexion.createStatement(); 
           ResultSet rs = ps.executeQuery("SELECT * FROM categoria");
            
               
            while(rs.next()){
            this.jcbCategoriaProducto.addItem(rs.getString("nombreNuevaCategoria"));
            }  
        }catch(Exception ex){
        Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            accesoBD = conexion.getConnection();
            ps = (Statement) accesoBD.createStatement();
            //Statement sent = conexion.createStatement(); 
           ResultSet rs = ps.executeQuery("SELECT * FROM proveedor");
            
            while(rs.next()){
            this.cbxProveedor.addItem(rs.getString("nombreProveedor"));
            } 
            
        } catch (SQLException ex) {
            Logger.getLogger(PanelRegistroProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfCodigoProducto = new javax.swing.JTextField();
        jtfNombreProducto = new javax.swing.JTextField();
        jtfDescripcionProducto = new javax.swing.JTextField();
        jcbCategoriaProducto = new javax.swing.JComboBox();
        jtfStock = new javax.swing.JTextField();
        jtfPuntoPedido = new javax.swing.JTextField();
        jtfMarcaProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfFechaVencimiento = new com.toedter.calendar.JDateChooser();
        jdcFechaRegistroProducto = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        cbxProveedor = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jtfResponsable = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePrecios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de Producto");
        setToolTipText("");

        jLabel9.setText("DESCRIPCION DE PRODUCTO");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripción:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Fecha de Registro:");

        jLabel6.setText("Categoria:");

        jLabel7.setText("Stock Actual:");

        jLabel8.setText("Punto de Pedido:");

        jtfCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoProductoActionPerformed(evt);
            }
        });
        jtfCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCodigoProductoKeyTyped(evt);
            }
        });

        jtfNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreProductoActionPerformed(evt);
            }
        });
        jtfNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreProductoKeyTyped(evt);
            }
        });

        jcbCategoriaProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Snack", "Bebidas", "Galletas" }));

        jtfStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfStockKeyTyped(evt);
            }
        });

        jtfPuntoPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPuntoPedidoKeyTyped(evt);
            }
        });

        jtfMarcaProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfMarcaProductoKeyTyped(evt);
            }
        });

        jLabel11.setText("Feha de Vencimiento:");

        jLabel12.setText("Proveedor:");

        cbxProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Item 1", "Item 2", "Item 3" }));

        jLabel13.setText("Responsable:");

        jtfResponsable.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(62, 62, 62)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfNombreProducto)
                                .addComponent(jtfDescripcionProducto)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtfCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jdcFechaRegistroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jtfMarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcbCategoriaProducto, 0, 122, Short.MAX_VALUE)
                                        .addComponent(cbxProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(38, 38, 38)
                        .addComponent(jtfPuntoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfStock, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5))
                    .addComponent(jdcFechaRegistroProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfDescripcionProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfMarcaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jcbCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jtfFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfPuntoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel10.setText("LISTA DE PRECIOS");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablePrecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unidad", "Costo", "Venta"
            }
        ));
        jScrollPane1.setViewportView(tablePrecios);

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoProductoActionPerformed

    private void jtfCodigoProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoProductoKeyTyped
        
        char c = evt.getKeyChar();
        int limite = 13;
        int longitudCadena = jtfCodigoProducto.getText().length();
        if (!Character.isDigit(c)|| longitudCadena == limite) {
            evt.consume();//no permite digitar
        }
    }//GEN-LAST:event_jtfCodigoProductoKeyTyped

    private void jtfNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreProductoKeyTyped
        char c = evt.getKeyChar();
        String nomProd = jtfNombreProducto.getText();
        if (Character.isLetter(c) || c == KeyEvent.VK_SPACE) {
             if(nomProd.length() == 40){
                evt.consume();
            }
            //Permite ingreso
            if (Character.isLowerCase(c)) {
                String cadena = (""+c).toUpperCase();
                c = cadena.charAt(0);
                evt.setKeyChar(c);
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfNombreProductoKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        model = (DefaultTableModel) this.tablePrecios.getModel();
        model.addRow(new Object[filas]);
        filas++;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfMarcaProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMarcaProductoKeyTyped
       char c = evt.getKeyChar();
        String nomProd = jtfMarcaProducto.getText();
        if (Character.isLetter(c) || c == KeyEvent.VK_SPACE) {
             if(nomProd.length() == 40){
                evt.consume();
            }
            //Permite ingreso
            if (Character.isLowerCase(c)) {
                String cadena = (""+c).toUpperCase();
                c = cadena.charAt(0);
                evt.setKeyChar(c);
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfMarcaProductoKeyTyped

    private void jtfStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfStockKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();//no permite digitar
        }
    }//GEN-LAST:event_jtfStockKeyTyped

    private void jtfPuntoPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPuntoPedidoKeyTyped
       char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();//no permite digitar
        }
    }//GEN-LAST:event_jtfPuntoPedidoKeyTyped

    private void jtfNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreProductoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox cbxProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox jcbCategoriaProducto;
    public com.toedter.calendar.JDateChooser jdcFechaRegistroProducto;
    public javax.swing.JTextField jtfCodigoProducto;
    public javax.swing.JTextField jtfDescripcionProducto;
    public com.toedter.calendar.JDateChooser jtfFechaVencimiento;
    public javax.swing.JTextField jtfMarcaProducto;
    public javax.swing.JTextField jtfNombreProducto;
    public javax.swing.JTextField jtfPuntoPedido;
    public javax.swing.JTextField jtfResponsable;
    public javax.swing.JTextField jtfStock;
    public javax.swing.JTable tablePrecios;
    // End of variables declaration//GEN-END:variables
}
