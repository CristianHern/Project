package com.registrar.app;

import com.asignaciones.Asig;

        
public class InterfazAdmin extends javax.swing.JFrame {

    public InterfazAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jSpinner1 = new javax.swing.JSpinner();
        jMenu4 = new javax.swing.JMenu();
        PanelFormulario = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salida = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        TipoAmbiente = new javax.swing.JMenuItem();
        BtnAmbiente = new javax.swing.JMenuItem();
        Aprendiz = new javax.swing.JMenuItem();
        Asignacion = new javax.swing.JMenuItem();
        Curso = new javax.swing.JMenuItem();
        Ficha = new javax.swing.JMenuItem();
        Instructor = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        BtnValidar = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanelFormularioLayout = new javax.swing.GroupLayout(PanelFormulario);
        PanelFormulario.setLayout(PanelFormularioLayout);
        PanelFormularioLayout.setHorizontalGroup(
            PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1356, Short.MAX_VALUE)
        );
        PanelFormularioLayout.setVerticalGroup(
            PanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        Salida.setText("Salir");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        jMenu1.add(Salida);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registro");

        TipoAmbiente.setText("TipoAmbiente");
        TipoAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoAmbienteActionPerformed(evt);
            }
        });
        jMenu2.add(TipoAmbiente);

        BtnAmbiente.setText("Ambiente");
        BtnAmbiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAmbienteActionPerformed(evt);
            }
        });
        jMenu2.add(BtnAmbiente);

        Aprendiz.setText("Aprendiz");
        Aprendiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AprendizActionPerformed(evt);
            }
        });
        jMenu2.add(Aprendiz);

        Asignacion.setText("Asignacion");
        Asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignacionActionPerformed(evt);
            }
        });
        jMenu2.add(Asignacion);

        Curso.setText("Curso");
        Curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CursoActionPerformed(evt);
            }
        });
        jMenu2.add(Curso);

        Ficha.setText("Ficha");
        Ficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FichaActionPerformed(evt);
            }
        });
        jMenu2.add(Ficha);

        Instructor.setText("Instructor");
        Instructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructorActionPerformed(evt);
            }
        });
        jMenu2.add(Instructor);

        jMenuBar1.add(jMenu2);

        jMenu6.setText("Asigacion Horario");

        BtnValidar.setText("Validar");
        BtnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnValidarActionPerformed(evt);
            }
        });
        jMenu6.add(BtnValidar);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstructorActionPerformed
        FormInst Ver = new FormInst();
        this.PanelFormulario.add(Ver);
        Ver.setVisible(true);
    }//GEN-LAST:event_InstructorActionPerformed

    private void AprendizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AprendizActionPerformed
        FormApr formapr = new FormApr();
        this.PanelFormulario.add(formapr);
        formapr.setVisible(true);   
    }//GEN-LAST:event_AprendizActionPerformed

    private void AsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignacionActionPerformed
        FormAsi formasi = new FormAsi();
        this.PanelFormulario.add(formasi);
        formasi.setVisible(true);  
    }//GEN-LAST:event_AsignacionActionPerformed

    private void CursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CursoActionPerformed
        FormCur formcur = new FormCur();
        this.PanelFormulario.add(formcur);
        formcur.setVisible(true); 
    }//GEN-LAST:event_CursoActionPerformed

    private void FichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FichaActionPerformed
        FormFicha formficha = new FormFicha();
        this.PanelFormulario.add(formficha);
        formficha.setVisible(true); 
    }//GEN-LAST:event_FichaActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        dispose();
    }//GEN-LAST:event_SalidaActionPerformed

    private void TipoAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoAmbienteActionPerformed
        FormTipoAmb formtipoamb = new FormTipoAmb();
        this.PanelFormulario.add(formtipoamb);
        formtipoamb.setVisible(true); 
    }//GEN-LAST:event_TipoAmbienteActionPerformed

    private void BtnAmbienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAmbienteActionPerformed
        FormAmb formamb = new FormAmb();
        this.PanelFormulario.add(formamb);
        formamb.setVisible(true);
    }//GEN-LAST:event_BtnAmbienteActionPerformed

//-------------------------Validar Asignacion-------------------------
    private void BtnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnValidarActionPerformed
        Asig asig = new Asig();
        this.PanelFormulario.add(asig);
        asig.setVisible(true);
    }//GEN-LAST:event_BtnValidarActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Aprendiz;
    private javax.swing.JMenuItem Asignacion;
    private javax.swing.JMenuItem BtnAmbiente;
    private javax.swing.JMenuItem BtnValidar;
    private javax.swing.JMenuItem Curso;
    private javax.swing.JMenuItem Ficha;
    private javax.swing.JMenuItem Instructor;
    private javax.swing.JDesktopPane PanelFormulario;
    private javax.swing.JMenuItem Salida;
    private javax.swing.JMenuItem TipoAmbiente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
