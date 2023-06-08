/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import BusinessLayer.PagoMatriculaBO;
import BusinessLayer.PagoPensionBO;
import BusinessLayer.PagoVariosBO;
import JavaBean.Matricula;
import JavaBean.pagoMatricula;
import JavaBean.pagoPensiones;
import JavaBean.pagoVarios;
import java.sql.Date;
import java.util.Map;

/**
 *
 * @author black
 */
public class VentanaPagos extends javax.swing.JFrame {

    /**
     * Creates new form InsertPagos
     * @param tipoPago
     */
    private String tipoPago = "";
    
    public VentanaPagos(String tipoPago, pagoMatricula pagoMat) {    
        initComponents();
        
        jlTitulo.setText("Actualizar Pago Matricula");
        
        jlID.setText(String.valueOf(pagoMat.getPago_matricula_id()));
        jbPrincipal.setText("Actualizar");
        
        //Rellenar formulario
        jTextAlumnoId.setText( String.valueOf(pagoMat.getAlumno_id()) );
        jTextFecha.setText( pagoMat.getFecha().toString() );
        jTextMonto.setText( String.valueOf(pagoMat.getMonto()) );
        jTextObservacion.setText( pagoMat.getObservacion() );
        
        this.tipoPago = tipoPago;
    }
    
    public VentanaPagos(String tipoPago, pagoPensiones pagoPen) {    
        initComponents();
        
        jlTitulo.setText("Actualizar Pago Pensiones");
        
        jlID.setText(String.valueOf(pagoPen.getPago_pensiones_id()));
        jbPrincipal.setText("Actualizar");
        
        //Rellenar formulario
        jTextAlumnoId.setText( String.valueOf(pagoPen.getAlumno_id()) );
        jTextFecha.setText( pagoPen.getFecha().toString() );
        jTextMonto.setText( String.valueOf(pagoPen.getMonto()) );
        jTextObservacion.setText( pagoPen.getObservacion() );
        
        this.tipoPago = tipoPago;
    }
    
