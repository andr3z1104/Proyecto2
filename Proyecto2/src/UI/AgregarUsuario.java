/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import clases.*;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class AgregarUsuario extends javax.swing.JFrame {

    
    
    private String path;
    
    /**
     * Creates new form AgregarUsuario
     */
    public AgregarUsuario() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        NombreLabel = new javax.swing.JLabel();
        TipoLabel = new javax.swing.JLabel();
        VolverAgregarUsuarioBut = new javax.swing.JButton();
        AgregarBut = new javax.swing.JButton();
        AltoBut = new javax.swing.JRadioButton();
        MedioBut = new javax.swing.JRadioButton();
        BajoBut = new javax.swing.JRadioButton();
        FondoAgregarUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 132, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        NombreText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextActionPerformed(evt);
            }
        });
        getContentPane().add(NombreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 310, 30));

        NombreLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        NombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        NombreLabel.setText("Nombre:");
        getContentPane().add(NombreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 90, 30));

        TipoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TipoLabel.setForeground(new java.awt.Color(255, 255, 255));
        TipoLabel.setText("Tipo:");
        getContentPane().add(TipoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        VolverAgregarUsuarioBut.setBackground(new java.awt.Color(0, 0, 0));
        VolverAgregarUsuarioBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VolverAgregarUsuarioBut.setForeground(new java.awt.Color(255, 255, 255));
        VolverAgregarUsuarioBut.setText("Volver");
        VolverAgregarUsuarioBut.setBorderPainted(false);
        VolverAgregarUsuarioBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverAgregarUsuarioButActionPerformed(evt);
            }
        });
        getContentPane().add(VolverAgregarUsuarioBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        AgregarBut.setBackground(new java.awt.Color(0, 0, 0));
        AgregarBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarBut.setForeground(new java.awt.Color(255, 255, 255));
        AgregarBut.setText("Aceptar");
        AgregarBut.setBorderPainted(false);
        AgregarBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        buttonGroup1.add(AltoBut);
        AltoBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AltoBut.setText("prioridad_alta");
        AltoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltoButActionPerformed(evt);
            }
        });
        getContentPane().add(AltoBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        buttonGroup1.add(MedioBut);
        MedioBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MedioBut.setText("prioridad_media");
        MedioBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedioButActionPerformed(evt);
            }
        });
        getContentPane().add(MedioBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        buttonGroup1.add(BajoBut);
        BajoBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BajoBut.setText("prioridad_baja");
        getContentPane().add(BajoBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        FondoAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/FondoAgregarUsuario.png"))); // NOI18N
        getContentPane().add(FondoAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextActionPerformed

    private void VolverAgregarUsuarioButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverAgregarUsuarioButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ModificarUsuario ventana = new ModificarUsuario();
        ventana.setVisible(true);
        
    }//GEN-LAST:event_VolverAgregarUsuarioButActionPerformed

    private void AltoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltoButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AltoButActionPerformed

    private void AgregarButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButActionPerformed
          csv C2 = new csv();
        if (NombreText.getText().equalsIgnoreCase("") || C2.ObtenerStr(getPath()).equals(NombreText.getText())){
            if (NombreText.getText().equalsIgnoreCase("")){
           JOptionPane.showMessageDialog(null, "Por favor ingrese un nombbre valido");
           }
           if (C2.ObtenerStr(getPath()).equals(NombreText.getText())){
               JOptionPane.showMessageDialog(null, "El usuario ya existe, solo puede agregar nuevos usuarios");
               NombreText.setText("");
           }
        }else{
        String nombre=NombreText.getText();
        String choice = null;
            for (Enumeration buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
                AbstractButton button = (AbstractButton) buttons.nextElement();
                if (button.isSelected()) {
                    choice = button.getText();
                    break;
                }
//                else{
//                    JOptionPane.showMessageDialog(null, "Por favor indique la prioridad");
//                    break;
//                }
            }
       csv C = new csv();
       C.modificarCSV(getPath(),C2.ObtenerStr(getPath()), nombre,choice);
       JOptionPane.showMessageDialog(null, "El usuario fue añadido exitosamente");
        }
    }//GEN-LAST:event_AgregarButActionPerformed

    private void MedioButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedioButActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedioButActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBut;
    private javax.swing.JRadioButton AltoBut;
    private javax.swing.JRadioButton BajoBut;
    private javax.swing.JLabel FondoAgregarUsuario;
    private javax.swing.JRadioButton MedioBut;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreText;
    private javax.swing.JLabel TipoLabel;
    private javax.swing.JButton VolverAgregarUsuarioBut;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
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


}
