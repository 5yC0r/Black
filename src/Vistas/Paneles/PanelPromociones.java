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

/**
 *
 * @author MARIANA
 */
public class PanelPromociones extends javax.swing.JInternalFrame {

    /**
     * Creates new form PanelPromociones1
     */
    Conexion conexion;
    public PanelPromociones() {
        initComponents();
        
        this.jcbCategoriaProducto.removeAllItems();
        this.jcbProducto.removeAllItems();
        
        
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
        
        
        
    }
    
    
    
    public void indexarProductos(int codCategoria)
    {
        
        conexion = new Conexion();
            java.sql.Connection accesoBD = null;
            Statement ps = null;
            
        try {
            accesoBD = conexion.getConnection();
            ps = (Statement) accesoBD.createStatement();
            //Statement sent = conexion.createStatement(); 
           ResultSet rs = ps.executeQuery("SELECT * FROM producto where codCategoria = '"+codCategoria+"'");
            
            while(rs.next()){
            this.jcbProducto.addItem(rs.getString("nombreProducto"));
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

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePromociones = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfNombrePromocion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcbCategoriaProducto = new javax.swing.JComboBox();
        jcbProducto = new javax.swing.JComboBox();
        jtfUnidades = new javax.swing.JTextField();
        jtfImporte = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtpDescripcion = new javax.swing.JTextPane();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registro de Promociones");

        jLabel6.setText("Detalle de Promocion");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        jLabel7.setText("Listado de Promociones");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        tablePromociones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Producto", "Cantidad", "Importe"
            }
        ));
        jScrollPane1.setViewportView(tablePromociones);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nombre: ");

        jtfNombrePromocion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombrePromocionKeyTyped(evt);
            }
        });

        jLabel2.setText("Categoria:");

        jLabel3.setText("Producto:");

        jLabel4.setText("Unidades:");

        jLabel5.setText("Importe:");

        jcbCategoriaProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Item 1", "Item 2", "Item 3" }));
        jcbCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaProductoActionPerformed(evt);
            }
        });

        jcbProducto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Item 1", "Item 2", "Item 3", "Item 4" }));

        jtfUnidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfUnidadesKeyTyped(evt);
            }
        });

        jtfImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfImporteKeyTyped(evt);
            }
        });

        jLabel8.setText("Descripcion:");

        jtpDescripcion.setBorder(null);
        jtpDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtpDescripcionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jtpDescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcbCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombrePromocion)
                    .addComponent(jtfImporte)
                    .addComponent(jtfUnidades)
                    .addComponent(jcbProducto, 0, 223, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNombrePromocion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaProductoActionPerformed
        // TODO add your handling code here:
        this.jcbProducto.removeAllItems();
        int cb = jcbCategoriaProducto.getSelectedIndex()+1;        
        indexarProductos(cb);
        
    }//GEN-LAST:event_jcbCategoriaProductoActionPerformed

    private void jtfNombrePromocionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombrePromocionKeyTyped
        char c = evt.getKeyChar();
        String nomPro = jtfNombrePromocion.getText();
        if (Character.isLetter(c) || c == KeyEvent.VK_SPACE) {
             if(nomPro.length() == 40){
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
        
    }//GEN-LAST:event_jtfNombrePromocionKeyTyped

    private void jtpDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtpDescripcionKeyTyped
         char c = evt.getKeyChar();
        String desP = jtpDescripcion.getText();
        
             if(desP.length() == 60){
                evt.consume();
            }
        
    }//GEN-LAST:event_jtpDescripcionKeyTyped

    private void jtfUnidadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUnidadesKeyTyped
        char c = evt.getKeyChar();// 1 2 3 4 5 6
        String und  = jtfUnidades.getText();  
        if (Character.isDigit(c)  || c == '-') {
            //Permite ingreso
            if(und.length() == 8){
                evt.consume();
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfUnidadesKeyTyped

    private void jtfImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfImporteKeyTyped
        char c = evt.getKeyChar();
        String impo = jtfImporte.getText();
        if (Character.isDigit(c)) {
             if(impo.length() == 10){
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
        
    }//GEN-LAST:event_jtfImporteKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JComboBox jcbCategoriaProducto;
    public javax.swing.JComboBox jcbProducto;
    public javax.swing.JTextField jtfImporte;
    public javax.swing.JTextField jtfNombrePromocion;
    public javax.swing.JTextField jtfUnidades;
    public javax.swing.JTextPane jtpDescripcion;
    public javax.swing.JTable tablePromociones;
    // End of variables declaration//GEN-END:variables
}
