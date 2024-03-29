/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import clases.*;

/**
 *
 * @author ACER
 */
public class ModificarUsuario extends javax.swing.JFrame {
    private String path;
    private Lista usuarios;
    private usuariosSistema uc;
    private Bin_Heap bin;
    private TimerUI ti;
    /**
     * Creates new form ModificarUsuario
     */
    public ModificarUsuario() {
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
        TituloModificarUsuario = new javax.swing.JLabel();
        VolverModificarUsuarioBut = new javax.swing.JButton();
        AgregarUsuarioBut = new javax.swing.JButton();
        BorrarUsuarioBut = new javax.swing.JButton();
        FondoModificarUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 147, -1, -1));

        TituloModificarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TituloModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TituloModificarUsuario.setText("Que desea hacer");
        getContentPane().add(TituloModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        VolverModificarUsuarioBut.setBackground(new java.awt.Color(0, 0, 0));
        VolverModificarUsuarioBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VolverModificarUsuarioBut.setForeground(new java.awt.Color(255, 255, 255));
        VolverModificarUsuarioBut.setText("Volver");
        VolverModificarUsuarioBut.setBorderPainted(false);
        VolverModificarUsuarioBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverModificarUsuarioButActionPerformed(evt);
            }
        });
        getContentPane().add(VolverModificarUsuarioBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        AgregarUsuarioBut.setBackground(new java.awt.Color(0, 0, 0));
        AgregarUsuarioBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarUsuarioBut.setForeground(new java.awt.Color(255, 255, 255));
        AgregarUsuarioBut.setText("Agregar Usuario");
        AgregarUsuarioBut.setBorderPainted(false);
        AgregarUsuarioBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUsuarioButActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarUsuarioBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 190, 50));

        BorrarUsuarioBut.setBackground(new java.awt.Color(0, 0, 0));
        BorrarUsuarioBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BorrarUsuarioBut.setForeground(new java.awt.Color(255, 255, 255));
        BorrarUsuarioBut.setText("Borrar Usuario");
        BorrarUsuarioBut.setBorderPainted(false);
        BorrarUsuarioBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarUsuarioButActionPerformed(evt);
            }
        });
        getContentPane().add(BorrarUsuarioBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 190, 50));

        FondoModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/FondoModificarUsuario.png"))); // NOI18N
        getContentPane().add(FondoModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverModificarUsuarioButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverModificarUsuarioButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SistemaOperativo ventanasistema = new SistemaOperativo();
        ventanasistema.setPath(getPath());
        ventanasistema.setUsuarios(getUsuarios());
        ventanasistema.setUc(getUc());
        ventanasistema.setBin(getBin());
        ventanasistema.setTi(getTi());
        ventanasistema.setVisible(true);
    }//GEN-LAST:event_VolverModificarUsuarioButActionPerformed

    private void AgregarUsuarioButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUsuarioButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AgregarUsuario ventanaagregaru = new AgregarUsuario();
        ventanaagregaru.setPath(getPath());
        ventanaagregaru.setUsuarios(getUsuarios());
        ventanaagregaru.setUc(getUc());
        ventanaagregaru.setBin(getBin());
        ventanaagregaru.setTi(getTi());
        ventanaagregaru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarUsuarioButActionPerformed

    private void BorrarUsuarioButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarUsuarioButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BorrarUsuario ventana = new BorrarUsuario();
        ventana.setPath(getPath());
        ventana.setUsuarios(getUsuarios());
        ventana.setUc(getUc());
        ventana.setBin(getBin());
        ventana.setTi(getTi());
        ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BorrarUsuarioButActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarUsuarioBut;
    private javax.swing.JButton BorrarUsuarioBut;
    private javax.swing.JLabel FondoModificarUsuario;
    private javax.swing.JLabel TituloModificarUsuario;
    private javax.swing.JButton VolverModificarUsuarioBut;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    public Lista getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Lista usuarios) {
        this.usuarios = usuarios;
    }

    public usuariosSistema getUc() {
        return uc;
    }

    public void setUc(usuariosSistema uc) {
        this.uc = uc;
    }

    public Bin_Heap getBin() {
        return bin;
    }

    public void setBin(Bin_Heap bin) {
        this.bin = bin;
    }

    public TimerUI getTi() {
        return ti;
    }

    public void setTi(TimerUI ti) {
        this.ti = ti;
    }

    
    
    
    
    
}
