/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import BusinessLayer.AlumnoApoderadoBO;
import BusinessLayer.AlumnoBO;
import BusinessLayer.ApoderadoBO;
import JavaBean.Alumno;
import JavaBean.Apoderado;
import JavaBean.alumnoApoderado;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author black
 */
public class VentanaAlumnoApoderado extends javax.swing.JFrame {

    /**
     * Creates new form VentanaAlumnoApoderado
     */
    public VentanaAlumnoApoderado() {
        initComponents();
        
        try {
            alumnos = alumBO.buscarPorAlumno("");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        actualizarTablaAlumno();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableGestionAlumno = new javax.swing.JTable();
        JTextBuscarNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscarAlumno = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTableAlumnoApoderado = new javax.swing.JTable();
        jTextAlumnoId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTextAlumnoNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonInsertar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccionar Alumno"));

        jTableGestionAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Alumno_id", "Apellidos y Nombres", "DNI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableGestionAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGestionAlumnoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableGestionAlumno);

        jLabel2.setText("Nombres:");

        btnBuscarAlumno.setText("Buscar");
        btnBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(JTextBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarAlumno)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarAlumno)
                    .addComponent(JTextBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Apoderados por Alumno"));

        jTableAlumnoApoderado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Apoderado_id", "Apellidos y Nombres", "DNI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAlumnoApoderado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlumnoApoderadoMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTableAlumnoApoderado);

