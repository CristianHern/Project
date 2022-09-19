package com.registrar.app;

import com.mataperco.controller.ControllerAprendiz;
import com.mataperco.model.Aprendiz;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import com.mataperco.model.FichaCombo;

public class FormApr extends javax.swing.JInternalFrame {

    public FormApr() {
        initComponents();
        cargarModelAprendices();
        cargarModelComboFicha();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboSexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtContacto = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_registrar1 = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar1 = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAprendiz = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ComboFicha = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Aprendiz", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Old English Text MT", 3, 18))); // NOI18N

        jLabel1.setText("Cedula:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Sexo:");

        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        jLabel5.setText("Correo:");

        jLabel6.setText("Nro de Contacto:");

        txt_id.setEditable(false);
        txt_id.setEnabled(false);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ID");

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

        jTableAprendiz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cedula", "Nombre", "Apellido", "Sexo", "Correo", "Contacto", "IdFicha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAprendiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAprendizMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAprendiz);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Listado General de Estudiantes");

        jLabel9.setText("IdFicha:");

        ComboFicha.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboFicha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCedula))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNombre))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtContacto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_registrar1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_eliminar1)
                                .addGap(18, 18, 18)
                                .addComponent(btn_limpiar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrar1btn_guardarAmbiente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar1btn_guardarAmbiente
        // TODO add your handling code here:
        String cedula = this.TxtCedula.getText();
        String nombre = this.TxtNombre.getText();
        String descripcion = this.TxtApellido.getText();
        String sexo = (String) this.ComboSexo.getSelectedItem();
        String correo = this.TxtCorreo.getText();
        String contacto = this.TxtContacto.getText();
        
        FichaCombo object = (FichaCombo) ComboFicha.getSelectedItem();
        int ficha = ((FichaCombo)object).getCodigo();

        Aprendiz aprendiz = new Aprendiz(cedula, nombre, descripcion, sexo, correo, contacto, ficha);
        // controlador
        ControllerAprendiz controller = new ControllerAprendiz();
        // guarda un Tipoambiente a través del controlador
        controller.registrar(aprendiz);
        cargarModelAprendices();
    }//GEN-LAST:event_btn_registrar1btn_guardarAmbiente

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txt_id.getText());

        String cedula = this.TxtCedula.getText();
        String nombre = this.TxtNombre.getText();
        String descripcion = this.TxtApellido.getText();
        String sexo = (String) this.ComboSexo.getSelectedItem();
        String correo = this.TxtCorreo.getText();
        String contacto = this.TxtContacto.getText();
        
        FichaCombo object = (FichaCombo) ComboFicha.getSelectedItem();
        int ficha = ((FichaCombo)object).getCodigo();

        Aprendiz aprendiz = new Aprendiz(cedula, nombre, descripcion, sexo, correo, contacto, ficha);

        // controlador
        ControllerAprendiz controller = new ControllerAprendiz();
        // Eliminar un aprendiz por medio del id
        aprendiz.setId(id);
        controller.actualizar(aprendiz);
        
        cargarModelComboFicha();
        cargarModelAprendices();
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar1ActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txt_id.getText());
        String cedula = this.TxtCedula.getText();
        String nombre = this.TxtNombre.getText();
        String descripcion = this.TxtApellido.getText();
        String sexo = (String) this.ComboSexo.getSelectedItem();
        String correo = this.TxtCorreo.getText();
        String contacto = this.TxtContacto.getText();
        FichaCombo object = (FichaCombo) ComboFicha.getSelectedItem();
        int ficha = ((FichaCombo)object).getCodigo();
        
        Aprendiz aprendiz = new Aprendiz(cedula, nombre, descripcion, sexo, correo, contacto, ficha);

        // controlador
        ControllerAprendiz controller = new ControllerAprendiz();

        // eliminar un Tipoambiente por medio del id
        aprendiz.setId(id);
        controller.eliminar(aprendiz);

        txt_id.setText(null);
        TxtCedula.setText(null);
        TxtNombre.setText(null);
        TxtApellido.setText(null);
        ComboSexo.getSelectedItem();
        TxtCorreo.setText(null);
        TxtContacto.setText(null);
       
        cargarModelAprendices();
    }//GEN-LAST:event_btn_eliminar1ActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        txt_id.setText(null);
        TxtCedula.setText(null);
        TxtNombre.setText(null);
        TxtApellido.setText(null);
        ComboSexo.getSelectedItem();
        TxtCorreo.setText(null);
        TxtContacto.setText(null);
        ComboFicha.getSelectedItem();
       // String nombre = ((FichaCombo)object).getNombre();
        // System.out.println("Id= " + codigo +" Nombre= " + nombre);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void jTableAprendizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAprendizMouseClicked
        // TODO add your handling code here:

        int Fila = jTableAprendiz.getSelectedRow();
        String id = jTableAprendiz.getValueAt(Fila, 0).toString();
        String cedula = jTableAprendiz.getValueAt(Fila, 1).toString();
        String nombre = jTableAprendiz.getValueAt(Fila, 2).toString();
        String apellido = jTableAprendiz.getValueAt(Fila, 3).toString();
        String sexo = jTableAprendiz.getValueAt(Fila, 4).toString();
        String correo = jTableAprendiz.getValueAt(Fila, 5).toString();
        String contacto = jTableAprendiz.getValueAt(Fila, 6).toString();
        int ficha = Integer.parseInt(jTableAprendiz.getValueAt(Fila, 7).toString());
        
        txt_id.setText(String.valueOf(id));
        TxtCedula.setText(cedula);
        TxtNombre.setText(nombre);
        TxtApellido.setText(apellido);
        ComboSexo.setSelectedItem(sexo);
        TxtCorreo.setText(correo);
        TxtContacto.setText(contacto);
        ComboFicha.setSelectedIndex(ficha);
    }//GEN-LAST:event_jTableAprendizMouseClicked

    public void cargarModelAprendices(){
        ControllerAprendiz controller = new ControllerAprendiz();
        try {            
            jTableAprendiz.setModel(controller.consultarModelAprendiz());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Error al cargar los Aprendices",JOptionPane.ERROR_MESSAGE);
        }
    }
                                        

    public void cargarModelComboFicha(){
        ControllerAprendiz controller = new ControllerAprendiz();
        try {    
            ComboFicha.setModel(controller.consultarModelComboFicha());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Error al cargar combo ficha aprediz",JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboFicha;
    private javax.swing.JComboBox<String> ComboSexo;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCedula;
    private javax.swing.JTextField TxtContacto;
    private javax.swing.JTextField TxtCorreo;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAprendiz;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
