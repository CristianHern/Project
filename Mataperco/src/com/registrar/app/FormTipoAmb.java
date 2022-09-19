package com.registrar.app;

import com.mataperco.controller.ControllerTipoambiente;
import com.mataperco.model.Tipoambiente;
import javax.swing.JOptionPane;

public class FormTipoAmb extends javax.swing.JInternalFrame {

    public FormTipoAmb(){
        initComponents();
        CardarModelTipoambiente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTipoAmbiente = new javax.swing.JTable();
        btn_eliminar1 = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_registrar1 = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Tipo de Ambiente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Old English Text MT", 3, 18))); // NOI18N

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        txt_id.setEditable(false);
        txt_id.setEnabled(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Listado General de Tipo de Ambientes");

        jtTipoAmbiente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtTipoAmbiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTipoAmbienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTipoAmbiente);

        btn_eliminar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\delete.png")); // NOI18N
        btn_eliminar1.setText("Eliminar");
        btn_eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar1ActionPerformed(evt);
            }
        });

        btn_editar.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\pencil.png")); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_registrar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\add.png")); // NOI18N
        btn_registrar1.setText("Nuevo");
        btn_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar1btn_guardarAmbiente(evt);
            }
        });

        btn_limpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\page_refresh.png")); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_descripcion))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn_registrar1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_limpiar)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(311, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrar1btn_guardarAmbiente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar1btn_guardarAmbiente
        // TODO add your handling code here:
          String nombre = this.txt_nombre.getText();
        String descripcion = this.txt_descripcion.getText();

        Tipoambiente tipoambiente = new Tipoambiente( nombre, descripcion);
        // controlador
        ControllerTipoambiente controller = new ControllerTipoambiente();
        // guarda un Tipoambiente a través del controlador
        controller.registrar(tipoambiente);
        CardarModelTipoambiente();
    }//GEN-LAST:event_btn_registrar1btn_guardarAmbiente

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        txt_nombre.setText(null);
        txt_descripcion.setText(null);

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar1ActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txt_id.getText());
        String nombre = this.txt_nombre.getText();
        String descripcion = this.txt_descripcion.getText();
        
        Tipoambiente tipoambiente = new Tipoambiente(nombre,descripcion);

        // controlador
        ControllerTipoambiente controller = new ControllerTipoambiente();

        // eliminar un Tipoambiente por medio del id
        tipoambiente.setId(id);
        controller.eliminar(tipoambiente);

        txt_id.setText(null);
        txt_nombre.setText(null);
        txt_descripcion.setText(null);
        CardarModelTipoambiente();
    }//GEN-LAST:event_btn_eliminar1ActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txt_id.getText());

        String nombre = this.txt_nombre.getText();
        String descripcion = this.txt_descripcion.getText();

        Tipoambiente tipoambiente = new Tipoambiente(nombre,descripcion);

        // controlador
        ControllerTipoambiente controller = new ControllerTipoambiente();
        // editar un tipoambiente por medio del id
        tipoambiente.setId(id);
        controller.actualizar(tipoambiente);
        CardarModelTipoambiente();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void jtTipoAmbienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTipoAmbienteMouseClicked
        // TODO add your handling code here:          
        int Fila = jtTipoAmbiente.getSelectedRow();
            String tipoambiente_id = jtTipoAmbiente.getValueAt(Fila, 0).toString();
            String nombre = jtTipoAmbiente.getValueAt(Fila, 1).toString();
            String descripcion = jtTipoAmbiente.getValueAt(Fila, 2).toString();

        txt_id.setText(String.valueOf(tipoambiente_id));
        txt_nombre.setText(nombre);
        txt_descripcion.setText(descripcion);
    }//GEN-LAST:event_jtTipoAmbienteMouseClicked

    public void CardarModelTipoambiente(){
        ControllerTipoambiente controller = new ControllerTipoambiente();
        try {            
            jtTipoAmbiente.setModel(controller.consultarModelTipoambiente());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Error al cargar los Tipos de Ambientes",JOptionPane.ERROR_MESSAGE);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar1;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_registrar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTipoAmbiente;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
