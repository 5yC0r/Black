/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Paneles;

import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author MARIANA
 */
public class PanelRegistroTrabajador extends javax.swing.JInternalFrame {

    DateFormat df = DateFormat.getDateInstance();
        
    public PanelRegistroTrabajador() {
        
        initComponents();
        Calendar c2 = new GregorianCalendar();
        jcFechaRegistroTrabajador.setCalendar(c2);  
        jcFechaRegistroTrabajador.setEnabled(false);
        
        
    }
    
     /*public void edad() {     //fecha_nac debe tener el formato dd/MM/yyyy
    
        String fecha_nac = df.format(jdcFechNacTrab.getDate());
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String hoy = formato.format(fechaActual);
        String[] dat1 = fecha_nac.split("/");
        String[] dat2 = hoy.split("/");
        int anos = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
        int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
        if (mes < 0) {
        anos = anos - 1;
        } else if (mes == 0) {
        int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
        if (dia > 0) {
            anos = anos - 1;
        }
        }
        System.out.println(anos);
        //return anos;
  }*/
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfApellidosNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfDniTrab = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfDireccionTrab = new javax.swing.JTextField();
        jtfTelefonoTrab = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfTelRefTrab = new javax.swing.JTextField();
        jtfCorreoTrab = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtfHobbyTrab = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtfCelularTrab = new javax.swing.JTextField();
        jdcFechNacTrab = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jcbSexoTrab = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jtfSueldoTrab = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtfNumCuentaTrab = new javax.swing.JTextField();
        jtfFechaPago = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jtfClaveUsuario = new javax.swing.JTextField();
        jcbCargoTrabajador = new javax.swing.JComboBox();
        jcFechaRegistroTrabajador = new com.toedter.calendar.JDateChooser();

