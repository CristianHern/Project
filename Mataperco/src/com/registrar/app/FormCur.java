package com.registrar.app;

import com.mataperco.controller.ControllerAprendiz;
import com.mataperco.controller.ControllerCurso;
import com.mataperco.model.Curso;
import com.mataperco.model.FichaCombo;
import com.mataperco.model.InstructorCombo;
import javax.swing.JOptionPane;

public class FormCur extends javax.swing.JInternalFrame {

    public FormCur() {
        initComponents();
        cargarModelCursos();
        cargarModelComboFicha();
        cargarModelComboInstructor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtDescripcion = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCurso = new javax.swing.JTable();
        btn_registrar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        ComboFicha = new javax.swing.JComboBox<>();
        ComboInstructor = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario Curso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Old English Text MT", 3, 18))); // NOI18N

        jLabel1.setText("Descripcion:");

        txt_id.setEditable(false);
        txt_id.setEnabled(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID");

        jLabel2.setText("Id_Ficha");

        jLabel3.setText("Id_Instructor");

        jTableCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Curso", "Descripcion", "Id_Ficha", "Id_Instructor"
            }
        ));
        jTableCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCursoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCurso);

        btn_registrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\add.png")); // NOI18N
        btn_registrar.setText("Nuevo");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarbtn_guardarInstructor(evt);
            }
        });

        btn_editar.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\pencil.png")); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\delete.png")); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_limpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\camil\\Desktop\\Mata\\Mataperco\\src\\icons\\page_refresh.png")); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        ComboFicha.setToolTipText("");

        ComboInstructor.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_registrar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_editar)
                                .addGap(29, 29, 29)
                                .addComponent(btn_eliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_limpiar)
                                .addGap(35, 35, 35))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(27, 27, 27)
                                        .addComponent(ComboFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarbtn_guardarInstructor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarbtn_guardarInstructor
        // TODO add your handling code here:
        String descripcion = this.TxtDescripcion.getText();
        FichaCombo object = (FichaCombo) ComboFicha.getSelectedItem();
        int ficha = ((FichaCombo)object).getCodigo();
        InstructorCombo object1 = (InstructorCombo) ComboInstructor.getSelectedItem();
        int instructor = ((InstructorCombo)object1).getCodigo();

        Curso curso = new Curso(descripcion, ficha, instructor);
        // controlador
        ControllerCurso controller = new ControllerCurso();
        // guarda un instructor a través del controlador
        controller.registrar(curso);
        cargarModelCursos();
    }//GEN-LAST:event_btn_registrarbtn_guardarInstructor

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txt_id.getText());
        String descripcion = this.TxtDescripcion.getText();
        FichaCombo object = (FichaCombo) ComboFicha.getSelectedItem();
        int ficha = ((FichaCombo)object).getCodigo();
        
       //int ficha = ComboFicha.getSelectedIndex();
       
         InstructorCombo object1 = (InstructorCombo) ComboInstructor.getSelectedItem();
        int instructor = ((InstructorCombo)object1).getCodigo();
         
        //int instructor = ComboInstructor.getSelectedIndex();
       
        Curso curso = new Curso(descripcion, ficha, instructor);

        // controlador
        ControllerCurso controller = new ControllerCurso();
        // editar un instructor por medio del id
        curso.setId(id);
        curso.setDescripcion(descripcion);
        curso.setFicha(ficha);
        curso.setInstructor(instructor);
 
        controller.actualizar(curso);
        
        cargarModelCursos();
        
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txt_id.getText());
        String descripcion = this.TxtDescripcion.getText();
         FichaCombo object = (FichaCombo) ComboFicha.getSelectedItem();
        int ficha = ((FichaCombo)object).getCodigo();
         InstructorCombo object1 = (InstructorCombo) ComboInstructor.getSelectedItem();
        int instructor = ((InstructorCombo)object1).getCodigo();
        

        //System.out.println("sexo: "+sexo);
        Curso curso = new Curso(descripcion, ficha, instructor);

        // controlador
        ControllerCurso controller = new ControllerCurso();

        // eliminar un instructor por medio del id
        curso.setId(id);
        controller.eliminar(curso);

        txt_id.setText(null);
        TxtDescripcion.setText(null);
        ComboFicha.getSelectedItem();
        ComboInstructor.getSelectedItem();
        cargarModelCursos();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        this.TxtDescripcion.setText(null);
        ComboFicha.getSelectedItem();
        ComboInstructor.getSelectedItem();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void jTableCursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCursoMouseClicked
        int Fila = jTableCurso.getSelectedRow();
        String id = jTableCurso.getValueAt(Fila, 0).toString();
        String descripcion = jTableCurso.getValueAt(Fila, 1).toString();
       // int ficha = Integer.parseInt(jTableCurso.getValueAt(Fila, 2).toString());
        //int instructor = Integer.parseInt(jTableCurso.getValueAt(Fila, 3).toString());
        //System.out.println("Ficha: "+ficha);
        txt_id.setText(String.valueOf(id));
        TxtDescripcion.setText(descripcion);
        //ComboFicha.setSelectedIndex(ficha);
        
        //ComboInstructor.setSelectedIndex(instructor);
        
    }//GEN-LAST:event_jTableCursoMouseClicked

    public void cargarModelCursos(){
        ControllerCurso controller = new ControllerCurso();
         try {       
            jTableCurso.setModel(controller.consultarModelCurso());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Error al cargar los Cursos",JOptionPane.ERROR_MESSAGE);
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
    
    
    public void cargarModelComboInstructor(){
        ControllerCurso controller = new ControllerCurso();
        try {    
            ComboInstructor.setModel(controller.consultarModelComboInstructor());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Error al cargar combo ficha aprediz",JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboFicha;
    private javax.swing.JComboBox<String> ComboInstructor;
    private javax.swing.JTextField TxtDescripcion;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCurso;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
