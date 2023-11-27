/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import clases.Documento;
import clases.Lista;
import clases.Nodo;
import clases.Usuario;
import clases.Bin_Heap;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class AgregarDocumento extends javax.swing.JFrame {
    private String path;
    private Lista usuarios;
    private usuariosSistema uc;
    private Bin_Heap bin;
    private TimerUI ti;
    /**
     * Creates new form AgregarUsuario
     */
    public AgregarDocumento() {
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
        TituloAgregarDocumento = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        NombreLabel = new javax.swing.JLabel();
        TipoLabel = new javax.swing.JLabel();
        VolverAgregarDocumentoBut = new javax.swing.JButton();
        AgregarBut = new javax.swing.JButton();
        TipoText = new javax.swing.JTextField();
        TamañoLabel = new javax.swing.JLabel();
        TamañoText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        FondoAgregarDocumento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 132, -1, -1));

        TituloAgregarDocumento.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TituloAgregarDocumento.setForeground(new java.awt.Color(255, 255, 255));
        TituloAgregarDocumento.setText("Agregar Documento");
        getContentPane().add(TituloAgregarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

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
        getContentPane().add(TipoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        VolverAgregarDocumentoBut.setBackground(new java.awt.Color(0, 0, 0));
        VolverAgregarDocumentoBut.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VolverAgregarDocumentoBut.setForeground(new java.awt.Color(255, 255, 255));
        VolverAgregarDocumentoBut.setText("Volver");
        VolverAgregarDocumentoBut.setBorderPainted(false);
        VolverAgregarDocumentoBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverAgregarDocumentoButActionPerformed(evt);
            }
        });
        getContentPane().add(VolverAgregarDocumentoBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

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
        getContentPane().add(AgregarBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        TipoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(TipoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 310, 30));

        TamañoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TamañoLabel.setForeground(new java.awt.Color(255, 255, 255));
        TamañoLabel.setText("Tamaño:");
        getContentPane().add(TamañoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        TamañoText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(TamañoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 310, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 80, 30));

        usuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 310, -1));

        FondoAgregarDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/FondoAgregarDocumento.png"))); // NOI18N
        getContentPane().add(FondoAgregarDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextActionPerformed

    private void VolverAgregarDocumentoButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverAgregarDocumentoButActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ModificarDocumento ventana = new ModificarDocumento();
        ventana.setPath(getPath());
        ventana.setUsuarios(getUsuarios());
        ventana.setUc(getUc());
        ventana.setBin(getBin());
        ventana.setTi(getTi());
        ventana.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_VolverAgregarDocumentoButActionPerformed

    private void AgregarButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButActionPerformed
        String user = usuario.getText();
        if (user.isBlank()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un usuario valido");
            return;
        }
        Nodo pointer = getUsuarios().getHead();
        boolean b = false;
          while(pointer!=null){
              if(usuario.getText().equalsIgnoreCase(((Usuario) pointer.getElement()).getNombre())){
                  b=true;
              }
              pointer=pointer.getNext();
          }
          if(!b){
              JOptionPane.showMessageDialog(null, "El usuario ingresado no existe");
                  usuario.setText("");
                  return;
          }
        String nombre = NombreText.getText();
        if (nombre.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese un nombre valido");
            NombreText.setText("");
            return;
        }
        String tipo = TipoText.getText();
        String tamaño = TamañoText.getText();
        int tamaño1;
        try{
             tamaño1=Integer.parseInt(tamaño);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese un tamaño valido");
            TamañoText.setText("");
            return;
        }
        
        Nodo pAux = getUsuarios().getHead();
        Documento doc = new Documento(nombre,tipo,tamaño1);
        while (pAux!=null){
            if ((((Usuario) pAux.getElement()).getNombre()).equalsIgnoreCase(user)){
               Nodo pointer2=((Usuario) pAux.getElement()).getDocumentos().getHead();
               while(pointer2!=null){
                   if ((((Documento) pointer2.getElement()).getNombre()).equalsIgnoreCase(nombre)){
                       JOptionPane.showMessageDialog(null, "Existe un documento con el mismo nombre");
                       NombreText.setText("");
                       return;
                   }
                   pointer2=pointer2.getNext();
               }
                ((Usuario) pAux.getElement()).getDocumentos().insertFinale(doc);
                break;
            }
            pAux=pAux.getNext();
        }
        getUc().setLista_Usuarios(usuarios);
        JOptionPane.showMessageDialog(null, "exitoso");
        
    }//GEN-LAST:event_AgregarButActionPerformed

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
    private javax.swing.JLabel FondoAgregarDocumento;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreText;
    private javax.swing.JLabel TamañoLabel;
    private javax.swing.JTextField TamañoText;
    private javax.swing.JLabel TipoLabel;
    private javax.swing.JTextField TipoText;
    private javax.swing.JLabel TituloAgregarDocumento;
    private javax.swing.JButton VolverAgregarDocumentoBut;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField usuario;
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

    /**
     * @return the usuarios
     */
    public Lista getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios the usuarios to set
     */
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
