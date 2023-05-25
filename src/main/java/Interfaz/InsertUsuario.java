/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import BusinessLayer.UsuarioBO;
import JavaBean.Usuario;
import Utilities.Validator;
import java.util.Map;

/**
 *
 * @author black
 */
public class InsertUsuario extends javax.swing.JFrame {

    /**
     * Creates new form InsertUsuario
     */
    public InsertUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombresUsuario = new javax.swing.JTextField();
        txtApellidoPaternoUsuario = new javax.swing.JTextField();
        txtApellidoMaternoUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDNIUsuario = new javax.swing.JTextField();
        txtClaveUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRolUsuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        NombreError = new javax.swing.JLabel();
        APaternoError = new javax.swing.JLabel();
        AMaternoError = new javax.swing.JLabel();
        DNIError = new javax.swing.JLabel();
        ClaveError = new javax.swing.JLabel();
        RolError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBRegistrar.setText("Registrar");
        JBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(JBRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insertar Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 338, 30));

        jLabel2.setText("Nombres :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Apellido paterno :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setText("DNI :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 99, -1));
        getContentPane().add(txtNombresUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 250, -1));
        getContentPane().add(txtApellidoPaternoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 250, -1));
        getContentPane().add(txtApellidoMaternoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 250, -1));

        jLabel5.setText("Apellido materno :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel6.setText("Rol : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        getContentPane().add(txtDNIUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 250, -1));

        txtClaveUsuario.setMaximumSize(new java.awt.Dimension(80, 2147483647));
        getContentPane().add(txtClaveUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 250, -1));

        jLabel7.setText("Clave :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        getContentPane().add(txtRolUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 250, -1));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        NombreError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(NombreError, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 85, 250, 20));

        APaternoError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(APaternoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 135, 250, 20));

        AMaternoError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(AMaternoError, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 185, 250, 20));

        DNIError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(DNIError, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 235, 250, 20));

        ClaveError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(ClaveError, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 285, 250, 20));

        RolError.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(RolError, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 335, 250, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegistrarActionPerformed
        // TODO add your handling code here:
        String nombres = txtNombresUsuario.getText();
        String apellidopaterno = txtApellidoPaternoUsuario.getText();
        String apellidomaterno = txtApellidoMaternoUsuario.getText();
        String dni = txtDNIUsuario.getText();
        String clave = txtClaveUsuario.getText();
        String rol = txtRolUsuario.getText();
        UsuarioBO ubo = new UsuarioBO();
        Usuario usuario = new Usuario();
        usuario.setNombres(nombres);
        usuario.setApellido_paterno(apellidopaterno);
        usuario.setApellido_materno(apellidomaterno);
        try {
            usuario.setDni(dni);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        usuario.setClave(clave);
        usuario.setRol(rol);
        LimpiarErrores();
        System.out.println("P1");
        if(nombres.isBlank() || apellidopaterno.isBlank() || apellidomaterno.isBlank() || dni.isBlank() || clave.isBlank() || rol.isBlank()){
            System.out.println(usuario.getErrores().isEmpty());
            if(!usuario.getErrores().isEmpty()){
                ImprimirErrores(usuario.getErrores());
            }
            System.out.println("P1-entro");
        }else{
            System.out.println("P2");
            if(Validator.isDNI(dni) && clave.length()>=8){
                System.out.println("P2-entro1");
                try {
                    ubo.insertar(usuario);
                    dispose();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }else{
                System.out.println("Entro error");
                if(!Validator.isDNI(dni)){
                    DNIError.setText("Ingrese un DNI valido");
                }
                if(clave.length()<8){
                    ClaveError.setText("La clave debe ser minimo de 8 caracteres");
                }
            }
        }
    }//GEN-LAST:event_JBRegistrarActionPerformed

    
    private void ImprimirErrores(Map<String, String> errores){    
        for (String error : errores.keySet().toArray(new String[0])) {
            System.out.println(errores.get(error));
            switch (error) {
                case "nombres" -> NombreError.setText(errores.get(error));
                case "apellido_paterno" -> APaternoError.setText(errores.get(error));
                case "apellido_materno" -> AMaternoError.setText(errores.get(error));
                case "dni" -> DNIError.setText(errores.get(error));
                case "claveLen" -> ClaveError.setText(errores.get(error));
                case "clave" -> ClaveError.setText(errores.get(error));
                case "rol" -> RolError.setText(errores.get(error));
            }
            System.out.println(error);
        }
    }
    
    private void LimpiarErrores(){
        NombreError.setText("");
        APaternoError.setText("");
        AMaternoError.setText("");
        DNIError.setText("");
        ClaveError.setText("");
        RolError.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(InsertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AMaternoError;
    private javax.swing.JLabel APaternoError;
    private javax.swing.JLabel ClaveError;
    private javax.swing.JLabel DNIError;
    private javax.swing.JButton JBRegistrar;
    private javax.swing.JLabel NombreError;
    private javax.swing.JLabel RolError;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellidoMaternoUsuario;
    private javax.swing.JTextField txtApellidoPaternoUsuario;
    private javax.swing.JTextField txtClaveUsuario;
    private javax.swing.JTextField txtDNIUsuario;
    private javax.swing.JTextField txtNombresUsuario;
    private javax.swing.JTextField txtRolUsuario;
    // End of variables declaration//GEN-END:variables
}