        jTextAlumnoId.setEnabled(false);
        jTextAlumnoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAlumnoIdActionPerformed(evt);
            }
        });

        jLabel9.setText("CODIGO ALUMNO :");

        JTextAlumnoNombre.setEnabled(false);
        JTextAlumnoNombre.setMaximumSize(new java.awt.Dimension(250, 22));
        JTextAlumnoNombre.setMinimumSize(new java.awt.Dimension(250, 22));
        JTextAlumnoNombre.setName(""); // NOI18N
        JTextAlumnoNombre.setPreferredSize(new java.awt.Dimension(250, 22));

        jLabel1.setText("ALUMNO :");

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.setEnabled(false);
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.setEnabled(false);
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextAlumnoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextAlumnoId)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButtonInsertar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAlumnoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextAlumnoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableGestionAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGestionAlumnoMouseClicked
        // TODO add your handling code here:
        int fila = jTableGestionAlumno.getSelectedRow();

        if(fila !=-1){
            JTextAlumnoNombre.setText(jTableGestionAlumno.getValueAt(fila, 1).toString());
            jTextAlumnoId.setText(jTableGestionAlumno.getValueAt(fila, 0).toString());
            jButtonInsertar.setEnabled(true);
            jButtonEliminar.setEnabled(true);
        }
        
        try {
            alumnoApoderados = alumnoApoderadoBO.buscarPorAlumnoId(Integer.parseInt(jTableGestionAlumno.getValueAt(fila, 0).toString()));
            actualizarTablaAlumnoApoderado();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }        
    }//GEN-LAST:event_jTableGestionAlumnoMouseClicked

    private void jTextAlumnoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAlumnoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAlumnoIdActionPerformed

    private void btnBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlumnoActionPerformed
        try {
            alumnos = alumBO.buscarPorAlumno(JTextBuscarNombre.getText());
            actualizarTablaAlumno();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnBuscarAlumnoActionPerformed

    private void jTableAlumnoApoderadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlumnoApoderadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableAlumnoApoderadoMouseClicked

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        // TODO add your handling code here:
        int fila = jTableGestionAlumno.getSelectedRow();
        VentanaInsertarApoderadoAlumno ventanaInsertar = new VentanaInsertarApoderadoAlumno(Integer.parseInt(jTextAlumnoId.getText()),
                JTextAlumnoNombre.getText());
        // Agregar el WindowListener a la ventana
        ventanaInsertar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    alumnoApoderados = alumnoApoderadoBO.buscarPorAlumnoId(Integer.parseInt(jTableGestionAlumno.getValueAt(fila, 0).toString()));
                    actualizarTablaAlumnoApoderado();
                } catch (Exception ex){ 
                    System.out.println(ex.getMessage());
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        // Mostrar la ventana
        ventanaInsertar.setVisible(true);
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        int fila = jTableAlumnoApoderado.getSelectedRow();

        try {
            System.out.println( "Eliminando AlumnoApoderado con id: "+jTableAlumnoApoderado.getValueAt(fila, 0) );
            int alumno_id = Integer.parseInt(jTextAlumnoId.getText().toString());
            int apoderado_id = Integer.parseInt(jTableAlumnoApoderado.getValueAt(fila, 0).toString());
            System.out.println("Alumno ID :"+alumno_id+ ", Apoderado ID :"+apoderado_id);
            alumnoApoderadoBO.eliminar(alumno_id , apoderado_id);
            
            modeloAlumnoApoderado.removeRow(fila);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private DefaultTableModel modeloAlumnoApoderado;
    private ArrayList<alumnoApoderado> alumnoApoderados;
    private AlumnoApoderadoBO alumnoApoderadoBO = new AlumnoApoderadoBO();
    
    private void actualizarTablaAlumnoApoderado() {
        modeloAlumnoApoderado = new DefaultTableModel();

        jTableAlumnoApoderado.setModel(modeloAlumnoApoderado);

        modeloAlumnoApoderado.addColumn("Apoderado_id");
        modeloAlumnoApoderado.addColumn("Apellidos y Nombres");
        modeloAlumnoApoderado.addColumn("DNI");
        modeloAlumnoApoderado.addColumn("Parentesco");
        
        try {
            for (int i = 0; i < alumnoApoderados.size(); i++) {
                alumnoApoderado alumApo = alumnoApoderados.get(i);
                Apoderado apoderado = alumApo.getApoderado();
                
                String apellidosNombres = apoderado.getApellido_paterno() + " " + apoderado.getApellido_materno() + " , " + apoderado.getNombres();

                Object[] fila = new Object[]{alumApo.getApoderado_id(), apellidosNombres,apoderado.getDni(),
                alumApo.getParentesco()};
                modeloAlumnoApoderado.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//    
//    private DefaultTableModel modeloApoderado;
//    private ArrayList<Apoderado> apoderados;
//    private ApoderadoBO apoBO = new ApoderadoBO();
//
//    private void actualizarTablaApoderado() {
//        modeloApoderado = new DefaultTableModel();
//
//        jTableGestionApoderado.setModel(modeloApoderado);
//
//        modeloApoderado.addColumn("apoderado_id");
//        modeloApoderado.addColumn("apellido_nombres");
//        modeloApoderado.addColumn("dni");
//        
//        try {
//            for (int i = 0; i < apoderados.size(); i++) {
//                Apoderado apoderado = apoderados.get(i);
//                String apellidosNombres = apoderado.getApellido_paterno() + " " + apoderado.getApellido_materno() + " , " + apoderado.getNombres();
//
//                Object[] fila = new Object[]{apoderado.getApoderado_id(),apellidosNombres,
//                apoderado.getDni()};
//                modeloApoderado.addRow(fila);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

    private DefaultTableModel modeloAlumnos;
    private AlumnoBO alumBO = new AlumnoBO();
    private ArrayList<Alumno> alumnos;

    private void actualizarTablaAlumno() {
        modeloAlumnos = new DefaultTableModel();

        jTableGestionAlumno.setModel(modeloAlumnos);

        modeloAlumnos.addColumn("Alumno id");
        modeloAlumnos.addColumn("Apellidos y Nombres");
        modeloAlumnos.addColumn("DNI");

        try {
            System.out.println(alumnos.size());
            for (int i = 0; i < alumnos.size(); i++) {
                Alumno alumno = alumnos.get(i);
                String apellidosNombres = alumno.getApellido_paterno() + " " + alumno.getApellido_materno() + " , " + alumno.getNombres();

                Object[] fila = new Object[]{alumno.getAlumno_id(), apellidosNombres,
                alumno.getDni()};
                modeloAlumnos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(VentanaAlumnoApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumnoApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumnoApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAlumnoApoderado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAlumnoApoderado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextAlumnoNombre;
    private javax.swing.JTextField JTextBuscarNombre;
    private javax.swing.JButton btnBuscarAlumno;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTableAlumnoApoderado;
    private javax.swing.JTable jTableGestionAlumno;
    private javax.swing.JTextField jTextAlumnoId;
    // End of variables declaration//GEN-END:variables
}
