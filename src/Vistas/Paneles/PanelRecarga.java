
package Vistas.Paneles;

import Controlador.ControladorPrincipal;
import Modelo.Conexion;
import Modelo.Recarga;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PanelRecarga extends javax.swing.JInternalFrame {

    /**
     * Creates new form PanelRecarga1
     */
    Conexion conexion;
    
    
    public PanelRecarga() {
       
       initComponents();
            
        this.jcbOperador.removeAllItems();
            
            conexion = new Conexion();
            java.sql.Connection accesoBD = null;
            Statement ps = null;
            
        try{
            //conexion = new Conexion();
            
            accesoBD = conexion.getConnection();
            ps = (Statement) accesoBD.createStatement();
            //Statement sent = conexion.createStatement(); 
           ResultSet rs = ps.executeQuery("SELECT * FROM operador");
            
               
            while(rs.next()){
            this.jcbOperador.addItem(rs.getString("nombreOperador"));
            }  
        }catch(Exception ex){
        Logger.getLogger(ControladorPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
           
           }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfNumeroCelular = new javax.swing.JTextField();
        jcbOperador = new javax.swing.JComboBox();
        jtfCantidadRecargada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAgregarOperador = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRecargas = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Nueva Recarga");
        setMaximumSize(new java.awt.Dimension(368, 481));
        setMinimumSize(new java.awt.Dimension(368, 481));
        setPreferredSize(new java.awt.Dimension(368, 481));
        setVisible(true);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Número Celular:");

        jLabel2.setText("Operador:");

        jLabel3.setText("Cantidad:");

        jtfNumeroCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumeroCelularKeyTyped(evt);
            }
        });

        jcbOperador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Movistar", "Claro", "Entel" }));
        jcbOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOperadorActionPerformed(evt);
            }
        });

        jtfCantidadRecargada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCantidadRecargadaKeyTyped(evt);
            }
        });

        jLabel4.setText("S/.");

        btnAgregarOperador.setText("+");
        btnAgregarOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarOperadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfCantidadRecargada)
                            .addComponent(jcbOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btnAgregarOperador)))
                    .addComponent(jtfNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNumeroCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbOperador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarOperador))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCantidadRecargada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 36, 330, 119);

        jLabel5.setText("Recarga");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 12, 330, 18);

        jLabel6.setText("Listado de Recargas");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 166, 330, 18);

        tableRecargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableRecargas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 330, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarOperadorActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnAgregarOperadorActionPerformed

    private void jcbOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOperadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbOperadorActionPerformed

    private void jtfNumeroCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeroCelularKeyTyped
        
        char c = evt.getKeyChar();// 1 2 3 4 5 6       
        String numCel  = jtfNumeroCelular.getText();      
        if (Character.isDigit(c)  || c == '-') {
            //Permite ingreso
            if(numCel.length() == 12){
                evt.consume();
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfNumeroCelularKeyTyped

    private void jtfCantidadRecargadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCantidadRecargadaKeyTyped
        
        char c = evt.getKeyChar();// 1 2 3 4 5 6       
        String cantR  = jtfCantidadRecargada.getText();      
        if (Character.isDigit(c)  || c == '-') {
            //Permite ingreso
            if(cantR.length() == 2){
                evt.consume();
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfCantidadRecargadaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarOperador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox jcbOperador;
    public javax.swing.JTextField jtfCantidadRecargada;
    public javax.swing.JTextField jtfNumeroCelular;
    public javax.swing.JTable tableRecargas;
    // End of variables declaration//GEN-END:variables
}