    public VentanaPagos(String tipoPago, pagoVarios pagoVar) {    
        initComponents();
        
        jlTitulo.setText("Actualizar Pago Varios");
        
        jlID.setText(String.valueOf(pagoVar.getPago_varios_id()));
        jbPrincipal.setText("Actualizar");
        
        //Rellenar formulario
        jTextAlumnoId.setText( String.valueOf(pagoVar.getAlumno_id()) );
        jTextFecha.setText( pagoVar.getFecha().toString() );
        jTextMonto.setText( String.valueOf(pagoVar.getMonto()) );
        jTextObservacion.setText( pagoVar.getObservacion() );
        
        this.tipoPago = tipoPago;
    }
    
    
    public VentanaPagos(String tipoPago) {    
        initComponents();
        
        jlTitulo.setText("Insertar "+tipoPago);
        if(tipoPago.trim()=="Pago Varios")
            jLabel10.setText("Descripcion :");
        
        jlID.setText("");
        jbPrincipal.setText("Insertar");
        
        this.tipoPago = tipoPago;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextAlumnoId = new javax.swing.JTextField();
        jTextFecha = new javax.swing.JTextField();
        jTextMonto = new javax.swing.JTextField();
        jbPrincipal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextObservacion = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        jlID = new javax.swing.JLabel();
        jLabelAlumno_id = new javax.swing.JLabel();
        jLabelMonto = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelObservacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel16.setText("Fecha de pago :");

        jLabel17.setText("Monto pagado :");

        jLabel10.setText("Observaciones :");

        jLabel19.setText("Alumno ID :");

        jbPrincipal.setText("Registrar pago");
        jbPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrincipalActionPerformed(evt);
            }
        });

        jTextObservacion.setColumns(20);
        jTextObservacion.setRows(5);
        jScrollPane1.setViewportView(jTextObservacion);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlTitulo.setText("Actualizar Pago: ");

        jlID.setForeground(new java.awt.Color(51, 51, 255));
        jlID.setText("-");

        jLabelAlumno_id.setForeground(new java.awt.Color(255, 51, 51));
        jLabelAlumno_id.setText("-");

        jLabelMonto.setForeground(new java.awt.Color(255, 51, 51));
        jLabelMonto.setText("-");

        jLabelFecha.setForeground(new java.awt.Color(255, 51, 51));
        jLabelFecha.setText("-");

        jLabelObservacion.setForeground(new java.awt.Color(255, 51, 51));
        jLabelObservacion.setText("-");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(37, 37, 37)
                        .addComponent(jbPrincipal)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelObservacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel19))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelAlumno_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextAlumnoId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(23, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTitulo)
                    .addComponent(jlID))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextAlumnoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabelAlumno_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jLabelFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jTextMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMonto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(2, 2, 2)
                .addComponent(jLabelObservacion)
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPrincipal)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrincipalActionPerformed
        // TODO add your handling code here:
        switch (tipoPago) {
            case "Pago Matricula" -> {
                pagoMatricula pagoMat = RecibirDatosMatricula();
                InsertActualizar(pagoMat);
            }
            case "Pago Pensiones" -> {
                pagoPensiones pagoPen = RecibirDatosPensiones();
                InsertActualizar(pagoPen);
            }
            case "Pago Varios" -> {
                pagoVarios pagoVar = RecibirDatosVarios();
                InsertActualizar(pagoVar);
                }
        }
        dispose();
    }//GEN-LAST:event_jbPrincipalActionPerformed

    private pagoMatricula RecibirDatosMatricula(){
        pagoMatricula pagoMatricula1 = new pagoMatricula();
        
        int id = 0;
        double monto = 0;
        
        try {
            id = Integer.parseInt( jTextAlumnoId.getText() );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            jLabelAlumno_id.setText("Ingresa un número en el campo código alumno");
        }
        
        try {
            monto = Double.parseDouble(jTextMonto.getText() );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            jLabelMonto.setText("Ingresa un número en el campo monto");
        }
        
        try {
            if(!jTextFecha.getText().isEmpty())
                pagoMatricula1.setFecha(Date.valueOf(jTextFecha.getText()).toLocalDate());
            else
                pagoMatricula1.setFecha(null);
        } catch (Exception e) {
            if(e.toString().equals("java.lang.IllegalArgumentException"))
                jLabelFecha.setText("Error en el formato de la Fecha de Nacimiento");
            
            System.out.println("Error: "+e.toString());
        }
        
        pagoMatricula1.setAlumno_id(id);
        pagoMatricula1.setMonto(monto);
        pagoMatricula1.setObservacion(jTextObservacion.getText());
        
        if(!jlID.getText().isEmpty())
            pagoMatricula1.setPago_matricula_id(Integer.parseInt(jlID.getText()));
        
        return pagoMatricula1;
    }
    
    private pagoPensiones RecibirDatosPensiones(){
        pagoPensiones pagoPensiones1= new pagoPensiones();
        
        int id = 0;
        double monto = 0;
        
        try {
            id = Integer.parseInt( jTextAlumnoId.getText() );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            jLabelAlumno_id.setText("Ingresa un número en el campo código alumno");
        }
        
        try {
            monto = Double.parseDouble(jTextMonto.getText() );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            jLabelMonto.setText("Ingresa un número en el campo monto");
        }
        
        try {
            if(!jTextFecha.getText().isEmpty())
                pagoPensiones1.setFecha(Date.valueOf(jTextFecha.getText()).toLocalDate());
            else
                pagoPensiones1.setFecha(null);
        } catch (Exception e) {
            if(e.toString().equals("java.lang.IllegalArgumentException"))
                jLabelFecha.setText("Error en el formato de la Fecha de Nacimiento");
            
            System.out.println("Error: "+e.toString());
        }
        
        pagoPensiones1.setAlumno_id(id);
        pagoPensiones1.setMonto(monto);
        pagoPensiones1.setObservacion(jTextObservacion.getText());
        
        if(!jlID.getText().isEmpty())
            pagoPensiones1.setPago_pensiones_id(Integer.parseInt(jlID.getText()));
        
        return pagoPensiones1;
    }
    
    private pagoVarios RecibirDatosVarios(){
        pagoVarios pagoVarios1= new pagoVarios();
        
        int id = 0;
        double monto = 0;
        
        try {
            id = Integer.parseInt( jTextAlumnoId.getText() );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            jLabelAlumno_id.setText("Ingresa un número en el campo código alumno");
        }
        
        try {
            monto = Double.parseDouble(jTextMonto.getText() );
        } catch (Exception e) {
            System.out.println(e.getMessage());
            jLabelMonto.setText("Ingresa un número en el campo monto");
        }
        
        try {
            if(!jTextFecha.getText().isEmpty())
                pagoVarios1.setFecha(Date.valueOf(jTextFecha.getText()).toLocalDate());
            else
                pagoVarios1.setFecha(null);
        } catch (Exception e) {
            if(e.toString().equals("java.lang.IllegalArgumentException"))
                jLabelFecha.setText("Error en el formato de la Fecha de Nacimiento");
            
            System.out.println("Error: "+e.toString());
        }
        
        pagoVarios1.setAlumno_id(id);
        pagoVarios1.setMonto(monto);
        pagoVarios1.setObservacion(jTextObservacion.getText());
        
        if(!jlID.getText().isEmpty())
            pagoVarios1.setPago_varios_id(Integer.parseInt(jlID.getText()));
        
        return pagoVarios1;
    }
    
    private void InsertActualizar(pagoMatricula pagoMat){
        PagoMatriculaBO pagoMatBO = new PagoMatriculaBO();
        
        if(pagoMat.getErrores().isEmpty()){
            try {
                if (jbPrincipal.getText().equals("Insertar")) {
                    pagoMatBO.insertarPagoMatricula(pagoMat);
                } else if (jbPrincipal.getText().equals("Actualizar")) {
                    pagoMatBO.actualizarPagoMatricula(pagoMat);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        else{
            ImprimirErrores(pagoMat.getErrores());
        }
    }
    
    private void InsertActualizar(pagoPensiones pagoPen){
        PagoPensionBO pagoPenBO = new PagoPensionBO();

        if (pagoPen.getErrores().isEmpty()) {
            try {
                if (jbPrincipal.getText().equals("Insertar")) {
                    pagoPenBO.insertarPagoPension(pagoPen);
                } else if (jbPrincipal.getText().equals("Actualizar")) {
                    pagoPenBO.actualizarPagoPension(pagoPen);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            ImprimirErrores(pagoPen.getErrores());
        }
    }
    
    private void InsertActualizar(pagoVarios pagoVar){
        PagoVariosBO pagoVarBO = new PagoVariosBO();

        if (pagoVar.getErrores().isEmpty()) {
            try {
                if (jbPrincipal.getText().equals("Insertar")) {
                    pagoVarBO.insertarPagoVarios(pagoVar);
                } else if (jbPrincipal.getText().equals("Actualizar")) {
                    pagoVarBO.actualizarPagoVarios(pagoVar);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            ImprimirErrores(pagoVar.getErrores());
        }
    }
    
    private void ImprimirErrores(Map<String, String> errores){
        for (String error : errores.keySet().toArray(new String[0])) {
            switch (error) {
                case "alumno_id" -> jLabelAlumno_id.setText(errores.get(error));
                case "fecha" -> jLabelFecha.setText(errores.get(error));
                case "monto" -> jLabelMonto.setText(errores.get(error));
                case "observacion" -> jLabelObservacion.setText(errores.get(error));
                case "descripcion" -> jLabelObservacion.setText(errores.get(error));
            }
            System.out.println(error);
        }
    }
    
    private void BorrarErrores(){
        jLabelAlumno_id.setText("-");
        jLabelFecha.setText("-");
        jLabelMonto.setText("-");
        jLabelObservacion.setText("-");
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPagos("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabelAlumno_id;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelMonto;
    private javax.swing.JLabel jLabelObservacion;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextAlumnoId;
    private javax.swing.JTextField jTextFecha;
    private javax.swing.JTextField jTextMonto;
    private javax.swing.JTextArea jTextObservacion;
    private javax.swing.JButton jbPrincipal;
    private javax.swing.JLabel jlID;
    private javax.swing.JLabel jlTitulo;
    // End of variables declaration//GEN-END:variables
}
