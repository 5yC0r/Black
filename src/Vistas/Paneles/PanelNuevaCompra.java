/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles;

import Controlador.ControladorPrincipal;
import Modelo.Conexion;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARIANA
 */
public class PanelNuevaCompra extends javax.swing.JInternalFrame {

    /**
     * Creates new form PanelNuevaCompra1
     */
    
    Conexion conexion;
    DefaultTableModel model;
         int filas = 0;
    
    public PanelNuevaCompra() {
        initComponents();
        jtfDiasPago.setEditable(false);
        
        
        this.jcbProveedor.removeAllItems();
        
            
            conexion = new Conexion();
            java.sql.Connection accesoBD = null;
            Statement ps = null;
            
        try{
            //conexion = new Conexion();
            
            accesoBD = conexion.getConnection();
            ps = (Statement) accesoBD.createStatement();
            //Statement sent = conexion.createStatement(); 
           ResultSet rs = ps.executeQuery("SELECT * FROM proveedor");
            
               
            while(rs.next()){
            this.jcbProveedor.addItem(rs.getString("nombreProveedor"));
            }  
        }catch(Exception ex){
        Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void tipoPago(String cb){
        
        if(cb.equals("Contado")){
           jtfDiasPago.setText("0");
           jtfDiasPago.setEditable(false);
        }else{
           if(cb.equals("Credito")){
               jtfDiasPago.setText("");
               jtfDiasPago.setEditable(true);
           }
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfNumeroComprobante = new javax.swing.JTextField();
        jtfNombreVendedor = new javax.swing.JTextField();
        jcbProveedor = new javax.swing.JComboBox();
        cbxOtraCompra = new javax.swing.JCheckBox();
        jdcFechaCompra = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jcbTipoPago = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfDiasPago = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCompras = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtfTotalPagar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de Compra");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Numero de Boleta/Factura:");

        jLabel3.setText("Vendedor:");

        jLabel4.setText("Proveedor:");

        jLabel5.setText("Fecha:");

        jtfNumeroComprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumeroComprobanteKeyTyped(evt);
            }
        });

        jtfNombreVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreVendedorKeyTyped(evt);
            }
        });

        jcbProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Item 1", "Item 2", "Item 3" }));
        jcbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProveedorActionPerformed(evt);
            }
        });

        cbxOtraCompra.setText("Otros");
        cbxOtraCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOtraCompraActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de Pago:");

        jcbTipoPago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Contado", "Credito" }));
        jcbTipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoPagoActionPerformed(evt);
            }
        });

        jLabel7.setText("Plazo:");

        jLabel8.setText("dias.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfNumeroComprobante)
                                    .addComponent(jcbProveedor, 0, 125, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addComponent(cbxOtraCompra))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcbTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfDiasPago, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                            .addComponent(jdcFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNombreVendedor)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(321, 321, 321)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNumeroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxOtraCompra))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFechaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jtfDiasPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jcbTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel11.setText("Productos Comprados");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        tableCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Cantidad", "Importe"
            }
        ));
        jScrollPane1.setViewportView(tableCompras);

        jLabel13.setText("Datos de la Compra");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        jLabel12.setText("Total a Pagar");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jtfTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxOtraCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOtraCompraActionPerformed
        // TODO add your handling code here:
        if(cbxOtraCompra.isSelected()== true){
            jtfNumeroComprobante.setText("000000");
            jcbProveedor.setSelectedIndex(0);
            jcbProveedor.setEnabled(false);
            jtfNombreVendedor.setEditable(false);
        }
        else{
            jtfNumeroComprobante.setText("");
            jcbProveedor.setEnabled(true);
            jtfNombreVendedor.setEditable(true);
        }
    }//GEN-LAST:event_cbxOtraCompraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        model = (DefaultTableModel) this.tableCompras.getModel();
        model.addRow(new Object[filas]);
        filas++;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbTipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoPagoActionPerformed
        
        String tp = jcbTipoPago.getSelectedItem().toString();
        tipoPago(tp);
    }//GEN-LAST:event_jcbTipoPagoActionPerformed

    private void jcbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbProveedorActionPerformed

    private void jtfNumeroComprobanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeroComprobanteKeyTyped
        char c = evt.getKeyChar();// 1 2 3 4 5 6
        String numCom  = jtfNumeroComprobante.getText();  
        if (Character.isDigit(c)  || c == '-') {
            //Permite ingreso
            if(numCom.length() == 15){
                evt.consume();
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfNumeroComprobanteKeyTyped

    private void jtfNombreVendedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreVendedorKeyTyped
        char c = evt.getKeyChar();
        String nomVen = jtfNombreVendedor.getText();
        if (Character.isLetter(c) || c == KeyEvent.VK_SPACE) {
             if(nomVen.length() == 70){
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
    }//GEN-LAST:event_jtfNombreVendedorKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox cbxOtraCompra;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox jcbProveedor;
    public javax.swing.JComboBox jcbTipoPago;
    public com.toedter.calendar.JDateChooser jdcFechaCompra;
    public javax.swing.JTextField jtfDiasPago;
    public javax.swing.JTextField jtfNombreVendedor;
    public javax.swing.JTextField jtfNumeroComprobante;
    public javax.swing.JTextField jtfTotalPagar;
    public javax.swing.JTable tableCompras;
    // End of variables declaration//GEN-END:variables
}