        jMenuItem1.setText("jMenuItem1");

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de Trabajador");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Apellidos y Nombres:");

        jtfApellidosNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidosNombresKeyTyped(evt);
            }
        });

        jLabel2.setText("DNI:");

        jtfDniTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDniTrabActionPerformed(evt);
            }
        });
        jtfDniTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDniTrabKeyTyped(evt);
            }
        });

        jLabel4.setText("Fecha Nacimiento:");

        jLabel3.setText("Dirección:");

        jtfTelefonoTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTelefonoTrabKeyTyped(evt);
            }
        });

        jLabel5.setText("Teléfono Fijo:");

        jLabel8.setText("Telefono de Referencia:");

        jtfTelRefTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTelRefTrabKeyTyped(evt);
            }
        });

        jLabel6.setText("Correo Electrónico:");

        jLabel11.setText("Hobby:");

        jtfHobbyTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfHobbyTrabKeyTyped(evt);
            }
        });

        jLabel15.setText("Celular:");

        jtfCelularTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCelularTrabKeyTyped(evt);
            }
        });

        jLabel7.setText("Sexo:");

        jcbSexoTrab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Femenino", "Masculino" }));

        jLabel9.setText("Edad:");

        edad.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfHobbyTrab, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(jtfCorreoTrab)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(26, 26, 26)
                            .addComponent(jtfApellidosNombres))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtfTelefonoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfCelularTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfDireccionTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jdcFechNacTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtfDniTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(jcbSexoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(edad))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfTelRefTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfApellidosNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDniTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jcbSexoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechNacTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDireccionTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfTelefonoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jtfCelularTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtfTelRefTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfCorreoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtfHobbyTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        /*jdcFechNacTrab.getDateEditor().addPropertyChangeListener(new java.beans.PropertyChangeListener(){
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                //String fechaNacimiento = df.format(jdcFechNacTrab.getDate());
                //edad();
                System.out.println("salio clic");
                //jtfEdadTrab.setText("");
                //System.out.println(edad);
            }
        });*/

        jLabel14.setText("Datos Personales");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Sueldo:");

        jtfSueldoTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSueldoTrabKeyTyped(evt);
            }
        });

        jLabel13.setText("Fecha:");

        jLabel10.setText("Número de Cuenta:");

        jtfNumCuentaTrab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumCuentaTrabKeyTyped(evt);
            }
        });

        jtfFechaPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfFechaPagoKeyTyped(evt);
            }
        });

        jLabel18.setText("c/mes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jtfSueldoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jtfFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18))
                    .addComponent(jtfNumCuentaTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSueldoTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jtfFechaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfNumCuentaTrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setText("Información de Pago");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setText("Datos de Usuario");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setText("Usuario:");

        jLabel20.setText("Clave:");

        jLabel21.setText("Cargo:");

        jLabel22.setText("Fecha de Registro:");

        jcbCargoTrabajador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Administrador", "Trabajador" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel22))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcFechaRegistroTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfClaveUsuario)
                    .addComponent(jcbCargoTrabajador, 0, 137, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfClaveUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(jcbCargoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcFechaRegistroTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDniTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDniTrabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDniTrabActionPerformed

    private void jtfApellidosNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidosNombresKeyTyped
        char c = evt.getKeyChar();
        String nomProd = jtfApellidosNombres.getText();
        if (Character.isLetter(c) || c == KeyEvent.VK_SPACE) {
             //Permite ingreso
            if (Character.isLowerCase(c)) {
                String cadena = (""+c).toUpperCase();
                c = cadena.charAt(0);
                evt.setKeyChar(c);
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfApellidosNombresKeyTyped

    private void jtfDniTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDniTrabKeyTyped
         char c = evt.getKeyChar();
        int limite = 8;
        int longitudCadena = jtfDniTrab.getText().length();
        if (!Character.isDigit(c)|| longitudCadena == limite) {
            evt.consume();//no permite digitar
        }
    }//GEN-LAST:event_jtfDniTrabKeyTyped

    private void jtfTelefonoTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelefonoTrabKeyTyped
        char c = evt.getKeyChar();// 1 2 3 4 5 6
        
        String cel  = jtfTelefonoTrab.getText();
        
        if (Character.isDigit(c)  || c == '-') {
            //Permite ingreso
            if(cel.length() == 9){
                evt.consume();
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfTelefonoTrabKeyTyped

        private void jtfCelularTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCelularTrabKeyTyped
        char c = evt.getKeyChar();// 1 2 3 4 5 6
        
        String cel  = jtfCelularTrab.getText();
        
        if (Character.isDigit(c)  || c == '-') {
            //Permite ingreso
            if(cel.length() == 9){
                evt.consume();
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfCelularTrabKeyTyped

    private void jtfTelRefTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelRefTrabKeyTyped
        char c = evt.getKeyChar();// 1 2 3 4 5 6
        
        String cel  = jtfTelRefTrab.getText();
        
        if (Character.isDigit(c)  || c == '-') {
            //Permite ingreso
            if(cel.length() == 9){
                evt.consume();
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfTelRefTrabKeyTyped

    private void jtfHobbyTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfHobbyTrabKeyTyped
        char c = evt.getKeyChar();
        String nomHob = jtfHobbyTrab.getText();
        if (Character.isLetter(c) || c == KeyEvent.VK_SPACE) {
             //Permite ingreso
            if (Character.isLowerCase(c)) {
                String cadena = (""+c).toUpperCase();
                c = cadena.charAt(0);
                evt.setKeyChar(c);
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfHobbyTrabKeyTyped

    private void jtfNumCuentaTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumCuentaTrabKeyTyped
        char c = evt.getKeyChar();//      
        String numCuen  = jtfNumCuentaTrab.getText();
        if (Character.isDigit(c)  || c == '-' ) {
            //Permite ingreso
            if(numCuen.length() == 20){
                evt.consume();
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfNumCuentaTrabKeyTyped

    private void jtfFechaPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfFechaPagoKeyTyped
        char c = evt.getKeyChar();// 1 2 3 4 5 6
        
        String cel  = jtfFechaPago.getText();
        
        if (Character.isDigit(c)) {
            //Permite ingreso
            if(cel.length() == 2){
                evt.consume();
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfFechaPagoKeyTyped

    private void jtfSueldoTrabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSueldoTrabKeyTyped
        char c = evt.getKeyChar();//      
        String numCuen  = jtfSueldoTrab.getText();
        if (Character.isDigit(c)  || c == '.' ) {
            //Permite ingreso
            if(numCuen.length() == 6){
                evt.consume();
            }
        }else{
            
            evt.consume();
        }
    }//GEN-LAST:event_jtfSueldoTrabKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public com.toedter.calendar.JDateChooser jcFechaRegistroTrabajador;
    public javax.swing.JComboBox jcbCargoTrabajador;
    public javax.swing.JComboBox jcbSexoTrab;
    public com.toedter.calendar.JDateChooser jdcFechNacTrab;
    public javax.swing.JTextField jtfApellidosNombres;
    public javax.swing.JTextField jtfCelularTrab;
    public javax.swing.JTextField jtfClaveUsuario;
    public javax.swing.JTextField jtfCorreoTrab;
    public javax.swing.JTextField jtfDireccionTrab;
    public javax.swing.JTextField jtfDniTrab;
    public javax.swing.JTextField jtfFechaPago;
    public javax.swing.JTextField jtfHobbyTrab;
    public javax.swing.JTextField jtfNumCuentaTrab;
    public javax.swing.JTextField jtfSueldoTrab;
    public javax.swing.JTextField jtfTelRefTrab;
    public javax.swing.JTextField jtfTelefonoTrab;
    public javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
