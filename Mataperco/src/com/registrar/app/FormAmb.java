package com.registrar.app;

import javax.swing.JOptionPane;
import com.mataperco.controller.ControllerAmbiente;
import com.mataperco.model.Ambiente;
import com.mataperco.model.TipoAmbienteCombo;

public class FormAmb extends javax.swing.JInternalFrame {

    public FormAmb() {
        initComponents();
        CargarModelAmbiente();
        cargarModelComboTipoAmbiente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtAmbiente = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtDescripcion = new javax.swing.JTextField();
        TxtCapacidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        ComboTipoAmbiente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAmbiente = new javax.swing.JTable();
        btn_registrar1 = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar1 = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Aambiente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Old English Text MT", 3, 18))); // NOI18N

        jLabel1.setText("N# Ambiente");

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Capacidad");

        jLabel5.setText("Estado");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID");

        txt_id.setEditable(false);
        txt_id.setEnabled(false);

        ComboTipoAmbiente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        jLabel6.setText("Tipo Ambiente");

        jTableAmbiente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Ambiente", "Nombre", "Descripcion", "Capacidad", "Estado", "Tipo Ambiente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAmbiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAmbienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAmbiente);

        btn_registrar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\add.png")); // NOI18N
        btn_registrar1.setText("Nuevo");
        btn_registrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar1btn_guardarAmbiente(evt);
            }
        });

        btn_editar.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\pencil.png")); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar1.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\delete.png")); // NOI18N
        btn_eliminar1.setText("Eliminar");
        btn_eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar1ActionPerformed(evt);
            }
        });

        btn_limpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\page_refresh.png")); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Listado General de Ambientes");

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(ComboTipoAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtNombre))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_registrar1)
                .addGap(18, 18, 18)
                .addComponent(btn_editar)
                .addGap(56, 56, 56)
                .addComponent(btn_eliminar1)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar)
                .addGap(641, 641, 641))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboTipoAmbiente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
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
        String codigo = this.TxtAmbiente.getText();
        String nombre = this.TxtNombre.getText();
        String descripcion = this.TxtDescripcion.getText();
        String capacidad = this.TxtCapacidad.getText();
        String estado =  (String) ComboEstado.getSelectedItem();
        

        TipoAmbienteCombo object = (TipoAmbienteCombo) ComboTipoAmbiente.getSelectedItem();
        int tipoambiente = ((TipoAmbienteCombo)object).getCodigo();
        
        Ambiente ambiente = new Ambiente(codigo, nombre, descripcion, capacidad, estado, tipoambiente);
        // controlador
        ControllerAmbiente controller = new ControllerAmbiente();
        // guarda un Tipoambiente a través del controlador
        controller.registrar(ambiente);
        CargarModelAmbiente();
    }//GEN-LAST:event_btn_registrar1btn_guardarAmbiente

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txt_id.getText());

        String codigo = this.TxtAmbiente.getText();
        String nombre = this.TxtNombre.getText();
        String descripcion = this.TxtDescripcion.getText();
        String capacidad = this.TxtCapacidad.getText();
        String estado = (String) ComboEstado.getSelectedItem();
        TipoAmbienteCombo object = (TipoAmbienteCombo) ComboTipoAmbiente.getSelectedItem();
        int tipoambiente = ((TipoAmbienteCombo)object).getCodigo();
        

        Ambiente ambiente = new Ambiente(codigo, nombre, descripcion, capacidad, estado, tipoambiente);

        // controlador
        ControllerAmbiente controller = new ControllerAmbiente();
        // editar un tipoambiente por medio del id
        ambiente.setId(id);
        controller.actualizar(ambiente);
        CargarModelAmbiente();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar1ActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txt_id.getText());
        String codigo = this.TxtAmbiente.getText();
        String nombre = this.TxtNombre.getText();
        String descripcion = this.TxtDescripcion.getText();
        String capacidad = this.TxtCapacidad.getText();
        String estado = (String) ComboEstado.getSelectedItem();
          TipoAmbienteCombo object = (TipoAmbienteCombo) ComboTipoAmbiente.getSelectedItem();
        int tipoambiente = ((TipoAmbienteCombo)object).getCodigo();
        
       Ambiente ambiente = new Ambiente(codigo, nombre, descripcion, capacidad, estado, tipoambiente);

        // controlador
        ControllerAmbiente controller = new ControllerAmbiente();

        // eliminar un Tipoambiente por medio del id
        ambiente.setId(id);
        controller.eliminar(ambiente);

        txt_id.setText(null);
        TxtAmbiente.setText(null);
        TxtNombre.setText(null);
        TxtDescripcion.setText(null);
        TxtCapacidad.setText(null);
        ComboEstado.getSelectedItem();
        ComboTipoAmbiente.getSelectedItem(); 
        CargarModelAmbiente();
    }//GEN-LAST:event_btn_eliminar1ActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        txt_id.setText(null);
        TxtAmbiente.setText(null);
        TxtNombre.setText(null);
        TxtDescripcion.setText(null);
        TxtCapacidad.setText(null);
        ComboEstado.getSelectedItem();
        ComboTipoAmbiente.getSelectedItem();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void jTableAmbienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAmbienteMouseClicked
        // TODO add your handling code here:          
        int Fila = jTableAmbiente.getSelectedRow();
            String id = jTableAmbiente.getValueAt(Fila, 0).toString();
            String codigo = jTableAmbiente.getValueAt(Fila, 1).toString();
            String nombre = jTableAmbiente.getValueAt(Fila, 2).toString();
            String descricion = jTableAmbiente.getValueAt(Fila, 3).toString();
            String capacidad = jTableAmbiente.getValueAt(Fila, 4).toString();
            String estado = jTableAmbiente.getValueAt(Fila, 5).toString();
            int tipoAmbiente =Integer.parseInt(jTableAmbiente.getValueAt(Fila, 6).toString());
            
            txt_id.setText(String.valueOf(id));
            TxtAmbiente.setText(codigo);
            TxtNombre.setText(nombre);
            TxtDescripcion.setText(descricion);
            TxtCapacidad.setText(capacidad);
            ComboEstado.setSelectedItem(estado); 
            ComboTipoAmbiente.setSelectedIndex(tipoAmbiente);
    }//GEN-LAST:event_jTableAmbienteMouseClicked

    public void CargarModelAmbiente(){
        ControllerAmbiente controller = new ControllerAmbiente();
        try {            
            jTableAmbiente.setModel(controller.consultarModelAmbiente());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Error al cargar los Ambientes",JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void cargarModelComboTipoAmbiente(){
        ControllerAmbiente controller = new ControllerAmbiente();
        try {    
            ComboTipoAmbiente.setModel(controller.consultarModelComboTipoAmbiente());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Error al cargar combo ficha aprediz",JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JComboBox<String> ComboTipoAmbiente;
    private javax.swing.JTextField TxtAmbiente;
    private javax.swing.JTextField TxtCapacidad;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar1;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_registrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAmbiente;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
