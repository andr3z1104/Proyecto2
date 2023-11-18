/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

/**
 *
 * @author ACER
 */
public class Impresora extends javax.swing.JFrame {

    /**
     * Creates new form Impresora
     */
    public Impresora() {
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
        TituloImpresora = new javax.swing.JLabel();
        ImprimirBut = new javax.swing.JButton();
        BorrarDocEspecificoBut = new javax.swing.JButton();
        VolverImpresoraBut = new javax.swing.JButton();
        FondoImpresora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 98, -1, -1));

        TituloImpresora.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TituloImpresora.setForeground(new java.awt.Color(255, 255, 255));
        TituloImpresora.setText("Impresora");
        getContentPane().add(TituloImpresora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        ImprimirBut.setBackground(new java.awt.Color(0, 0, 0));
        ImprimirBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ImprimirBut.setForeground(new java.awt.Color(255, 255, 255));
        ImprimirBut.setText("Imprimir");
        ImprimirBut.setBorderPainted(false);
        getContentPane().add(ImprimirBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 210, 50));

        BorrarDocEspecificoBut.setBackground(new java.awt.Color(0, 0, 0));
        BorrarDocEspecificoBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BorrarDocEspecificoBut.setForeground(new java.awt.Color(255, 255, 255));
        BorrarDocEspecificoBut.setText("Borrar Documento Especifico");
        BorrarDocEspecificoBut.setBorderPainted(false);
        BorrarDocEspecificoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarDocEspecificoButActionPerformed(evt);
            }
        });
        getContentPane().add(BorrarDocEspecificoBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 300, 50));

        VolverImpresoraBut.setBackground(new java.awt.Color(0, 0, 0));
        VolverImpresoraBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VolverImpresoraBut.setForeground(new java.awt.Color(255, 255, 255));
        VolverImpresoraBut.setText("Volver");
        VolverImpresoraBut.setBorderPainted(false);
        VolverImpresoraBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverImpresoraButActionPerformed(evt);
            }
        });
        getContentPane().add(VolverImpresoraBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        FondoImpresora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/FondoImpresora.png"))); // NOI18N
        getContentPane().add(FondoImpresora, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverImpresoraButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverImpresoraButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SistemaOperativo ventana = new SistemaOperativo();
        ventana.setVisible(true);
    }//GEN-LAST:event_VolverImpresoraButActionPerformed

    private void BorrarDocEspecificoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarDocEspecificoButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BorrarDocEspecifico ventana = new BorrarDocEspecifico();
        ventana.setVisible(true);
    }//GEN-LAST:event_BorrarDocEspecificoButActionPerformed

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
            java.util.logging.Logger.getLogger(Impresora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Impresora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Impresora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Impresora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Impresora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarDocEspecificoBut;
    private javax.swing.JLabel FondoImpresora;
    private javax.swing.JButton ImprimirBut;
    private javax.swing.JLabel TituloImpresora;
    private javax.swing.JButton VolverImpresoraBut;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
