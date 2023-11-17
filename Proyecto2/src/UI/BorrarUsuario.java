/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author ACER
 */
public class BorrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form BorrarUsuario
     */
    public BorrarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloBorrarUsuario = new javax.swing.JLabel();
        VolverBorrarUsuarioBut = new javax.swing.JButton();
        BorrarLabel = new javax.swing.JLabel();
        BorrarText = new javax.swing.JTextField();
        BorrarBut = new javax.swing.JButton();
        FondoBorrarUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 136, -1, -1));

        TituloBorrarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TituloBorrarUsuario.setText("Borrar usuario");
        getContentPane().add(TituloBorrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        VolverBorrarUsuarioBut.setBackground(new java.awt.Color(0, 0, 0));
        VolverBorrarUsuarioBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VolverBorrarUsuarioBut.setText("Volver");
        VolverBorrarUsuarioBut.setBorderPainted(false);
        VolverBorrarUsuarioBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBorrarUsuarioButActionPerformed(evt);
            }
        });
        getContentPane().add(VolverBorrarUsuarioBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        BorrarLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BorrarLabel.setText("Borrar:");
        getContentPane().add(BorrarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        BorrarText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(BorrarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 270, 30));

        BorrarBut.setBackground(new java.awt.Color(0, 0, 0));
        BorrarBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BorrarBut.setText("Aceptar");
        BorrarBut.setBorderPainted(false);
        getContentPane().add(BorrarBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        FondoBorrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/FondoBorrarUsuario.png"))); // NOI18N
        getContentPane().add(FondoBorrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverBorrarUsuarioButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBorrarUsuarioButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ModificarUsuario ventana = new ModificarUsuario();
        ventana.setVisible(true);
    }//GEN-LAST:event_VolverBorrarUsuarioButActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarBut;
    private javax.swing.JLabel BorrarLabel;
    private javax.swing.JTextField BorrarText;
    private javax.swing.JLabel FondoBorrarUsuario;
    private javax.swing.JLabel TituloBorrarUsuario;
    private javax.swing.JButton VolverBorrarUsuarioBut;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
