
package Vistas;

public class Bienvenida extends javax.swing.JFrame {

    public Bienvenida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBienvenida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGV17(Sistema de Gestión de Ventas)");
        setMaximumSize(new java.awt.Dimension(586, 500));
        setMinimumSize(new java.awt.Dimension(586, 500));
        setPreferredSize(new java.awt.Dimension(586, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        btnBienvenida.setText("Acceda al sistema");
        getContentPane().add(btnBienvenida);
        btnBienvenida.setBounds(200, 400, 150, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portada01.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(581, 472));
        jLabel2.setMinimumSize(new java.awt.Dimension(581, 472));
        jLabel2.setPreferredSize(new java.awt.Dimension(581, 472));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 580, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBienvenida;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
